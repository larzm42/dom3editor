/* This file is part of dom3Editor.
 *
 * dom3Editor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * dom3Editor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with dom3Editor.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.larz.dom3.dm.ui.comment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultCommentAssociater;
import org.eclipse.xtext.parsetree.reconstr.impl.NodeIterator;
import org.eclipse.xtext.util.Pair;

/**
 */
public class DmCommentAssociater extends DefaultCommentAssociater {

	/**
	 * This implementation associates each comment with the next following semantic token's EObject, except for the
	 * case, where a line of the document end by a semantic element followed by a comment. Then, the the comment is
	 * associated with this preceding semantic token.
	 */
	protected void associateCommentsWithSemanticEObjects(Map<LeafNode, EObject> mapping, CompositeNode rootNode) {
		//		System.out.println(EmfFormatter.objToStr(rootNode));
		EObject currentEObject = null;
		List<LeafNode> currentComments = new ArrayList<LeafNode>();

		NodeIterator nodeIterator = new NodeIterator(rootNode);
		// rewind to previous token with token owner 
		while (nodeIterator.hasPrevious() && currentEObject == null) {
			AbstractNode node = nodeIterator.previous();
			if (tokenUtil.isToken(node)) {
				currentEObject = tokenUtil.getTokenOwner(node);
			}
		}
		while (nodeIterator.hasNext()) {
			EObject o = nodeIterator.next();
			if (o instanceof AbstractNode) {
				AbstractNode node = (AbstractNode) o;
				if (tokenUtil.isCommentNode(node)) {
					currentComments.add((LeafNode) node);
				}
				boolean isToken = tokenUtil.isToken(node);
				if ((node instanceof LeafNode || isToken) && node.getLine() != node.endLine() && currentEObject != null) {
					// found a newline -> associating existing comments with currentEObject
					//addMapping(mapping, currentComments, currentEObject);
					currentEObject = null;
					continue;
				}
				if (isToken) {
					Pair<List<LeafNode>, List<LeafNode>> leadingAndTrailingHiddenTokens = tokenUtil
							.getLeadingAndTrailingHiddenTokens(node);
					for (LeafNode leadingHiddenNode : leadingAndTrailingHiddenTokens.getFirst()) {
						if (tokenUtil.isCommentNode(leadingHiddenNode)) {
							currentComments.add(leadingHiddenNode);
						}
					}
					nodeIterator.prune();
					currentEObject = tokenUtil.getTokenOwner(node);
					if (currentEObject != null) {
						addMapping(mapping, currentComments, currentEObject);
						if (node.getOffset() > rootNode.getOffset() + rootNode.getLength()) {
							// found next EObject outside rootNode
							break;
						}
					}
				}
			}
		}
		if (!currentComments.isEmpty()) {
			if (currentEObject != null) {
				addMapping(mapping, currentComments, currentEObject);
			} else {
				EObject objectForRemainingComments = getEObjectForRemainingComments(rootNode);
				if (objectForRemainingComments != null) {
					addMapping(mapping, currentComments, objectForRemainingComments);
				}
			}
		}
	}

}
