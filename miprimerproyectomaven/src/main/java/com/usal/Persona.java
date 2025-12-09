package com.usal;

/**
 * Esta clase es muy importante. Y la documentación también.
 * 
 */
public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Esto es un método factory que sirve para crear una Persona a partir de un String con formato CSV
     * @param personaString String separado por comas con el nombre y apellido
     * @return retorna una Persona o lanza una @IllegalArgumentException si el formato es incorrecto
     */
    public static Persona fromCSVString(String personaString) {
        String[] trozos = personaString.split(",");
        if (trozos.length != 2) {
            throw new IllegalArgumentException("Parámetros inválidos");
        }
        return new Persona(trozos[0], trozos[1]);
    }

}
