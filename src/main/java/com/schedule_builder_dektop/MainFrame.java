package com.schedule_builder_dektop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.http_api_call_schedule_builder.Employee.AddEmployee;
import com.schedule_builder_dektop.Employee.NewEmployee;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Schedule Builder");

        setLayout(new BorderLayout());

        setJMenuBar(createMenu());

        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);// display in the screen center
        // setVisible(true);// delete or comment this line for the login mode

    }

    public JMenuBar createMenu() {
        JMenuBar menu = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newEmployee = new JMenuItem("New Employee");
        JMenuItem exit = new JMenuItem("Exit");

        newEmployee.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                NewEmployee newEmployee = new NewEmployee();
                newEmployee.addActionListenerToAddBtn(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String fisrtName = newEmployee.getFirstNameField().getText();
                        String lastName = newEmployee.getLastNameField().getText();
                        int age = Integer.valueOf(newEmployee.getAgeField().getText());
                        double hourRate = Double.valueOf(newEmployee.getHourRateField().getText());
                        String jobTitle = newEmployee.getJobTitleField().getText();
                        String role = (String) newEmployee.getRoleBox().getSelectedItem();

                        AddEmployee addEmployee = new AddEmployee();
                        try {

                            if (addEmployee.add(fisrtName, lastName, hourRate, jobTitle, age, role)) {

                                JOptionPane.showMessageDialog(newEmployee, "new Employee Added!",
                                        "Employee added", JOptionPane.INFORMATION_MESSAGE);
                                newEmployee.dispose();

                            }
                        } catch (IOException e1) {

                            e1.printStackTrace();
                        }
                    }

                });
            }

        });

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
