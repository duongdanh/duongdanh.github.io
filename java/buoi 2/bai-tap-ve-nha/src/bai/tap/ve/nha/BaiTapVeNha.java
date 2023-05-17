/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.tap.ve.nha;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class BaiTapVeNha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap (N>=3): ");
            n = scanner.nextInt();
            if (n < 3) {
                System.out.println("Nhap sai vui long nhap lai!");
            }
        } while (n < 3);

        int[] mang1 = new int[n];

        //nhập mảng
        System.out.println("Nhap mang gom " + n + " phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mang1[i] = scanner.nextInt();
        }

        //xuất mảng
        System.out.print("Mang gom " + n + " phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang1[i] + " ");
        }

        // Đếm số lượng số nguyên tố trong mảng
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (laNgto(mang1[i])) {
                count++;
            }
        }
        // Xuất kết quả
        System.out.println("\nSo luong so nguyen to trong mang la: " + count);
        
        // In ra các số chẵn và dương trong mảng
        System.out.print("cac so chan va duong trong mang la: ");
        for(int i=0;i<n;i++){
            if(mang1[i] % 2 == 0 && mang1[i] > 0){
                System.out.print(mang1[i] + " ");
            }
        }
        
        //tìm giá trị âm lớn nhất trong mảng(nếu có)
        //khởi tạo biến maxAm là giá trị lớn nhất trong mảng
        Integer maxAm = null;
        
        //  duyệt qua từng phần tử trong mảng
        for(int i=0;i<n;i++){
            // Nếu phần tử đó là số âm và lớn hơn maxAm thì gán giá trị của maxAm bằng giá trị đó
            if(mang1[i] < 0 && (maxAm == null || mang1[i] > maxAm)){
                maxAm = mang1[i];
            }
        }
        
        //kiểm tra xem có số âm nào trong mảng ko
        if(maxAm == null){
            System.out.println("\nkhong co so am trong mang!");
        }else{
            System.out.println("\ngia tri am lon nhat trong mang la: " + maxAm);
        }
        
        //gán giá trị của hàm xuất kq
        boolean kq = ktratangdan(mang1);
        xuatketqua(kq);
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean laNgto(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {                   
                return false;
            }
        }
        return true;
    }
    
    public static boolean ktratangdan(int[] mang1) {
    for (int i = 1; i < mang1.length; i++) {
        if (mang1[i] <= mang1[i-1]) {
            return false;
        }
    }
    return true;
  }

//    // Hàm xuất kết quả
public static void xuatketqua(boolean kq) {
    if (kq) {
       System.out.println("Mang nay la mang tang dan.");
   } else {
       System.out.println("Mang nay khong phai la mang tang dan.");
    }
  }
}