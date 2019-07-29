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
public class CantonDB {
    
       //metodo que se trae toda la lista de provincias
    public LinkedList<Canton> moTodo() throws SNMPExceptions, SQLException {

        String select = "";
        LinkedList<Canton> listaCant = new LinkedList<Canton>();

        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select
                    = "Select COD_PROVINCIA,COD_CANTON,DSC_CANTON,LOG_ACTIVO FROM CANTONES";
            //se ejecuta la sentencia sql
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                int codProvincia = rsPA.getInt("COD_PROVINCIA");
                int codCanton = rsPA.getInt("COD_CANTON");
                String descripcion = rsPA.getString("DSC_CANTON");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                //se construye el objeto.
                Canton Cant = new Canton(codProvincia, codCanton, descripcion, logActivo);

                listaCant.add(Cant);
            }
            rsPA.close();//se cierra el ResultSeat.

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listaCant;
    }

    //selecciona los cantones por el codigo de provincia
    public LinkedList<Canton> SeleccionarCantonPorProvincia(int codigoProv)throws SNMPExceptions, SQLException {
        
        String strSQL = "";
        LinkedList<Canton> listCant = new LinkedList<Canton>();

        try {

            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            strSQL
                    = "Select COD_CANTON,COD_PROVINCIA,DSC_CANTON,LOG_ACTIVO FROM CANTONES"
                    + "  where COD_PROVINCIA=" + codigoProv;
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(strSQL);
            //se llama el array con los proyectos
            while (rsPA.next()) {
                int codProvincia = rsPA.getInt("COD_PROVINCIA");
                int codCanton = rsPA.getInt("COD_CANTON");
                String descCanton = rsPA.getString("DSC_CANTON");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                Canton canton = new Canton(codProvincia,
                        codCanton, descCanton, logActivo);

                listCant.add(canton);
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listCant;
    }
    
}
