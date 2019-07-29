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
public class ProvinciaDB {

    public ProvinciaDB() {
    }

    //metodo que se trae toda la lista de provincias
    public LinkedList<Provincia> moTodo() throws SNMPExceptions, SQLException {

        String select = "";

        LinkedList<Provincia> listaPro = new LinkedList<Provincia>();

        try {
            //Se intancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de Busqueda
            select
                    = "Select COD_PROVINCIA,DSC_CORTA_PROVINCIA,DSC_PROVINCIA,LOG_ACTIVO FROM PROVINCIAS";
            //se ejecuta la sentencia sql
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //se llama el array con los proyectos
            while (rsPA.next()) {

                int codProvincia = rsPA.getInt("COD_PROVINCIA");
                String desCorta = rsPA.getString("DSC_CORTA_PROVINCIA");
                String descripcion = rsPA.getString("DSC_PROVINCIA");
                int logActivo = rsPA.getInt("LOG_ACTIVO");

                //se construye el objeto.
                Provincia prov = new Provincia(codProvincia,
                        desCorta, descripcion, logActivo);

                listaPro.add(prov);
            }
            rsPA.close();//se cierra el ResultSeat.

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        } finally {

        }
        return listaPro;
    }

}
