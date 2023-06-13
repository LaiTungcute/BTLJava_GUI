/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tungu
 */
public class VatTu {
    private String ma;
    private String ten;
    private String moTa;
    private int soLuong;
    private int gia;

    public VatTu(String ma, String ten, String moTa, int soLuong, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public VatTu() {
        
    }


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Mã: " + ma + ", Tên: " + ten + ", Mô tả: " + moTa + ", Số lượng: " + soLuong;
    }
}
