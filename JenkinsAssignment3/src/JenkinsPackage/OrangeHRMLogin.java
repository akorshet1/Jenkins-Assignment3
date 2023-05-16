package JenkinsPackage;

import org.testng.annotations.Test;

public class OrangeHRMLogin
{
@Test (groups= {"SmokeTest"})
 public void OrangeLogin() {
 System.out.println("OrangeHRM Admin can able to Login");
}
@Test
 public void OrangeAdmin() {
System.out.println("OrangeHRM Admin can to Login ");
}
	@Test
public void OrangeEmployeeLogin() {
 System.out.println("OrangeHRM Employee can able to Login");

	}
	}

