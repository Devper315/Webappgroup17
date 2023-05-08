package dao;

import entity.SANPHAM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class SANPHAMDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<SANPHAM> findAll() throws Exception{
        String query = "SELECT * FROM SANPHAM";
        List<SANPHAM> dsSANPHAM = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            SANPHAM sanPham = new SANPHAM( rs.getString("maSP"),
	                                             rs.getString("ten"),
	                                             rs.getString("donvi"),
	                                             rs.getString("nuocSX"),
	                                             rs.getInt("gia"),
	                                             rs.getInt("soLuongTon"));
            dsSANPHAM.add(sanPham);
        }
        return dsSANPHAM;
    }
    
    public SANPHAM findBymaSP(String maSP) throws Exception{
        String query = "SELECT * FROM SANPHAM WHERE maSP = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maSP);
        rs = ps.executeQuery();
        while(rs.next()){
        	SANPHAM sanPham = new SANPHAM( rs.getString("maSP"),
                    rs.getString("ten"),
                    rs.getString("donvi"),
                    rs.getString("nuocSX"),
                    rs.getInt("gia"),
                    rs.getInt("soLuongTon"));
            return sanPham;
        }
        return null;
    }
    
}
