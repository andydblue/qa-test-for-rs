import org.testng.annotations.DataProvider;

public class DataProviderForStringArrayHandler {

    @DataProvider(name = "correct data")
    public static Object[][] getTestDataForPrintAnagramsIndexes() {
        return new Object[][] {
                {new String[] {"qwe", "wqe", "qwee", "a", "a"}, "a = 3, 4\r\neqw = 0, 1\r\n"},
                {new String[] {"!.7 ", " ", "QQ", "Q", " !.7", "  "}, " !.7 = 0, 4\r\n"},
                {new String[] {}, ""}
        };
    }
}
