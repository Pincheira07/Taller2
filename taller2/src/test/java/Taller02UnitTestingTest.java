import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Taller02UnitTestingTest {

    @Test
    void esPalindromoTest() {
        Taller02UnitTesting pruebaPalindromo = new Taller02UnitTesting();
        boolean esPalindromo = pruebaPalindromo.esPalindromo("amoraroma");
        assertTrue(esPalindromo);


    }
    @Test
    public void esPalindromoFalse(){
        Taller02UnitTesting pruebaPalindromo = new Taller02UnitTesting();
        boolean esPalindromo = pruebaPalindromo.esPalindromo("la tele letal");
        assertFalse(esPalindromo);
    }
    @Test
    public void formatearPalabraTest(){
        Taller02UnitTesting pruebaPalindromo = new Taller02UnitTesting();
        String formateada = pruebaPalindromo.formatearPalabra("la tele letal");
        assertEquals("lateleletal",formateada);

    }
}