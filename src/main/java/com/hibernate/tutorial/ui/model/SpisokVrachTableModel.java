/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.ui.model;

import com.hibernate.tutorial.entity.SpisokVrach;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author ����
 */
public class SpisokVrachTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<SpisokVrach> listDoctors;

    @Override
    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public SpisokVrachTableModel(List<SpisokVrach> listDoctors) {
        super();
        this.listDoctors = listDoctors;
    }

    @Override
    public int getRowCount() {
        return listDoctors.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "iddokt";
            case 1:
                return "lpukod";
            case 2:
                return "id_podr";
            case 3:
                return "id_otd";
            case 4:
                return "�������";
            case 5:
                return "���";
            case 6:
                return "��������";
            case 7:
                return "dokt";
            case 8:
                return "�������������";
            case 9:
                return "���� ��������";
            case 10:
                return "���� ����������";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            case 7:
                return Boolean.class;
            case 8:
                return Integer.class;
            case 9:
                return Date.class;
            case 10:
                return Date.class;

        }
        return Object.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        SpisokVrach doctor = listDoctors.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return doctor.getIddokt();
            case 1:
                return doctor.getLpukod();
            case 2:
                return doctor.getIdPodr();
            case 3:
                return doctor.getIdOtd();
            case 4:
                return doctor.getFam();
            case 5:
                return doctor.getIm();
            case 6:
                return doctor.getOt();
            case 7:
                return doctor.getDokt();
            case 8:
                return doctor.getPrvs();
            case 9:
                return doctor.getDateVn();
            case 10:
                return doctor.getDateUv();

        }
        return Object.class;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

}
