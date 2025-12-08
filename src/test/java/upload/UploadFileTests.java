package upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTests extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadFileDemoPage = homePage.clickFileUploadLink();
      var resultText =  uploadFileDemoPage.clickChooseToChooseFile("D:\\Assoumpta_Uwabera_Recommendation_Letter.jpg");
       assertEquals(resultText,"File Successfully Uploaded", "Uploading failed!");
    }
}
