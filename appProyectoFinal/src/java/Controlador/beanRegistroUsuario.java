/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Direccion;
import Model.DireccionDB;
import DAO.SNMPExceptions;
import Model.TelefonoUsuario;
import Model.TelefonoUsuarioDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

/**
 *
 * @author luubs
 */
@Named(value = "beanRegistroUsuario")
@SessionScoped
public class beanRegistroUsuario implements Serializable {

    /**
     * Creates a new instance of beanRegistroUsuario
     */
    
    
    //DATOS DIRECCION
   
    private int codprovincia;
    private int codcanton;
    private int coddistrito;
    private int codbarrio;
    private String otrasSenas;

    @ManagedProperty(value = "{beanDirecciones}")
    private beanDireccion beanDireccion;
    
    public beanDireccion getBeanDireccion() {
        return beanDireccion;
    }

    public void setBeanDireccion(beanDireccion beanDireccion) {
        this.beanDireccion = beanDireccion;
    }

    public int getCodprovincia() {
        return codprovincia;
    }

    public void setCodprovincia(int codprovincia) {
        this.codprovincia = codprovincia;
    }

    public int getCodcanton() {
        return codcanton;
    }

    public void setCodcanton(int codcanton) {
        this.codcanton = codcanton;
    }

    public int getCoddistrito() {
        return coddistrito;
    }

    public void setCoddistrito(int coddistrito) {
        this.coddistrito = coddistrito;
    }

    public int getCodbarrio() {
        return codbarrio;
    }

    public void setCodbarrio(int codbarrio) {
        this.codbarrio = codbarrio;
    }

    public String getOtrasSenas() {
        return otrasSenas;
    }

    public void setOtrasSenas(String otrasSenas) {
        this.otrasSenas = otrasSenas;
    }

  //DATOS DIRECCION
    
    public beanRegistroUsuario() {
    }
    
}
