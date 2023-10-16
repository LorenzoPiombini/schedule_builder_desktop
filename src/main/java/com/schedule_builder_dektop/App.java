package com.schedule_builder_dektop;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        // ------------UNCOMMENT THE FOOLOWING CODE TO ENEBLE THE LOGIN VIEW--------//
        LogInView logInView = new LogInView();
        MainFrame mainFrame = new MainFrame();

        new AppController(mainFrame, logInView);

        logInView.setVisible(true);

        // ------------------------------------------------------------------------//

        // ------------to make development faster uncomment the following code
        // ---------------//
        // SwingUtilities.invokeLater(new Runnable() {

        // @Override
        // public void run() {
        // new MainFrame();
        // }

        // });
    }
}
