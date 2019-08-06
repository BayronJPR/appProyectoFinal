/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.TipoIdentificacion;
import Model.TipoIdentificacionDB;
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
@Named(value = "beanTipoIdentificacion")
@SessionScoped
public class beanTipoIdentificacion implements Serializable {

    /**
     * Creates a new instance of beanTipoIdentificacion
     */
    public beanTipoIdentificacion() {
    }
    
    private int idTipoIdentificacion;
    private String descripcion;
    private int Log_Activo;

    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLog_Activo() {
        return Log_Activo;
    }

    public void setLog_Activo(int Log_Activo) {
        this.Log_Activo = Log_Activo;
    }
    
      public LinkedList<SelectItem> getListaTipoIdent() 
               throws SNMPExceptions, SQLException{
        int id;
        String descripcion="";
        
        LinkedList<TipoIdentificacion> lista = new LinkedList<TipoIdentificacion>();
        TipoIdentificacionDB tipoIdeDB= new TipoIdentificacionDB();
        
        lista= tipoIdeDB.moTodo();
        LinkedList resultList= new LinkedList();
        resultList.add(new SelectItem(0,"Seleccione Identificacion"));
        
        for(Iterator iter = lista.iterator();
                iter.hasNext();){
            
            TipoIdentificacion tipoIdent= (TipoIdentificacion)iter.next();
            id=tipoIdent.getIdTipoIdentificacion();
            descripcion=tipoIdent.getDescripcion();
            resultList.add(new SelectItem(id,descripcion));
            
        }
        
        return resultList;  
    }
      
       public void transferir(){
           FacesContext context= FacesContext.getCurrentInstance();
        beanRegistroInstructor beanAuto= 
          context.getApplication().evaluateExpressionGet(context,"#{beanRegistroInstructor}",beanRegistroInstructor.class);
         
        beanAuto.setTipoIdentificacion(idTipoIdentificacion);
        
        
    }
    
    
    
}
