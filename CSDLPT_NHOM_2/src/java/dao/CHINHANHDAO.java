package dao;

import entity.CHINHANH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class CHINHANHDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<CHINHANH> findAll() throws Exception{
        String query = "SELECT * FROM CHINHANH";
        List<CHINHANH> dsChiNhanh = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            CHINHANH chinhanh = new CHINHANH(rs.getString("maCN"),
                                             rs.getString("ten"),
                                             rs.getString("diachi"),
                                             rs.getString("diachi"));
            dsChiNhanh.add(chinhanh);
        }
        return dsChiNhanh;
    }
    
    public CHINHANH findByMaCN(String maCN) throws Exception{
        String query = "SELECT * FROM CHINHANH WHERE MACN = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maCN);
        rs = ps.executeQuery();
        while(rs.next()){
            CHINHANH chinhanh = new CHINHANH(rs.getString("maCN"),
                                             rs.getString("ten"),
                                             rs.getString("diachi"),
                                             rs.getString("diachi"));
            return chinhanh;
        }
        return null;
    }
    
}
