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
public class TipoIdentificacionDB {

    public TipoIdentificacionDB() {
    }

    //metodo que se trae toda la lista de tipo identificacion
    public LinkedList<TipoIdentificacion> moTodo() throws SNMPExceptions, SQLException {

        String select = "";

        LinkedList<TipoIdentificacion> listaTipoIdentificacion = new LinkedList<TipoIdentificacion>();

        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            /*
            TipoIdentificacion(
            idTipoIdentificacion int IDENTITY(1,1) not null,
            descripcion varchar(150),
            LOG_ACTIVO bit
            );
             */
            //Se crea la sentencia de Busqueda
            select
                    = "Select idTipoIdentificacion, descripcion, LOG_ACTIVO FROM TipoIdentificacion";
            //se ejecuta la sentencia sql
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                int idtipoiden = rsPA.getInt("idTipoIdentificacion");
                String descripcion = rsPA.getString("descripcion");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                //se construye el objeto.
                TipoIdentificacion ti = new TipoIdentificacion(idtipoiden, descripcion, logActivo);

                listaTipoIdentificacion.add(ti);
            }
            rsPA.close();//se cierra el ResultSeat.

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listaTipoIdentificacion;
    }
}
