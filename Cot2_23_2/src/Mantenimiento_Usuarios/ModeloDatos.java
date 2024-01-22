
package Mantenimiento_Usuarios;

import java.sql.*;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
//nos permite hacer uso del objeto Tablas
import javax.swing.table.DefaultTableModel;

public class ModeloDatos {
    //instanciamos la clase que nos conecta a la base de datos.
    ConexionBD cbd = new ConexionBD();
//------------------------------------------------------------------------------
   //funcion que nos permite buscar un id y validarlo
    public int buscar_id(String ide) {
        int enco = 0;
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios where id = '" + ide + "'";
            ResultSet rs = ConexionBD.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en sql que esta almacenada en query
            //y los resultados, los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) //Si rs no es null, es que hay algo
            {
                //Compara lo que hay en rs en el campo identificacion con ide
                if (ide.equals(rs.getString("id"))) {
                    enco = 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return enco;
    }
//------------------------------------------------------------------------------  
    //Funcion que permite insertar un cliente en tablaclientes
    public boolean ingresarcliente(String ide, String nom, String log, String niv,
            String ing, String co, String con) {
        try {
            cbd.conectarbase();
            String query = "INSERT INTO tabla_usuarios (id, nombre,login, nivel,"
                    + " fecha, correo, contra) "
                    
                    + "VALUES ('" +  ide + "','" + nom + "','" + log + "','" + niv 
                    + "','" + ing + "','"+co+ "','" + con + "')";
            //Aqui ejecuta la sentencia en sql que esta en query
            cbd.stmt.execute(query);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cbd.desconectarbase();
            } catch (Exception e)//Un catch puede quedar vacio mi amerw
            {
            }
        }
        return true;
    }
//------------------------------------------------------------------------------
     //Procedimiento que permite mostrar los datos de un cliente
    public void mostrardatos(JTextField ide, JTextField nombre,
            String log, JTextField niv, String fec, 
            JTextField co,JPasswordField con) {
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios WHERE id = '" + ide + "'" ;
            //Aqui ejecuta la instruccion query y los resultados quedan almacenados en rs
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                if (ide.equals(
                        rs.getString("id"))) {
                    nombre.setText(rs.getString("nombre"));
                    log.setText("login");//NO ENTIENDO ESTE ERRRO
                    niv.setText("nivel");
                    fec= rs.getString("fecha");
                    co.setText("correo");
                    con.setText("contra");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cbd.desconectarbase();
            } catch (Exception e) {

            }
        }
    }
//------------------------------------------------------------------------------
    //metodo que permite eliminar cliente de la tablacliente
    public boolean Eliminarcliente(String ide) {
        boolean borrado = true;
        try {
            cbd.conectarbase();
            String query = "delete from tabla_usuarios where id = '" + ide + "'";
            cbd.stmt.execute(query);
        } catch (Exception ex) 
        {
            System.out.println(ex);
            borrado = false;
        }
        finally {
            cbd.desconectarbase();
        }return borrado;
    }
//------------------------------------------------------------------------------    
   //metodo que permite modificar los datos de la tabla
    public boolean modificar_usuarios (String ide, String nom, String log, String niv,
            String ing, String co, String con){

    try{
        cbd.conectarbase();
        String query = "update tabla_usuarios set id = '"+ide+"', nombre= '"+nom+"',"
                + " login= '"+log+"', nivel = '"+niv+"', fecha = '"+ing+"', "
                + "correo = '"+co+"', contra = '"+con+'"';
        cbd.stmt.execute(query);
    }catch(Exception e){
        System.out.println(e);
        return false;
    }finally {
        cbd.desconectarbase();
    }
    return true;
} 
//------------------------------------------------------------------------------  

}
