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
public class ContrasenaUsuarioDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public ContrasenaUsuarioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public ContrasenaUsuarioDB() {
    }

    public void InsertarContrasenaUsuario(ContrasenaUsuario cu)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {

            ContrasenaUsuario conUsu = new ContrasenaUsuario();
            conUsu = cu;

            strSQL
                    = "INSERT INTO ContrasenaUsuario (identificacionUsuario, tipoIdentificacionUsuario,"
                    + " contrasena, contrasenaVieja, tipoPerfil, FechaRegistra, IdRegistra, FechaEdita,"
                    + "IdEdita,LOG_ACTIVO) VALUES "
                    + "(" + "'" + conUsu.getIdentificacionUsuario() + "'" + ","
                    + "'" + conUsu.getTipoIdentificacionUsuario() + "'" + ","
                    + "'" + conUsu.getContrasena() + "'" + ","
                    + "'" + conUsu.getContrasenaVieja() + "'" + ","
                    + "'" + conUsu.getTipoPerfil() + "'" + ","
                    + "Getdate()" + ","
                    + "'" + conUsu.getIdRegistra() + "'" + ","
                    + "Getdate()" + ","
                    + "'" + conUsu.getIdEdita() + "'" + ","
                    + "'" + conUsu.getLog() + "'" + ")";

            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
    }

    public boolean consultarContrasenaUsuarioPorID(int id, int tipoID, String contra)
            throws SNMPExceptions, SQLException {

        boolean existe = false;
        String select = "";
        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select = "Select * from ContrasenaUsuario where identificacionUsuario=" + id + "AND" + "tipoIdentificacionUsuario=" + tipoID + "AND" + "contrasena=" + contra;

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

    public static ContrasenaUsuario iniciarSesion(int ced, String contrasena, int tipoPerfil) throws SNMPExceptions, SQLException {
        String select = "";
        ContrasenaUsuario cU = null;
        try {
            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            select = "SELECT identificacionUsuario, tipoIdentificacionUsuario, contrasena, contrasenaVieja, tipoPerfil, FechaRegistra, IdRegistra, FechaEdita, IdEdita, LOG_ACTIVO"
                    + "FROM ContrasenaUsuario "
                    + "WHERE identificacionUsuario = '" + ced + "' AND contrasena = '" + contrasena  + "' AND tipoPerfil = " + tipoPerfil ;
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);

            while (rsPA.next()) {
                //Tecnicamente, la lista solo deberia traer un unico usuario. Se obtiene el primer index de la lista
                cU = new ContrasenaUsuario((rsPA.getInt("identificacionUsuario")),
                        rsPA.getInt("identificacionUsuario"),
                        rsPA.getInt("tipoIdentificacionUsuario"),
                        rsPA.getString("contrasena"),
                        rsPA.getString("contrasenaVieja"),
                        rsPA.getInt("tipoPerfil"),
                        rsPA.getString("FechaRegistra"),
                        rsPA.getInt("IdRegistra"),
                        rsPA.getString("FechaEdita"),
                        rsPA.getInt("IdEdita"),
                        rsPA.getInt("LOG_ACTIVO"));

            }
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {
            return cU;
        }
    }

}
