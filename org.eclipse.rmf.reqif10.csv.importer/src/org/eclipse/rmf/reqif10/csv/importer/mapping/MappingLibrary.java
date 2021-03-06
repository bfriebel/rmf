/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.csv.importer.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage#getMappingLibrary()
 * @model
 * @generated
 */
public interface MappingLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage#getMappingLibrary_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingItem> getItems();

} // MappingLibrary
