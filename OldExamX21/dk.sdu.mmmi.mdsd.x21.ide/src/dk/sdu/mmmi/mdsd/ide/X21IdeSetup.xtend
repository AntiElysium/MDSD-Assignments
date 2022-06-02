/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ide

import com.google.inject.Guice
import dk.sdu.mmmi.mdsd.X21RuntimeModule
import dk.sdu.mmmi.mdsd.X21StandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class X21IdeSetup extends X21StandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new X21RuntimeModule, new X21IdeModule))
	}
	
}
