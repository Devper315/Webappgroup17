package entity;

import java.util.Date;

public class NHANVIEN {
    private String maNV;
    private String hoTen;
    private String diaChi;
    private String sdt;
    private Date ngayVaoLam;
    private String maCN;

    public String getMaNV() {
        return maNV;
    }

    public NHANVIEN(String maNV, String hoTen, String diaChi, String sdt, Date ngayVaoLam, String maCN) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.ngayVaoLam = ngayVaoLam;
		this.maCN = maCN;
	}

	public void setMaNV(String maNV) {
        this.maNV = maNV;
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

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public NHANVIEN() {
    }

}
