package entity;

public class CHINHANH {
    private String maCN;
    private String ten;
    private String diaChi;
    private String sdt;

    public CHINHANH() {
    }

    @Override
    public String toString() {
        return "CHINHANH{" + "maCN=" + maCN + ", ten=" + ten + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }

    public CHINHANH(String maCN, String ten, String diaChi, String sdt) {
        this.maCN = maCN;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

  
}
