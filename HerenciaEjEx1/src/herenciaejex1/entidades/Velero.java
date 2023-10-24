package herenciaejex1.entidades;

import java.util.Date;

public class Velero extends Barco {
    private Integer numeroMastil;

    public Velero() {
    }

    public Velero(String matricula, Integer eslora, Date anoFabricacion, Integer numeroMastil) {
        super(matricula, eslora, anoFabricacion);
        this.numeroMastil = numeroMastil;
    }

    public Integer getNumeroMastil() {
        return numeroMastil;
    }

    public void setNumeroMastil(Integer numeroMastil) {
        this.numeroMastil = numeroMastil;
    }

    @Override
    
    public String getMatricula() {
        return matricula;
    }

    @Override
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    
    public Integer getEslora() {
        return eslora;
    }

    @Override
    
    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    @Override
    
    public Date getAnoFabricacion() {
        return anoFabricacion;
    }

    @Override
    
    public void setAnoFabricacion(Date anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
    
    
    
}
