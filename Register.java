package com.register;

import com.login.Login;
import com.orderpayment.OrderPayment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField Nama_Register;
    private JTextField Username_Register;
    private JPasswordField Password_Register;
    private JPasswordField RetypePassword_Register;
    private JCheckBox ShowPassword;
    private JButton RegisterNow;
    private JPanel Register;
    private JLabel NameStore;
    private JLabel Hello;
    private JLabel Instruction;
    private JLabel Nama;
    private JLabel Username;
    private JLabel Password;
    private JLabel RetypePassword;
    private JLabel WrongPassword;

    public static String name;
    public static String username;
    public static String password;

    public Register() {
        ShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ShowPassword.isSelected()) {
                    Password_Register.setEchoChar((char) 0);
                    RetypePassword_Register.setEchoChar((char)0);
                }
                else {
                    Password_Register.setEchoChar('*');
                    RetypePassword_Register.setEchoChar('*');
                }
            }
        });
        RegisterNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RetypePassword_Register.getText().equals(Password_Register.getText())) {
                    name = Nama_Register.getText();
                    username = Username_Register.getText();
                    password = Password_Register.getText();

                    Login Masuk = new Login();
                    Masuk.setVisible(true);

                }
                else{
                    WrongPassword.setText("Maaf, password yang anda masukkan tidak sesuai");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AMIINAH STORE");
        frame.setContentPane(new Register().Register);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }
}
