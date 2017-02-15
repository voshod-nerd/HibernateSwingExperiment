/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.app;

import com.hibernate.tutorial.ui.MainFrame;

/**
 *
 * @author Талалаев
 */
public class Application {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
       // ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
       // MainFrame mainFrame = (MainFrame) context.getBean("mainFrame");
        //mainFrame.setArgs(args);
        mainFrame.init();
    }
}
