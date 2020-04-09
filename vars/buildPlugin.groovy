/**
 * Simple wrapper step for building a plugin
 */
def call(Map addonParams = [:])
{
	library(addonParams.version)
	buildPlugin2(addonParams)
}
