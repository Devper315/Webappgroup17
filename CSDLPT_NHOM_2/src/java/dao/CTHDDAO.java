package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBContext.DBContext;
import entity.CTHD;

public class CTHDDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<CTHD> findAll() throws Exception{
        String query = "SELECT * FROM CTHD";
        List<CTHD> dsCTHD = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            CTHD cthd = new CTHD(rs.getString("maHD"),
            					 rs.getString("maSP"), 
            					 rs.getInt("soLuong"));
            dsCTHD.add(cthd);
        }
        return dsCTHD;
    }
    
    public CTHD findByMaCTHD(String maHD, String maSP) throws Exception{
    	String query = "SELECT * FROM CTHD WHERE maHD = ? AND maSP = ?";
    	conn = new DBContext().getConnection();
    	ps = conn.prepareStatement(query);
    	ps.setString(1, maHD);
    	ps.setString(2, maSP);
    	rs = ps.executeQuery();
    	while(rs.next()) {
    		CTHD cthd = new CTHD(rs.getString("maHD"),
								 rs.getString("maSP"), 
								 rs.getInt("soLuong"));
    		return cthd;
    	}
    	return null;
    }
}
