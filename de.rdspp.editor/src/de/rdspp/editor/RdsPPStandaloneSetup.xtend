/*
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RdsPPStandaloneSetup extends RdsPPStandaloneSetupGenerated {

	def static void doSetup() {
		new RdsPPStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}