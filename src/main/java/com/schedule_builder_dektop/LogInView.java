package com.schedule_builder_dektop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInView extends JFrame {

    private JLabel userDescription;
    private JLabel passwordDescription;
    private JTextField usernameField;
    private JTextField passworField;
    private JButton loginBtn;

    public LogInView() {

        setLayout(new BorderLayout());

        userDescription = new JLabel("Username: ");
        passwordDescription = new JLabel("Password: ");
        usernameField = new JTextField(10);
        passworField = new JTextField(10);
        loginBtn = new JButton();

        loginBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // create http library to performe the API calls
                // and use it here
            }

        });

    }

}
