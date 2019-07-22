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
Provincia(
COD_PROVINCIA INT not null,
DSC_CORTA_PROVINCIA varchar(10),
DSC_PROVINCIA varchar(100),
LOG_ACTIVO bit
);
 * 
 */
public class Provincia {
    
    int codProvincia;
    String dscCortaProvincia;
    String dscProvincia;
    int log;

    public Provincia(int codProvincia, String dscCortaProvincia, String dscProvincia, int log) {
        
        this.setCodProvincia(codProvincia);
        this.setDscCortaProvincia(dscCortaProvincia);
        this.setDscProvincia(dscProvincia);
        this.setLog(log);
    }

    

    public Provincia() {
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }
    

    public String getDscCortaProvincia() {
        return dscCortaProvincia;
    }

    public void setDscCortaProvincia(String dscCortaProvincia) {
        this.dscCortaProvincia = dscCortaProvincia;
    }

    public String getDscProvincia() {
        return dscProvincia;
    }

    public void setDscProvincia(String dscProvincia) {
        this.dscProvincia = dscProvincia;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
    
}
