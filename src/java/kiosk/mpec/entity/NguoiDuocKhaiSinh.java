
package kiosk.mpec.entity;

import java.util.ArrayList;

public class NguoiDuocKhaiSinh {
    private int nguoiKhaiSinhID;
    private String soChungSinh;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String danToc;
    private String ngayLamDon;
    private String status;
    private String details;
    private DiaDiem queQuan;
    private DiaDiem noiSinh;
    private ArrayList<FileDinhKem> listFileDinhKem;
    private int userID;
    private String idPhuongXa;
    private String idCoSoYTe;

    public int getNguoiKhaiSinhID() {
        return nguoiKhaiSinhID;
    }

    public void setNguoiKhaiSinhID(int nguoiKhaiSinhID) {
        this.nguoiKhaiSinhID = nguoiKhaiSinhID;
    }
    

    public String getSoChungSinh() {
        return soChungSinh;
    }

    public void setSoChungSinh(String soChungSinh) {
        this.soChungSinh = soChungSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getNgayLamDon() {
        return ngayLamDon;
    }

    public void setNgayLamDon(String ngayLamDon) {
        this.ngayLamDon = ngayLamDon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public DiaDiem getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(DiaDiem queQuan) {
        this.queQuan = queQuan;
    }

    public DiaDiem getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(DiaDiem noiSinh) {
        this.noiSinh = noiSinh;
    }

    public ArrayList<FileDinhKem> getListFileDinhKem() {
        return listFileDinhKem;
    }

    public void setListFileDinhKem(ArrayList<FileDinhKem> listFileDinhKem) {
        this.listFileDinhKem = listFileDinhKem;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getIdPhuongXa() {
        return idPhuongXa;
    }

    public void setIdPhuongXa(String idPhuongXa) {
        this.idPhuongXa = idPhuongXa;
    }

    public String getIdCoSoYTe() {
        return idCoSoYTe;
    }

    public void setIdCoSoYTe(String idCoSoYTe) {
        this.idCoSoYTe = idCoSoYTe;
    }
    
    
    
}
