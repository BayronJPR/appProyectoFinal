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
public class DisciplinaUsuario {
    
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    int idDisciplina;

    public DisciplinaUsuario(int identificacionUsuario, int tipoIdentificacionUsuario, int idDisciplina) {
        
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setIdDisciplina(idDisciplina);
    }

    public DisciplinaUsuario() {
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
    
}
