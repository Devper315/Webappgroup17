package dao;

import entity.KHACHHANG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class KHACHHANGDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<KHACHHANG> findAll() throws Exception{
        String query = "SELECT * FROM KHACHHANG";
        List<KHACHHANG> dsKHACHHANG = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            KHACHHANG khachHang = new KHACHHANG( rs.getString("maKH"),
	                                             rs.getString("hoTen"),
	                                             rs.getString("diaChi"),
	                                             rs.getString("sdt"),
	                                             rs.getDate("ngaySinh"),
	                                             rs.getDate("ngayDangKy"),
	                                             rs.getInt("doanhSo"),
	                                             rs.getString("maCN"));
            dsKHACHHANG.add(khachHang);
        }
        return dsKHACHHANG;
    }
    
    public KHACHHANG findBymaKH(String maKH) throws Exception{
        String query = "SELECT * FROM KHACHHANG WHERE maKH = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maKH);
        rs = ps.executeQuery();
        while(rs.next()){
        	KHACHHANG khachHang = new KHACHHANG( rs.getString("maKH"),
                    rs.getString("hoTen"),
                    rs.getString("diaChi"),
                    rs.getString("sdt"),
                    rs.getDate("ngaySinh"),
                    rs.getDate("ngayDangKy"),
                    rs.getInt("doanhSo"),
                    rs.getString("maCN"));
            return khachHang;
        }
        return null;
    }
    
}
