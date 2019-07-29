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
public class DisciplinaEjercicio {
    
    int idDisciplina;
    int idEjercicio;

    public DisciplinaEjercicio(int idDisciplina, int idEjercicio) {
        
        this.setIdDisciplina(idDisciplina);
        this.setIdEjercicio(idEjercicio);
    }

    public DisciplinaEjercicio() {
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }
    
}
