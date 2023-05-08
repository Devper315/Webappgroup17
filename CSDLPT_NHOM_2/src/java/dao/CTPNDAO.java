package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DBContext.DBContext;
import entity.CTPN;

public class CTPNDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<CTPN> findAll() throws Exception{
        String query = "SELECT * FROM CTPN";
        List<CTPN> dsCTPN = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            CTPN CTPN = new CTPN(rs.getString("maPN"),
            					 rs.getString("maSP"), 
            					 rs.getInt("soLuong"),
            					 rs.getInt("donGia"));
            dsCTPN.add(CTPN);
        }
        return dsCTPN;
    }
    
    public CTPN findByMaCTPN(String maPN, String maSP) throws Exception{
    	String query = "SELECT * FROM CTPN WHERE maPN = ? AND maSP = ?";
    	conn = new DBContext().getConnection();
    	ps = conn.prepareStatement(query);
    	ps.setString(1, maPN);
    	ps.setString(2, maSP);
    	rs = ps.executeQuery();
    	while(rs.next()) {
    		CTPN CTPN = new CTPN(rs.getString("maPN"),
								 rs.getString("maSP"), 
								 rs.getInt("soLuong"),
								 rs.getInt("donGia"));
    		return CTPN;
    	}
    	return null;
    }
}
