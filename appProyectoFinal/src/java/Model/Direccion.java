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
Direccion(
idDireccion int IDENTITY(1,1) not null,
identificacionUsuario int not null,
tipoIdentificacionUsuario int not null,
COD_PROVINCIA INT not null,
COD_CANTON INT not null,
COD_DISTRITO INT not null,
COD_BARRIO INT not null,
DSC_BARRIO varchar(100),
Otras varchar(250),
FechaRegistra varchar(250),
IdRegistra int,
FechaEdita varchar(250),
IdEdita int,
LOG_ACTIVO bit
);
 */
public class Direccion {
    
    int idDireccion;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    int codProvincia;
    int codCanton;
    int codDistrito;
    int codBarrio;
    String dscBarrio;
    String otras;
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    int log;

    public Direccion(int idDireccion, int identificacionUsuario, int tipoIdentificacionUsuario, int codProvincia, int codCanton, int codDistrito, int codBarrio, String dscBarrio, String otras, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        
        this.setIdDireccion(idDireccion);
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setCodProvincia(codProvincia);
        this.setCodCanton(codCanton);
        this.setCodDistrito(codDistrito);
        this.setCodBarrio(codBarrio);
        this.setDscBarrio(dscBarrio);
        this.setOtras(otras);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }

    public Direccion(int identificacionUsuario, int tipoIdentificacionUsuario, int codProvincia, int codCanton, int codDistrito, int codBarrio, String dscBarrio, String otras, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setCodProvincia(codProvincia);
        this.setCodCanton(codCanton);
        this.setCodDistrito(codDistrito);
        this.setCodBarrio(codBarrio);
        this.setDscBarrio(dscBarrio);
        this.setOtras(otras);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }
    
    

    public Direccion() {
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

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public int getCodCanton() {
        return codCanton;
    }

    public void setCodCanton(int codCanton) {
        this.codCanton = codCanton;
    }

    public int getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(int codDistrito) {
        this.codDistrito = codDistrito;
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

    public String getOtras() {
        return otras;
    }

    public void setOtras(String otras) {
        this.otras = otras;
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
    
    
}
