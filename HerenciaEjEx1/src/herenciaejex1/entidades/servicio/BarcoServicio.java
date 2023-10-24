package herenciaejex1.entidades.servicio;

import herenciaejex1.entidades.Barco;
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
        Date DateanoFabricacion;
        System.out.println("Por favor introduzca la matricula del Barco");
        matricula = leer.nextLine();
        System.out.println("Por favor introduzca la eslora el valor de la eslora del barco en metros");
        eslora = leer.nextInt();
        System.out.println("");
    }
    
}
/*
*/