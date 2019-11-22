package Modelos;

import SubModelos.Postre;
import Vistas.JFrmCrearGerente;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naomi
 */
public class TablaMostrarPostres {

    public ArrayList<Postre> listapostres = new ArrayList<>();

    public void tablaPostres(JTable tabla) {

        Vector<String> columnas = new Vector<>();
        Vector<Vector<Object>> datos = new Vector<>();

        columnas.add("No.Postre");
        columnas.add("Descripción");
        columnas.add("Precio");

        for (int a = 0; a < JFrmCrearGerente.postres.size(); a++) {
            Vector<Object> row = new Vector<>();

            row.add(a);
            row.add(JFrmCrearGerente.postres.get(a).getNombre());
            row.add(JFrmCrearGerente.postres.get(a).getPrecio());

            datos.add(row);
        }

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(datos, columnas);
        tabla.setModel(modelo);

    }

}
