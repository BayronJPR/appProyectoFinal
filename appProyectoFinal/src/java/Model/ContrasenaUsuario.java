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
ContrasenaUsuario(
idContrasena int IDENTITY(1,1) not null,
identificacionUsuario int not null,
tipoIdentificacionUsuario int not null,
contrasena varchar(100),
contrasenaVieja varchar(100),
FechaRegistra varchar(250),
IdRegistra int,
FechaEdita varchar(250),
IdEdita int,
LOG_ACTIVO bit
);
 * 
 */
public class ContrasenaUsuario {
    
    int idContrasena;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    String contrasena;
    String contrasenaVieja;
    int tipoPerfil;
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    int log;

    public ContrasenaUsuario(int idContrasena, int identificacionUsuario, int tipoIdentificacionUsuario, String contrasena, String contrasenaVieja,int tipoPerfil, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        
        this.setIdContrasena(idContrasena);
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setContrasena(contrasena);
        this.setContrasenaVieja(contrasenaVieja);
        this.setTipoPerfil(tipoPerfil);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }

    public ContrasenaUsuario(int identificacionUsuario, int tipoIdentificacionUsuario, String contrasena, String contrasenaVieja,int tipoPerfil, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setContrasena(contrasena);
        this.setContrasenaVieja(contrasenaVieja);
        this.setTipoPerfil(tipoPerfil);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }
    
    

    public ContrasenaUsuario() {
    }
    

    public int getIdContrasena() {
        return idContrasena;
    }

    public void setIdContrasena(int idContrasena) {
        this.idContrasena = idContrasena;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasenaVieja() {
        return contrasenaVieja;
    }

    public void setContrasenaVieja(String contrasenaVieja) {
        this.contrasenaVieja = contrasenaVieja;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }  
     
    public String getFechaRegistra() {
        return fechaRegistra;
    }

    public void setFechaRegistra(String fechaRegistra) {
        this.fechaRegistra = fechaRegistra;
    }

    public int getIdRegistra() {
        return idRegistra;
    }

    public void setIdRegistra(int idRegistra) {
        this.idRegistra = idRegistra;
    }

    public String getFechaEdita() {
        return fechaEdita;
    }

    public void setFechaEdita(String fechaEdita) {
        this.fechaEdita = fechaEdita;
    }

    public int getIdEdita() {
        return idEdita;
    }

    public void setIdEdita(int idEdita) {
        this.idEdita = idEdita;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
    
    
}
