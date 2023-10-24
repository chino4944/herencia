package servicio;

import entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer; 

    public ServicioRectangulo(){
        leer = new Scanner(System.in);
    }

    public Rectangulo crearReactangulo(){
        Rectangulo r1;
        double base;
        double altura;
        System.out.println("solo tiene un lado!?");
        if (leer.nextLine().equalsIgnoreCase("si")){
            System.out.println("cual es el valor de la base");
            base = leer.nextDouble();
            altura = base;
        } else {
            System.out.println("cual es el valor de la base?");
            base = leer.nextDouble();
            System.out.println("cual es el valor de la altura?");
            altura = leer.nextDouble();
        }
        return new Rectangulo(base, altura);
    }
}
