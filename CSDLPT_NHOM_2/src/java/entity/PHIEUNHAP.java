package entity;

import DBContext.DBContext;
import java.sql.Connection;
import java.util.Date;

public class PHIEUNHAP {
    private String maPN;    
    private Date ngayNhap;
    private String nhaCC;
    private String maNV;
    private String maKHO;

    public PHIEUNHAP() {
    }

    public PHIEUNHAP(String maPN, Date ngayNhap, String nhaCC, String maNV, String maKHO) {
        this.maPN = maPN;
        this.ngayNhap = ngayNhap;
        this.nhaCC = nhaCC;
        this.maNV = maNV;
        this.maKHO = maKHO;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKHO() {
        return maKHO;
    }

    public void setMaKHO(String maKHO) {
        this.maKHO = maKHO;
    }

    
}
