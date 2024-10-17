/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

/**
 *
 * @author PHAN CANH TOAN
 */
public class PhanCong {
    private int id;
    private int khoaDaoTao; // Foreign key to KhoaDaoTao
    private int giangVien;  // Foreign key to GiangVien

    // Constructor
    public PhanCong(int id, int khoaDaoTao, int giangVien) {
        this.id = id;
        this.khoaDaoTao = khoaDaoTao;
        this.giangVien = giangVien;
    }

    public PhanCong() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getKhoaDaoTao() {
        return khoaDaoTao;
    }

    public int getGiangVien() {
        return giangVien;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setKhoaDaoTao(int khoaDaoTao) {
        this.khoaDaoTao = khoaDaoTao;
    }

    public void setGiangVien(int giangVien) {
        this.giangVien = giangVien;
    }
}
