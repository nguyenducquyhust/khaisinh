
package kiosk.mpec.dao;

import java.util.ArrayList;
import java.util.HashMap;
import kiosk.mpec.entity.DiaDiem;
import kiosk.mpec.entity.FileDinhKem;
import kiosk.mpec.entity.NguoiDuocKhaiSinh;
import kiosk.mpec.entity.NguoiThan;

public interface List_dao {
    ArrayList<NguoiDuocKhaiSinh>  getListNguoiDuocKhaiSinhByUser(int userID);
    ArrayList<NguoiDuocKhaiSinh>  getListNguoiDuocKhaiSinh();
    DiaDiem getDiaDiem(int idPhuongXa);
    ArrayList<NguoiThan>  getListNguoiThan(int nguoiKhaiSinhID);
    ArrayList<FileDinhKem>  getListFileDinhKem(int nguoiKhaiSinhID);
    HashMap<Integer ,String> getListQuocGia();
    HashMap<Integer ,String> getListTinhThanhPho();
    HashMap<Integer ,String> getListQuanHuyen();
    HashMap<Integer ,String> getListPhuongXa();
    HashMap<Integer ,String> getListCoSoYTe();

    
    
    
}
