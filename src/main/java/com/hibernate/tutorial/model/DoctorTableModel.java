/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.model;

import com.hibernate.tutorial.entity.Doctor;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Юыху
 */
public class DoctorTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Doctor> listDoctors;

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public DoctorTableModel(List<Doctor> listDoctors) {
        this.listDoctors = listDoctors;
    }

    public int getRowCount() {
        return listDoctors.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int columnIndex) {
         switch (columnIndex) {
            case 0:
                return "id";
            case 1:
                return "FIO";
            case 2:
                return "Dr";
            }
            return "";
    }

    public Class<?> getColumnClass(int columnIndex) {
         switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Date.class;
            }
            return Object.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void removeTableModelListener(TableModelListener l) {
         listeners.remove(listeners);
    }

}
