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
 * @author MrHaksh
 */
@Named(value = "beanRegistroInstructor")
@SessionScoped
public class beanRegistroInstructor implements Serializable {

    
    private int cedula;
    private int tipoIdentificacion;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correoElectronico;
    private String fechaRegistra;
    private int IdRegistra;
    private String FechaEdita;
    private int IdEdita;
    private int LOG_ACVIVO;
    // tabla telefono
    private int idTelefono;
    private String numeroTelefono;
    //DATOS DIRECCION
    private int codprovincia;
    private int codcanton;
    private int coddistrito;
    private int codbarrio;
    private String otrasSenas;
    // disciplina deportiva
    private int disciplinaDeportiva;
    /**
     * Creates a new instance of beanRegistroInstructor
     */
    public beanRegistroInstructor() {
    }
    
     @ManagedProperty(value = "{beanDirecciones}")
    private beanDireccion beanDireccion;

    public beanDireccion getBeanDireccion() {
        return beanDireccion;
    }

    public void setBeanDireccion(beanDireccion beanDireccion) {
        this.beanDireccion = beanDireccion;
    }
    
    @ManagedProperty(value = "{beanTelefonoUsuario}")
    private beanTelefonoUsuario beanTelefonoUsuario;

    public beanTelefonoUsuario getBeanTelefonoUsuario() {
        return beanTelefonoUsuario;
    }

    public void setBeanTelefonoUsuario(beanTelefonoUsuario beanTelefonoUsuario) {
        this.beanTelefonoUsuario = beanTelefonoUsuario;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(int tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaRegistra() {
        return fechaRegistra;
    }

    public void setFechaRegistra(String fechaRegistra) {
        this.fechaRegistra = fechaRegistra;
    }

    public int getIdRegistra() {
        return IdRegistra;
    }

    public void setIdRegistra(int IdRegistra) {
        this.IdRegistra = IdRegistra;
    }

    public String getFechaEdita() {
        return FechaEdita;
    }

    public void setFechaEdita(String FechaEdita) {
        this.FechaEdita = FechaEdita;
    }

    public int getIdEdita() {
        return IdEdita;
    }

    public void setIdEdita(int IdEdita) {
        this.IdEdita = IdEdita;
    }

    public int getLOG_ACVIVO() {
        return LOG_ACVIVO;
    }

    public void setLOG_ACVIVO(int LOG_ACVIVO) {
        this.LOG_ACVIVO = LOG_ACVIVO;
    }

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(int disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }
}
