import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

// get the URL of MHTML file saved in the tmp directory in this project
String mhtFileUrl = getURLofMHT('tmp', 'CURA Healthcare Service.mht')

// load the MHTML to restore the AUT
WebUI.navigateToUrl(mhtFileUrl)

WebUI.delay(3)

WebUI.closeBrowser()

def getURLofMHT(String dirName, String fileName) {
	File projectDir = new File(RunConfiguration.getProjectDir())
	File tmpDir = new File(projectDir, dirName)
	File mthFile = new File(tmpDir, fileName)
	URL url = mthFile.toURI().toURL()
	return url.toExternalForm()
}