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
TelefonoUsuario(
idTelefono int IDENTITY(1,1) not null,
identificacionUsuario int not null,
tipoIdentificacionUsuario int not null,
telefono varchar(25) not null,
LOG_ACTIVO bit
);
 */
public class TelefonoUsuario {
    
    int idTelefono;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    String telefono;
    int log;

    public TelefonoUsuario(int idTelefono, int identificacionUsuario, int tipoIdentificacionUsuario, String telefono, int log) {
        
        this.setIdTelefono(idTelefono);
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setTelefono(telefono);
        this.setLog(log);
    }

    public TelefonoUsuario() {
    }
    
    

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public int getTipoIdentificacionUsuario() {
        return tipoIdentificacionUsuario;
    }

    public void setTipoIdentificacionUsuario(int tipoIdentificacionUsuario) {
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
    
}
