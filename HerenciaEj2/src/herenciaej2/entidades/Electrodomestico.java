package herenciaej2.entidades;

import herenciaej2.enumeraciones.consumoEnergetico;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoEnergia;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergia, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
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
        this.color = color;
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
        switch (consumoEnergia){
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
        System.out.println(consumoEnergia);
               
    }
    
    public void comprobarColor(String color){
        
    }
    
}
/*
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
*/