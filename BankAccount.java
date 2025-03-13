/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_2;

/**
 *
 * @author Norisa Defriani
 */
// Kelas untuk merepresentasikan akun / rekening bank
public class BankAccount {
    // Deklarasi field untuk menyimpan data akun bank
    private String noRek;
    private String namaPemilik;
    private double saldo;
    private String jenisAkun;

    // Constructor dengan 4 parameter
    public BankAccount(String noRek, String namaPemilik, double saldo, String jenisAkun) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.jenisAkun = jenisAkun;
    }

    // Constructor dengan 3 parameter (tanpa saldo)
    public BankAccount(String noRek, String namaPemilik, String jenisAkun) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.jenisAkun = jenisAkun;
        
    // Menetapkan nilai saldo default berdasarkan jenis akun menggunakan switch-case
        switch (jenisAkun) {
            case "Tabungan":
                this.saldo = 100.0;
                break;
            case "Giro":
                this.saldo = 500.0;
                break;
            default:
            // Jika jenis akun tidak valid (atau bukan jenis Tabungan / Giro saldo di set ke 0
                this.saldo = 0.0; 
        }
    }

    // Method untuk menampilkan informasi akun / rekening 
    public void displayInfo() {
        System.out.println("Nomor Rekening: " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println("Jenis Akun: " + jenisAkun);
        System.out.println("------------------------");
    }

    // Method untuk deposit atau penambahan saldo ke rekening
    public void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal; // Tambah saldo
            System.out.println(namaPemilik + " berhasil deposit: " + nominal);
        }
    }

    // Method untuk menarik uang dari akun / rekening
    public void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (saldo < nominal) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal; // Mengurangi saldo dari nominal yang ditarik
            System.out.println(namaPemilik + " berhasil menarik: " + nominal);
        }
    }

    // Method untuk transfer saldo ke akun lain
    public void transfer(BankAccount tujuan, double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal transfer harus lebih dari 0!");
        } else if (saldo < nominal) {
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        } else {
            saldo -= nominal; // Mengurangi saldo pengirim
            tujuan.saldo += nominal; // Menambah saldo penerima
            System.out.println(namaPemilik + " berhasil transfer " + nominal + " ke " + tujuan.namaPemilik);
        }
    }
}
