/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MrHaksh
 */
public class DireccionDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public DireccionDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public DireccionDB() {

    }

    public void InsertarDireccion(Direccion direccion)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {
            //Se obtienen los valores del objeto Departamento
            //DireccionFuncionario direc = new DireccionFuncionario();
            Direccion direc = new Direccion();
            direc = direccion;

            strSQL
                    = "INSERT INTO Direccion (identificacionUsuario, tipoIdentificacionUsuario,"
                    + " COD_PROVINCIA,COD_CANTON,COD_DISTRITO, COD_BARRIO, Otras,FechaRegistra, IdRegistra,"
                    + "FechaEdita,IdEdita, LOG_ACTIVO) VALUES "
                    + "(" + "'" + direc.getIdentificacionUsuario() + "'" + ","
                    + "'" + direc.getTipoIdentificacionUsuario() + "'" + ","
                    + "'" + direc.getCodProvincia() + "'" + ","
                    + "'" + direc.getCodCanton() + "'" + ","
                    + "'" + direc.getCodDistrito() + "'" + ","
                    + "'" + direc.getCodBarrio() + "'" + ","
                    + "'" + direc.getOtras() + "'" + ","
                    + "Getdate()"+ ","
                    + "'" + direc.getIdRegistra() + "'" + ","
                    + "Getdate()"+ ","
                    + "'" + direc.getIdEdita() + "'" + ","
                    + "'" + direc.getLog() + "'" + ")";

            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
    }

    public boolean consultarDireccionPorID(int id, int tipoID)
            throws SNMPExceptions, SQLException {

        boolean existe = false;
        String select = "";
        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select = "Select * from Direccion where identificacionUsuario=" + id  +"AND"+ "tipoIdentificacionUsuario=" + tipoID;

            //se ejecuta la sentencia sql
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            if (rsPA.next()) {

                existe = true;
            }

            rsPA.close();

            return existe;

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }

    }
}
