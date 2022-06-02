/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ui;

import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.x21.ui.internal.X21Activator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class X21ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(X21Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		X21Activator activator = X21Activator.getInstance();
		return activator != null ? activator.getInjector(X21Activator.DK_SDU_MMMI_MDSD_X21) : null;
	}

}