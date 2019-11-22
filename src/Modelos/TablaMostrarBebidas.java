package Modelos;

import SubModelos.Bebida;
import Vistas.JFrmCrearGerente;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naomi
 */
public class TablaMostrarBebidas {

    public ArrayList<Bebida> listabebidas = new ArrayList<>();

    public void tablaBebidas(JTable tabla) {

        Vector<String> columnas = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

        columnas.add("No.Bebida");
        columnas.add("Descripción");
        columnas.add("Precio");

        for (int a = 0; a < JFrmCrearGerente.bebidas.size(); a++) {
            Vector<Object> row = new Vector<Object>();

            row.add(a);
            row.add(JFrmCrearGerente.bebidas.get(a).getNombre());
            row.add(JFrmCrearGerente.bebidas.get(a).getPrecio());

            datos.add(row);
        }

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(datos, columnas);
        tabla.setModel(modelo);

    }

}
