/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MrHaksh
 */
public class Ejercicio {
    
    int idEjercicio;
    String descripcion;
    int log;

    public Ejercicio(int idEjercicio, String descripcion, int log) {
        this.setIdEjercicio(idEjercicio);
        this.setDescripcion(descripcion);
        this.setLog(log);
    }
    
    public Ejercicio() {
    }
        
    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
}
