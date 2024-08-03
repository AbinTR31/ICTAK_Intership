package com.ictak.intership;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import AutomationConstants.AutomationConstant;

import java.io.IOException;

import mentorView.MentorLogin;
import mentorView.AssignedProjectsChecking;
import mentorView.ViewSubmission;
import adminView.AdminLogin;
import adminView.AdminLogout;
import adminView.MentorAdding;
import adminView.MentorDeleting;
import adminView.MentorInfoUpdate;
import adminView.ProjectDelete;
import adminView.ProjectEdit;
import adminView.ProjectTopicAdding;
import mentorView.MarkCommentEditing;
import mentorView.DeleteSubmission;
import mentorView.SubmissionSorting; 
import mentorView.ReferenceMaterialsAdding;
import mentorView.ReferenceMaterialsDelete;
import mentorView.MarkCommentAdding;
import mentorView.EvaluationStatusView;

@Test
public class TestClass extends TestBase{

		
	public TestClass() throws IOException
	{
		super();
	}

	String actualResult=null;
	AdminLogin testobj = null;
	ProjectTopicAdding testobj1 = null;
	ProjectEdit testobj2 = null;
	MentorAdding testobj3 = null;
	ProjectDelete  testobj4 = null;
	MentorInfoUpdate  testobj5 = null;
	MentorDeleting testobj6 = null;
	AdminLogout testobj7 = null;
	MentorLogin testobj8 = null;
	AssignedProjectsChecking testobj9 = null;
	ViewSubmission testobj10 = null;
	MarkCommentEditing testobj11 = null;
	DeleteSubmission testobj12 = null;
	SubmissionSorting testobj13 = null;
	ReferenceMaterialsAdding testobj14 = null;
	ReferenceMaterialsDelete testobj15 = null;
	MarkCommentAdding testobj16 = null;
	EvaluationStatusView  testobj17 = null;

		
	    @Test(priority = 1)
		public void TC_IIP_1_2_1 ()
	   	{
	   		testobj=new AdminLogin(driver);
	   		testobj.loginPage();
	   		testobj.setUsername(prop.getProperty("AdminUsername"));
	   		testobj.setPassword(prop.getProperty("AdminPassword"));
	   		testobj.loginClick();
	   		String actualresult = testobj.getAdminText();
	   		Assert.assertEquals(actualresult,AutomationConstant.ExpectedAdminText);
	   	}
	    
	    @Test(priority = 2)
		public void TC_IIP_1_2_2 ()
	   	{
	   		testobj1=new ProjectTopicAdding(driver);
	   		testobj1.clickProject();
	   		testobj1.addProject();
	   		testobj1.setTopic(prop.getProperty("Project_name"));
	   		testobj1.addClick();
	   		testobj1.getProjectAdddingAlert();
	   		testobj1.projectAddingeAlert();
	   	}

