package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionBooleanItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionIntegerItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionStringItemProvider;

public class ExtendedDatatypeDefinitionStringItemProvider extends
		DatatypeDefinitionStringItemProvider {

	public ExtendedDatatypeDefinitionStringItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) { 
	  Object parent = super.getParent(object);
	  return adapterFactory.adapt(parent, TransientDataTypesItemProvider.class); 
	}
}
