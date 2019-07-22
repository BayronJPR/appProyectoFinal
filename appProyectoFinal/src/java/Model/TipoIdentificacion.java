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
TipoIdentificacion(
idTipoIdentificacion int IDENTITY(1,1) not null,
descripcion varchar(150),
LOG_ACTIVO bit
);
 * 
 */
public class TipoIdentificacion {
    
    int idTipoIdentificacion;
    String Descripcion;
    int log;

    public TipoIdentificacion(int idTipoIdentificacion, String Descripcion, int log) {
       
        this.setIdTipoIdentificacion(idTipoIdentificacion);
        this.setDescripcion(Descripcion);
        this.setLog(log);
    }

    public TipoIdentificacion() {
    }

    
    
    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
    
    
}
