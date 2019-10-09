
package kiosk.mpec.entity;

public class NguoiThan {
    private int nguoiKhaiSinhID;
    private int nguoiThanID;
    private String hoTen;
    private String quanHeVoiNguoiKS;
    private DiaDiem noiCuTru;
    private String danToc;
    private GiayTo idloaiGiayTo;
    private String idPhuongXa;
    
    
    //constructors
    public NguoiThan(){
        
    }
    public NguoiThan(String hoTen, String quanHeVoiNguoiKS, DiaDiem noiCuTru){
        this.hoTen = hoTen;
        this.quanHeVoiNguoiKS = quanHeVoiNguoiKS;
        this.noiCuTru = noiCuTru;
    }
    
    //getters and setters

    public int getNguoiKhaiSinhID() {
        return nguoiKhaiSinhID;
    }

    public void setNguoiKhaiSinhID(int nguoiKhaiSinhID) {
        this.nguoiKhaiSinhID = nguoiKhaiSinhID;
    }

    public int getNguoiThanID() {
        return nguoiThanID;
    }

    public void setNguoiThanID(int nguoiThanID) {
        this.nguoiThanID = nguoiThanID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQuanHeVoiNguoiKS() {
        return quanHeVoiNguoiKS;
    }

    public void setQuanHeVoiNguoiKS(String quanHeVoiNguoiKS) {
        this.quanHeVoiNguoiKS = quanHeVoiNguoiKS;
    }

    public DiaDiem getNoiCuTru() {
        return noiCuTru;
    }

    public void setNoiCuTru(DiaDiem noiCuTru) {
        this.noiCuTru = noiCuTru;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public GiayTo getIdloaiGiayTo() {
        return idloaiGiayTo;
    }

    public void setIdloaiGiayTo(GiayTo idloaiGiayTo) {
        this.idloaiGiayTo = idloaiGiayTo;
    }

    public String getIdPhuongXa() {
        return idPhuongXa;
    }

    public void setIdPhuongXa(String idPhuongXa) {
        this.idPhuongXa = idPhuongXa;
    }
    
}
