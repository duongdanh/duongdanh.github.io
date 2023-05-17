/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.tap;

import java.util.Scanner;

/*
 *
 * @author MSI
 */
public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hocsinh hs1 = new hocsinh();
        hs1.input();
        hs1.output();  
        hs1.rank();
        System.out.println("ho ten vua nhap la: " +hs1.getHoten());
        System.out.println("*****************************************");
        System.out.println("ho ten moi: ");
        Scanner scr = new Scanner(System.in);
        String tenmoi = scr.nextLine();
        hs1.setHoten(tenmoi);
        System.out.println("ten moi dau khi doi: " +hs1.getHoten());
        System.out.println("*****************************************");
        System.out.println("nhap thong tin cua hoc sinh thu 2: ");
        hocsinh hs2 = new hocsinh();
        hs2.input();
        hs2.output();  
        hs2.rank();
        System.out.println("hoc sinh vua duoc them la: " +hs2.getHoten());
        System.out.println("*****************************************");
        if(hs1.getDtb() > hs2.getDtb()){
            System.out.println("hoc sinh " + hs1.getHoten() + " co diem lon hon " +hs2.getHoten());
        }else if(hs1.getDtb() < hs2.getDtb()){
            System.out.println("hoc sinh " + hs2.getHoten() + " co diem lon hon " +hs1.getHoten());
        }else 
            System.out.println("hai hoc sinh co diem bang nhau!");
    }
    
}
