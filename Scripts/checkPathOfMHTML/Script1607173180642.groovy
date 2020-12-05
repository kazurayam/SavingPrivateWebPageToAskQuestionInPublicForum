import com.kms.katalon.core.configuration.RunConfiguration

String mhtFileUrl = getURLofMHT('tmp', 'CURA Healthcare Service.mht') 
println(mhtFileUrl)

def getURLofMHT(String dirName, String fileName) {
	File projectDir = new File(RunConfiguration.getProjectDir())
	File tmpDir = new File(projectDir, dirName)
	File mthFile = new File(tmpDir, fileName)
	URL url = mthFile.toURI().toURL()
	return url.toExternalForm()
}