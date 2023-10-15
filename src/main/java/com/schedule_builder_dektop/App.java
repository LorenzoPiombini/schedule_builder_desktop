package com.schedule_builder_dektop;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        LogInView logInView = new LogInView();
        MainFrame mainFrame = new MainFrame();

        new AppController(mainFrame, logInView);

        logInView.setVisible(true);
        // SwingUtilities.invokeLater(new Runnable() {

        // @Override
        // public void run() {
        // new MainFrame();
        // }

        // });
    }
}
