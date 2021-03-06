/*******************************************************************************
 * Copyright (c) 2014.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Hussein MHANNA - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.cheatsheets.handlers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10ModelWizard;
import org.eclipse.ui.INewWizard;

/**
 * The Class CreateReqIFModelHandler.
 */
public class CreateReqIFModelHandler extends AbstractOpenWizardHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.cheatsheets.handlers.AbstractOpenWizardHandler#createWizard()
	 */
	@Override
	protected INewWizard createWizard() throws CoreException {
		return new Reqif10ModelWizard();
	}
}
