package dao;

import entity.PHIEUNHAP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBContext.DBContext;

public class PHIEUNHAPDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<PHIEUNHAP> findAll() throws Exception{
        String query = "SELECT * FROM PHIEUNHAP";
        List<PHIEUNHAP> dsPHIEUNHAP = new ArrayList<>();
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            PHIEUNHAP phieuNhap = new PHIEUNHAP( rs.getString("maPN"),
	                                             rs.getDate("ngayNhap"),
	                                             rs.getString("nhaCC"),
	                                             rs.getString("maNV"),
	                                             rs.getString("maKHO"));
            dsPHIEUNHAP.add(phieuNhap);
        }
        return dsPHIEUNHAP;
    }
    
    public PHIEUNHAP findBymaPN(String maPN) throws Exception{
        String query = "SELECT * FROM PHIEUNHAP WHERE maPN = ?";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, maPN);
        rs = ps.executeQuery();
        while(rs.next()){
        	PHIEUNHAP phieuNhap = new PHIEUNHAP(rs.getString("maPN"),
                    rs.getDate("ngayNhap"),
                    rs.getString("nhaCC"),
                    rs.getString("maNV"),
                    rs.getString("maKHO"));
            return phieuNhap;
        }
        return null;
    }
    
}
