package entity;

import java.util.Date;

public class HOADON {
    private String maHD;
    private Date ngayTao;
    private String maKH;
    private String maNV;
    private Integer giaTri;
    private String maKho;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Integer getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(Integer giaTri) {
        this.giaTri = giaTri;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public HOADON(String maHD, Date ngayTao, String maKH, String maNV, Integer giaTri, String maKho) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.maKH = maKH;
        this.maNV = maNV;
        this.giaTri = giaTri;
        this.maKho = maKho;
    }

    public HOADON() {
    }

}