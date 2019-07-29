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
public class DistritoDB {

    //selecciona todos los distritos de un canton que pertenece a una provincia.
    public LinkedList<Distrito> SeleccionarDistritoPorCantonPorProvincia(int codProv, int codCant) throws SNMPExceptions, SQLException {

        String strSQL = "";
        LinkedList<Distrito> listDist = new LinkedList<Distrito>();

        try {

            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            strSQL
                    = "SELECT COD_DISTRITO,COD_PROVINCIA,COD_CANTON,DSC_DISTRITO,LOG_ACTIVO"
                    + " FROM DISTRITOS WHERE COD_PROVINCIA= '" + codProv + "'" + "AND COD_CANTON=" + codCant;
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(strSQL);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                int codDistrito = rsPA.getInt("COD_DISTRITO");
                int codProvincia = rsPA.getInt("COD_PROVINCIA");
                int codCanton = rsPA.getInt("COD_CANTON");
                String descDistrito = rsPA.getString("DSC_DISTRITO");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                Distrito distrito = new Distrito(codProvincia, codCanton,
                        codDistrito, descDistrito, logActivo);

                listDist.add(distrito);
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listDist;
    }

}
