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
 * Distrito(
COD_PROVINCIA INT not null,
COD_CANTON INT not null,
COD_DISTRITO INT not null,
DSC_DISTRITO varchar(100),
LOG_ACTIVO bit
);
 */
public class Distrito {
    
    int codProvincia;
    int codCanton;
    int codDistrito;
    String dscDistrito;
    int log;

    public Distrito(int codProvincia, int codCanton, int codDistrito, String dscDistrito, int log) {
        
        this.setCodProvincia(codProvincia);
        this.setCodCanton(codCanton);
        this.setCodDistrito(codDistrito);
        this.setDscDistrito(dscDistrito);
        this.setLog(log);
    }

    public Distrito() {
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

    public String getDscDistrito() {
        return dscDistrito;
    }

    public void setDscDistrito(String dscDistrito) {
        this.dscDistrito = dscDistrito;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
    
    
}
