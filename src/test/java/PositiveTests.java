
import com.finder.pageObjects.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveTests extends BaseTest{
    @DataProvider(name = "ClientInfo")
    public static Object[][] clientInfo(){
        return new Object[][]{{"Cover for pregnancy and childbirth",
                "Couple", "Hospital Only", "Navy Health Ltd", "5453 HOYLETON"}};
    }

    @Test(dataProvider = "ClientInfo")
    public void importanceTest(String sImportance, String sCoverage, String sCoverageType, String sFund, String sPostcode){
        Importance importance = new Importance();
        importance.selectOptionByText(sImportance);
        assertEquals(importance.getOptionByValue(), "having_children");
    }

    @Test(dataProvider = "ClientInfo")
    public void simpleTest (String sImportance, String sCoverage, String sCoverageType, String sFund, String sPostcode) {
        new Importance().selectOptionByText(sImportance);
        Coverage coverage = new Coverage();
        coverage.selectCoverage(sCoverage);
        coverage.selectCoverageType(sCoverageType);
        new Fund().selectFund(sFund);
        new Postcode().setPostcode(sPostcode);
        coverage.submitRequest()
                .getSearchResults()
                .shouldHaveSize(19);
    }

}
