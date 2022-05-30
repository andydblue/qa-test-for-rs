import org.testng.Assert;
import org.testng.annotations.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringArrayHandlerTest {

    private static StringArrayHandler stringArrayHandler;
    private final PrintStream systemOutput = System.out;
    private final ByteArrayOutputStream outputCapture = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(outputCapture));
    }

    @Test(dataProviderClass = DataProviderForStringArrayHandler.class, dataProvider = "correct data")
    void  printAnagramsIndexesTest(String[] inputArray, String output) {
        stringArrayHandler = new StringArrayHandler(inputArray);
        stringArrayHandler.printAnagramsIndexes();
        Assert.assertEquals(outputCapture.toString(), output);
    }

    @Test(expectedExceptions = NullPointerException.class)
    void  printAnagramsIndexesTest() {
        stringArrayHandler = new StringArrayHandler(null);
        stringArrayHandler.printAnagramsIndexes();
    }

    @AfterMethod
    public void tearDown() {
        outputCapture.reset();
        System.setOut(systemOutput);
    }
}
