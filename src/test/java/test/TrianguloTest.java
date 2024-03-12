package test;

import ejercicios.Triangulo;
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
public class TrianguloTest {
    @Test
    public void testNoEsUnTrianguloValido() {
        String valorEsperado = "No es un triángulo válido";
        String valorActual = Triangulo.evaluar(3, 6, 12);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testEsUnTrianguloEquilatero() {
        String valorEsperado = "Es un triángulo equilátero";
        String valorActual = Triangulo.evaluar(3, 3, 3);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testEsUnTrianguloIsosceles() {
        String valorEsperado = "Es un triángulo isósceles";
        String valorActual = Triangulo.evaluar(5, 8, 5);
        assertEquals(valorEsperado, valorActual);
    } 
    
    @Test
    public void testEsUnTrianguloEscaleno() {
        String valorEsperado = "Es un triángulo escaleno";
        String valorActual = Triangulo.evaluar(8, 2, 7);
        assertEquals(valorEsperado, valorActual);
    }
    
}
