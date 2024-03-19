
package dao;

import java.sql.Connection;
import java.sql. PreparedStatement;
import model.Taikhoan;
import java.sql.ResultSet;
/**
 *
 * @author AMIN
 */
public class TaiKhoanDaoImpl implements TaiKhoanDao{

    @Override
    public Taikhoan login(String tdn, String mk) {
       Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM tai_khoan WHERE ten_dang_nhap LIKE ? AND mat_khau LIKE ?";
        Taikhoan taiKhoan = null;
        try {
          PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ps.setString(1, tdn);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                taiKhoan = new Taikhoan();
                taiKhoan.setMa_tai_khoan(rs.getInt("ma_tai_khoan"));
                taiKhoan.setTen_dang_nhap(rs.getString("ten_dang_nhap"));
                taiKhoan.setMat_khau(rs.getString("mat_khau"));
                taiKhoan.setTinh_trang(rs.getBoolean("tinh_trang"));
            }
            ps.close();
            cons.close();
            return taiKhoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    }

