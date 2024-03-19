
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import model.TranDau2;


public class TranDauDao {
     public static void loadDataToJTable(DefaultTableModel myModel)
    {
         Connection connection = null;
        Statement statement = null;

        try {
             String sql ="SELECT * FROM tran_dau";
            
             connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb","root","phandien05");
              statement = connection.createStatement();           
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next())
            {
                //lay du lieu
               Vector vector = new Vector();
               TranDau2 td = new TranDau2();
               td.setMa_tran_dau(rs.getInt("ma_tran_dau"));
               td.setMa_cau_thu(rs.getInt("ma_cau_thu"));
               td.setMa_huan_luyen_vien(rs.getInt("ma_huan_luyen_vien"));
                td.setMa_noi_dao_tao(rs.getInt("ma_noi_dao_tao"));
               td.setNgay_dang_ky(rs.getString("ngay_dang_ky"));
                td.setTinh_trang(rs.getString("tinh_trang"));
               
              
               
               //dua du lieu vao vector
               vector.add(td.getMa_tran_dau());
               vector.add(td.getMa_cau_thu());
               vector.add(td.getMa_huan_luyen_vien());
               vector.add(td.getMa_noi_dao_tao());
                 vector.add(td.getNgay_dang_ky());
                   vector.add(td.getTinh_trang());
              
               //dua vector vao model
               myModel.addRow(vector);
            }
        }catch( Exception e) {
            e.printStackTrace();
        }
    }
 
public static int insert(TranDau2 td) {
        Connection connection = null;
        PreparedStatement statement = null;
        int kq=-1;
        try {
            //lay tat ca danh sach 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb", "root", "phandien05");
            
            //query
            String sql = "insert into tran_dau(ma_tran_dau,ma_cau_thu,ma_huan_luyen_vien,ma_noi_dao_tao,ngay_dang_ky,tinh_trang) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, td.getMa_tran_dau());
            statement.setInt(2, td.getMa_cau_thu());
            statement.setInt(3, td.getMa_huan_luyen_vien());
            statement.setInt(4, td.getMa_noi_dao_tao());
            statement.setString(5, td.getNgay_dang_ky());
            statement.setString(6, td.getTinh_trang());
             kq = statement.executeUpdate();
            return kq;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TranDauDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kq;
    }
 public static int update(TranDau2 td) {
        Connection connection = null;
        PreparedStatement statement = null;
        int kq=-1;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb", "root", "phandien05");
            
            //query
            String sql = "update tran_dau set  ma_cau_thu =?,ma_huan_luyen_vien=?,ma_noi_dao_tao=?,ngay_dang_ky=?,tinh_trang=? where ma_tran_dau=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, td.getMa_cau_thu());
            statement.setInt(2, td.getMa_huan_luyen_vien());
            statement.setInt(3, td.getMa_noi_dao_tao());
            statement.setString(5, td.getNgay_dang_ky());
            statement.setString(6, td.getTinh_trang());
            
             kq=statement.executeUpdate();
             return kq;
           
        } catch (SQLException ex) {
            Logger.getLogger(TranDauDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kq;
    }
  public static int delete(TranDau2 td) {
        Connection connection = null;
        PreparedStatement statement = null;
        int kq=-1;
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb", "root", "phandien05");
            
            //query
            String sql = "delete from tran_dau where ma_tran_dau = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, td.getMa_tran_dau());
            kq=statement.executeUpdate();
             return kq;
            
        } catch (SQLException ex) {
            Logger.getLogger(TranDauDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return kq;
    }
 
 
    
}
