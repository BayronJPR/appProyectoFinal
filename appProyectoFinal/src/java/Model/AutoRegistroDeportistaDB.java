/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.SQLException;
import Model.AutoRegistroDeportista;

/**
 *
 * @author MrHaksh
 */
public class AutoRegistroDeportistaDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public AutoRegistroDeportistaDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public AutoRegistroDeportistaDB() {
    }
    
     public void InsertarDeportista(AutoRegistroDeportista deportista)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {

            AutoRegistroDeportista deport = new AutoRegistroDeportista();
            deport = deportista;

            strSQL
                    = "INSERT INTO AutoRegistroDeportista (identificacionUsuario, tipoIdentificacionUsuario,"
                    + " peso,talla,altura, IMC, FechaRegistra,IdRegistra, FechaEdita,"
                    + "IdEdita,LOG_ACTIVO) VALUES "
                    + "(" + "'" + deport.getIdentificacionUsuario()+ "'" + ","
                    + "'" + deport.getTipoIdentificacionUsuario()+ "'" + ","
                    + "'" + deport.getPeso()+ "'" + ","
                    + "'" + deport.getTalla()+ "'" + ","
                    + "'" + deport.getAltura()+ "'" + ","
                    + "'" + deport.getIMC()+ "'" + ","
                    + "Getdate()"+ ","
                    + "'" + deport.getIdRegistra() + "'" + ","
                    + "Getdate()"+ ","
                    + "'" + deport.getIdEdita() + "'" + ","
                    + "'" + deport.getLog() + "'" + ")";

            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
    }

}
