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

                /*private String cedula;
    private int numero_telefono;
    private int cod_tip_telefono; //telefono en tbla tipo
    private int log_activo;*/
                String cedula = rsPA.getString("cedula");
                int telefono = rsPA.getInt("numero_telefono");
                int cod_tp = rsPA.getInt("cod_tip_telefono");
                int logActivo = rsPA.getInt("log_activo");

                //se construye el objeto.
                TelefonoUsuario telef = new TelefonoUsuario(cedula, telefono, cod_tp, logActivo);

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

    public boolean consultarTelefono(int numTelefono)
            throws SNMPExceptions, SQLException {

        boolean existe = false;
        String select = "";
        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select = "Select * from Telefono_Usuario where numero_telefono=" + numTelefono;

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
    public void InsertarTelefono(TipoTelefono pTelefono)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {
            //Se obtienen los valores del objeto Departamento
            TipoTelefono tel = new TipoTelefono();
            tel = pTelefono;

            /* [telefono]
      ,[descripcion]
      ,[log_activo]*/
            strSQL
                    = "INSERT INTO Telefono (,telefono, descripcion, log_activo) VALUES "
                    + "(" + "'" + tel.getCod_Tipo_Telefono() + "'" + ","
                    + "(" + "'" + tel.getDescripcion() + "'" + ","
                    + "'" + tel.getLog_activo() + "'" + ")";

            //Se ejecuta la sentencia SQL
            accesoDatos.ejecutaSQL(strSQL);

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
    }

//    Insertar el id del telefono y del usuario en la tabla
//    TelefonoUsuario.
    public void insertarTelfonosUsuario(String ced, int num_tel, int cod_tip_tel, int log)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {

            String cedula = ced;
            int num_t = num_tel;
            int cod_tip_t = cod_tip_tel;
            int log_Ac = log;

            /*([cedula]
           ,[numero_telefono]
           ,[cod_tipo_telefono]
           ,[log_activo])

             */
            strSQL = "insert into Telefono_Usuario (cudula, numero_telefono,cod_tipo_telefono, log_acivo) values"
                    + "(" + "'" + cedula + "'" + ","
                    + "'" + num_t + "'" + ","
                    + "'" + cod_tip_t + "'" + ","
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

    public void InsertarTelefonoUsuario2(TelefonoUsuario TU)
            throws SNMPExceptions, SQLException {
        String strSQL = "";

        try {
            //Se obtienen los valores del objeto Departamento
            TelefonoUsuario tel = new TelefonoUsuario();
            tel = TU;

            /* [telefono]
      ,[descripcion]
      ,[log_activo]*/
            strSQL
                    = "INSERT INTO Telefono_Usuario (cedula, numero_telefono, cod_tipo_telefono, log_activo) VALUES "
                    + "(" + "'" + tel.getCedula() + "'" + ","
                    + "(" + "'" + tel.getNumero_telefono() + "'" + ","
                    + "(" + "'" + tel.getCod_tip_telefono() + "'" + ","
                    + "'" + tel.getLog_activo() + "'" + ")";

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
