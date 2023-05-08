package dao;

import entity.NHANVIEN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class NHANVIENDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<NHANVIEN> findAll() throws Exception{
        String query = "SELECT * FROM NHANVIEN";
        List<NHANVIEN> dsNHANVIEN = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            NHANVIEN nhanVien = new NHANVIEN( rs.getString("maNV"),
	                                             rs.getString("hoTen"),
	                                             rs.getString("diaChi"),
	                                             rs.getString("sdt"),
	                                             rs.getDate("ngayVaoLam"),
	                                             rs.getString("maCN"));
            dsNHANVIEN.add(nhanVien);
        }
        return dsNHANVIEN;
    }
    
    public NHANVIEN findBymaNV(String maNV) throws Exception{
        String query = "SELECT * FROM NHANVIEN WHERE maNV = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maNV);
        rs = ps.executeQuery();
        while(rs.next()){
        	NHANVIEN nhanVien = new NHANVIEN( rs.getString("maNV"),
                    rs.getString("hoTen"),
                    rs.getString("diaChi"),
                    rs.getString("sdt"),
                    rs.getDate("ngayVaoLam"),
                    rs.getString("maCN"));
            return nhanVien;
        }
        return null;
    }
    
}
