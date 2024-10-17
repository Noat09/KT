/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.util.Date;

/**
 *
 * @author PHAN CANH TOAN
 */
public class KhoaDaoTao {
    private int id;
    private String ten;
    private String hocPhi;
    private int chungChi; 
    private Date batDau; 
    private Date ketThuc;

    public KhoaDaoTao(int id, String ten, String hocPhi, int chungChi, Date batDau, Date ketThuc) {
        this.id = id;
        this.ten = ten;
        this.hocPhi = hocPhi;
        this.chungChi = chungChi;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
    }

    

    public KhoaDaoTao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(String hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getChungChi() {
        return chungChi;
    }

    public void setChungChi(int chungChi) {
        this.chungChi = chungChi;
    }

    public Date getBatDau() {
        return batDau;
    }

    public void setBatDau(Date batDau) {
        this.batDau = batDau;
    }

    public Date getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(Date ketThuc) {
        this.ketThuc = ketThuc;
    }

    
}
