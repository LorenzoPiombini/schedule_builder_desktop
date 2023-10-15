package com.schedule_builder_dektop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Schedule Builder");

        setLayout(new BorderLayout());

        setJMenuBar(createMenu());

        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);// display in the screen center

    }

    public JMenuBar createMenu() {
        JMenuBar menu = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newEmployee = new JMenuItem("New Employee");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        fileMenu.add(newEmployee);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        menu.add(fileMenu);

        return menu;
    }
}
