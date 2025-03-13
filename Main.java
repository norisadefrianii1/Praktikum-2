/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_2;

/**
 *
 * @author Norisa Defriani
 */
// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek akun bank dengan dua constructor berbeda
        BankAccount akun1 = new BankAccount("18022006", "Norisa", 2000.0, "Tabungan");
        BankAccount akun2 = new BankAccount("20111977", "Defriani", "Giro");

        // Menampilkan informasi akun
        akun1.displayInfo();
        akun2.displayInfo();

        // Melakukan deposit
        akun1.deposit(100.0);

        // Melakukan withdraw
        akun2.withdraw(200.0);

        // Melakukan transfer
        akun1.transfer(akun2, 150.0);
        
        // Menampilkan informasi akun setelah transaksi
        System.out.println("----------------------");
        System.out.println("Informasi Akun Setelah Melakukan Transaksi");
        System.out.println("------------------------");
        akun1.displayInfo();
        akun2.displayInfo();
    }
}


