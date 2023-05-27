import org.testng.annotations.DataProvider;

public class DataProviderHelper {
    @DataProvider(name = "provider")
    public Object[][] dataProvider(){
        Object[][] newData = new Object[3][3];
        newData[0][0] = 111;
        newData[0][1] = "Kazi";
        newData[0][2] = 929222;
        newData[1][0] = 222;
        newData[1][1] = "Fakrul";
        newData[1][2] = 380000;
        newData[2][0] = 333;
        newData[2][1] = "Islam";
        newData[2][2] = 0171333;

        return newData;

    }
}
