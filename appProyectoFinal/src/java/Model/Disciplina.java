/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MrHaksh
 */
public class Disciplina {
    
    int idDisciplina;
    String descripcion;
    int log;

    public Disciplina(int idDisciplina, String descripcion, int log) {
        
        this.setIdDisciplina(idDisciplina);
        this.setDescripcion(descripcion);
        this.setLog(log);
    }

    public Disciplina() {
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }
    
}
