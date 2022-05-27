package com.order;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Order extends javax.swing.JFrame {
    private JPanel Order;
    private JComboBox JenisHijab;
    private JTextField Jumlah_Beli;
    private JTextField Harga_Hijab;
    private JTextField Total_Pesanan;
    private JLabel StoreName;
    private JLabel Welcome;
    private JLabel Hijab;
    private JButton HitungTotalPesanan;
    private JButton PesanSekarang;
    private JLabel JumlahBeli;
    private JLabel HargaHijab;
    private JLabel TotalPesanan;
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
    private JButton Cancel;
    private JLabel Pembayaran;
    private JLabel Instruction;
    private JLabel NamaPenerima;
    private JLabel AlamatPenerima;
    private JLabel OpsiPengiriman;
    private JLabel MetodePembayaran;
    private JLabel SubtotalProduk;
    private JLabel SubtotalPengiriman;
    private JLabel SubtotalPembayaran;
    private JLabel TotalPembayaran;
    private JButton Close;

    public Order() {
        add(Order);
        setSize(500, 500);
        JenisHijab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Hijab = (String) JenisHijab.getSelectedItem();
                switch (Hijab) {
                    case "Rabbani":
                        Harga_Hijab.setText("45000");
                    case "Bergo":
                        Harga_Hijab.setText("30000");
                    case "Rawis":
                        Harga_Hijab.setText("30000");
                    case "Bella Square":
                        Harga_Hijab.setText("35000");
                    case "Pashmina Katun":
                        Harga_Hijab.setText("45000");
                    case "Pashmina Sifon":
                        Harga_Hijab.setText("40000");
                    case "Pashmina Wool Peach":
                        Harga_Hijab.setText("45000");
                    case "Pashmina Diamond":
                        Harga_Hijab.setText("35000");
                    case "Pashmina Ceruty":
                        Harga_Hijab.setText("30000");
                    case "Pashmina Crincle":
                        Harga_Hijab.setText("30000");
                    case "Pashmina Plisket":
                        Harga_Hijab.setText("35000");
                    case "Pashmina Inner":
                        Harga_Hijab.setText("40000");
                    case "Pashmina Satin":
                        Harga_Hijab.setText("40000");
                }
            }
        });
        HitungTotalPesanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int JumlahBeli = Integer.parseInt(Jumlah_Beli.getText());
                int HargaHijab = Integer.parseInt(Harga_Hijab.getText());
                int TotalPesanan = JumlahBeli * HargaHijab;
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
                        Subtotal_Pengiriman.setText("70000");
                    case "Cargo":
                        Subtotal_Pengiriman.setText("5000");
                    case "Express":
                        Subtotal_Pengiriman.setText("6000");
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
                    case "Transfer Bank BCA":
                        Subtotal_Pembayaran.setText("3500");
                    case "Transfer Bank Mandiri":
                        Subtotal_Pembayaran.setText("4500");
                    case "Transfer Bank BRI":
                        Subtotal_Pembayaran.setText("3500");
                    case "Transfer Bank BNI":
                        Subtotal_Pembayaran.setText("4500");
                }
            }
        });
        BuatPesanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int SubtotalProduk = Integer.parseInt(Subtotal_Produk.getText());
                int SubtotalPengiriman = Integer.parseInt(Subtotal_Pengiriman.getText());
                int SubtotalPembayaran = Integer.parseInt(Subtotal_Pengiriman.getText());
                int TotalPesanan = SubtotalProduk + SubtotalPengiriman + SubtotalPembayaran;
                Total_Pembayaran.setText((Integer.toString((TotalPesanan))));
                Informasi.setText("Pesananmu sedang dikemas ");
            }
        });
        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Harga_Hijab.setText("");
                Total_Pesanan.setText("");
                Opsi_Pengiriman.setSelectedIndex(0);
                Metode_Pembayaran.setSelectedIndex(0);
                Subtotal_Produk.setText("");
                Subtotal_Pengiriman.setText("");
                Subtotal_Pembayaran.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AMIINAH STORE");
        frame.setContentPane(new Order().Order);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }
}