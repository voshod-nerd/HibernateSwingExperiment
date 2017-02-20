/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.ui;

import com.hibernate.tutorial.config.SpringContext;
import com.hibernate.tutorial.mainclass.HibernateMain;
import com.hibernate.tutorial.ui.listener.JAddDoctorMouseListener;
import com.hibernate.tutorial.ui.model.SertifTableModel;
import com.hibernate.tutorial.ui.model.SpisokVrachTableModel;
import com.hibernate.tutorial.ui.listener.JExampleMouseTableListener;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ��������
 */
public class MainFrame extends javax.swing.JFrame {

    HibernateMain hiber;
    private javax.swing.JTable tblSpisokVrach;
    private javax.swing.JTable tblSertif;
    private String[] args;
    private ApplicationContext context;
    private javax.swing.JMenuBar jMenuBar1;
    //private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;

    /**
     * Creates new form MainFrame
     */

    public void init() {

        context = new AnnotationConfigApplicationContext(SpringContext.class);
        hiber = (HibernateMain) context.getBean("HibernateMain");

        TableModel model1 = new SpisokVrachTableModel(hiber.getAllSpisokVrach());
        tblSpisokVrach = new JTable(model1);
        TableModel model2 = new SertifTableModel(hiber.getAll());
        tblSertif = new JTable(model2);

        tblSpisokVrach.setSize(new Dimension(900, 150));
        tblSertif.setSize(new Dimension(900, 150));

        tblSpisokVrach.addMouseListener(new JExampleMouseTableListener(this));

        //Create the menu bar.
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu("File");
        jMenuBar1.add(jMenu1);

        jMenuItem1 = new JMenuItem("�������� �����",
                KeyEvent.VK_T);
        jMenuItem2 = new JMenuItem("������� ������ ������ � xml",
                KeyEvent.VK_T);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        
       
        jMenuItem1.addMouseListener(new JAddDoctorMouseListener(this));

        this.setJMenuBar(jMenuBar1);
        Box contents = new Box(BoxLayout.Y_AXIS);

        contents.add(new JScrollPane(tblSpisokVrach));
        contents.add(new JScrollPane(tblSertif));

        this.getContentPane().add(contents);
        setPreferredSize(new Dimension(910, 700));
        this.pack();
        MainFrame.setDefaultLookAndFeelDecorated(true);
        this.setVisible(true);

    }

    public MainFrame() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
