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
    public void test_sek_to_rupees(){
        assertEquals(90,obj.sek_to_rupees(10));
    }

}