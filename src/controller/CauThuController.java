
package controller;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.CauThu;
import service.CauThuService;
import service.CauThuServiceImpl;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
  import java.text.SimpleDateFormat;
//import java.sql.date;

/**
 *
 * @author AMIN
 */
public class CauThuController {
    
    private JButton btnSubmit;
    private JTextField jtfMaCauThu;
    private JTextField jtfHoTen;
    private JTextField jtfNgaySinh;
    private JRadioButton jtfGioiTinhNam;
    private JRadioButton jtfGioiTinhNu;
    private JTextField jtfSoDienThoai;
    private JCheckBox jcbKichHoat;
    private JTextArea jtaDiaChi;
    private JLabel jlbMsg;
    private CauThu cauThu = null;
    private CauThuService cauThuService = null;

    public CauThuController(JButton btnSubmit, JTextField jtfMaCauThu, JTextField jtfHoTen, JTextField jtfNgaySinh, JRadioButton jtfGioiTinhNam, JRadioButton jtfGioiTinhNu, JTextField jtfSoDienThoai, JCheckBox jcbKichHoat, JTextArea jtaDiaChi,JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfMaCauThu = jtfMaCauThu;
        this.jtfHoTen = jtfHoTen;
        this.jtfNgaySinh = jtfNgaySinh;
        this.jtfGioiTinhNam = jtfGioiTinhNam;
        this.jtfGioiTinhNu = jtfGioiTinhNu;
        this.jtfSoDienThoai = jtfSoDienThoai;
        this.jcbKichHoat = jcbKichHoat;
        this.jtaDiaChi = jtaDiaChi;
        this.jlbMsg = jlbMsg;
        this.cauThuService = new CauThuServiceImpl();
    }

   
    
    public void setView(CauThu cauThu) {
        this.cauThu=cauThu;
        jtfMaCauThu.setText("#"+cauThu.getMa_cau_thu());
        jtfHoTen.setText(cauThu.getHo_ten());
        jtfNgaySinh.setText(cauThu.getNgay_sinh());
        if(cauThu.isGioi_tinh()){
            jtfGioiTinhNam.setSelected(true);
            jtfGioiTinhNam.setSelected(false);
        }else{
            jtfGioiTinhNam.setSelected(false);
            jtfGioiTinhNam.setSelected(true);
        }
        jtfSoDienThoai.setText(cauThu.getSo_dien_thoai());
        jtaDiaChi.setText(cauThu.getDia_chi());
        jcbKichHoat.setSelected(cauThu.isTinh_trang());
        
    }
    
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
             try {
                    if (!checkNotNull()) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        cauThu.setHo_ten(jtfHoTen.getText().trim());
                         cauThu.setNgay_sinh(jtfNgaySinh.getText());
                        cauThu.setSo_dien_thoai(jtfSoDienThoai.getText());
                        cauThu.setDia_chi(jtaDiaChi.getText());
                        cauThu.setGioi_tinh(jtfGioiTinhNam.isSelected());
                        cauThu.setTinh_trang(jcbKichHoat.isSelected());
                        if (showDialog()) {
                             int lastId = cauThuService.createOrUpdate(cauThu);
                            if (lastId != 0) {
                                cauThu.setMa_cau_thu(lastId);
                                jtfMaCauThu.setText("#" + cauThu.getMa_cau_thu());
                                jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                            } else {
                                jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                            }
                        }
                    }
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
       
 
            
//            if(jtfHoTen.getText() == null || jdcNgaySinh.getDate() == null)  {
//              jlbMsg.setText("Vui long nhap du lieu bat buoc ");  
//            }else{
//                cauThu.setHo_ten(jtfHoTen.getText());
//                cauThu.setNgay_sinh(jdcNgaySinh.getDate());
//                cauThu.setGioi_tinh(jtfGioiTinhNam.isSelected());
//                cauThu.setSo_dien_thoai(jtfSoDienThoai.getText());
//                cauThu.setDia_chi(jtaDiaChi.getText());
//                cauThu.setTinh_trang(jcbKichHoat.isSelected());
//                int lastId = cauThuService.createOrUpdate(cauThu);
//                if(lastId >0){
//                    cauThu.setMa_cau_thu(lastId);
//                     jtfMaCauThu.setText("#"+lastId);
//                     jlbMsg.setText("Cap nhat thong tin thanh cong");
//                             }
//            }
    }
          @Override
        public void mouseEntered(MouseEvent e) {
            btnSubmit.setBackground(new Color(0,200,83));
    }
        
          @Override
        public void mouseExited(MouseEvent e) {
            btnSubmit.setBackground(new Color(100,221,23));
    }

           
    });
    }
     private boolean checkNotNull() {
        return jtfHoTen.getText() != null && !jtfHoTen.getText().equalsIgnoreCase("");
    }

    private boolean showDialog() {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn muốn cập nhật dữ liệu hay không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
    }

//    public java.sql.Date covertDateToDateSql(Date d) {
//        return new java.sql.Date(d.getTime());
//    }
}
