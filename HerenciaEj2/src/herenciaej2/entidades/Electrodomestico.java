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

    public Electrodomestico(Double precio, String color, String consumoEnergia, Double peso) {
        this.precio = precio;
        this.color = color.toUpperCase();
        this.consumoEnergia = consumoEnergia.toUpperCase().charAt(0);
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
        System.out.println("Introduzca por favor el consumo");
        String aux = leer.nextLine().toUpperCase();
        consumoEnergia = aux.charAt(0);
        System.out.println("introduzca el precio");
        precio = leer.nextDouble();
        System.out.println("por favor introduzca el peso");
        peso = leer.nextDouble();
        comprobarConsumoElectrico();
        comprobarColor();
    }
    
    public void precioFinal(){
        switch (consumoEnergia) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;

        }
        
        if (peso<20){
            precio += 100; 
        } else if(peso >19 && peso<50) {
            precio += 500;
        } else if(peso >49 && peso<80) {
            precio += 800;
        } else if(peso >79) {
            precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + ", leer=" + leer + '}';
    }

}
/*
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
*/