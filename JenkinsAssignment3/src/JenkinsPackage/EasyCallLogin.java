package JenkinsPackage;


import org.testng.annotations.Test;

public class EasyCallLogin {

@Test

 public void EasyCalculaLogin() {

 System.out.println("EasyCalcula user can able to Login");
}

@Test(groups={"SmokeTest"})

public void EasyCalculaAdminLogin() {

 System.out.println("EasyCalculation Admin can able to Login");


}
@Test

public void easyCalculationEmployeeLogin() {

 System.out.println("EasyCalcula Employee can able to Login");


}

}





}
