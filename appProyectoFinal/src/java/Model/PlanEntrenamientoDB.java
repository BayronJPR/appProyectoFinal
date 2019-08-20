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
public class PlanEntrenamientoDB {
    
}
