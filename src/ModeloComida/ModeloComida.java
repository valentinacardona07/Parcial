package ModeloComida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JOptionPane;

public class ModeloComida {

    private final String tabla = "comidas";

    public void guardar(Connection conexion, String Nombre) {
        try {
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre_comida) VALUES(?)");
            consulta.setString(1, Nombre);
            //asas

            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso!", "Registro", JOptionPane.INFORMATION_MESSAGE);
            //System.out.println("Se efectuo la operacion de escritura");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error en la insercion", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }
//    public static String crearComidaModelo(Connection connection, Map<String, String> data) {
//        String message = "";
//        int insert = 0;
//
//        String sql = "INSERT INTO comidas (nombre_comida)"
//                + "VALUES (?,)";
//
//        try {
//            String nombre_comida = data.get("nombre_comida");
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, nombre_comida);
//            insert = statement.executeUpdate();
//            message = (insert > 0) ? "success" : "failed";
//
//        } catch (SQLException ex) {
//            message = "sql_query_error";
//        }
//        return message;
//    }

}
