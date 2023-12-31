package com.schedule_builder_dektop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.http_api_call_schedule_builder.LoginAuth;

public class AppController {

    private MainFrame mainFrame;
    private LogInView logInView;

    public AppController(MainFrame mainframe, LogInView logInView) {
        this.mainFrame = mainframe;
        this.logInView = logInView;

        this.logInView.addLogInBtnActionLisntener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                LoginAuth auth = new LoginAuth();

                String username = logInView.getUsername();
                String password = logInView.getPassword();

                try {

                    if (auth.authenticate(username, password)) {
                        logInView.dispose();
                        mainFrame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(logInView, "wrong username or Password, try agian!",
                                "Login Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (IOException e1) {

                    e1.printStackTrace();
                }

            }

        });

    }

}
