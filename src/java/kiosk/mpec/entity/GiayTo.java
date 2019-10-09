
package kiosk.mpec.entity;

public class GiayTo {
    private int giayToID;
    private String loaiGiayTo;
    private String soGiayTo;
    private String noiCap;
    private String ngayCap;
    
    //constructors
    public GiayTo(){
        
    }
    public GiayTo(String loaiGiayTo, String soGiayTo, String noiCap, String ngayCap){
        this.loaiGiayTo = loaiGiayTo;
        this.noiCap = noiCap;
        this.ngayCap = ngayCap;
        this.soGiayTo = soGiayTo;
    }
    
    //setters and getters

    public int getGiayToID() {
        return giayToID;
    }

    public String getLoaiGiayTo() {
        return loaiGiayTo;
    }

    public void setLoaiGiayTo(String loaiGiayTo) {
        this.loaiGiayTo = loaiGiayTo;
    }

    public String getSoGiayTo() {
        return soGiayTo;
    }

    public void setSoGiayTo(String soGiayTo) {
        this.soGiayTo = soGiayTo;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public String getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(String ngayCap) {
        this.ngayCap = ngayCap;
    }
    
}
