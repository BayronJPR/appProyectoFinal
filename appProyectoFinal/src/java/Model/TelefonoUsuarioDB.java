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
public class TelefonoUsuarioDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    public TelefonoUsuarioDB() {

    }

    public TelefonoUsuarioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    //metodo que se trae toda la lista de Telefonos
    public LinkedList<TelefonoUsuario> moTodo() throws SNMPExceptions, SQLException {
        String select = "";
        LinkedList<TelefonoUsuario> listaTel = new LinkedList<TelefonoUsuario>();

        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select
                    = "Select telefono,log_activo from TelefonoUsuario";
            //se ejecuta la sentencia sql
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                /* int idTelefono;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    String telefono;
    int log;*/
                int idTelefono = rsPA.getInt("idTelefono");
                int identificacionUsuario = rsPA.getInt("identificacionUsuario");
                int tipoIdentificacionUsuario = rsPA.getInt("tipoIdentificacionUsuario");
                String telefono = rsPA.getString("telefono");
                int log = rsPA.getInt("LOG_ACTIVO");

                //se construye el objeto.
                TelefonoUsuario telef = new TelefonoUsuario(idTelefono, identificacionUsuario, tipoIdentificacionUsuario, telefono, log);

                listaTel.add(telef);
            }
            rsPA.close();//se cierra el ResultSeat.

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listaTel;
    }

    public boolean consultarTelefono(String numTelefono)
            throws SNMPExceptions, SQLException {

        boolean existe = false;
        String select = "";
        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select = "Select * from TelefonoUsuario where telefono=" + numTelefono;

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
    //INGRESA LOS TIPOS DE TELEFONO A LA BD

    //insertar telefonos en la base de datos.
//    public void InsertarTelefono(TipoTelefono pTelefono)
//            throws SNMPExceptions, SQLException {
//        String strSQL = "";
//
//        try {
//            //Se obtienen los valores del objeto Departamento
//            TipoTelefono tel = new TipoTelefono();
//            tel = pTelefono;
//
//            /* [telefono]
//      ,[descripcion]
//      ,[log_activo]*/
//            strSQL
//                    = "INSERT INTO Telefono (,telefono, descripcion, log_activo) VALUES "
//                    + "(" + "'" + tel.getCod_Tipo_Telefono() + "'" + ","
//                    + "(" + "'" + tel.getDescripcion() + "'" + ","
//                    + "'" + tel.getLog_activo() + "'" + ")";
//
//            //Se ejecuta la sentencia SQL
//            accesoDatos.ejecutaSQL(strSQL);
//
//        } catch (SQLException e) {
//            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
//        } catch (Exception e) {
//            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
//        } finally {
//
//        }
//    }
//    Insertar el id del telefono y del usuario en la tabla
//    TelefonoUsuario.
    public void insertarTelfonosUsuario(int identificacionUsuario, int tipoIdentidficacion, String numeroTelefono, int log)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {

            int identificacion = identificacionUsuario;
            int tipoIdent = tipoIdentidficacion;
            String numeroTele = numeroTelefono;
            int log_Ac = log;

            /*nt identificacionUsuario;
    int tipoIdentificacionUsuario;
    String telefono;
    int log;
             */
            strSQL = "insert into TelefonoUsuario (identificacionUsuario, tipoIdentificacionUsuario, telefono, LOG_ACTIVO) values"
                    + "(" + "'" + identificacion + "'" + ","
                    + "'" + tipoIdent + "'" + ","
                    + "'" + numeroTele + "'" + ","
                    + "'" + log_Ac + "'" + ")";

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
