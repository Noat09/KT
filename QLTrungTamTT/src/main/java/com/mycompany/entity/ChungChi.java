/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

/**
 *
 * @author PHAN CANH TOAN
 */
public class ChungChi {
    private int id;
    private String ten;

    // Constructor
    public ChungChi(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public ChungChi() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
