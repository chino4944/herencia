package servicio;

import entidades.Circulo;
import java.util.Scanner;

public class ServicioCirculo {

    Scanner leer;
    
    public ServicioCirculo(){
        leer = new Scanner(System.in);
    }
    
    public Circulo crearCirculo(){
        Circulo c1;
        System.out.println("¿el circulo tiene solo perimetro o radio?");
        double radio;
        double perimetro;
        if (leer.nextLine().equalsIgnoreCase("si")){
            System.out.println("¿solo tiene radio?");
            if (leer.nextLine().equalsIgnoreCase("si")){
                System.out.println("introduzca el radio");
                radio = leer.nextDouble();
                perimetro = (radio*2);
            } else {
                System.out.println("introduzca el permetro");
                perimetro = leer.nextDouble();
                radio = (perimetro/2);
            }
        } else {
            System.out.println("cual es el perimetro!?");
            perimetro = leer.nextDouble();
            System.out.println("cual es el radio!?");
            radio = leer.nextDouble();
        }
        
        return new Circulo (perimetro,radio);
    }
    
}
