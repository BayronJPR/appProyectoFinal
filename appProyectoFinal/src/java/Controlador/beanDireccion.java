/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.Barrio;
import Model.BarrioDB;
import Model.Canton;
import Model.CantonDB;
import Model.Distrito;
import Model.DistritoDB;
import Model.Provincia;
import Model.ProvinciaDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import Model.Direccion;
import Model.DireccionDB;
/**
 *
 * @author MrHaksh
 */
@Named(value = "beanDireccion")
@SessionScoped
public class beanDireccion implements Serializable {

    /**
     * Creates a new instance of beanDireccion_
     * 
     * 
     */
    public beanDireccion() {
    }
    
    private int idDireccion;
    private int identificacionUsuario;
    private int tipoIdentificacionUsuario;
    private int log;
    
    //variables de Provincia 
    private int codProvincia;//
    private String dsc_corta_provincia;
    private String dscProvincia;
    private int logActivo;

    //variables de Canton
    private int idCanton;//
    private int codProvinciaCan;
    private int codCanton;
    private String dscCanton;
    private int logActivoCan;

    //variables de Distrito
    private int idDistrito;
    private int codProvinciaDis;
    private int codCantonDis;
    private int codDistrito;//
    private String dscDistrito;
    private int logActivoDis;

    //variables de Barrio
    private int idBarrio;
    private int codProviciaBar;
    private int codCantonBar;
    private int codDistritoBar;
    private int codBarrio;//
    private String dscBarrio;
    private int logActivoBar;
    private String otrasSenas;
    
    //Control
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    
    String Mensaje;

    //listas 
    private LinkedList<SelectItem> listaProvincias = new LinkedList<>();
    private LinkedList<SelectItem> listaCantones = new LinkedList<>();
    private LinkedList<SelectItem> listaDistritos = new LinkedList<>();
    private LinkedList<SelectItem> listaBarrios = new LinkedList<>();

    
    
    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getDsc_corta_provincia() {
        return dsc_corta_provincia;
    }

    public void setDsc_corta_provincia(String dsc_corta_provincia) {
        this.dsc_corta_provincia = dsc_corta_provincia;
    }

    public String getDscProvincia() {
        return dscProvincia;
    }

    public void setDscProvincia(String dscProvincia) {
        this.dscProvincia = dscProvincia;
    }

    public int getLogActivo() {
        return logActivo;
    }

