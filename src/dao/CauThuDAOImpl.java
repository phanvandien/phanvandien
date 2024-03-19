
package dao;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.CauThu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
  import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author AMIN
 */
public class CauThuDAOImpl implements CauThuDAO{

    @Override
    public List<CauThu> getList() {

        try {
            Connection cons = DBConnect.getConnection();
            String sql = "select *from cau_thu";
            List<CauThu> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
            CauThu cauThu = new CauThu();
            cauThu.setMa_cau_thu(rs.getInt("ma_cau_thu"));
            cauThu.setHo_ten(rs.getString("ho_ten"));
            cauThu.setNgay_sinh(rs.getString("ngay_sinh"));
            //cauThu.setSo_dien_thoai(rs.getString("so_dien_thoai"));
            cauThu.setGioi_tinh(rs.getBoolean("gioi_tinh"));
             cauThu.setSo_dien_thoai(rs.getString("so_dien_thoai"));
            cauThu.setDia_chi(rs.getString("dia_chi"));
            cauThu.setTinh_trang(rs.getBoolean("tinh_trang"));
            
            list.add(cauThu);
            
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
    public int createOrUpdate(CauThu cauThu) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO cau_thu(ma_cau_thu, ho_ten, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi, tinh_trang) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE ho_ten = VALUES(ho_ten), ngay_sinh = VALUES(ngay_sinh), gioi_tinh = VALUES(gioi_tinh), so_dien_thoai = VALUES(so_dien_thoai), dia_chi = VALUES(dia_chi), tinh_trang = VALUES(tinh_trang) ;";
            PreparedStatement ps = cons.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cauThu.getMa_cau_thu());
            ps.setString(2, cauThu.getHo_ten());
            ps.setString(3, cauThu.getNgay_sinh());
            ps.setBoolean(4, cauThu.isGioi_tinh());
            ps.setString(5, cauThu.getSo_dien_thoai());
            ps.setString(6, cauThu.getDia_chi());
            ps.setBoolean(7, cauThu.isTinh_trang());
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
        CauThuDAO cauThuDao = new CauThuDAOImpl();
        System.out.println(cauThuDao.getList());
    }
}
