import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTwo {
    @Test(dataProvider = "provider", dataProviderClass = DataProviderHelper.class)
    public void test4(int ssn, String name, int ph){
        //System.out.println("Test 4");
        System.out.println("SSN is "+ssn);
        System.out.println("Name is "+name);
        System.out.println("Phone no is "+ph);


    }

    @Test
    public void test5(){
        System.out.println("Test 5");
    }



}
