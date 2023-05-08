package dao;

import entity.HOADON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class HOADONDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<HOADON> findAll() throws Exception{
        String query = "SELECT * FROM HOADON";
        List<HOADON> dsChiNhanh = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            HOADON hoaDon = new HOADON(rs.getString("maHD"),
            						     rs.getDate("ngayTao"),
                                         rs.getString("maKH"),
                                         rs.getString("maNV"),
                                         rs.getInt("giaTri"),
                                         rs.getString("maKHO"));
            dsChiNhanh.add(hoaDon);
        }
        return dsChiNhanh;
    }
    
    public HOADON findByMaCN(String maHD) throws Exception{
        String query = "SELECT * FROM HOADON WHERE MACN = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maHD);
        rs = ps.executeQuery();
        while(rs.next()){
        	HOADON hoaDon = new HOADON(rs.getString("maHD"),
				     rs.getDate("ngayTao"),
                    rs.getString("ten"),
                    rs.getString("diachi"),
                    rs.getInt("giaTri"),
                    rs.getString("diachi"));
            return hoaDon;
        }
        return null;
    }
    
}
