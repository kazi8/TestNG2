import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(priority = 0)
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test9(){
        System.out.println("Test 9");
    }

}
