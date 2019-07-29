/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
PerfilUsuario(
identificacionUsuario int not null,
tipoIdentificacionUsuario int not null,
idPerfil int not null,
); 
 * 
 * @author MrHaksh
 */
public class PerfilUsuario {
    
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    int idPerfil;

    public PerfilUsuario(int identificacionUsuario, int tipoIdentificacionUsuario, int idPerfil) {
        
       this.setIdentificacionUsuario(identificacionUsuario);
       this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
       this.setIdPerfil(idPerfil);
    }

    public PerfilUsuario() {
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

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }
    
    
}
