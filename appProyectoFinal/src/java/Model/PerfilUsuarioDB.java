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
public class PerfilUsuarioDB {
    
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public PerfilUsuarioDB() {
    }

    public PerfilUsuarioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }
    
    public void insertarPerfilUsuario(int identificacionUsuario, int tipoIdentidficacion, int idPerfil)
            throws SNMPExceptions, SQLException {
        
        String strSQL = "";

        try {

            int identificacion = identificacionUsuario;
            int tipoIdent = tipoIdentidficacion;
            int perfil = idPerfil;

            strSQL = "insert into PerfilUsuario (identificacionUsuario, tipoIdentificacionUsuario, idPerfil) values"
                    + "(" + "'" + identificacion + "'" + ","
                    + "'" + tipoIdent + "'" + ","
                    + "'" + perfil + "'" + ")";

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
