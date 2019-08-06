/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.DisciplinaDB;
import Model.Disciplina;
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
@Named(value = "beanDisciplinaDeportiva")
@SessionScoped
public class beanDisciplinaDeportiva implements Serializable {

    private int idDisciplina;
    private String descipcion;
    private int LOG_ACTIVO;

    public beanDisciplinaDeportiva() {
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
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

    public LinkedList<SelectItem> getListaDisciplinas()
            throws SNMPExceptions, SQLException {
        int id;
        String descripcion = "";

        LinkedList<Disciplina> lista = new LinkedList<Disciplina>();
        DisciplinaDB disciplina = new DisciplinaDB();

        lista = disciplina.moTodo();
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Disciplina"));

        for (Iterator iter = lista.iterator();
                iter.hasNext();) {

            Disciplina discip = (Disciplina) iter.next();
            id = discip.getIdDisciplina();
            descripcion = discip.getDescripcion();
            resultList.add(new SelectItem(id, descripcion));

        }

        return resultList;
    }

    public void transferir() {
        FacesContext context = FacesContext.getCurrentInstance();
        beanDisciplinaDeportiva beanAuto
                = context.getApplication().evaluateExpressionGet(context, "#{beanRegistroInstructor}", beanDisciplinaDeportiva.class);

        beanAuto.setIdDisciplina(idDisciplina);

    }

}
