package TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Configuration.StartBrowser;
import Reusage.BusinessFunction;

public class CostcoLogInPageTest extends StartBrowser {
	@Test
	public void login() throws IOException {
		
		BusinessFunction fsn = new BusinessFunction();
		fsn.GoTOApplication();
		fsn.login();
		
	}

}
