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
 * Canton( 
 * COD_PROVINCIA INT not null, 
 * COD_CANTON INT not null, 
 * DSC_CANTON varchar(100), 
 * LOG_ACTIVO bit );
 *
 */
public class Canton {

    int codProvincia;
    int codCanton;
    String dscCanton;
    int log;

    public Canton(int codProvincia, int codCanton, String dscCanton, int log) {
        
        this.setCodProvincia(codProvincia);
        this.setCodCanton(codCanton);
        this.setDscCanton(dscCanton);
        this.setLog(log);
    }

    public Canton() {
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

    public String getDscCanton() {
        return dscCanton;
    }

    public void setDscCanton(String dscCanton) {
        this.dscCanton = dscCanton;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }

    
}
