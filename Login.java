package com.login;

import com.order.Order;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextHitInfo;

public class Login {
    private JTextField UserName_Login;
    private JTextField Password_Login;
    private JButton LoginSekarang;
    private JPanel Login;
    private JLabel StoreName;
    private JLabel Welcome;
    private JLabel Instruction;
    private JLabel UserName;
    private JLabel Password;

    public Login() {
        LoginSekarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String UserName = "citra";
                String Password = "citra";
                if (UserName_Login.getText().equals(UserName) && Password_Login.getText().equals(Password)){
                    JOptionPane.showMessageDialog(null, "Login berhasil");

                    Order Pemesanan = new Order();
                    Pemesanan.setVisible(true);
                }
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