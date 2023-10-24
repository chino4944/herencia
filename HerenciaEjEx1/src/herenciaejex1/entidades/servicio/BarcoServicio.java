package herenciaejex1.entidades.servicio;

import herenciaejex1.entidades.Barco;
import herenciaejex1.entidades.Motor;
import herenciaejex1.entidades.Velero;
import herenciaejex1.entidades.Yate;
import java.util.Date;
import java.util.Scanner;

public class BarcoServicio {

    private Scanner leer;
    
    public BarcoServicio(){
        leer = new Scanner(System.in);
    }
    
    public Barco crearBarco(){
        String matricula;
        Integer eslora;
        Date anoFabricacion;
        Integer numeroMastil;
        Integer potenciaCv;
        Integer numeroCamarote;
        System.out.println("Por favor introduzca la matricula del Barco");
        matricula = leer.nextLine();
        System.out.println("Por favor introduzca la eslora el valor de la eslora del barco en metros");
        eslora = leer.nextInt();
        System.out.println("para ");
        Integer anio = leer.nextInt();
        anoFabricacion = new Date(anio);
        System.out.println("el barco es un velero?");
        if (leer.nextLine().equalsIgnoreCase("si")) {
            System.out.println("cual es el numero de mastiles");
            numeroMastil = leer.nextInt();
            return new Velero(matricula, eslora, anoFabricacion, numeroMastil);
        } else {
            System.out.println("el barco tiene motor");
        }
        if (leer.nextLine().equalsIgnoreCase("si")) {
            System.out.println("cual es el cv del motor");
            potenciaCv = leer.nextInt();
            System.out.println("es un yate?");
            if (leer.nextLine().equalsIgnoreCase("si")) {
                System.out.println("cuantos camarotes tiene!?");
                numeroCamarote = leer.nextInt();
                return new Yate(matricula, eslora, anoFabricacion, potenciaCv, numeroCamarote);
            } else {
                return new Motor(matricula, eslora, anoFabricacion, potenciaCv);
            }
        } else {
            return new Barco(matricula, eslora, anoFabricacion);
        }
    }
    
}
/*
*/