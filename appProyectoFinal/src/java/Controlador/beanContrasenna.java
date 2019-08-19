/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import Model.ContrasenaUsuario;
import Model.ContrasenaUsuarioDB;

/**
 *
 * @author luubs
 */
@Named(value = "beanContrasenna")
@SessionScoped
public class beanContrasenna implements Serializable {

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

    public beanContrasenna() {
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

    public void iniciarSesion() throws SNMPExceptions, SQLException, IOException {
        
       // ContrasenaUsuario contrasUsua = null;
        ContrasenaUsuario contrasUsua = new ContrasenaUsuario();
        
        contrasUsua = ContrasenaUsuarioDB.iniciarSesion(this.getIdentificacionUsuario(), this.getContrasena(), this.getTipoPerfil());
        //Se comprueba la variable contrasena, si es nula, retorna mensaje de error
        if (contrasUsua != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("ContrasenaUsuario", this.getIdentificacionUsuario());//Se agrega el usuario a la sesión
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("Perfil",this.getTipoPerfil());
            //Se comprueba el Activo del usuario. Si es 0 (primera vez en el sistema) se redirecciona a otra pagina para cambiar la clave

            if (contrasUsua.getTipoPerfil() == 1)//Si es Administrador
            {
                FacesContext.getCurrentInstance().getExternalContext().redirect("PaginaPrincipal.xhtml");
            } else if (contrasUsua.getTipoPerfil() == 2)//Si es Instrcutor
            {
                FacesContext.getCurrentInstance().getExternalContext().redirect("PaginaPrincipal.xhtml");
            } else//Si es Deportista
            {
                FacesContext.getCurrentInstance().getExternalContext().redirect("PaginaPrincipal.xhtml");
            }

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso: Usuario o Contraseña incorrecta", "Usuario o Contraseña incorrecta"));
        }
    }

}
