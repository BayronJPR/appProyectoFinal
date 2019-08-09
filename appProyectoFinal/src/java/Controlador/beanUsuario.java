/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import Model.Usuario;
import Model.UsuarioDB;

/**
 *
 * @author luubs
 */
@Named(value = "beanUsuario")
@SessionScoped
public class beanUsuario implements Serializable {

    /**
     * Creates a new instance of beanUsuario
     */
    
    int identificacion;
    int tipoIdentificacion;
    String nombre;
    String apellido1;
    String apellido2;
    String correoElectronico;
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    int log;
    
    String Mensaje;
    
    private LinkedList<SelectItem> listaUsuario = new LinkedList<>();
    
    public beanUsuario() {
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public LinkedList<SelectItem> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(LinkedList<SelectItem> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
     public void insertarDireccion() throws SNMPExceptions, SQLException {

        Usuario usu = new Usuario(this.identificacion, this.tipoIdentificacion, 
                this.nombre, this.apellido1, this.apellido2, this.correoElectronico, 
                this.fechaRegistra,this.idRegistra, this.fechaEdita,this.idEdita,this.log);
         

        UsuarioDB dirDB = new UsuarioDB();

        if (this.identificacion == 0 && this.tipoIdentificacion == 0 && this.nombre.equals("") && this.apellido1.equals("")
                && this.apellido2.equals("") && this.correoElectronico.equals("") && this.fechaRegistra.equals("") && this.idRegistra == 0
                && this.fechaEdita.equals("") && this.idEdita == 0){

            this.setMensaje("Campos Obligatorios!");

        } else {

            if (dirDB.consultarUsuarioPorID(this.identificacion, this.tipoIdentificacion) == true) {

                this.setMensaje("Direccion ya existe!");
            } else {
                dirDB.InsertarUsuario(usu);
                this.setMensaje("Direccion correctamente registrada!");
            }
            
/*
     Direccion(this.identificacionUsuario, this.tipoIdentificacionUsuario, 
                this.codProvincia, this.codCanton, this.codDistrito, this.codBarrio, this.otrasSenas, 
                this.fechaRegistra,this.idRegistra, this.fechaEdita,this.idEdita,this.log);
);
        */
        }

    }
    
}
