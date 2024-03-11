package ejercicios;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anio){
        if (anio % 4 == 0)
            {
                return anio + " Es bisiesto";
            } 
        else if (anio % 400 == 0) 
            { 
                return anio + " Es bisiesto"; 
            } 
        else 
            { 
                return anio + " No es bisiesto"; 
            } 
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anio = lector.nextInt();
        
        String respuesta = evaluar(anio);
        System.out.println(respuesta);
    }
            
}
