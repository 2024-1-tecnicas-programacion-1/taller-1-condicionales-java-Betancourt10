package test;

import ejercicios.IMC;
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
public class IMCTest {
    @Test
    public void testBajo() {
        String valorEsperado = "Bajo";
        String valorActual = IMC.evaluar(50, 1.8,   20);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testMedio() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(76, 1.69,   34);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testMedio2() {
        String valorEsperado = "Medio";
        String valorActual = IMC.evaluar(44, 1.7,   52);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testAlto() {
        String valorEsperado = "Alto";
        String valorActual = IMC.evaluar(70, 1.65,   73);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testError() {
        String valorEsperado = "Error";
        String valorActual = IMC.evaluar(-2, 1.8,   18);
        assertEquals(valorEsperado, valorActual);
    }
    
}
