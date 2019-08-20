/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.Direccion;
import Model.DireccionDB;
import Model.DisciplinaUsuario;
import Model.PerfilUsuarioDB;
import Model.TelefonoUsuario;
import Model.TelefonoUsuarioDB;
import Model.Usuario;
import Model.UsuarioDB;
import Model.AutoRegistroDeportista;
import Model.AutoRegistroDeportistaDB;
import Model.Correo;
import Model.ContrasenaUsuario;
import Model.ContrasenaUsuarioDB;
import Model.DisciplinaUsuarioDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author luubs
 */
@Named(value = "beanAutoRegistroDeportista")
@SessionScoped
public class beanAutoRegistroDeportista implements Serializable {

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
    private int LOG_ACTIVO =1;
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

    private float peso;
    private float talla;
    private float altura;
    private float IMC;
    private String gradoObesidad;
    private String objetivo1;
    private String objetivo2;
    private String objetivo3;

    private String contrasenna;
    private String contrasennaVieja;
    private int tipoPerfil = 3;

    String mensaje;
    private String mensajeTel;

    private LinkedList<TelefonoUsuario> listaTelefnosUsuario = new LinkedList<TelefonoUsuario>();
    private LinkedList<Usuario> listaDeportistas = new LinkedList<Usuario>();

    public beanAutoRegistroDeportista() {
    }

    @ManagedProperty(value = "{beanDireccion}")
    private beanDireccion beanDireccion;

    public beanDireccion getBeanDireccion() {
        return beanDireccion;
    }

    public void setBeanDireccion(beanDireccion beanDireccion) {
        this.beanDireccion = beanDireccion;
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
        return LOG_ACTIVO;
    }

