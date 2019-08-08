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
public class DisciplinaUsuarioDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public DisciplinaUsuarioDB() {
    }

    public DisciplinaUsuarioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public void insertarDisciplinaUsuario(int identificacionUsuario, int tipoIdentidficacion, int disciplina)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {

            int identificacion = identificacionUsuario;
            int tipoIdent = tipoIdentidficacion;
            int discipl = disciplina;

            strSQL = "insert into DisciplinaUsuario (identificacionUsuario, tipoIdentificacionUsuario, idDisciplina) values"
                    + "(" + "'" + identificacion + "'" + ","
                    + "'" + tipoIdent + "'" + ","
                    + "'" + discipl + "'" + ")";

            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }

    }

    public boolean consultarDiscilplinaUsuario(int numeroIdentificacion, int tipoIndentificacion, int idDiSciplina)
            throws SNMPExceptions, SQLException {

        boolean existe = false;
        String select = "";
        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select = "Select identificacionUsuario,tipoIdentificacionUsuario,idDisciplina from DisciplinaUsuario where "
                    + ("identificacionUsuario,=" + numeroIdentificacion) + "AND" + ("tipoIdentificacionUsuario,=" + numeroIdentificacion)
                    + "AND" + ("idDisciplina=" + idDiSciplina);

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
