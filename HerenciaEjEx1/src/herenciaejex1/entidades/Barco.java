package herenciaejex1.entidades;

import java.util.Date;

public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Date anoFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Date anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Date anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
    
}
