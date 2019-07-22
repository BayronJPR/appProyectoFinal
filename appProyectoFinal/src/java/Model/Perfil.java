/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MrHaksh
 * 
Perfil(
idPerfil int IDENTITY(1,1) not null,
descripcion varchar(150),
LOG_ACTIVO bit
);
 * 
 */
public class Perfil {
    
    int idPerfil;
    String descripcion;
    int log;

    public Perfil(int idPerfil, String descripcion, int log) {
        this.setIdPerfil(idPerfil);
        this.setDescripcion(descripcion);
        this.setLog(log);
    }

    public Perfil() {
    } 
    
    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
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
