import org.junit.jupiter.api.BeforeEach;
import org.junit. jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import modelo.Modelo;

public class ModeloTest {

    private Modelo modelo;

    @BeforeEach
    public void setUp(){
        modelo = new Modelo();
    }

    @Test
    public void testSuma(){

        assertEquals(15.1, modelo.suma(7.5,7.6));
    }

    @Test
    public void testResta(){
        assertEquals(24.0, modelo.resta(36, 12));
    }

    @Test
    public void testMulti(){
        assertEquals(64, modelo.multiplicacion(8, 8));
    }

    @Test
    public void testDivisionValida(){
        assertEquals(3.3333333333333335, modelo.division(10.0, 3.0));
    }

    @Test
    public void testDivisionEntreCero(){
        assertThrows(ArithmeticException.class, () ->{
            modelo.division(10.0, 0.0);
        });
    }

    @Test
    public void testSumaResNegativo(){
        assertEquals(-2, modelo.suma(3,-5));
    }

    @Test
    public void testRestaResNegativo(){
        assertEquals(-2, modelo.resta(3,5));
    }

    @Test
    public void testMultiDosNegativosDaPositivo(){
        assertEquals(16, modelo.multiplicacion(-4, -4));
    }

    @Test
    public void testMultiUnoNegativo(){
        assertEquals(-15, modelo.multiplicacion(3, -5));
    }

    @Test
    public void testDivisonDosNegativosDaPositivo(){
        assertEquals(8, modelo.division(-16,-2));
    }

    @Test
    public void testDivisionUnoNegativodaNegativo(){
        assertEquals(-5, modelo.division(15, -3));
    }

}
