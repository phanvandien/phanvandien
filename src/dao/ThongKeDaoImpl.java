
package dao;

import bean.NDaoTaoBean;
import bean.TranDauBean;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql. PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author AMIN
 */
public class ThongKeDaoImpl implements ThongKeDAO {

    @Override
    public List<TranDauBean> getListByTranDau() {
        try {
       Connection cons =DBConnect.getConnection();
       String sql="select ngay_dang_ky, count(*) as so_luong from quanlyclb.tran_dau group by ngay_dang_ky ;";
       
       List<TranDauBean> list = new ArrayList<>();
       PreparedStatement ps =cons.prepareCall(sql);
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
           TranDauBean tranDauBean = new TranDauBean();
           tranDauBean.setNgayDangKy(rs.getString("ngay_dang_ky"));
           tranDauBean.setSoLuongCauThu(rs.getInt("so_luong"));
             tranDauBean.setSoLuongHLuyenVien(rs.getInt("so_luong"));
           list.add(tranDauBean);
       }
    return list;
    
    }catch(SQLException ex){
    ex.printStackTrace();
}
   return null;
   
}

    @Override
    public List<NDaoTaoBean> getListByNDaoTao() {
            try {
       Connection cons =DBConnect.getConnection();
       String sql="select ten_noi_dao_tao, ngay_bat_dau, ngay_ket_thuc from quanlyclb.noi_dao_tao where tinh_trang = true;";
       List<NDaoTaoBean> list = new ArrayList<>();
       PreparedStatement ps =cons.prepareCall(sql);
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
           NDaoTaoBean nDaoTao = new NDaoTaoBean();
            nDaoTao.setTenNDaoTao(rs.getString("ten_noi_dao_tao"));
          nDaoTao.setNgayBatDau(rs.getDate("ngay_bat_dau"));
           nDaoTao.setNgayKetThuc(rs.getDate("ngay_ket_thuc"));
           list.add(nDaoTao);
       }
    return list;
    }catch(SQLException ex){
    ex.printStackTrace();
}
   return null;
    }
}