/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tungu
 */
public class Kho {
    private List<VatTu> vatTuList;
    private List<LinhKien> linhKienList;
  
    public Kho() {
        vatTuList = new ArrayList<>();
        linhKienList = new ArrayList<>();
    }

    public void themVatTu(VatTu vatTu) {
        vatTuList.add(vatTu);
    }

    public void themLinhKien(LinhKien linhKien) {
        linhKienList.add(linhKien);
    }

    public void xoaVatTu(VatTu vatTu) {
        vatTuList.remove(vatTu);
    }

    public void xoaLinhKien(LinhKien linhKien) {
        linhKienList.remove(linhKien);
    }

    public void hienThiVatTu() {
        for (VatTu vatTu : vatTuList) {
            System.out.println(vatTu);
        }
    }

    public void hienThiLinhKien() {
        for (LinhKien linhKien : linhKienList) {
            System.out.println(linhKien);
        }
    }

    public List<VatTu> getVatTuList() {
        return vatTuList;
    }

    public void setVatTuList(List<VatTu> vatTuList) {
        this.vatTuList = vatTuList;
    }

    public List<LinhKien> getLinhKienList() {
        return linhKienList;
    }

    public void setLinhKienList(List<LinhKien> linhKienList) {
        this.linhKienList = linhKienList;
    }
}
