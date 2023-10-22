package herenciaej3;

import herenciaej3.entidades.Electrodomestico;
import herenciaej3.entidades.Lavadora;
import herenciaej3.entidades.Televisor;
import java.util.ArrayList;

public class HerenciaEj3 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(new Televisor(39,false,100d,"negro","b",15d));
        electrodomesticos.add(new Televisor(50,true,1000d,"negro","a",12d));
        electrodomesticos.add(new Lavadora(14,500d,"blanca","c",25d));
        electrodomesticos.add(new Lavadora(30,1000d,"blanca","a",19d));
        
        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
        }
        double suma=0;
        for (Electrodomestico aux : electrodomesticos) {
            System.out.println(aux.getClass().getName().substring(22)+" "+aux.getPrecio());
            suma += aux.getPrecio();
        }
        
        System.out.println("la suma del precio de todos los electrodomesticos es de:" + suma);
    }
}
    /*
21
*/

/*
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/