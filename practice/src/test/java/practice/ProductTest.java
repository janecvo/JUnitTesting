package practice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {
    
    @DisplayName("Test totalCost() method")
    @Test

    double productCost = 2.5;
    int productQuantity = 4;
    String productName = "Socks";

    void testTotalCost(){
        assertEquals(10.0, Product.totalCost());
    }


    void testPrintProduct(){
        assertEquals("Socks cost $2.5 each and 4 units were purchased", Product.printProduct());
    }
}