    public void setLogActivo(int logActivo) {
        this.logActivo = logActivo;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public int getCodProvinciaCan() {
        return codProvinciaCan;
    }

    public void setCodProvinciaCan(int codProvinciaCan) {
        this.codProvinciaCan = codProvinciaCan;
    }

    public int getCodCanton() {
        return codCanton;
    }

    public void setCodCanton(int codCanton) {
        this.codCanton = codCanton;
    }

    public String getDscCanton() {
        return dscCanton;
    }

    public void setDscCanton(String dscCanton) {
        this.dscCanton = dscCanton;
    }

    public int getLogActivoCan() {
        return logActivoCan;
    }

    public void setLogActivoCan(int logActivoCan) {
        this.logActivoCan = logActivoCan;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getCodProvinciaDis() {
        return codProvinciaDis;
    }

    public void setCodProvinciaDis(int codProvinciaDis) {
        this.codProvinciaDis = codProvinciaDis;
    }

    public int getCodCantonDis() {
        return codCantonDis;
    }

    public void setCodCantonDis(int codCantonDis) {
        this.codCantonDis = codCantonDis;
    }

    public int getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(int codDistrito) {
        this.codDistrito = codDistrito;
    }

    public String getDscDistrito() {
        return dscDistrito;
    }

    public void setDscDistrito(String dscDistrito) {
        this.dscDistrito = dscDistrito;
    }

    public int getLogActivoDis() {
        return logActivoDis;
    }

    public void setLogActivoDis(int logActivoDis) {
        this.logActivoDis = logActivoDis;
    }

    public int getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(int idBarrio) {
        this.idBarrio = idBarrio;
    }

    public int getCodProviciaBar() {
        return codProviciaBar;
    }

    public void setCodProviciaBar(int codProviciaBar) {
        this.codProviciaBar = codProviciaBar;
    }

    public int getCodCantonBar() {
        return codCantonBar;
    }

    public void setCodCantonBar(int codCantonBar) {
        this.codCantonBar = codCantonBar;
    }

    public int getCodDistritoBar() {
        return codDistritoBar;
    }

    public void setCodDistritoBar(int codDistritoBar) {
        this.codDistritoBar = codDistritoBar;
    }

    public int getCodBarrio() {
        return codBarrio;
    }

    public void setCodBarrio(int codBarrio) {
        this.codBarrio = codBarrio;
    }

    public String getDscBarrio() {
        return dscBarrio;
    }

    public void setDscBarrio(String dscBarrio) {
        this.dscBarrio = dscBarrio;
    }

    public int getLogActivoBar() {
        return logActivoBar;
    }

    public void setLogActivoBar(int logActivoBar) {
        this.logActivoBar = logActivoBar;
    }

    public String getOtrasSenas() {
        return otrasSenas;
    }

    public void setOtrasSenas(String otrasSenas) {
        this.otrasSenas = otrasSenas;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
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

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
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

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    

    //Llena la lista con provincias y se llena el combo con provincias.
    public LinkedList<SelectItem> getListaProvincias() throws SNMPExceptions, SQLException {

        String descripcion = "";
        int codigoPro = 0;

        LinkedList<Provincia> lista = new LinkedList<Provincia>();
        ProvinciaDB provinciaDB = new ProvinciaDB();

        lista = provinciaDB.moTodo();

        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Provincia"));

        for (Iterator iter = lista.iterator();
                iter.hasNext();) {

            Provincia provincia = (Provincia) iter.next();
            descripcion = provincia.getDscProvincia();
            codigoPro = provincia.getCodProvincia();
            resultList.add(new SelectItem(codigoPro, descripcion));

        }
        return resultList;
    }

    public void setListaProvincias(LinkedList<SelectItem> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }
//Llena la lista con cantones y se llena el combo con cantones.

    public LinkedList<SelectItem> getListaCantones() throws SNMPExceptions, SQLException {
        String descripcion = "";
        int codigoCant = 0;

        LinkedList<Canton> lista = new LinkedList<Canton>();
        CantonDB cantonDB = new CantonDB();

        lista = cantonDB.SeleccionarCantonPorProvincia(codProvincia);

        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Cantón"));

        for (Iterator iter = lista.iterator();
                iter.hasNext();) {

            Canton canton = (Canton) iter.next();
            descripcion = canton.getDscCanton();
            codigoCant = canton.getCodCanton();
            resultList.add(new SelectItem(codigoCant, descripcion));

        }
        return resultList;
    }

    public void setListaCantones(LinkedList<SelectItem> listaCantones) {
        this.listaCantones = listaCantones;
    }

//Llena la lista con distritos y se llena el combo con distritos.
    public LinkedList<SelectItem> getListaDistritos() throws SNMPExceptions, SQLException {
        String descripcion = "";
        int codigoDistr = 0;

        LinkedList<Distrito> lista = new LinkedList<Distrito>();
        DistritoDB distritoDB = new DistritoDB();

        lista = distritoDB.SeleccionarDistritoPorCantonPorProvincia(codProvincia, idCanton);

        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Distrito"));

        for (Iterator iter = lista.iterator();
                iter.hasNext();) {

            Distrito distrito = (Distrito) iter.next();
            descripcion = distrito.getDscDistrito();
            codigoDistr = distrito.getCodDistrito();
            resultList.add(new SelectItem(codigoDistr, descripcion));

        }
        return resultList;
    }

    public void setListaDistritos(LinkedList<SelectItem> listaDistritos) {
        this.listaDistritos = listaDistritos;
    }

//Llena la lista con barrios y se llena el combo con barrios.
    public LinkedList<SelectItem> getListaBarrios() throws SNMPExceptions, SQLException {

        String descripcion = "";
        int codigoBarrio = 0;

        LinkedList<Barrio> lista = new LinkedList<Barrio>();
        BarrioDB barrioDB = new BarrioDB();

        //mandar esto al insert de la tabla direcciones....
        lista = barrioDB.SeleccionarBarrioDistritoPorCantonPorProvincia(codProvincia, idCanton, codDistrito);

        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Barrio"));

        for (Iterator iter = lista.iterator();
                iter.hasNext();) {

            Barrio barrio = (Barrio) iter.next();
            descripcion = barrio.getDscBarrio();
            codigoBarrio = barrio.getCodBarrio();
            resultList.add(new SelectItem(codigoBarrio, descripcion));

        }
        return resultList;
    }

    public void setListaBarrios(LinkedList<SelectItem> listaBarrios) {
        this.listaBarrios = listaBarrios;
    }
    
    
    public void insertarDireccion() throws SNMPExceptions, SQLException {

        Direccion dir = new Direccion(this.identificacionUsuario, this.tipoIdentificacionUsuario, 
                this.codProvincia, this.codCanton, this.codDistrito, this.codBarrio, this.otrasSenas, 
                this.fechaRegistra,this.idRegistra, this.fechaEdita,this.idEdita,this.log);
         

        DireccionDB dirDB = new DireccionDB();

        if (this.identificacionUsuario == 0 && this.tipoIdentificacionUsuario == 0) {

            this.setMensaje("Campos Obligatorios!");

        } else {

            if (dirDB.consultarDireccionPorID(this.identificacionUsuario, this.tipoIdentificacionUsuario) == true) {

                this.setMensaje("Direccion ya existe!");
            } else {
                dirDB.InsertarDireccion(dir);
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


    
    public void transferir(){
        FacesContext context= FacesContext.getCurrentInstance();
        
        //transfiere a instructor
        beanRegistroInstructor beanAuto= 
          context.getApplication().evaluateExpressionGet(context,"#{beanRegistroInstructor}",beanRegistroInstructor.class);
              
        beanAuto.setCodprovincia(codProvincia);
        beanAuto.setCodcanton(idCanton);
        beanAuto.setCoddistrito(codDistrito);
        beanAuto.setCodbarrio(codBarrio);
        beanAuto.setOtrasSenas(otrasSenas);
        
        
        // transfiere a deportista
         beanAutoRegistroDeportista beanAutoDepor = 
          context.getApplication().evaluateExpressionGet(context,"#{beanAutoRegistroDeportista}",beanAutoRegistroDeportista.class);
              
        beanAutoDepor.setCodprovincia(codProvincia);
        beanAutoDepor.setCodcanton(idCanton);
        beanAutoDepor.setCoddistrito(codDistrito);
        beanAutoDepor.setCodbarrio(codBarrio);
        beanAutoDepor.setOtrasSenas(otrasSenas);
    }
    
}
