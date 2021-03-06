/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.namespace.SpaceType;
import org.eclipse.rmf.reqif10.xhtml.AlignType;
import org.eclipse.rmf.reqif10.xhtml.ValignType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlThType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTrType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Tr Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getGroup <em>Group</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getTh <em>Th</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getTd <em>Td</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getAlign <em>Align</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getChar <em>Char</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getCharoff <em>Charoff</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getClass_ <em>Class</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getLang <em>Lang</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getSpace <em>Space</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getTitle <em>Title</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class XhtmlTrTypeImpl extends MinimalEObjectImpl implements XhtmlTrType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType ALIGN_EDEFAULT = AlignType.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected Object charoff = CHAROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.PRESERVE_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final ValignType VALIGN_EDEFAULT = ValignType.TOP;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XhtmlTrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getXhtmlTrType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XhtmlPackage.XHTML_TR_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlThType> getTh() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getXhtmlTrType_Th());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlTdType> getTd() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getXhtmlTrType_Td());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AlignType getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAlign(AlignType newAlign) {
		AlignType oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetAlign() {
		AlignType oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TR_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCharoff(Object newCharoff) {
		Object oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__CHAROFF, oldCharoff, charoff));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TR_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValignType getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValign(ValignType newValign) {
		ValignType oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TR_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetValign() {
		ValignType oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TR_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetValign() {
		return valignESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XhtmlPackage.XHTML_TR_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_TR_TYPE__TH:
			return ((InternalEList<?>) getTh()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_TR_TYPE__TD:
			return ((InternalEList<?>) getTd()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XhtmlPackage.XHTML_TR_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case XhtmlPackage.XHTML_TR_TYPE__TH:
			return getTh();
		case XhtmlPackage.XHTML_TR_TYPE__TD:
			return getTd();
		case XhtmlPackage.XHTML_TR_TYPE__ALIGN:
			return getAlign();
		case XhtmlPackage.XHTML_TR_TYPE__CHAR:
			return getChar();
		case XhtmlPackage.XHTML_TR_TYPE__CHAROFF:
			return getCharoff();
		case XhtmlPackage.XHTML_TR_TYPE__CLASS:
			return getClass_();
		case XhtmlPackage.XHTML_TR_TYPE__ID:
			return getId();
		case XhtmlPackage.XHTML_TR_TYPE__LANG:
			return getLang();
		case XhtmlPackage.XHTML_TR_TYPE__SPACE:
			return getSpace();
		case XhtmlPackage.XHTML_TR_TYPE__STYLE:
			return getStyle();
		case XhtmlPackage.XHTML_TR_TYPE__TITLE:
			return getTitle();
		case XhtmlPackage.XHTML_TR_TYPE__VALIGN:
			return getValign();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XhtmlPackage.XHTML_TR_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__TH:
			getTh().clear();
			getTh().addAll((Collection<? extends XhtmlThType>) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__TD:
			getTd().clear();
			getTd().addAll((Collection<? extends XhtmlTdType>) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__ALIGN:
			setAlign((AlignType) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__CHAR:
			setChar((String) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__CHAROFF:
			setCharoff(newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__CLASS:
			setClass((String) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__ID:
			setId((String) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__LANG:
			setLang((String) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__SPACE:
			setSpace((SpaceType) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__STYLE:
			setStyle((String) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__TITLE:
			setTitle((String) newValue);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__VALIGN:
			setValign((ValignType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XhtmlPackage.XHTML_TR_TYPE__GROUP:
			getGroup().clear();
			return;
		case XhtmlPackage.XHTML_TR_TYPE__TH:
			getTh().clear();
			return;
		case XhtmlPackage.XHTML_TR_TYPE__TD:
			getTd().clear();
			return;
		case XhtmlPackage.XHTML_TR_TYPE__ALIGN:
			unsetAlign();
			return;
		case XhtmlPackage.XHTML_TR_TYPE__CHAR:
			setChar(CHAR_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__CHAROFF:
			setCharoff(CHAROFF_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__LANG:
			setLang(LANG_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__SPACE:
			unsetSpace();
			return;
		case XhtmlPackage.XHTML_TR_TYPE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_TR_TYPE__VALIGN:
			unsetValign();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XhtmlPackage.XHTML_TR_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case XhtmlPackage.XHTML_TR_TYPE__TH:
			return !getTh().isEmpty();
		case XhtmlPackage.XHTML_TR_TYPE__TD:
			return !getTd().isEmpty();
		case XhtmlPackage.XHTML_TR_TYPE__ALIGN:
			return isSetAlign();
		case XhtmlPackage.XHTML_TR_TYPE__CHAR:
			return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
		case XhtmlPackage.XHTML_TR_TYPE__CHAROFF:
			return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
		case XhtmlPackage.XHTML_TR_TYPE__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case XhtmlPackage.XHTML_TR_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case XhtmlPackage.XHTML_TR_TYPE__LANG:
			return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
		case XhtmlPackage.XHTML_TR_TYPE__SPACE:
			return isSetSpace();
		case XhtmlPackage.XHTML_TR_TYPE__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case XhtmlPackage.XHTML_TR_TYPE__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case XhtmlPackage.XHTML_TR_TYPE__VALIGN:
			return isSetValign();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", align: "); //$NON-NLS-1$
		if (alignESet)
			result.append(align);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", char: "); //$NON-NLS-1$
		result.append(char_);
		result.append(", charoff: "); //$NON-NLS-1$
		result.append(charoff);
		result.append(", class: "); //$NON-NLS-1$
		result.append(class_);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", lang: "); //$NON-NLS-1$
		result.append(lang);
		result.append(", space: "); //$NON-NLS-1$
		if (spaceESet)
			result.append(space);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", style: "); //$NON-NLS-1$
		result.append(style);
		result.append(", title: "); //$NON-NLS-1$
		result.append(title);
		result.append(", valign: "); //$NON-NLS-1$
		if (valignESet)
			result.append(valign);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} // XhtmlTrTypeImpl
