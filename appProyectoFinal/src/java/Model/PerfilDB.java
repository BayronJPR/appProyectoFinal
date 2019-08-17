/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 *
 * @author MrHaksh
 */
public class PerfilDB {
    
    
    public LinkedList<Perfil> moTodo() throws SNMPExceptions, SQLException {

        String select = "";

        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();

        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            /*
            Disciplina(
            idPerfil int IDENTITY(1,1) not null,
            descripcion varchar(100),
            LOG_ACTIVO bit
            );
             */
            //Se crea la sentencia de Busqueda
            select
                    = "Select idPerfil, descripcion, LOG_ACTIVO FROM Perfil";
            //se ejecuta la sentencia sql
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                int idPerfil = rsPA.getInt("idPerfil");
                String descripcion = rsPA.getString("descripcion");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                //se construye el objeto.
                Perfil per = new Perfil(idPerfil, descripcion, logActivo);

                listaPerfil.add(per);
            }
            rsPA.close();//se cierra el ResultSeat.

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listaPerfil;
    }
}
