package herenciaej2.entidades;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, Double precio, String color, String consumoEnergia, Double peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("ingrese la carga en kg de la lavadora");
        carga = super.leer.nextInt();
    }
    
    public void precioFinal(){
        super.precioFinal();
        if (carga>30){
            super.precio += 500;
        }
    }
}
