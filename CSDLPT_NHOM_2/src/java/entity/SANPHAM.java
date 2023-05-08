package entity;

public class SANPHAM {
    private String maSP;
    private String ten;
    private String donvi;
    private String nuocSX;
    private Integer gia;
    private Integer soLuongTon;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public SANPHAM() {
    }

    public SANPHAM(String maSP, String ten, String donvi, String nuocSX, Integer gia, Integer soLuongTon) {
        this.maSP = maSP;
        this.ten = ten;
        this.donvi = donvi;
        this.nuocSX = nuocSX;
        this.gia = gia;
        this.soLuongTon = soLuongTon;
    }

}
