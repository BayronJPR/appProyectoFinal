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
public class BarrioDB {

    //selecciona todos los distritos de un canton que pertenece a una provincia.
    public LinkedList<Barrio>
            SeleccionarBarrioDistritoPorCantonPorProvincia(int codProv, int codCant, int codDis) throws SNMPExceptions, SQLException {

        String strSQL = "";
        LinkedList<Barrio> listBarrios = new LinkedList<Barrio>();

        try {

            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            strSQL = "SELECT COD_BARRIO,COD_PROVINCIA,COD_CANTON,COD_DISTRITO,"
                    + "DSC_BARRIO,LOG_ACTIVO FROM BARRIOS WHERE"
                    + " COD_PROVINCIA= '" + codProv + "'" + "AND COD_CANTON='" + codCant + "'" + " AND COD_DISTRITO=" + codDis;
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(strSQL);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                int codBarrio = rsPA.getInt("COD_BARRIO");
                int codProvincia = rsPA.getInt("COD_PROVINCIA");
                int codCanton = rsPA.getInt("COD_CANTON");
                int codDistrito = rsPA.getInt("COD_DISTRITO");
                String descBarrio = rsPA.getString("DSC_BARRIO");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                Barrio barrio = new Barrio(codProvincia, codCanton,
                        codDistrito, codBarrio, descBarrio, logActivo);

                listBarrios.add(barrio);
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listBarrios;
    }

}
