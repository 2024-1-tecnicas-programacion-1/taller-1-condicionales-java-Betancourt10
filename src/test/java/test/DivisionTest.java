package test;

import ejercicios.Division;
import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class DivisionTest {
    @Test
    public void testDivisionNoExacta() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testDivisionExacta() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 10\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(100, 10);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testDivisionNoExactaDos() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 6\n"
                + "Residuo: 2";
        String valorActual = Division.evaluar(32, 5);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testDivisionExactaDos() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 7\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(56, 8);
        assertEquals(valorEsperado, valorActual);
    } 
    
}
