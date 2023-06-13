/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import Model.LinhKien;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laitu
 */
public class LinhKienFileController extends FileController{
    //Ghi vào file
    public void writeVTToFile (String fileName,LinhKien a) {
        super.openFileToWrite(fileName);
        super.printWriter.println(a.getMa() + "|" + a.getTen() + "|" + a.getMoTa() + "|" + a.getSoLuong() + "|" + a.getGia());
        super.closeFileAfterWrite();
    }
    
    //Chuyển đổi dữ liệu từ file txt thành lớp
    public LinhKien createLinhKienFormData(String data) {
        String[] formDatas = data.split("\\|");
        LinhKien nvs = new LinhKien(formDatas[0], formDatas[1], formDatas[2], Integer.parseInt(formDatas[3]), Integer.parseInt(formDatas[4]));
        return nvs;
    }
    
    //đọc file
    public List<LinhKien> readLinhKienFromFile(String fileName) {
        super.openFileToRead(fileName);
        List<LinhKien> lk = new ArrayList<>();
        
        while(super.sc.hasNext()) {
            String data = super.sc.nextLine();
            LinhKien acc = createLinhKienFormData(data);
            lk.add(acc);
        }
        return lk;
    }
    
    public void updateLinhKienToFile (List<LinhKien> lks, String fileName) {
        readLinhKienFromFile(fileName);
        File file = new File(fileName);
        if(file.exists()) {
            file.delete();
        }
        super.openFileToWrite(fileName);
        for(LinhKien a : lks) {
            super.printWriter.println(a.getMa() + "|" + a.getTen() + "|" + a.getMoTa() + "|" + a.getSoLuong() + "|" + a.getGia());
        }
        super.closeFileAfterWrite();
    }
}
