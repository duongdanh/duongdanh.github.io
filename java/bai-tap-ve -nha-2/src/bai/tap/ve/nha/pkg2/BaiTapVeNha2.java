/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.tap.ve.nha.pkg2;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class BaiTapVeNha2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        
        //nhap vao danh sach cac books
        System.out.print("nhap so luong sach: ");
        int n = x.nextInt();
        book[] books = new book[n];
        for(int i=0; i<n; i++){
            System.out.println("nhap thong tin sach thu " + (i+1) + ":");
            books[i] = new book();
            books[i].input();
            System.out.println("*************************");
    }
        //xuat ra danh sach cac sach
        System.out.println("thong tin cac sach vua nhap la: ");
        for(int i=0;i<n;i++){
            books[i].output();
            System.out.println("*************************");
        }
    }
}
