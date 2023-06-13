/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import Model.NhanVien;
import java.io.File;
import java.util.*;
/**
 *
 * @author laitu
 */
public class NhanVienFileController extends FileController{
    
    //Ghi vào file
    public void writeNVToFile (String fileName,NhanVien a) {
        super.openFileToWrite(fileName);
        super.printWriter.println(a.getMa() + "|" + a.getName() + "|" + a.getChucvu() + "|" + a.getMatKhau());
        super.closeFileAfterWrite();
    }
    
    //Chuyển đổi dữ liệu từ file txt thành lớp
    public NhanVien createNhanVienFormData(String data) {
        String[] formDatas = data.split("\\|");
        NhanVien nvs = new NhanVien(formDatas[0], formDatas[1], formDatas[2], formDatas[3]);
        return nvs;
    }
    
    //đọc file
    public List<NhanVien> readNhanVienFromFile(String fileName) {
        super.openFileToRead(fileName);
        List<NhanVien> nv = new ArrayList<>();
        
        while(super.sc.hasNext()) {
            String data = super.sc.nextLine();
            NhanVien acc = createNhanVienFormData(data);
            nv.add(acc);
        }
        return nv;
    }
    
    public void updateNhanVienToFile (List<NhanVien> nvs, String fileName) {
        readNhanVienFromFile(fileName);
        File file = new File(fileName);
        if(file.exists()) {
            file.delete();
        }
        super.openFileToWrite(fileName);
        for(NhanVien a : nvs) {
            super.printWriter.println(a.getMa() + "|" + a.getName() + "|" + a.getChucvu() + "|" + a.getMatKhau());
        }
        super.closeFileAfterWrite();
    }
}
