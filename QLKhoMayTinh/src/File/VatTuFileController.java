/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import Model.VatTu;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laitu
 */
public class VatTuFileController extends FileController{
    //Ghi vào file
    public void writeVTToFile (String fileName,VatTu a) {
        super.openFileToWrite(fileName);
        super.printWriter.println(a.getMa() + "|" + a.getTen() + "|" + a.getMoTa() + "|" + a.getSoLuong() + "|" + a.getGia());
        super.closeFileAfterWrite();
    }
    
    //Chuyển đổi dữ liệu từ file txt thành lớp
    public VatTu createVatTuFormData(String data) {
        String[] formDatas = data.split("\\|");
        VatTu nvs = new VatTu(formDatas[0], formDatas[1], formDatas[2], Integer.parseInt(formDatas[3]), Integer.parseInt(formDatas[4]));
        return nvs;
    }
    
    //đọc file
    public List<VatTu> readVatTuFromFile(String fileName) {
        super.openFileToRead(fileName);
        List<VatTu> vt = new ArrayList<>();
        
        while(super.sc.hasNext()) {
            String data = super.sc.nextLine();
            VatTu acc = createVatTuFormData(data);
            vt.add(acc);
        }
        return vt;
    }
    
    public void updateVatTuToFile (List<VatTu> vts, String fileName) {
        readVatTuFromFile(fileName);
        File file = new File(fileName);
        if(file.exists()) {
            file.delete();
        }
        super.openFileToWrite(fileName);
        for(VatTu a : vts) {
            super.printWriter.println(a.getMa() + "|" + a.getTen() + "|" + a.getMoTa() + "|" + a.getSoLuong() + "|" + a.getGia());
        }
        super.closeFileAfterWrite();
    }
}
