
package kiosk.mpec.entity;

public class FileDinhKem {
     private byte[] image;
    private String name;

    public FileDinhKem() {
    }

    public FileDinhKem(byte[] image, String name) {
        this.image = image;
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
