/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.TelefonoUsuario;
import Model.TelefonoUsuarioDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.context.FacesContext;
import Model.DisciplinaUsuario;
import Model.DisciplinaUsuarioDB;

/**
 *
 * @author luubs
 */
@Named(value = "beanDisciplinaUsuario")
@SessionScoped
public class beanDisciplinaUsuario implements Serializable {

    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    int idDisciplina;
    String mensaje;

    public beanDisciplinaUsuario() {
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

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void insertarTelefono() throws SNMPExceptions, SQLException {

        DisciplinaUsuario dis = new DisciplinaUsuario(this.identificacionUsuario, tipoIdentificacionUsuario, this.idDisciplina);

        DisciplinaUsuarioDB discDB = new DisciplinaUsuarioDB();

        if (this.idDisciplina != 0) {

            this.setMensaje("Campos Obligatorios!");

        } else {

            if (discDB.consultarDiscilplinaUsuario(this.identificacionUsuario, this.tipoIdentificacionUsuario, this.idDisciplina) == true) {

                this.setMensaje("Disciplina ya ligada al usuario!");
            } else {
                discDB.insertarDisciplinaUsuario(tipoIdentificacionUsuario, identificacionUsuario, idDisciplina);
                this.setMensaje("Discilplina correctamente registrada!");
            }

        }

    }
}

//    public void transferir() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        beanRegistroInstructor beanAuto
//                = context.getApplication().evaluateExpressionGet(context, "#{beanRegistroInstructor}", beanRegistroInstructor.class);
//
//     //   beanAuto.set(identificacionUsuario);
//
//    }

