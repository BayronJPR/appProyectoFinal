/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author luubs
 * 
CREATE  TABLE  PlanEntrenamiento(
idPlan int IDENTITY(1,1) not null,
identificacionUsuario int not null,
tipoIdentificacionUsuario int not null,
idDisciplina int not null,
periodicidad varchar(100),
fechaInicio varchar(100),
fechaFin varchar(100),
FechaRegistra varchar(250),
IdRegistra int,
FechaEdita varchar(250),
IdEdita int,
LOG_ACTIVO bit
);
 */
public class PlanEntrenamiento {
    
    int idPlan;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    int idDisciplina;
    String periodicidad;
    String fechaInicio;
    String fechaFin;
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    int LOG_ACTIVO;

    public PlanEntrenamiento(int idPlan, int identificacionUsuario, int tipoIdentificacionUsuario, int idDisciplina, String periodicidad, String fechaInicio, String fechaFin, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int LOG_ACTIVO) {
        this.idPlan = idPlan;
        this.identificacionUsuario = identificacionUsuario;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.idDisciplina = idDisciplina;
        this.periodicidad = periodicidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaRegistra = fechaRegistra;
        this.idRegistra = idRegistra;
        this.fechaEdita = fechaEdita;
        this.idEdita = idEdita;
        this.LOG_ACTIVO = LOG_ACTIVO;
    }

    public PlanEntrenamiento(int identificacionUsuario, int tipoIdentificacionUsuario, int idDisciplina, String periodicidad, String fechaInicio, String fechaFin, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int LOG_ACTIVO) {
        this.identificacionUsuario = identificacionUsuario;
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
        this.idDisciplina = idDisciplina;
        this.periodicidad = periodicidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaRegistra = fechaRegistra;
        this.idRegistra = idRegistra;
        this.fechaEdita = fechaEdita;
        this.idEdita = idEdita;
        this.LOG_ACTIVO = LOG_ACTIVO;
    }

    public PlanEntrenamiento() {
    }
    
    

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
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

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
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

    public int getLOG_ACTIVO() {
        return LOG_ACTIVO;
    }

    public void setLOG_ACTIVO(int LOG_ACTIVO) {
        this.LOG_ACTIVO = LOG_ACTIVO;
    }
    
    
    
}
