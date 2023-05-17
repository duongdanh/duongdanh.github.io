/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg4;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class HCN {
    //thuoc tinh
    private int chieudai;
    private int chieurong;
    
    
    
    //constructor
    public HCN()
    {
        
    }
    public HCN(int a, int b)
    {
        chieudai = a;
        chieurong = b;               
    }
    
    public HCN(HCN b)
    {
        this.chieudai = b.chieudai ;
        this.chieurong = b.chieurong ;
    }
    
    //getter và setter
    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }


    //phương thức
    public int TinhDienTich() {
        return chieudai*chieurong;
    }

    void nhap() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieudai = x.nextInt();
        
       
        System.out.print("Nhap chieu rong: ");
        chieurong = x.nextInt();
    }
    
}
