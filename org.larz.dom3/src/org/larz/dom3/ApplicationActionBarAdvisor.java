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
package org.larz.dom3;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.larz.dom3.editor.NewDialog;

/**
 * @author lamoor
 *
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
    private IWorkbenchAction closeAction;
    private IWorkbenchAction closeAllAction;
    private IWorkbenchAction exitAction;
    private IWorkbenchAction aboutAction;
    private IWorkbenchAction saveAction;
    private IWorkbenchAction saveAsAction;
    private IWorkbenchAction saveAllAction;
    private IWorkbenchAction undoAction;
    private IWorkbenchAction redoAction;
    private IWorkbenchAction cutAction;
    private IWorkbenchAction copyAction;
    private IWorkbenchAction pasteAction;
    private IAction newAction;

    /**
     * @param configurer
     */
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
     */
    protected void makeActions(final IWorkbenchWindow window) {
    	closeAction = ActionFactory.CLOSE.create(window);
    	register(closeAction);
    	
    	closeAllAction = ActionFactory.CLOSE_ALL.create(window);
    	register(closeAllAction);
    	
        exitAction = ActionFactory.QUIT.create(window);
        register(exitAction);
        
        aboutAction = ActionFactory.ABOUT.create(window);
        register(aboutAction);
        
        saveAction = ActionFactory.SAVE.create(window);
        register(saveAction);
        
        saveAsAction = ActionFactory.SAVE_AS.create(window);
        register(saveAction);
        
        saveAllAction = ActionFactory.SAVE_ALL.create(window);
        register(saveAction);
        
        newAction = new Action("New Mod...") {

			@Override
			public void run() {
				NewDialog dialog = new NewDialog(window.getShell());
				dialog.open();
			}
		};
        	
        undoAction = ActionFactory.UNDO.create(window);
        register(undoAction);
        redoAction = ActionFactory.REDO.create(window);
        register(redoAction);
        cutAction = ActionFactory.CUT.create(window);
        register(cutAction);
        copyAction = ActionFactory.COPY.create(window);
        register(copyAction);
        pasteAction = ActionFactory.PASTE.create(window);
        register(pasteAction);
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
     */
    protected void fillMenuBar(IMenuManager menuBar) {
        MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
        MenuManager editMenu = new MenuManager("&Edit", IWorkbenchActionConstants.M_EDIT);
        MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        // File
       // fileMenu.removeAll();
        fileMenu.add(new Separator());
        fileMenu.add(closeAction);
        fileMenu.add(closeAllAction);        
        fileMenu.add(new Separator());
        fileMenu.add(saveAction);
        fileMenu.add(saveAsAction);
        fileMenu.add(saveAllAction);
        fileMenu.add(new Separator());
        fileMenu.add(exitAction);
        fileMenu.add(newAction);
        
        // Edit
        editMenu.add(undoAction);
        editMenu.add(redoAction);
        editMenu.add(new Separator());
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);
        
        // Help
        helpMenu.add(aboutAction);
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
     */
    protected void fillCoolBar(ICoolBarManager coolBar) {
        IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
        coolBar.add(new ToolBarContributionItem(toolbar, "main"));
        toolbar.add(saveAction);
        toolbar.add(saveAllAction);
        coolBar.setLockLayout(true);
    }

}
