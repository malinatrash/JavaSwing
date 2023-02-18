package malinatrash.Model;

import javax.swing.table.AbstractTableModel;


public class TabelModelData extends AbstractTableModel {
    private final State data;
    private final String type;
    public TabelModelData(State state, String type) {
        this.data = state;
        this.type = type;
    }
    @Override
    public int getRowCount() {
        return data.getSize();
    }
    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return rowIndex + 1;
            case 1: return data.getOrganization(rowIndex).getName();
            case 2:
                if (type.equals("Companies")) {
                    return data.getOrganization(rowIndex).getType();
                }
                return data.getOrganization(rowIndex).processOperation();
        }
        return null;
    }
}