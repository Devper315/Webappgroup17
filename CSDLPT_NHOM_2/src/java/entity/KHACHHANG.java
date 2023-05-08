package entity;

import java.util.Date;

public class KHACHHANG {
    private String maKH;
    private String hoTen;
    private String diaChi;
    private String sdt;
    private Date ngaySinh;
    private Date ngayDangKy;
    private Integer doanhSo;
    private String maCN;

    public KHACHHANG() {
    }

    public KHACHHANG(String maKH, String hoTen, String diaChi, String sdt, Date ngaySinh, Date ngayDangKy, Integer doanhSo, String maCN) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.ngayDangKy = ngayDangKy;
        this.doanhSo = doanhSo;
        this.maCN = maCN;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public Integer getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Integer doanhSo) {
        this.doanhSo = doanhSo;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

}
