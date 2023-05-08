package entity;

import java.util.Date;

public class KHO {
    private String maKHO;
    private String ten;
    private String diaChi;
    private String maCN;

    public KHO() {
    }

    public String getMaKHO() {
        return maKHO;
    }

    public void setMaKHO(String maKHO) {
        this.maKHO = maKHO;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public KHO(String maKHO, String ten, String diaChi, String maCN) {
        this.maKHO = maKHO;
        this.ten = ten;
        this.diaChi = diaChi;
        this.maCN = maCN;
    }

    
}
