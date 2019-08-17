/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.Perfil;
import Model.PerfilDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author luubs
 */
@Named(value = "beanPrefil")
@SessionScoped
public class beanPrefil implements Serializable {

    /**
     * Creates a new instance of beanPrefil
     */
    
    private int idperfil;
    private String descipcion;
    private int LOG_ACTIVO;
    
    public beanPrefil() {
    }

    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public int getLOG_ACTIVO() {
        return LOG_ACTIVO;
    }

    public void setLOG_ACTIVO(int LOG_ACTIVO) {
        this.LOG_ACTIVO = LOG_ACTIVO;
    }
    
    public LinkedList<SelectItem> getListaPerfil() throws SNMPExceptions, SQLException {
        int id;
        String descripcion = "";

        LinkedList<Perfil> lista = new LinkedList<Perfil>();
        PerfilDB perfil = new PerfilDB();

        lista = perfil.moTodo();
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Perfil"));

        for (Iterator iter = lista.iterator();
                iter.hasNext();) {

            Perfil perf = (Perfil) iter.next();
            id = perf.getIdPerfil();
            descripcion = perf.getDescripcion();
            resultList.add(new SelectItem(id, descripcion));

        }

        return resultList;
    }

//    public void transferir() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        beanPrefil beanAuto
//                = context.getApplication().evaluateExpressionGet(context, "#{beanPrefil}", beanPrefil.class);
//
//        beanAuto.setIdperfil(idperfil);
//
//    }
    
}
