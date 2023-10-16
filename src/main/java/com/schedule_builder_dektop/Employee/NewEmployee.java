package com.schedule_builder_dektop.Employee;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewEmployee extends JFrame {
    private JLabel firstNameLbl;
    private JLabel lastNameLbl;
    private JLabel ageLbl;
    private JLabel hourRateLbl;
    private JLabel jobTitlelbl;
    private JLabel roleLbl;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField ageField;
    private JTextField hourRateField;
    private JTextField jobTitleField;
    private JComboBox<String> roleBox;
    private JButton addBtn;

    public NewEmployee() {

        firstNameLbl = new JLabel("First name: ");
        firstNameField = new JTextField(10);
        lastNameLbl = new JLabel("Last name: ");
        lastNameField = new JTextField(10);
        ageLbl = new JLabel("Age: ");
        ageField = new JTextField(2);
        hourRateLbl = new JLabel("Hour rate: $");
        hourRateField = new JTextField(5);
        jobTitlelbl = new JLabel("Job title: ");
        jobTitleField = new JTextField(10);
        roleLbl = new JLabel("Role: ");
        roleBox = new JComboBox<>();
        roleBox.setModel(new DefaultComboBoxModel<String>(new String[] { "USER", "ADMIN" }));
        addBtn = new JButton("add");

        setLayout();
        setSize(400, 700);
        setLocation(880, 120);
        setVisible(true);

    }

    public void setLayout() {
        // display components with the gridbag
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        // ----------first row----------------//
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        add(firstNameLbl, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(firstNameField, gc);

        // -------second row ------------------//

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(lastNameLbl, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(lastNameField, gc);

        // ----------third row----------------//
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_END;
        add(ageLbl, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(ageField, gc);

        // ----------fourth row----------------//
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.LINE_END;
        add(hourRateLbl, gc);

        gc.gridx = 1;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(hourRateField, gc);

        // ----------fifth row----------------//
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.LINE_END;
        add(jobTitlelbl, gc);

        gc.gridx = 1;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.LINE_START;
        add(jobTitleField, gc);

        // ----------six row----------------//
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 5;
        gc.anchor = GridBagConstraints.LINE_END;
        add(roleLbl, gc);

        gc.gridx = 1;
        gc.gridy = 5;
        gc.anchor = GridBagConstraints.LINE_START;
        add(roleBox, gc);

        // ----------Last row----------------//
        gc.weightx = 1;
        gc.weighty = 2;

        gc.gridx = 0;
        gc.gridy = 6;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(addBtn, gc);

    }

    public void addActionListenerToAddBtn(ActionListener listener) {
        addBtn.addActionListener(listener);
    }

    public JLabel getFirstNameLbl() {
        return this.firstNameLbl;
    }

    public void setFirstNameLbl(JLabel firstNameLbl) {
        this.firstNameLbl = firstNameLbl;
    }

    public JLabel getLastNameLbl() {
        return this.lastNameLbl;
    }

    public void setLastNameLbl(JLabel lastNameLbl) {
        this.lastNameLbl = lastNameLbl;
    }

    public JLabel getAgeLbl() {
        return this.ageLbl;
    }

    public void setAgeLbl(JLabel ageLbl) {
        this.ageLbl = ageLbl;
    }

    public JLabel getHourRateLbl() {
        return this.hourRateLbl;
    }

    public void setHourRateLbl(JLabel hourRateLbl) {
        this.hourRateLbl = hourRateLbl;
    }

    public JLabel getJobTitlelbl() {
        return this.jobTitlelbl;
    }

    public void setJobTitlelbl(JLabel jobTitlelbl) {
        this.jobTitlelbl = jobTitlelbl;
    }

    public JLabel getRoleLbl() {
        return this.roleLbl;
    }

    public void setRoleLbl(JLabel roleLbl) {
        this.roleLbl = roleLbl;
    }

    public JTextField getFirstNameField() {
        return this.firstNameField;
    }

    public void setFirstNameField(JTextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public JTextField getLastNameField() {
        return this.lastNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public JTextField getAgeField() {
        return this.ageField;
    }

    public void setAgeField(JTextField ageField) {
        this.ageField = ageField;
    }

    public JTextField getHourRateField() {
        return this.hourRateField;
    }

    public void setHourRateField(JTextField hourRateField) {
        this.hourRateField = hourRateField;
    }

    public JTextField getJobTitleField() {
        return this.jobTitleField;
    }

    public void setJobTitleField(JTextField jobTitleField) {
        this.jobTitleField = jobTitleField;
    }

    public JComboBox<String> getRoleBox() {
        return this.roleBox;
    }

    public void setRoleBox(JComboBox<String> roleBox) {
        this.roleBox = roleBox;
    }

    public JButton getAddBtn() {
        return this.addBtn;
    }

    public void setAddBtn(JButton addBtn) {
        this.addBtn = addBtn;
    }

}
