package herenciaejex1.entidades.servicio;

import herenciaejex1.entidades.Alquiler;
import herenciaejex1.entidades.Barco;
import java.util.Date;
import java.util.Scanner;

public class AlquilerServicio {
    Scanner leer;
    
    public AlquilerServicio(){
        leer = new Scanner(System.in);
    }
            
    public Alquiler crearAlquiler(){
        
        String nombre;
        String documento;
        String fecha;
        int dia;
        int mes;
        int anio;
        Date fechaAlquiler;
        Date fechaDevolucion;
        Integer posicionMuelle;
        Barco barco;
        
        System.out.println("vamos a crear el perfil de alquiler");
        System.out.println(" introduce tu nombre");
        nombre = leer.nextLine();
        System.out.println("introduce tu documento");
        documento = leer.nextLine();
        do{
            System.out.println("introduce la fecha que inica el alquiler(aaaa/mm/dd)");
            fecha = (leer.nextLine());
            anio = Integer.parseInt(fecha.substring(0, 3));
            mes = Integer.parseInt(fecha.substring(5,6));
            dia = Integer.parseInt(fecha.substring(8, 9));
            fechaAlquiler = new Date(anio,mes,dia);
            
            System.out.println("introduce la fecha que finaliza el alquiler(aaaa/mm/dd)");
            fecha = (leer.nextLine());
            anio = Integer.parseInt(fecha.substring(0, 3));
            mes = Integer.parseInt(fecha.substring(5,6));
            dia = Integer.parseInt(fecha.substring(8, 9));
            fechaDevolucion = new Date(anio,mes,dia);
            if (fechaAlquiler.before(fechaDevolucion)){
                System.out.println("las fechas indicadas no concuerda puesto que la fecha que inicia esta despues luego de que termna"
                        + "por favor introduzca nuevamente las fechas");
            }
        } while (fechaAlquiler.before(fechaDevolucion));
        
        System.out.println("introduzca la posicion en el muelle");
        posicionMuelle = leer.nextInt();
        System.out.println(" ahora los datos del barco");
        barco = new BarcoServicio().crearBarco();
        return new Alquiler (nombre, documento,fechaAlquiler, fechaDevolucion,posicionMuelle,barco);
    }
    
    public void calcularAlquiler(Alquiler alquiler){
        Integer dia = alquiler.getFechaAlquiler().compareTo(alquiler.getFechaDevolucion());
    }
}
