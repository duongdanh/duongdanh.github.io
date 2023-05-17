/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.tap;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
class hocsinh {
    private String maso;
    private String hoten;
    private float dtb;

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma so: ");
        maso = sc.nextLine();
        System.out.print("nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("nhap diem trung binh: ");
        dtb = sc.nextFloat();
        System.out.println("*****************************************");
    }
   
    public void output() {
        System.out.println("xuat thong tin: ");
        System.out.println("ma so la: " +maso);
        System.out.println("ho ten la: " +hoten);
        System.out.println("diem trung binh: " +dtb);
        
    }
    
    public void rank(){
        if(dtb<5){
            System.out.println("xep loai yeu");
        }else if(dtb<7){
            System.out.println("xep loai trung binh");
        }else if(dtb<8){
            System.out.println("xep loai kha");
        }else if(dtb<=10){
            System.out.println("xep loai gioi");
        }else 
            System.out.println("diem khong hop le");
    }
}
