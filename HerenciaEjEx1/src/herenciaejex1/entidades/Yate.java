package herenciaejex1.entidades;

import java.util.Date;

public class Yate extends Motor {
    private Integer numeroCamarote;

    public Yate() {
    }

    public Yate(String matricula, Integer eslora, Date anoFabricacion, Integer potenciaCv, Integer numeroCamarote) {
        super(matricula, eslora, anoFabricacion, potenciaCv);
        this.numeroCamarote = numeroCamarote;
    }

    public Integer getNumeroCamarote() {
        return numeroCamarote;
    }

    public void setNumeroCamarote(Integer numeroCamarote) {
        this.numeroCamarote = numeroCamarote;
    }

    @Override
    
    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    @Override
    
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
