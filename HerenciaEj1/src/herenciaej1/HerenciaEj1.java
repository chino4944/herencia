package herenciaej1;

import herenciaej1.entidades.Animal;
import herenciaej1.entidades.Caballo;
import herenciaej1.entidades.Gato;
import herenciaej1.entidades.Perro;

public class HerenciaEj1 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.tipoAlimento();
        Animal perro2 = new Perro("Teddy","Croquetas",10,"chihuahua");
        perro2.tipoAlimento();
        Animal gato1 = new Gato("pelusa","Galetas",15,"Siames");
        gato1.tipoAlimento();
        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.tipoAlimento();
        
    }
    
}
/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
*/