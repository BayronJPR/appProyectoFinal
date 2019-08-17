/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

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
