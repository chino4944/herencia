package herenciaej1.entidades;

public final class Caballo extends Animal{
    
    public Caballo(String nombre, String alimento, int edad, String raza){
        super(nombre,alimento,edad,raza);        
    }
    
    @Override
    public void tipoAlimento(){
        System.out.println(alimento);
    }
    
}
