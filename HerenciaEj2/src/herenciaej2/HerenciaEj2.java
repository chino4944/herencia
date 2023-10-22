package herenciaej2;

import herenciaej2.entidades.Lavadora;
import herenciaej2.entidades.Televisor;

public class HerenciaEj2 {

    public static void main(String[] args) {
    
        Lavadora l1 = new Lavadora();
        Televisor t1 = new Televisor();
        l1.crearLavadora(); 
        t1.crearTelevisor();
        l1.precioFinal();
        t1.precioFinal();
        System.out.println("el precio de la lavadora es de: "+l1.getPrecio()+"$");
        System.out.println("el precio del televisor es de: "+t1.getPrecio()+"$");
    
    }
    
}
/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
*/