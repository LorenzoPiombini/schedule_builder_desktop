package com.schedule_builder_dektop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.ActionListener;

public class LogInView extends JFrame {

    private JLabel userDescription;
    private JLabel passwordDescription;
    private JTextField usernameField;
    private JTextField passworField;
    private JButton loginBtn;

    public LogInView() {

        userDescription = new JLabel("Username: ");
        passwordDescription = new JLabel("Password: ");
        usernameField = new JTextField(10);
        passworField = new JTextField(10);
        loginBtn = new JButton("Login");

        layoutComponents();
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // display in the screen center

    }

    public void layoutComponents() {
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(userDescription, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(usernameField, gc);

        // next row //

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(passwordDescription, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(passworField, gc);

        // btn row //
        gc.weightx = 1.0;
        gc.weighty = 2.0;

        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.CENTER;
        add(loginBtn, gc);

    }

    public void addLogInBtnActionLisntener(ActionListener listner) {
        loginBtn.addActionListener(listner);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return passworField.getText();
    }

}
