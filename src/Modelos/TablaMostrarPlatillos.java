package Modelos;

import SubModelos.Platillo;
import Vistas.JFrmCrearGerente;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naomi
 */
public class TablaMostrarPlatillos {

    public ArrayList<Platillo> listaplatillos = new ArrayList<>();

    public void tablaPlatillos(JTable tabla) {

        Vector<String> columnas = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

        columnas.add("No.Platillo");
        columnas.add("Descripción");
        columnas.add("Precio");

        for (int a = 0; a < JFrmCrearGerente.platillos.size(); a++) {
            Vector<Object> row = new Vector<Object>();

            row.add(a);
            row.add(JFrmCrearGerente.platillos.get(a).getNombre());
            row.add(JFrmCrearGerente.platillos.get(a).getPrecio());

            datos.add(row);
        }

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(datos, columnas);
        tabla.setModel(modelo);

    }

}