    public void setLOG_ACVIVO(int LOG_ACVIVO) {
        this.LOG_ACTIVO = LOG_ACVIVO;
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

    public int getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(int disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public String getGradoObesidad() {
        return gradoObesidad;
    }

    public void setGradoObesidad(String gradoObesidad) {
        this.gradoObesidad = gradoObesidad;
    }

    public int getLOG_ACTIVO() {
        return LOG_ACTIVO;
    }

    public void setLOG_ACTIVO(int LOG_ACTIVO) {
        this.LOG_ACTIVO = LOG_ACTIVO;
    }

    public String getObjetivo1() {
        return objetivo1;
    }

    public void setObjetivo1(String objetivo1) {
        this.objetivo1 = objetivo1;
    }

    public String getObjetivo2() {
        return objetivo2;
    }

    public void setObjetivo2(String objetivo2) {
        this.objetivo2 = objetivo2;
    }

    public String getObjetivo3() {
        return objetivo3;
    }

    public void setObjetivo3(String objetivo3) {
        this.objetivo3 = objetivo3;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensajeTel() {
        return mensajeTel;
    }

    public void setMensajeTel(String mensajeTel) {
        this.mensajeTel = mensajeTel;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getContrasennaVieja() {
        return contrasennaVieja;
    }

    public void setContrasennaVieja(String contrasennaVieja) {
        this.contrasennaVieja = contrasennaVieja;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public LinkedList<TelefonoUsuario> getListaTelefnosUsuario() {
        return listaTelefnosUsuario;
    }

    public void setListaTelefnosUsuario(LinkedList<TelefonoUsuario> listaTelefnosUsuario) {
        this.listaTelefnosUsuario = listaTelefnosUsuario;
    }

    public void limpiarListaTelefonos() {
        this.listaTelefnosUsuario = null;

    }

    public LinkedList<Usuario> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(LinkedList<Usuario> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }
    
    
//    public void setListaDeportistas(LinkedList<Usuario> listaDeportistas) {
//        this.listaDeportistas = listaDeportistas;
//    }
//    
//    public LinkedList<Usuario> getListaDeportistas() throws SNMPExceptions, SQLException{
//       String nom = "";
//        String cod = "";
//
//        LinkedList<Usuario> lista = new LinkedList<Usuario>();
//        UsuarioDB deportistaDB = new UsuarioDB();
//
//        lista = deportistaDB.moTodo();
//
//        LinkedList resultList = new LinkedList();
//        resultList.add(new SelectItem(0, "Seleccione Deportista"));
//
//        for (Iterator iter = lista.iterator();
//                iter.hasNext();) {
//
//            Usuario usu = (Usuario) iter.next();
//            cod = usu.getNombre();
//            nom = usu.getApellido1();
//            resultList.add(new SelectItem(cod, nom));
//
//        }
//        return resultList;
//    }  
    
    public void limpiarCampos(){
    this.setTipoIdentificacion(0);
    this.setCedula(0);
    this.setNombre("");
    this.setApellido1("");
    this.setApellido2("");
    this.setNumeroTelefono("");
    this.setCorreoElectronico("");
    this.setCodprovincia(0);
    this.setCodcanton(0);
    this.setCoddistrito(0);
    this.setCodbarrio(0);
    this.setOtrasSenas("");
    this.setPeso(0.0f);
    this.setTalla(0.0f);
    this.setAltura(0.0f);
    this.setIMC(0.0f);
    this.setGradoObesidad("");
    this.setDisciplinaDeportiva(0);
    this.setObjetivo1("");
    this.setObjetivo2("");
    this.setObjetivo3("");
    this.setContrasenna("");
    }    
    
     
    public void mostrarLista()throws SNMPExceptions, SQLException{
        
        UsuarioDB depor= new UsuarioDB();       
        this.setListaDeportistas(depor.moTodo());      
        
    }

    public void calcularGradoObesidad() {

        calcularIMC();

        if (IMC < 16) {
            gradoObesidad = "Infrapeso: Delgadez Severa";
        } else if (IMC <= 16 && IMC <= 16.99) {
            gradoObesidad = "Infrapeso: Delgadez moderada";
        } else if (IMC <= 17 && IMC <= 18.49) {
            gradoObesidad = "Infrapeso: Delgadez aceptable";
        } else if (IMC <= 18.5 && IMC <= 24.99) {
            gradoObesidad = "Peso Normal";
        } else if (IMC <= 25 && IMC <= 29.99) {
            gradoObesidad = "Sobrepeso";
        } else if (IMC <= 30 && IMC <= 34.99) {
            gradoObesidad = "Obeso: Tipo I";
        } else if (IMC <= 35 && IMC <= 40) {
            gradoObesidad = "Obeso: Tipo III";
        } else {
            gradoObesidad = "no existe clasificacion";
        }
    }

    public void calcularIMC() {

        float dato = (float) Math.pow(altura, 2);
        IMC = peso / dato;
        this.setIMC(IMC);
    }

    public void agregarTelefonos() {

//        TelefonoUsuario tel= new TelefonoUsuario(this.getNumeroTelefono(), 1);
//        
//        this.listaTelefnosUsuario.add(tel);
        TelefonoUsuarioDB telDB = new TelefonoUsuarioDB();
        try {

            if (telDB.consultarTelefono(numeroTelefono) == true) {

                this.setMensajeTel("Teléfono ya Registrado!");

            } else {
                TelefonoUsuario tel = new TelefonoUsuario(this.getIdTelefono(), this.getTipoIdentificacion(), this.getNumeroTelefono(), 1);
                //si la lista esta vacia agrega el telefono
                if (listaTelefnosUsuario.size() == 0) {
                    listaTelefnosUsuario.add(tel);
                } else {
                    //Si ya tiene elementos la compara con el numero que viene 
                    //y si no son iguales lo mete en la lista.
                    for (int i = 0; i < listaTelefnosUsuario.size(); i++) {
                        if (listaTelefnosUsuario.get(i).getTelefono() != this.getNumeroTelefono()) {
                            listaTelefnosUsuario.add(tel);
                            break;
                        }
                    }
                }
            }

        } catch (Exception e) {

        }

    }

    public void enviarEmail() {
        try {
            String destino = this.getCorreoElectronico();
            String asunto = "Comprobación de Registro SIEAF";
            String mensajeCorreo = "Hola  " + this.getNombre() + "   " + this.getCedula()
                    + "\nAutoregistro existoso!"
                    + "\nTan pronto como sea asignado su instructor se le informará nuevamente por este medio";

            Correo objCorreo = new Correo();

            objCorreo.enviarMail(destino, asunto, mensajeCorreo);
            this.setMensaje("Correo Enviado!");

        } catch (Exception e) {
            this.setMensaje(e.getMessage());
        }
    }

    public void guardarDerportista() throws SNMPExceptions, SQLException {

        try {
            //this.fechaStringDate();

            //fecha para bitacora
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//            String fechaRegis = sdf.format(fechaRegistra);
//            String fechaEdt = sdf.format(FechaEdita);
            if (this.nombre.equals("") || this.apellido1.equals("")
                    || this.apellido2.equals("") || this.getCorreoElectronico().equals("")) {

                this.setMensaje("Introduzca los Datos Correctamente!");

            } else {

                Usuario usuario = new Usuario(this.cedula, this.tipoIdentificacion,
                        this.nombre, this.apellido1, this.apellido2, this.correoElectronico, this.fechaRegistra,
                        this.IdRegistra, this.FechaEdita, this.IdEdita, this.LOG_ACTIVO);

                UsuarioDB usuarioDB = new UsuarioDB();
                usuarioDB.InsertarUsuario(usuario);

                AutoRegistroDeportista deportista = new AutoRegistroDeportista(this.cedula, this.tipoIdentificacion, this.peso,
                        this.talla, this.altura, this.IMC, this.gradoObesidad, this.objetivo1, this.objetivo2, this.objetivo3, this.fechaRegistra, this.IdRegistra, this.FechaEdita,
                        this.IdEdita, this.LOG_ACTIVO);
                AutoRegistroDeportistaDB deportistaDB = new AutoRegistroDeportistaDB();
                deportistaDB.InsertarDeportista(deportista);

                /*insert en tabla perfilUsuario
        todos los de autoregistros van con como instructores
        los de registro desde la db se insertan*/
                int codPerfil = 3;
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
                DisciplinaUsuarioDB disDB = new DisciplinaUsuarioDB();
                disDB.insertarDisciplinaUsuario(cedula, tipoIdentificacion, disciplinaDeportiva);
                
                ContrasenaUsuario contra = new ContrasenaUsuario(this.cedula, this.tipoIdentificacion, this.contrasenna, this.contrasennaVieja, this.tipoPerfil, this.fechaRegistra, this.IdRegistra, this.FechaEdita, this.IdEdita, log);
                ContrasenaUsuarioDB contraDB = new ContrasenaUsuarioDB();
                contraDB.InsertarContrasenaUsuario(contra);

                this.enviarEmail();
                //redirigir a la pagina de Comprobacion
                FacesContext.getCurrentInstance().getExternalContext().redirect("Ingreso.xhtml");

            }//fin del if de validacion

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
            this.setMensaje("El Usuario ya se encuentra Registrado!");
        }

    }

}
