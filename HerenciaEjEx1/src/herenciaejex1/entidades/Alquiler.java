package herenciaejex1.entidades;

import java.util.Date;

public class Alquiler {
    private String nombre;
    private String documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer posicionMuelle;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, Date fechaAlquiler, Date fechaDevolucion, Integer posicionMuelle, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionMuelle = posicionMuelle;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionMuelle() {
        return posicionMuelle;
    }

    public void setPosicionMuelle(Integer posicionMuelle) {
        this.posicionMuelle = posicionMuelle;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    
}

