import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class CurrencyConvertorTest1 {
    private static CurrencyConvertor obj;

    @BeforeClass
    public static void setObj(){
        obj = new CurrencyConvertor();
    }

    @Test
    public void test_dollar_to_rupees(){
        assertEquals(800,obj.dollar_to_rupees(10));
    }

}