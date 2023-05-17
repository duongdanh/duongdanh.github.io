/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.tap.ve.nha.pkg2;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class book {
    private int masach;
    private String tiltle;
    private String author;
    private float giaban;
    
    //constructor
    public book()
    {
        
    }
    public book(int masach, String tiltle, String author, float giaban){
        this.masach = masach;
        this.tiltle = tiltle;
        this.author = author;
        this.giaban = giaban;
    }
    
    //getter and setter 
    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTiltle() {
        return tiltle;
    }

    public void setTiltle(String tiltle) {
        this.tiltle = tiltle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }
    
    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        masach = x.nextInt();
        x.nextLine();
        System.out.print("nhap vao tiltle(tieu de): ");
        tiltle = x.nextLine();
        System.out.print("nhap vao author(tac gia): ");
        author = x.nextLine();
        System.out.print("nhap vao gia ban: ");
        giaban = x.nextFloat();
    }
    
    public void output(){
        System.out.println("Ma sach la: " +masach);
        System.out.println("tieu de la: " +tiltle);
        System.out.println("tac gia la: " +author);
        System.out.println("gia ban la: " +giaban);
    }
}
