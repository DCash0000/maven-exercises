import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestTest {

        @Test
        public void testIfCompanyNameIsEquals(){
            String expected = "Cash";
            String actual = "Cash";
            System.out.println("In testIfCompanyNameIsEquals");
            assertEquals(expected, actual);
        }

        @Test
        public  void testIfTrueOrFalse(){
            int num1 = 5;
            int num2 = 7;
            System.out.println("In testIfTrueOrFalse()");
            assertTrue(num1 < num2);
            assertFalse(num1 > num2);
        }

}
