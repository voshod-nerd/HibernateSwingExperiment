/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.tutorial.config;

import com.hibernate.tutorial.ui.MainFrame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *
 * @author Талалаев
 */

@Configuration
//@PropertySource("com.hibernate.tutorial")
public class SpringContext {
    
    String title;

    @Bean(name = "mainFrame")
    public MainFrame createMainFrame() {
        return new MainFrame();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer setUp() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
