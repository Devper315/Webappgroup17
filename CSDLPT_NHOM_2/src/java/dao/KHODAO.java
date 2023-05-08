package dao;

import entity.KHO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class KHODAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<KHO> findAll() throws Exception{
        String query = "SELECT * FROM KHO";
        List<KHO> dsKHO = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            KHO kho = new KHO(rs.getString("maKHO"),
                              rs.getString("ten"),
                              rs.getString("diaChi"),
                              rs.getString("maCN"));
            dsKHO.add(kho);
        }
        return dsKHO;
    }
    
    public KHO findBymaKHO(String maKHO) throws Exception{
        String query = "SELECT * FROM KHO WHERE maKHO = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maKHO);
        rs = ps.executeQuery();
        while(rs.next()){
        	KHO kho = new KHO(rs.getString("maKHO"),
                    rs.getString("ten"),
                    rs.getString("diaChi"),
                    rs.getString("maCN"));
            return kho;
        }
        return null;
    }
    
}