	    @Test(priority = 3)
		public void TC_IIP_1_2_3 () throws InterruptedException
	   	{
	   		testobj2=new ProjectEdit(driver);
	   		testobj2.editBtnClick(prop.getProperty("Current_topic_Edit"));
	   		testobj2.topicEdit(prop.getProperty("Current_topic_name"));
	   		testobj2.topicSave();
	   		actualResult =testobj2.getProjectAddingAlert();
	   		AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForProjectEditing);
	   		testobj2.saveAlert();  
	   	}
	    
	    @Test(priority = 4)
	    public void TC_IIP_1_2_4 () throws InterruptedException
	    {
	    	testobj4=new ProjectDelete(driver);
	   		testobj4.deleteBtnClick(prop.getProperty("Delete_topic_name"));
	   		actualResult =testobj4.getdeleteAlert();
	   		AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForProjectDeleting);
	   		testobj4.deleteAlert();  
	    }
	    
	    @Test(priority = 5)
	    public void  TC_IIP_1_2_5 () throws InterruptedException
	   	{
	   		testobj3=new MentorAdding(driver);
	   		testobj3.Addmentors();
	   		testobj3.setName(prop.getProperty("Mentor_name"));
	   		testobj3.setEmail(prop.getProperty("Mentor_email"));
	   		testobj3.setNumber(prop.getProperty("Mentor_number"));
	   		testobj3.setPassword(prop.getProperty("Mentor_password"));
	   		testobj3.dropdownClick();
	   		testobj3.topicSelecting(prop.getProperty("Mentor_topic"));
	   		testobj3.submitClick();
	   		actualResult = testobj3.getMentorAddingAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForMentorAdding);
	   	}
   
	    @Test(priority = 6)
	    public void  TC_IIP_1_2_6 () throws InterruptedException 
	    {
	    	testobj5=new MentorInfoUpdate(driver);
	    	testobj5.clickMentors();
	    	testobj5.clickUpdate(prop.getProperty("Update_mentor_name"));
	    	testobj5.infoUpdate(prop.getProperty("Updated_email"));
	    	testobj5.clickSubmit();
	   		actualResult = testobj5.getEditAlert();
	   		AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForMentorInfoUpdating);
	    	testobj5.EditAlert();
	    }
	  	
	    @Test(priority = 7)
	    public void  TC_IIP_1_2_7 () throws InterruptedException 
	    {
	    	testobj6=new MentorDeleting(driver);
	    	testobj6.clickMentors();
	    	testobj6.clickDelete(prop.getProperty("Delete_mentor_name"));
	    	actualResult = testobj6.getmentorDeleteAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForMentorInfoDeleting);
			testobj6.mentorDeleteAlert();
	    }
	    
	    @Test(priority = 8)
	    public void  TC_IIP_1_2_8 () 
	    {
	    	testobj7=new AdminLogout(driver);
	    	testobj7.adminLogout();
	    	String actualresult = testobj7.getLogoutText();
	    	Assert.assertEquals(actualresult,AutomationConstant.ExpectedHomeText);
	    }
	    
	    @Test(priority = 9)
		public void TC_IIP_1_3_1 ()
	   	{
	   		testobj8=new MentorLogin(driver);
	   		testobj8.loginPage();
	   		testobj8.setUsername(prop.getProperty("MentorUsername"));
	   		testobj8.setPassword(prop.getProperty("MentorPassword"));
	   		testobj8.loginClick();
	   		String actualresult = testobj8.getMentorText();
	   		Assert.assertEquals(actualresult,AutomationConstant.ExpectedMentorText);
	   	}
	    
	    @Test(priority = 10)
	    public void TC_IIP_1_3_2 ()
	   	{
	   		testobj9=new AssignedProjectsChecking(driver);
	   		testobj9.clickShow();
	   		String actualresult = testobj9.getAssignedProjectsText();
	   		Assert.assertEquals(actualresult,AutomationConstant.ExpectedTextAssignedProjectPage);
	   		
	   	}
	    
	    @Test(priority = 11)
	    public void TC_IIP_1_3_3 () throws InterruptedException
	   	{
	   		testobj10=new ViewSubmission(driver);
	   		testobj10.clickView(prop.getProperty("Project_submissions"));
	   		String actualUrl = testobj10.verifySubmissionPageUrl();
	   		Assert.assertEquals(actualUrl,AutomationConstant.ExpectedTextViewSubmnissionPageUrl);
	   	}
	    
	    @Test(priority = 12)
	    public void TC_IIP_1_3_4 () throws InterruptedException
		{
		    testobj17 = new EvaluationStatusView(driver);
		    testobj17.checkEvaluationStatus();
		    String actualresult = testobj17.getEvaluationStatusText();
		    Assert.assertEquals(actualresult,AutomationConstant.ExpectedTextEvaluationStatusPage);
		}
	    
	    @Test(priority = 13)
	    public void  TC_IIP_1_3_5 () throws InterruptedException
	   	{
	   		testobj16=new  MarkCommentAdding(driver);
	   		testobj16.clickEvaluvate(prop.getProperty("Evaluate_submission"));
	   		testobj16.clickMArkDropdown();
	   		testobj16.addMark(prop.getProperty("Add_mark"));
	   		testobj16.addComment(prop.getProperty("Add_comment"));
	   		testobj16.clickSubmit();
	   		actualResult = testobj16.getmarkCommmentAddingAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedTexMarkandCommentAddingPage);
	   		testobj16.markCommmentAddingAlert();
	   	}	
	    
	    @Test(priority = 14)
	    public void  TC_IIP_1_3_6 () throws InterruptedException
	   	{
	   		testobj11=new  MarkCommentEditing(driver);
	   		testobj11.clickView(prop.getProperty("Project_updation"));
	   		testobj11.clickDropdown();
	   		testobj11.clickMark(prop.getProperty("Update_mark"));
	   		testobj11.commentUpdate(prop.getProperty("Update_comment"));
	   		testobj11.clickUpdate();
	   		actualResult = testobj11.getmarkCommmentUpdateAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedTexMarkandCommentEditingPage);
	   		testobj11.markCommmentUpdateAlert();
	   	}	
	    
	    @Test(priority = 15)
	    public void  TC_IIP_1_3_7 () throws InterruptedException
	    {
	    	testobj12=new DeleteSubmission(driver);
	    	testobj12.Delete(prop.getProperty("Submission_delete"));
	   		actualResult = testobj12.getdeleteSubmissionAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForSubmissionDeleting);
	    	testobj12.deleteSubmissionAlert();
	    }
	    
	    @Test(priority = 16)
	    public void TC_IIP_1_3_8 () throws InterruptedException
	    {;
	    	testobj13=new SubmissionSorting(driver);
	    	testobj13.Sorting();
	    	testobj13.batchSelecting(prop.getProperty("Batch"));
	    	actualResult = testobj13.getSortingText();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedTextSubmissionSortingPage);
	    }
	    
	    @Test(priority = 17)
	    public void TC_IIP_1_3_9 () throws InterruptedException
	    {
	    	testobj14=new ReferenceMaterialsAdding(driver);
	    	testobj14.referenceMaterialsClick();
	    	testobj14.addMaterial();
	    	testobj14.materialTitle(prop.getProperty("Material_title"));
	    	testobj14.materialDescription(prop.getProperty("Material_description"));
	    	testobj14.materialLink(prop.getProperty("Material_link"));
	    	testobj14.referenceAdd();
	    	actualResult = testobj14.getReferenceAddAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForReferenceMaterialAdding);
	    	testobj14.referenceAddAlert();
	    }
	    
	    @Test(priority = 18)
	    public void TC_IIP_1_3_10 () throws InterruptedException
	    {
	    	testobj15= new ReferenceMaterialsDelete(driver);
	    	testobj15.referenceMaterialsDelete(prop.getProperty("Material_Delete"));
	    	actualResult = testobj15.getreferenceMaterialsDeleteAlert();
			AssertJUnit.assertEquals(actualResult, AutomationConstant.ExpectedAlertMessageForReferenceMaterialDeleting);
	    	testobj15.referenceMaterialsDeleteAlert();;
	    }	
}
