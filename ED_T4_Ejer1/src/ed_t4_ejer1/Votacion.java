/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_t4_ejer1;

/**
 *
 * @author garrodlu
 */
public class Votacion {
    private String nombre;
    private Integer votos;
    private Integer edad;

    public Votacion(String nombre, Integer votos, Integer edad) {
        this.nombre = nombre;
        this.votos = votos;
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votacion{" + "nombre=" + nombre + ", votos=" + votos + '}';
    }
    
}
