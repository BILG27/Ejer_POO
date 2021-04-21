package ejerc_github;
import java.util.Scanner;
public class Ejerc_Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner (System.in);
        String nombre;
        String segnombre;
        String apellidos;
        int edad; 
        double peso;
        
        System.out.println("Hola que tal");  
        
        System.out.println("¿Cual es su nombre?");
        nombre=lec.nextLine();
        System.out.println("¿Cual es su segundo nombre?");
        segnombre=lec.nextLine();
        System.out.println("¿Cuales son sus apellidos?");
        apellidos=lec.nextLine();
        System.out.println("¿Cual es su edad?");
        edad=lec.nextInt();
        System.out.println("¿Cual es su peso?");
        peso=lec.nextDouble();
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su segundo nombre es: "+segnombre);
        System.out.println("Sus apellidos: "+apellidos);
        System.out.println("Su edad: "+edad);
        System.out.println("Su peso: "+peso);
        System.out.println("Usted ha finalizado");
    }
    
}
