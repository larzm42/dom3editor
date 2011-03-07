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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

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
        
        newAction = new Action("New") {

			@Override
			public void run() {
				FileDialog dialog = new FileDialog(window.getShell(), SWT.SAVE);
				dialog.setFilterExtensions(new String[]{"dm"});
				dialog.open();
				String[] names =  dialog.getFileNames();
				String filterPath =  System.getProperty("user.home"); //$NON-NLS-1$

				if (names != null) {
					filterPath =  dialog.getFilterPath();

					int numberOfFilesNotFound =  0;
					StringBuffer notFound =  new StringBuffer();
					for (int i =  0; i < names.length; i++) {
						IFileStore fileStore =  EFS.getLocalFileSystem().getStore(new Path(filterPath));
						if (!names[i].endsWith(".dm")) {
							names[i] += ".dm";
						}
						fileStore =  fileStore.getChild(names[i]);
						IFileInfo fetchInfo = fileStore.fetchInfo();
						if (!fetchInfo.isDirectory() && !fetchInfo.exists()) {
							IWorkbenchPage page =  window.getActivePage();
							try {
								File newFile = fileStore.toLocalFile(0, null);
								if (!newFile.exists()) {
									newFile.createNewFile();
									FileWriter out = new FileWriter(newFile);
									out.write("#modname \"My Mod\"\n");
									out.write("#description \"This is my mod\"\n");
									out.write("#icon \"./DeadlySeasMod.tga\"\n");
									out.write("#version 0.1\n");
									out.write("#domversion 3.26\n");
									out.flush();
									out.close();
									
									IDE.openEditorOnFileStore(page, fileStore);
								}
							} catch (PartInitException e) {
								String msg =  NLS.bind(IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, fileStore.getName());
								IDEWorkbenchPlugin.log(msg,e.getStatus());
								MessageDialog.open(MessageDialog.ERROR,window.getShell(), IDEWorkbenchMessages.OpenLocalFileAction_title, msg, SWT.SHEET);
							} catch (IOException e) {
								e.printStackTrace();
							} catch (CoreException e) {
								e.printStackTrace();
							}
						} else {
							if (++numberOfFilesNotFound > 1)
								notFound.append('\n');
							notFound.append(fileStore.getName());
						}
					}

//					if (numberOfFilesNotFound > 0) {
//						String msgFmt =  numberOfFilesNotFound == 1 ? IDEWorkbenchMessages.OpenLocalFileAction_message_fileNotFound : IDEWorkbenchMessages.OpenLocalFileAction_message_filesNotFound;
//						String msg =  NLS.bind(msgFmt, notFound.toString());
//						MessageDialog.open(MessageDialog.ERROR, window.getShell(), IDEWorkbenchMessages.OpenLocalFileAction_title, msg, SWT.SHEET);
//					}
				}

			}
        	
		};
        	
        
        
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
     */
    protected void fillMenuBar(IMenuManager menuBar) {
        MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
        MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
        
        menuBar.add(fileMenu);
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
