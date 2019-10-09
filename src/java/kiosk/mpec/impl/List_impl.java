
package kiosk.mpec.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kiosk.mpec.dao.List_dao;
import kiosk.mpec.entity.DiaDiem;
import kiosk.mpec.entity.FileDinhKem;
import kiosk.mpec.entity.NguoiDuocKhaiSinh;
import kiosk.mpec.entity.NguoiThan;

public class List_impl implements List_dao{

    Connection conn = new ConnectDB().getConnection();
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    String sql;
    @Override
    public ArrayList<NguoiDuocKhaiSinh> getListNguoiDuocKhaiSinhByUser(int userID) {
        NguoiDuocKhaiSinh nguoiKhaiSinh = new NguoiDuocKhaiSinh();
        ArrayList list = new ArrayList<NguoiDuocKhaiSinh>();
        sql = "select * from nguoikhaisinh where user_userID = '" + userID+"'";
          
        try {  
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nguoiKhaiSinh.setNguoiKhaiSinhID(rs.getInt("idNguoiKhaiSinh"));
                nguoiKhaiSinh.setIdPhuongXa(rs.getString("idPhuongXa"));
                nguoiKhaiSinh.setHoTen(rs.getString("HoTen"));
                nguoiKhaiSinh.setGioiTinh(rs.getString("GioiTinh"));
                nguoiKhaiSinh.setNgaySinh(rs.getString("NgaySinh"));;
                nguoiKhaiSinh.setDanToc(rs.getString("DanToc"));
                nguoiKhaiSinh.setSoChungSinh(rs.getString("SoChungSinh"));
                nguoiKhaiSinh.setNgayLamDon(rs.getString("NgayLamDon"));
                nguoiKhaiSinh.setStatus(rs.getString("Status"));
                nguoiKhaiSinh.setDetails(rs.getString("Details"));
                list.add(nguoiKhaiSinh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(List_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            return list;
    }

    @Override
    public ArrayList<NguoiDuocKhaiSinh> getListNguoiDuocKhaiSinh() {
        NguoiDuocKhaiSinh nguoiKhaiSinh = new NguoiDuocKhaiSinh();
        ArrayList list = new ArrayList<NguoiDuocKhaiSinh>();
        sql = "select * from nguoikhaisinh ";
          
        try {  
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nguoiKhaiSinh.setNguoiKhaiSinhID(rs.getInt("idNguoiKhaiSinh"));
                nguoiKhaiSinh.setIdPhuongXa(rs.getString("idPhuongXa"));
                nguoiKhaiSinh.setHoTen(rs.getString("HoTen"));
                nguoiKhaiSinh.setGioiTinh(rs.getString("GioiTinh"));
                nguoiKhaiSinh.setNgaySinh(rs.getString("NgaySinh"));;
                nguoiKhaiSinh.setDanToc(rs.getString("DanToc"));
                nguoiKhaiSinh.setSoChungSinh(rs.getString("SoChungSinh"));
                nguoiKhaiSinh.setNgayLamDon(rs.getString("NgayLamDon"));
                nguoiKhaiSinh.setStatus(rs.getString("Status"));
                nguoiKhaiSinh.setDetails(rs.getString("Details"));
                list.add(nguoiKhaiSinh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(List_impl.class.getName()).log(Level.SEVERE, null, ex);
        }             
           return list;
    }
    @Override
    public DiaDiem getDiaDiem(int idPhuongXa){
       DiaDiem diaDiem = new DiaDiem();
       sql = "select quocgia.idQuocGia, quocgia.TenQuocGia, tinhthanhpho.idTinhThanhPho, tinhthanhpho.TenTinhThanhPho,"
               + "quanhuyen.idQuanHuyen, quanhuyen.TenQuanHuyen, phuongxa.TenPhuongXa from quocgia"
               + "innerjoin tinhthanhpho on quocgia.idQuocGia = tinhthanhpho.idQuocGia"
               + "innerjoin quanhuyen on tinhthanhpho.idTinhThanhPho = quanhuyen.idTinhThanhPho"
               + "innerjoin phuongxa on quanhuyen.idQuanHuyen = phuongxa.idQuanHuyen"
               + "where idPhuongXa = '" + idPhuongXa + "';";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                diaDiem.setIdQuocGia(rs.getInt("idQuocGia"));
                diaDiem.setQuocGia(rs.getString("TenQuocGia"));
                diaDiem.setIdTinhThanhPho(rs.getInt("idTinhThanhPho"));
                diaDiem.setTinhThanhPho(rs.getString("TenTinhThanhPho"));
                diaDiem.setIdQuanHuyen(rs.getInt("idQuanHuyen"));
                diaDiem.setQuanHuyen(rs.getString("TenQuanHuyen"));
                diaDiem.setIdPhuongXa(idPhuongXa);
                diaDiem.setPhuongXa(rs.getString("TenPhuongXa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(List_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return diaDiem;
    }

    @Override
    public ArrayList<NguoiThan> getListNguoiThan(int nguoiKhaiSinhID) {
        NguoiThan nguoiThan = new NguoiThan();
        sql = "select * from nguoithan where idNguoiKhaiSinh = " + nguoiKhaiSinhID;
        ArrayList<NguoiThan> list = new ArrayList<NguoiThan>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nguoiThan.setNguoiThanID(rs.getInt("idNguoiThan"));
                nguoiThan.setHoTen(rs.getString("HoTen"));
                nguoiThan.setQuanHeVoiNguoiKS(rs.getString("QuanHe"));
                nguoiThan.setDanToc(rs.getString("DanToc"));
                
                DiaDiem diaDiem = new DiaDiem();
                diaDiem = this.getDiaDiem(rs.getInt("idPhuongXa"));
                nguoiThan.setNoiCuTru(diaDiem);
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(List_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;   
    }

    @Override
    public ArrayList<FileDinhKem> getListFileDinhKem(int nguoiKhaiSinhID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, String> getListQuocGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, String> getListTinhThanhPho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, String> getListQuanHuyen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, String> getListPhuongXa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, String> getListCoSoYTe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
