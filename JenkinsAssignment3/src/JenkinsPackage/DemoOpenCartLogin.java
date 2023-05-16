package JenkinsPackage;

import org.testng.annotations.Test;

public class DemoOpenCartLogin {
	
 @Test
 public void DemoOpenCartLogin() {
 System.out.println("DemoOpenCart user can able to Login");
 }
@Test
public void DemoOpenAdminLogin() {
 System.out.println("DemoOpenAdmin can able to Login"); }

@Test(groups = {"Smoke Test"})
 public void DemoOpenEmployeeLogin() {
	System.out.println("DemoOpenCart Employee can able to Login");
}
}
