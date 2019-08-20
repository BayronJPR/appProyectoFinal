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
import java.util.LinkedList;

/**
 *
 * @author MrHaksh
 */
public class UsuarioDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public UsuarioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public UsuarioDB() {
    }

    public void InsertarUsuario(Usuario usuario)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {

            Usuario usu = new Usuario();
            usu = usuario;

            strSQL
                    = "INSERT INTO Usuario (identificacion, tipoIdentificacion,"
                    + " nombre,apellido1,apellido2, correoElectronico, FechaRegistra,IdRegistra, FechaEdita,"
                    + "IdEdita,LOG_ACTIVO) VALUES "
                    + "(" + "'" + usu.getIdentificacion() + "'" + ","
                    + "'" + usu.getTipoIdentificacion() + "'" + ","
                    + "'" + usu.getNombre() + "'" + ","
                    + "'" + usu.getApellido1() + "'" + ","
                    + "'" + usu.getApellido2() + "'" + ","
                    + "'" + usu.getCorreoElectronico() + "'" + ","
                    + "Getdate()" + ","
                    + "'" + usu.getIdRegistra() + "'" + ","
                    + "Getdate()" + ","
                    + "'" + usu.getIdEdita() + "'" + ","
                    + "'" + usu.getLog() + "'" + ")";

            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
    }

    public boolean consultarUsuarioPorID(int id, int tipoID)
            throws SNMPExceptions, SQLException {

        boolean existe = false;
        String select = "";
        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select = "Select * from Usuario where identificacion=" + id + "AND" + "tipoIdentificacion=" + tipoID;

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

    public LinkedList<Usuario> moTodo() throws SNMPExceptions, SQLException {
        String select = "";
        LinkedList<Usuario> listaDeportistas = new LinkedList<Usuario>();

        try {
            AccesoDatos accesoDatos = new AccesoDatos();
            select
                    = "SELECT AutoRegistroDeportista.identificacionUsuario, Usuario.nombre, Usuario.apellido1,"
                    + "  Usuario.apellido2, AutoRegistroDeportista.IMC, AutoRegistroDeportista.GradoObesidad\n"
                    + "FROM Usuario, AutoRegistroDeportista where "
                    + "Usuario.identificacion = AutoRegistroDeportista.identificacionUsuario; ";
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            while (rsPA.next()) {

                int id = rsPA.getInt("AutoRegistroDeportista.identificacionUsuario");
                String nombre = rsPA.getString("Usuario.nombre");
                String apellido1 = rsPA.getString("Usuario.apellido1");
                String apellido2 = rsPA.getString("Usuario.apellido2");
                int imc = rsPA.getInt("AutoRegistroDeportista.IMC");
                String grado = rsPA.getString( "AutoRegistroDeportista.GradoObesidad");
                
               Usuario deportista = new Usuario(id, nombre, apellido1,apellido2,imc,grado);
               listaDeportistas.add(deportista);
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listaDeportistas;
    }

}
