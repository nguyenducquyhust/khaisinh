
package kiosk.mpec.entity;

public class DiaDiem {
    private int idQuocGia;
    private String quocGia;
    private int idTinhThanhPho;
    private String tinhThanhPho;
    private int idQuanHuyen;
    private String quanHuyen;
    private int idPhuongXa;
    private String phuongXa;
    private int idCoSoYTe;
    private String coSoYTe;
    
    //constructors
    public DiaDiem(){
        
    }
    public DiaDiem(String quocGia, String tinhThanhPHo, String quanHuyen, String phuongXa){
        this.quocGia = quocGia;
        this.tinhThanhPho = tinhThanhPHo;
        this.quanHuyen = quanHuyen;
        this.phuongXa = phuongXa;
    }
    
    //getters and setters

    public int getIdQuocGia() {
        return idQuocGia;
    }

    public void setIdQuocGia(int idQuocGia) {
        this.idQuocGia = idQuocGia;
    }

    public void setIdTinhThanhPho(int idTinhThanhPho) {
        this.idTinhThanhPho = idTinhThanhPho;
    }

    public void setIdQuanHuyen(int idQuanHuyen) {
        this.idQuanHuyen = idQuanHuyen;
    }

    public void setIdPhuongXa(int idPhuongXa) {
        this.idPhuongXa = idPhuongXa;
    }

    public void setIdCoSoYTe(int idCoSoYTe) {
        this.idCoSoYTe = idCoSoYTe;
    }
    

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getIdTinhThanhPho() {
        return idTinhThanhPho;
    }

    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    public int getIdQuanHuyen() {
        return idQuanHuyen;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public int getIdPhuongXa() {
        return idPhuongXa;
    }


    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public int getIdCoSoYTe() {
        return idCoSoYTe;
    }

    public String getCoSoYTe() {
        return coSoYTe;
    }

    public void setCoSoYTe(String coSoYTe) {
        this.coSoYTe = coSoYTe;
    }
    
}
