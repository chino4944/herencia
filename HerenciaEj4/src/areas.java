
import entidades.Circulo;
import entidades.Rectangulo;
import servicio.ServicioCirculo;
import servicio.ServicioRectangulo;


public class areas {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2d,4d);
        Rectangulo r1 = new Rectangulo(10d,15d);
        System.out.println("el area del rectangulo es "+r1.calcularArea());
        System.out.println("el perimetro del rectangulo es "+r1.calcularPerimetro());
        System.out.println("el area del circulo es "+c1.calcularArea());
        System.out.println("el area del circulo es "+c1.calcularPerimetro());

    }
    
}


