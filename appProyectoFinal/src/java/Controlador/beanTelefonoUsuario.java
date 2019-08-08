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
import Model.TelefonoUsuario;
import Model.TelefonoUsuarioDB;

/**
 *
 * @author luubs
 */
@Named(value = "beanTelefonoUsuario")
@SessionScoped
public class beanTelefonoUsuario implements Serializable {

    int idTelefono;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    String telefono;
    int log;
    private LinkedList<SelectItem> listaTelefonoUsuario = new LinkedList();
    String mensaje;

    public beanTelefonoUsuario() {
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

//    public LinkedList<SelectItem> getListaTelefonoUsuario() throws SNMPExceptions, SQLException {
//        int idTelefono;
//        int numeroIdentificacion;
//        int tipoIdentificacion;
//        String telefono = "";
//        int log = 1;
//
//        LinkedList<TelefonoUsuario> listaTel = new LinkedList<TelefonoUsuario>();
//        TelefonoUsuarioDB TelDB = new TelefonoUsuarioDB();
//
//        listaTel = TelDB.moTodo();
//        LinkedList resultList = new LinkedList();
//        resultList.add(new SelectItem(0, "Seleccione Telefono"));
//
//        for (Iterator iter = listaTel.iterator();
//                iter.hasNext();) {
//
//            TelefonoUsuario Tel = (TelefonoUsuario) iter.next();
//            
//            idTelefono = Tel.getIdTelefono();
//            numeroIdentificacion = Tel.getIdentificacionUsuario();
//            tipoIdentificacion = Tel.getTipoIdentificacionUsuario();
//            telefono = Tel.getTelefono().toString();
//            log = 1;
//
//            resultList.add(new SelectItem(idTelefono, numeroIdentificacion, tipoIdentificacion,telefono,log));
//
//        }
//
//        return resultList; 
//    }
    public void setListaTelefonoUsuario(LinkedList<SelectItem> listaTelefonoUsuario) {
        this.listaTelefonoUsuario = listaTelefonoUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void insertarTelefono() throws SNMPExceptions, SQLException {

        TelefonoUsuario tel = new TelefonoUsuario(this.tipoIdentificacionUsuario, this.identificacionUsuario,
                this.telefono, this.log);

        TelefonoUsuarioDB telDB = new TelefonoUsuarioDB();

        if (this.telefono.equals("")) {

            this.setMensaje("Campos Obligatorios!");

        } else {

            if (telDB.consultarTelefono(this.telefono) == true) {

                this.setMensaje("Teléfono ya existe!");
            } else {
                telDB.insertarTelfonosUsuario(tipoIdentificacionUsuario, identificacionUsuario, telefono, log);
                this.setMensaje("Teléfono correctamente registrado!");
            }

        }

    }

    public void transferir() {
        FacesContext context = FacesContext.getCurrentInstance();
        beanRegistroInstructor beanAuto
                = context.getApplication().evaluateExpressionGet(context, "#{beanRegistroInstructor}", beanRegistroInstructor.class);

        beanAuto.setNumeroTelefono(telefono);

    }

}
