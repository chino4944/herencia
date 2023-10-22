package herenciaej2.entidades;

public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, Double precio, String color, String consumoEnergia, Double peso) {
        super(precio, color, consumoEnergia, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("de cuantas pulgadas es el televisor");
        pulgadas = super.leer.nextInt();
        System.out.println("el televisor tiene TDT");
        tdt= super.leer.nextBoolean();
    }
    
    public void precioFinal(){
        super.precioFinal();
        
        if (tdt){
            super.precio += 500;
        }
        
        if (pulgadas>40){
            super.precio += ((super.precio*30)/100) ;
        }
    }
    
}