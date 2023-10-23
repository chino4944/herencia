package herenciaejex1.entidades;

import java.util.Date;

public class Motor extends Barco {
    protected Integer potenciaCv;

    public Motor() {
    }

    public Motor(Integer potenciaCv, String matricula, Integer eslora, Date anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
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
