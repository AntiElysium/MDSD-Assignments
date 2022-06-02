/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.X21RuntimeModule;
import dk.sdu.mmmi.mdsd.X21StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class X21IdeSetup extends X21StandaloneSetup {
  @Override
  public Injector createInjector() {
    X21RuntimeModule _x21RuntimeModule = new X21RuntimeModule();
    X21IdeModule _x21IdeModule = new X21IdeModule();
    return Guice.createInjector(Modules2.mixin(_x21RuntimeModule, _x21IdeModule));
  }
}