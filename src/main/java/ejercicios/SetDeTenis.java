package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) { 
        if (numVictoriasA < 0 || numVictoriasB < 0) 
            { 
                return "Error.";
            }
        else if (numVictoriasA > 7 || numVictoriasB > 7) 
            { 
                return "Inválido.";
            } 
        else if (numVictoriasA >= 6 && (numVictoriasA - numVictoriasB) >= 2) 
            { 
                return "Ganó A."; 
            } 
        else if (numVictoriasB >= 6 && (numVictoriasB - numVictoriasA) >= 2) 
            { 
                return "Ganó B."; 
            } 
        else if (numVictoriasA <= 6 && numVictoriasB <= 6) 
            { 
                return "Aún no termina."; 
            } 
        else if (numVictoriasA == 7 && numVictoriasB == 6)
            { 
                return "Ganó A.";
            } 
        else if (numVictoriasA == 6 && numVictoriasB == 7)
            { 
                return "Ganó B.";
            }
        else 
            { 
                return "Inválido.";
            }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
