package herenciaej1.entidades;

public final class Perro extends Animal {
    
    public Perro(String nombre, String alimento, int edad, String raza){
        super(nombre,alimento,edad,raza);        
    }
    
    @Override
    public void tipoAlimento(){
        System.out.println(alimento);
    }
    
}
