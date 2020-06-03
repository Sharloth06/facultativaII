package com.example.recicle;

import java.sql.Date;

public class Model {
    private String title;
    private String descripcion;
    private int image;
    private String profesor;
    private String dia;
    private String fechaent;
    private String hora;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProfesor() {return profesor;}

    public void setProfesor(String profesor) { this.profesor = profesor;}

    public String getDia() { return dia; }

    public void setDia(String dia) { this.dia = dia; }

    public String getFechaent() { return fechaent; }

    public void setFechaent(String fechaent) { this.fechaent = fechaent; }

   public String getHora() { return hora; }

  public void setHora(String hora) { this.hora = hora;}
}

