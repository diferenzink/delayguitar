package com.diferenzink.delayguitar;

/**
 * Created by Luis on 12/1/18.
 */

public class Nota {
    private String nombre;
    private String imagen;
    private float duracion;

    public Nota(String nombre, String imagen, float duracion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
}
