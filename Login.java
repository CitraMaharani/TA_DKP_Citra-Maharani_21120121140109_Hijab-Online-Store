package com.login;

import com.orderpayment.OrderPayment;
import com.register.Register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends javax.swing.JFrame{
    private JTextField Username_Login;
    private JPasswordField Password_Login;
    private JCheckBox ShowPassword;
    private JButton LoginNow;
    private JPanel Login;
    private JLabel NameStore;
    private JLabel Welcome;
    private JLabel Instruction;
    private JLabel Username;
    private JLabel Password;
    private JButton RegisterNow;

    public Login() {
        add(Login);
        setSize(500, 500);
        ShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ShowPassword.isSelected()) {
                    Password_Login.setEchoChar((char) 0);
                }
                else {
                    Password_Login.setEchoChar('*');
                }
            }
        });
        LoginNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Username_Login.getText().equals(Register.username) && Password_Login.getText().equals(Register.password)) {
                    JOptionPane.showMessageDialog(null, "Login berhasil");

                    OrderPayment Pemesanan = new OrderPayment();
                    Pemesanan.setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(null, "Login gagal");
                }
            }
        });
        RegisterNow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register Daftar = new Register();
                Daftar.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AMIINAH STORE");
        frame.setContentPane(new Login().Login);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }
}
