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
Barrio(
COD_PROVINCIA INT not null,
COD_CANTON INT not null,
COD_DISTRITO INT not null,
COD_BARRIO INT not null,
DSC_BARRIO varchar(100),
LOG_ACTIVO bit
);
 * 
 */
public class Barrio {
    
    int codProvincia;
    int codCanton;
    int codDistrito;
    int codBarrio;
    String dscBarrio;
    int log;

    public Barrio(int codProvincia, int codCanton, int codDistrito, int codBarrio, String dscBarrio, int log) {
        
        this.setCodProvincia(codProvincia);
        this.setCodCanton(codCanton);
        this.setCodDistrito(codDistrito);
        this.setCodBarrio(codBarrio);
        this.setDscBarrio(dscBarrio);
        this.setLog(log);
    }

    public Barrio() {
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

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
    
    
}
