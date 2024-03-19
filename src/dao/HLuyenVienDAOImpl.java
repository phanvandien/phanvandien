
package dao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.CauThu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.HLuyenVien;
/**
 *
 * @author AMIN
 */
public class HLuyenVienDAOImpl implements HLuyenVienDAO {
      @Override
    public List<HLuyenVien> getList() {

        try {
            Connection cons = DBConnect.getConnection();
            String sql = "select *from huan_luyen_vien";
            List<HLuyenVien> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
            HLuyenVien hLuyenVien = new HLuyenVien();
            hLuyenVien.setMa_huan_luyen_vien(rs.getInt("ma_huan_luyen_vien"));
            hLuyenVien.setHo_ten(rs.getString("ho_ten"));
            hLuyenVien.setNgay_sinh(rs.getString("ngay_sinh"));
            //cauThu.setSo_dien_thoai(rs.getString("so_dien_thoai"));
            hLuyenVien.setGioi_tinh(rs.getBoolean("gioi_tinh"));
            hLuyenVien.setGmail(rs.getString("gmail"));
            hLuyenVien.setDia_chi(rs.getString("dia_chi"));
            hLuyenVien.setTinh_trang(rs.getBoolean("tinh_trang"));
            
            list.add(hLuyenVien);
            
        }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     
        return null;
    }
      @Override
    public int createOrUpdate(HLuyenVien hLuyenVien) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO huan_luyen_vien(ma_huan_luyen_vien, ho_ten, ngay_sinh, gioi_tinh, gmail, dia_chi, tinh_trang) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE ho_ten = VALUES(ho_ten), ngay_sinh = VALUES(ngay_sinh), gioi_tinh = VALUES(gioi_tinh), gmail = VALUES(gmail), dia_chi = VALUES(dia_chi), tinh_trang = VALUES(tinh_trang) ;";
            PreparedStatement ps = cons.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, hLuyenVien.getMa_huan_luyen_vien());
            ps.setString(2, hLuyenVien.getHo_ten());
            ps.setString(3, hLuyenVien.getNgay_sinh());
            ps.setBoolean(4, hLuyenVien.isGioi_tinh());
            ps.setString(5, hLuyenVien.getGmail());
            ps.setString(6, hLuyenVien.getDia_chi());
            ps.setBoolean(7, hLuyenVien.isTinh_trang());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
    public static void main(String[] args) {
        HLuyenVienDAO hLuyenVienDao = new HLuyenVienDAOImpl();
        System.out.println(hLuyenVienDao.getList());
    }
}
