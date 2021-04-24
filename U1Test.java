import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;

public class U1Test{

    @BeforeEach                                         
    public void setUp() throws Exception {
        calc = new U1();
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    public void testMultiply() {
        assertEquals(20, calc.multiply(4,5),      
        "Regular multiplication should work");          
    }
}