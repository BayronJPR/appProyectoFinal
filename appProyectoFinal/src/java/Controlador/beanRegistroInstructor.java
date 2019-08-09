/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Direccion;
import Model.DireccionDB;
import Model.DisciplinaUsuario;
import Model.DisciplinaUsuarioDB;
import Model.PerfilUsuario;
import Model.PerfilUsuarioDB;
import Model.Usuario;
import Model.UsuarioDB;
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

    String mensaje;
    
     private LinkedList<TelefonoUsuario> listaTelefnosUsuario= new LinkedList<TelefonoUsuario>();
    

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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LinkedList<TelefonoUsuario> getListaTelefnosUsuario() {
        return listaTelefnosUsuario;
    }

    public void setListaTelefnosUsuario(LinkedList<TelefonoUsuario> listaTelefnosUsuario) {
        this.listaTelefnosUsuario = listaTelefnosUsuario;
    }   
    
    
    
     //Agrega los telefonos en la lista y los
    //muestra en la tabla.
    public void agregarTelefonos(){
        
        TelefonoUsuario tel= new TelefonoUsuario(this.getNumeroTelefono(), 1);
        
        this.listaTelefnosUsuario.add(tel);
    }
    
    //Limpia la lista de los telefonos
    public void limpiarListaTelefonos(){
        this.listaTelefnosUsuario=null;
    }

    public void guardarUsuario() throws SNMPExceptions, SQLException {

        try {
            //this.fechaStringDate();

            //fecha para bitacora
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            String fechaRegis = sdf.format(fechaRegistra);
            String fechaEdt = sdf.format(FechaEdita);

            if (this.nombre.equals("") || this.apellido1.equals("")
                    || this.apellido2.equals("") || this.getCorreoElectronico().equals("")) {

                this.setMensaje("Introduzca los Datos Correctamente!");

            } else {

                Usuario usuario = new Usuario(this.cedula, this.tipoIdentificacion,
                        this.nombre, this.apellido1, this.apellido2, this.correoElectronico, this.fechaRegistra,
                        this.IdRegistra, this.FechaEdita, this.IdEdita, this.LOG_ACVIVO);

                UsuarioDB usuarioDB = new UsuarioDB();
                usuarioDB.InsertarUsuario(usuario);

                /*insert en tabla perfilUsuario
        todos los de autoregistros van con como instructores
        los de registro desde la db se insertan*/
                int codPerfil = 2;
                PerfilUsuarioDB pUsu = new PerfilUsuarioDB();
                pUsu.insertarPerfilUsuario(this.cedula, this.tipoIdentificacion, codPerfil);

                int log = 1;
                Direccion direccion = new Direccion(this.cedula, this.tipoIdentificacion, this.codprovincia, this.codcanton,
                        this.coddistrito, this.codbarrio, this.otrasSenas, this.fechaRegistra, this.IdRegistra, this.FechaEdita,
                        this.IdEdita, log);

                DireccionDB dirDB = new DireccionDB();
                dirDB.InsertarDireccion(direccion);

                /*insertar en tabla telefono*/
                for (TelefonoUsuario tel : this.listaTelefnosUsuario) {
                //código para acceder a cada campo del Item.
               // TelefonoUsuario tel = new TelefonoUsuario(this.cedula, this.tipoIdentificacion, this.numeroTelefono, log);
                TelefonoUsuarioDB telDB = new TelefonoUsuarioDB();
                telDB.insertarTelfonosUsuario(this.getCedula(), this.getTipoIdentificacion(), this.numeroTelefono, log);
                }
                DisciplinaUsuario disc = new DisciplinaUsuario(this.cedula, this.tipoIdentificacion, this.disciplinaDeportiva);

                // this.enviarEmail();
                //redirigir a la pagina de Comprobacion
                FacesContext.getCurrentInstance().getExternalContext().redirect("Ingreso.xhtml");

            }//fin del if de validacion

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
            this.setMensaje("El Usuario ya se Encuentran Registrados!");
        }

    }
}
