package com.orderpayment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderPayment extends javax.swing.JFrame {
    private JTextField Harga_Hijab;
    private JTextField Jumlah_Beli;
    private JTextField Total_Pesanan;
    private JTextField Nama_Penerima;
    private JTextField Alamat_Penerima;
    private JComboBox Opsi_Pengiriman;
    private JComboBox Metode_Pembayaran;
    private JTextField Subtotal_Produk;
    private JTextField Subtotal_Pengiriman;
    private JTextField Subtotal_Pembayaran;
    private JTextField Total_Pembayaran;
    private JButton BuatPesanan;
    private JTextArea Informasi;
    private JPanel OrderPayment;
    private JLabel StoreName;
    private JLabel Instruction1;
    private JLabel Hijab;
    private JComboBox Pilih_Hijab;
    private JLabel Harga;
    private JLabel JumlahBeli;
    private JLabel TotalPesanan;
    private JButton HitungTotalPesanan;
    private JLabel Pembayaran;
    private JLabel Instruction2;
    private JLabel NamaPenerima;
    private JLabel AlamatPenerima;
    private JLabel OpsiPengiriman;
    private JLabel MetodePembayaran;
    private JLabel SubtotalProduk;
    private JLabel SubtotalPengiriman;
    private JLabel SubtotalPembayaran;
    private JLabel TotalPembayaran;
    private JButton Reset;
    private JButton Close;

    public OrderPayment() {
        add(OrderPayment);
        setSize(500, 500);
        Pilih_Hijab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Hijab = (String) Pilih_Hijab.getSelectedItem();
                switch (Hijab) {
                    case "Rabbani":
                        Harga_Hijab.setText("45000");
                        break;
                    case "Bergo":
                        Harga_Hijab.setText("30000");
                        break;
                    case "Rawis":
                        Harga_Hijab.setText("30000");
                        break;
                    case "Bella Square":
                        Harga_Hijab.setText("35000");
                        break;
                    case "Pashmina Katun":
                        Harga_Hijab.setText("45000");
                        break;
                    case "Pashmina Sifon":
                        Harga_Hijab.setText("40000");
                        break;
                    case "Pashmina Wool Peach":
                        Harga_Hijab.setText("45000");
                        break;
                    case "Pashmina Diamond":
                        Harga_Hijab.setText("35000");
                        break;
                    case "Pashmina Ceruty":
                        Harga_Hijab.setText("30000");
                        break;
                    case "Pashmina Crincle":
                        Harga_Hijab.setText("30000");
                        break;
                    case "Pashmina Plisket":
                        Harga_Hijab.setText("35000");
                        break;
                    case "Pashmina Inner":
                        Harga_Hijab.setText("40000");
                        break;
                    case "Pashmina Satin":
                        Harga_Hijab.setText("40000");
                        break;
                }
            }
        });
        HitungTotalPesanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Harga_Hijab.getText().equals("") || Jumlah_Beli.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Silahkan isi kolom yang masih kosong!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    HitungTotalPesanan.setText((String) Pilih_Hijab.getSelectedItem());
                }
                int HargaHijab = Integer.parseInt(Harga_Hijab.getText());
                int JumlahBeli= Integer.parseInt(Jumlah_Beli.getText());
                int TotalPesanan = HargaHijab * JumlahBeli;
                Total_Pesanan.setText((Integer.toString((TotalPesanan))));
                Subtotal_Produk.setText(Integer.toString(TotalPesanan));
            }
        });
        Opsi_Pengiriman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String OpsiPengiriman = (String) Opsi_Pengiriman.getSelectedItem();
                switch (OpsiPengiriman) {
                    case "Reguler":
                        Subtotal_Pengiriman.setText("7000");
                    break;
                    case "Cargo":
                        Subtotal_Pengiriman.setText("5000");
                    break;
                    case "Express":
                        Subtotal_Pengiriman.setText("6000");
                    break;
                }
            }
        });
        Metode_Pembayaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String MetodePembayaran = (String) Metode_Pembayaran.getSelectedItem();
                switch (MetodePembayaran) {
                    case "COD (bayar ditempat)":
                        Subtotal_Pembayaran.setText("0");
                        break;
                    case "Transfer Bank BCA":
                        Subtotal_Pembayaran.setText("4000");
                        break;
                    case "Transfer Bank Mandiri":
                        Subtotal_Pembayaran.setText("5000");
                        break;
                    case "Transfer Bank BRI":
                        Subtotal_Pembayaran.setText("5000");
                        break;
                    case "Transfer Bank BNI":
                        Subtotal_Pembayaran.setText("4000");
                        break;
                }
            }
        });
        BuatPesanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if (Nama_Penerima.getText().equals("") || Alamat_Penerima.getText().equals("") || Subtotal_Produk.getText().equals("") || Subtotal_Pengiriman.getText().equals("") || Subtotal_Pembayaran.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Silahkan isi kolom yang masih kosong!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        BuatPesanan.setText((String) Opsi_Pengiriman.getSelectedItem());
                        Metode_Pembayaran.getSelectedItem();
                    }
                    int SubtotalProduk = Integer.parseInt(Subtotal_Produk.getText());
                    int SubtotalPengiriman = Integer.parseInt(Subtotal_Pengiriman.getText());
                    int SubtotalPembayaran = Integer.parseInt(Subtotal_Pengiriman.getText());
                    int TotalPesanan = SubtotalProduk + SubtotalPengiriman + SubtotalPembayaran;
                    Total_Pembayaran.setText((Integer.toString((TotalPesanan))));
                    Informasi.setText("Pesananmu sedang dikemas ");
            }
        });
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pilih_Hijab.setSelectedIndex(0);
                Jumlah_Beli.setText("");
                Harga_Hijab.setText("");
                Total_Pesanan.setText("");
                Nama_Penerima.setText("");
                Alamat_Penerima.setText("");
                Opsi_Pengiriman.setSelectedIndex(0);
                Metode_Pembayaran.setSelectedIndex(0);
                Subtotal_Produk.setText("");
                Subtotal_Pengiriman.setText("");
                Subtotal_Pembayaran.setText("");
                Total_Pembayaran.setText("");
                Informasi.setText("");
            }
        });
        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AMIINAH STORE");
        frame.setContentPane(new OrderPayment().OrderPayment);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }
}
