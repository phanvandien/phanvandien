
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.NDaoTao2;
import model.TranDau2;

/**
 *
 * @author AMIN
 */
public class NDaoTaoDao {
        public static void loadDataToJTable(DefaultTableModel myModel)
    {
         Connection connection = null;
        Statement statement = null;

        try {
             String sql ="SELECT * FROM noi_dao_tao";
            
             connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb","root","phandien05");
              statement = connection.createStatement();           
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next())
            {
                //lay du lieu
               Vector vector = new Vector();
               NDaoTao2 td = new NDaoTao2();
               td.setMa_noi_dao_tao(rs.getInt("ma_noi_dao_tao"));
               td.setTen_noi_dao_tao(rs.getString("ten_noi_dao_tao"));
               td.setMo_ta(rs.getString("mo_ta"));
                td.setNgay_bat_dau(rs.getString("ngay_bat_dau"));
               td.setNgay_ket_thuc(rs.getString("ngay_ket_thuc"));
                td.setTinh_trang(rs.getString("tinh_trang"));
               
              
               
               //dua du lieu vao vector
               vector.add(td.getMa_noi_dao_tao());
               vector.add(td.getTen_noi_dao_tao());
               vector.add(td.getMo_ta());
               vector.add(td.getNgay_bat_dau());
                 vector.add(td.getNgay_ket_thuc());
                   vector.add(td.getTinh_trang());
              
               //dua vector vao model
               myModel.addRow(vector);
            }
        }catch( Exception e) {
            e.printStackTrace();
        }
    }
 
public static int insert(NDaoTao2 td) {
        Connection connection = null;
        PreparedStatement statement = null;
        int kq=-1;
        try {
            //lay tat ca danh sach 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb", "root", "phandien05");
            
            //query
            String sql = "insert into noi_dao_tao(ma_noi_dao_tao,ten_noi_dao_tao,mo_ta,ngay_bat_dau,ngay_ket_thuc,tinh_trang) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, td.getMa_noi_dao_tao());
            statement.setString(2, td.getTen_noi_dao_tao());
            statement.setString(3, td.getMo_ta());
            statement.setString(4, td.getNgay_bat_dau());
            statement.setString(5, td.getNgay_ket_thuc());
            statement.setString(6, td.getTinh_trang());
             kq = statement.executeUpdate();
            return kq;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(NDaoTaoDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kq;
    }
 public static int update(NDaoTao2 td) {
        Connection connection = null;
        PreparedStatement statement = null;
        int kq=-1;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb", "root", "phandien05");
            
            //query
            String sql = "update noi_dao_tao set  ten_noi_dao_tao =?,mo_ta=?,ngay_bat_dau=?,ngay_ket_thuc=?,tinh_trang=? where ma_noi_dao_tao=?";
            statement = connection.prepareCall(sql);
            
            //statement.setInt(1, td.getMa_noi_dao_tao());
            statement.setString(1, td.getTen_noi_dao_tao());
            statement.setString(2, td.getMo_ta());
            statement.setString(3, td.getNgay_bat_dau());
            statement.setString(4, td.getNgay_ket_thuc());
            statement.setString(5, td.getTinh_trang());
            
             kq=statement.executeUpdate();
             return kq;
           
        } catch (SQLException ex) {
            Logger.getLogger(NDaoTaoDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kq;
    }
  public static int delete(NDaoTao2 td) {
        Connection connection = null;
        PreparedStatement statement = null;
        int kq=-1;
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb", "root", "phandien05");
            
            //query
            String sql = "delete from noi_dao_tao where ma_noi_dao_tao = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, td.getMa_noi_dao_tao());
            kq=statement.executeUpdate();
             return kq;
            
        } catch (SQLException ex) {
            Logger.getLogger(NDaoTaoDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kq;
    }
 
 
}
