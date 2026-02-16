package testPackageCRM;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseClassCRM;
import pagePackageCRM.ChecklistPage;
import pagePackageCRM.FinancePage;
import pagePackageCRM.GroupsPage;
import pagePackageCRM.LoginPage;
import pagePackageCRM.MaterialsPage;
import pagePackageCRM.MyOrganization;
import pagePackageCRM.OfficeAndSource;
import pagePackageCRM.ProjectCreatePage;
import pagePackageCRM.ProjectPage;
import pagePackageCRM.RolesPage;
import pagePackageCRM.UsersPage;
import pagePackageCRM.WorkflowPage;
import utilityPackageCRM.CreatepageUtility;
import utilityPackageCRM.LoginUtility;
class TestClass extends BaseClassCRM
{
 @DataProvider(name = "loginData")
 public Object[][] getData() 
  {
	return LoginUtility.getExcelData("./testdata/LoginData.xlsx","Sheet1");
  }
	@Test(dataProvider = "loginData", priority = 1)
	public void loginUsingExcel(String url, String user, String pass) 
	{
		isLoginSuccessful = false; 
	    LoginPage login = new LoginPage(driver);
	    login.openUrl(url);
	    login.login(user, pass);

	    if (login.isLoginSuccessful()) 
	    {
	        isLoginSuccessful = true;
	        test.pass("Login successful");
	    } 
	    else 
	    {
	        test.fail("Login failed");
	        throw new AssertionError("Login failed");
	    }
	}

//	@DataProvider(name = "projectData")
//	public Object[][] projectData()
//	{
//	    return CreatepageUtility.getProjectData("./testdata/CreateProjectData.xlsx", "Sheet1");
//	}
//
//	@Test(dataProvider = "projectData", priority = 2)
//	public void createProjectUsingExcel(String location, String fname, String lname,String email, String phone, String description) throws InterruptedException 
//	{
//	    if (!isLoginSuccessful) 
//	    {
//	        throw new SkipException("Skipping Project Creation: Login failed");
//	    }
//	    ProjectCreatePage project = new ProjectCreatePage(driver);
//	    project.createPrjtClick();
//	    project.createProject(location, fname, lname, email, phone, description);
//	}

//	@Test(priority = 3)
//	public void myOrganizationTest() 
//	{
//	    if (!isLoginSuccessful)
//	    {
//	        throw new SkipException("Skipping My Organization test: Login failed");
//	    }
//	    MyOrganization myOrg = new MyOrganization(driver);
//	    driver.navigate().refresh();
//	    try 
//	    {
//	        test.info("Clicking on My Organization");
//	        myOrg.myOrgClick();
//
//	        test.pass("My Organization page opened successfully");
//
//	    } catch (Exception e) {
//	        test.fail("My Organization test failed: " + e.getMessage());
//	        throw new RuntimeException(e);
//	    }
//	}
//	
//	
//	@Test(priority = 4)
//	public void usersTest() {
//
//	    if (!isLoginSuccessful) {
//	        throw new SkipException(
//	            "Skipping Users & Groups test: Login failed"
//	        );
//	    }
//
//	    UsersPage ug = new UsersPage(driver);
//
//	    try {
//
//	        test.info("Opening Users module and inviting user");
//	        ug.users("anjanaworkesr26@gmail.com");
//	        test.info("Opening Users module and inviting user");
//	        ug.Userremaining();
//	        test.pass("Users & Groups operations completed successfully");
//
//	    } catch (Exception e)
//	    {
//	        test.fail("Users test failed: " + e.getMessage());
//	        throw new RuntimeException(e);
//	    }
//	}
//	@Test(priority = 5)
//    public void groupsTest() throws Exception {
//
//        if (!isLoginSuccessful) {
//            throw new SkipException("Skipping Groups test: Login failed");
//        }
//
//        GroupsPage group = new GroupsPage(driver);
//
//        try {
//            test.info("Opening Groups module and creating group");
//            group.groups();
//            test.pass("Group created, user added, and group deleted successfully");
//
//        } catch (Exception e) {
//            test.fail("Groups test failed: " + e.getMessage());
//            throw e;
//        }
//    }
//	
//	
//	@Test(priority = 6)
//	public void workflowCreationTest() 
//	{
//	    if (!isLoginSuccessful)
//	    {
//	        throw new SkipException("Skipping Workflow Creation: Login failed");
//	    }
//	    driver.navigate().refresh();
//    	
//	    WorkflowPage workflow = new WorkflowPage(driver);
//	    try 
//	    {
//	    	 
//	    test.info("Clicking Workflow option");
//        workflow.workflowclick();
//        test.info("Creating workflow");
//        workflow.workflowCreation();
//        driver.navigate().refresh();
//        test.info("Deleting workflow");
//        workflow.deleteworkflow();
//        test.info("Opening workflow and performing status & checklist actions");
//        workflow.openworkflow();
//        test.pass("Workflow test executed successfully");
//
//    } catch (Exception e) 
//	    {
//        test.fail("Workflow test failed: "+ e.getMessage());
//        throw new RuntimeException(e);
//	    }
//	}
//	@Test(priority = 7)
//	public void materialsTest() 
//	{
//	    if (!isLoginSuccessful)
//	    {
//	        throw new SkipException("Skipping Materials test: Login failed");
//	    }
//
//	    MaterialsPage materials = new MaterialsPage(driver);
//	    try 
//	    { 
//	        test.info("Opening Materials module");
//	        materials.materialsClick();
//
//	        test.info("Creating material type");
//	        materials.createMaterials();
//            
//            test.info("Delete Materials");
//            materials.deleteMaterials();
//            driver.navigate().refresh();
//	        test.info("Opening material and adding item");
//	        materials.openMaterials();
//
//	        test.pass("Materials test completed successfully");
//
//	    } catch (Exception e) {
//	        test.fail("Materials test failed: " + e.getMessage());
//	        throw new RuntimeException(e);
//	    }
//	}
//	@Test(priority = 8)
//	public void financeTest() throws Exception {
//
//	    if (!isLoginSuccessful) {
//	        throw new SkipException("Skipping Finance test: Login failed");
//	    }
//
//	    FinancePage finance = new FinancePage(driver);
//
//	    try {
//	        test.info("Opening Finance module");
//	        finance.createfinance();
//	        test.pass("Finance created successfully"); 
//	        driver.navigate().refresh();
//	        test.info("Delete Finance module");
//	        finance.deleteFinance();
//	        test.pass("Finance deleted successfully");   
//	    } catch (Exception e) {
//	        test.fail("Finance test failed: " + e.getMessage());
//	        throw e;
//	    }
//	}
//
//	@Test(priority = 9)
//	public void officeAndSourceTest() throws Exception 
//	{
//	   if (!isLoginSuccessful) 
//	    {
//	        throw new SkipException("Skipping Office & Source test: Login failed");
//	    }
//
//	    OfficeAndSource office = new OfficeAndSource(driver);
//
//	    try {
//
//     		driver.navigate().refresh();
//	        test.info("Opening Office & Source module");
//	        office.clickOffice();
//        
//	        test.info("Creating a new Office");
//	        office.createOffice();
//	        test.info("Delete Office");
//	        office.deleteOffice();
//	        test.info("Creating a new source");
//	        office.createsource();
//	        test.info("Delete Office");
//	        office.deleteSource();
//
//	        test.pass("Office created successfully");
//
//	    } catch (Exception e) {
//	        test.fail("Office & Source test failed: " + e.getMessage());
//	        throw e;
//	    }
//	}
//	@Test(priority = 10)
//	public void rolesTest() throws Exception 
//	{
//	    if (!isLoginSuccessful) 
//	    {
//	        throw new SkipException("Skipping Roles test: Login failed");
//	    }
//
//      driver.navigate().refresh();
//	    RolesPage roles = new RolesPage(driver);
//
//	    try {
//
//	        test.info("Opening Roles module");
//	        roles.clickRole();
//
//	        test.info("Creating a new Role");
//	        roles.createRole();
//	        test.info("Deleting the Role");
//	        roles.deleterole();
//	        test.info("Adding user to the Role");
//	        driver.navigate().refresh();
//	        roles.aduser();
//	        test.pass("Roles test completed successfully");
//
//	    } catch (Exception e) {
//
//	        test.fail("Roles test failed: " + e.getMessage());
//	        throw e;
//	    }
//	}
//	@Test(priority = 11)
//	public void checklistTest() throws Exception {
//
//	    if (!isLoginSuccessful) {
//	        throw new SkipException("Skipping Checklist test: Login failed");
//	    }
//        driver.navigate().refresh();
//	    ChecklistPage checklist = new ChecklistPage(driver);
//
//	    try {
//	        test.info("Opening Checklist module");
//	        checklist.checklistClick();
//	        test.pass("checklist Opened successfully");
//
//	        checklist.permit();
//	        test.pass("Permit checklist filled successfully");
//
////	        test.info("Uploading permit document");
////	        checklist.uploadAndSubmitChecklist();
////	        test.pass("Permit document uploaded successfully");
//
//	    } catch (Exception e) {
//	        test.fail("Checklist test failed: " + e.getMessage());
//	        throw e;
//	    }
//	}
	@Test(priority = 2)
	public void projectTest() throws Exception 
	{
	    if (!isLoginSuccessful) 
	    {
	        throw new SkipException("Skipping Project test: Login failed");
	    }
	    driver.navigate().refresh();
	    ProjectPage project = new ProjectPage(driver);

	    try {

	        test.info("Opening Projects module");
	        project.prjClick();

	        test.info("Opening specific Project");
	        project.openProject();

	        
	        test.info("add stages to Project");
	        project.addStages();
	        driver.navigate().refresh();
	        test.info("Add comments");
	        project.comment();
	        test.info("Delete comments");
	        project.dltComment();
	        test.info("Remove Stages");
	        project.stgremove();
	        test.info("Send Email");
	        project.emailOption();
	        test.info("Call");
	        project.callOption();
	        driver.navigate().refresh();
	        test.info("SMS");
	        project.smsOption();
	        test.info("Appointments");
	        project.appointments();
	        test.pass("Project test completed successfully");

	    } catch (Exception e) 
	    {
	        test.fail("Project test failed: " + e.getMessage());
	        throw e;
	    }
	}


}
