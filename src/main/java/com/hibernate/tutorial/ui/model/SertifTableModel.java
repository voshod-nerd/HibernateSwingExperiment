/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.ui.model;

import com.hibernate.tutorial.entity.Sertif;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Талалаев
 */
public class SertifTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<Sertif> listSertif;
    
    
     public SertifTableModel(List<Sertif> listSertif) {
        super();
        this.listSertif = listSertif;
    }

    public int getRowCount() {
        return listSertif.size();
    }

    public int getColumnCount() {
        return 8;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "n_sert";
            case 1:
                return "reg_num";
            case 2:
                return "date_end";
            case 3:
                return "prvs";
            case 4:
                return "prvs_s";
            case 5:
                return "iddokt";
            case 6:
                return "dateadd";
            case 7:
                return "id";

        }
        return "";
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Date.class;
            case 3:
                return Integer.class;
            case 4:
                return String.class;
            case 5:
                return Integer.class;
            case 6:
                return Date.class;
            case 7:
                return Integer.class;
        }
        return Object.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       Sertif sertif = listSertif.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sertif.getNSert();
            case 1:
                return sertif.getRegNum();
            case 2:
                return sertif.getDateEnd();
            case 3:
                return sertif.getPrvs();
            case 4:
                return sertif.getPrvsS();
            case 5:
                return sertif.getIddokt().getIddokt();
            case 6:
                return sertif.getDateadd();
            case 7:
                return sertif.getId();
        }
        return Object.class;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public void removeTableModelListener(TableModelListener listener) {
       listeners.remove(listener);
    }

}
