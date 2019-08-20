/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MrHaksh
 * 
Usuario(
identificacion int not null,
tipoIdentificacion int not null,
nombre varchar(150),
apellido1 varchar(150),
apellido2 varchar(150),
correoElectronico varchar(100),
FechaRegistra varchar(250),
IdRegistra int,
FechaEdita varchar(250),
IdEdita int,
LOG_ACTIVO bit
);
 */
public class Usuario {
    
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
    
    int imc;
    String grado;
    
    

    public Usuario(int identificacion, int tipoIdentificacion, String nombre, String apellido1, String apellido2, String correoElectronico, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        
        this.setIdentificacion(identificacion);
        this.setTipoIdentificacion(tipoIdentificacion);
        this.setNombre(nombre);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.setCorreoElectronico(correoElectronico);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }

    public Usuario(int identificacion, String nombre, String apellido1, String apellido2, int imc, String grado) {
        this.setIdentificacion(identificacion);
          this.setNombre(nombre);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.setImc(imc);
        this.setGrado(grado);
    }
    
    

    public Usuario() {
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }
    
    
}
