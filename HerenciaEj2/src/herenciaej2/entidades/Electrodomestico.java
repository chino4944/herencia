package herenciaej2.entidades;

import herenciaej2.enumeraciones.consumoEnergetico;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoEnergia;
    protected Double peso;
    protected Scanner leer;

    public Electrodomestico() {
        comprobarConsumoElectrico();
        comprobarColor();
        leer  = new Scanner(System.in);
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergia, Double peso) {
        this.precio = precio;
        this.color = color.toUpperCase();
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
        comprobarConsumoElectrico();
        comprobarColor();
        leer  = new Scanner(System.in);

    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toUpperCase();
    }

    public Character getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(Character consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoElectrico(){
        if (consumoEnergia == null) {
            consumoEnergia = 'F';
        } else {
            switch (consumoEnergia) {
                case 'A':
                    break;
                case 'B':
                    break;
                case 'C':
                    break;
                case 'D':
                    break;
                case 'E':
                    break;
                default:
                    this.consumoEnergia = 'F';

            }
        }
    }
    
    public void comprobarColor() {
        if (color == null) {
            color = "BLANCO";
        } else {
            switch (color) {
                case "NEGRO":
                    break;
                case "ROJO":
                    break;
                case "AZUL":
                    break;
                case "GRIS":
                    break;
                default:
                    this.color = "BLANCO";
            }
        }
    }
    
    public void crearElectrodomestico(){
      
        System.out.println("Introduzca por favor el color:");
        color = leer.nextLine();
        System.out.println("Introduzca por favor el consumo del electrodomestico");
        consumoEnergia = leer.nextLine();
        
    /*protected Double precio;
    protected Character consumoEnergia;
    protected Double peso;*/
    }
    
}
/*
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
*/