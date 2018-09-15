
package modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMNombre extends AbstractTableModel{
    private List<Nombre> lista;

    public TMNombre(List<Nombre> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Nombre a = lista.get(row);
        
        if (column == 0){
            return a.getId();
        }else{
            return a.getNombre();
        }
        
    }
    @Override
    public String getColumnName(int col){
        if (col == 0) {
            return "ID";
        } else {
            return "Nombre";
        }
    }
}
