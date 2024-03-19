
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

import service.HLuyenVienService;

import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
  import java.text.SimpleDateFormat;
import model.HLuyenVien;
import service.HLuyenVienServiceImpl;

public class HLuyenVienController {
     private JButton btnSubmit;
    private JTextField jtfMaHLuyenVien;
    private JTextField jtfHoTen;
    private JTextField jtfNgaySinh;
    private JRadioButton jtfGioiTinhNam;
    private JRadioButton jtfGioiTinhNu;
    private JTextField jtfGmail;
    private JCheckBox jcbKichHoat;
    private JTextArea jtaDiaChi;
    private JLabel jlbMsg;
    private HLuyenVien hLuyenVien = null;
    private HLuyenVienService hLuyenVienService = null;

    public HLuyenVienController(JButton btnSubmit, JTextField jtfMaHLuyenVien, JTextField jtfHoTen, JTextField jtfNgaySinh, JRadioButton jtfGioiTinhNam, JRadioButton jtfGioiTinhNu, JTextField jtfGmail, JCheckBox jcbKichHoat, JTextArea jtaDiaChi, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfMaHLuyenVien = jtfMaHLuyenVien;
        this.jtfHoTen = jtfHoTen;
        this.jtfNgaySinh = jtfNgaySinh;
        this.jtfGioiTinhNam = jtfGioiTinhNam;
        this.jtfGioiTinhNu = jtfGioiTinhNu;
        this.jtfGmail = jtfGmail;
        this.jcbKichHoat = jcbKichHoat;
        this.jtaDiaChi = jtaDiaChi;
        this.jlbMsg = jlbMsg;
       
        this.hLuyenVienService =  (HLuyenVienService) new HLuyenVienServiceImpl();
    }
    public void setView(HLuyenVien hLuyenVien) {
        this.hLuyenVien=hLuyenVien;
        jtfMaHLuyenVien.setText("#"+hLuyenVien.getMa_huan_luyen_vien());
        jtfHoTen.setText(hLuyenVien.getHo_ten());
        jtfNgaySinh.setText(hLuyenVien.getNgay_sinh());
        if(hLuyenVien.isGioi_tinh()){
            jtfGioiTinhNam.setSelected(true);
            jtfGioiTinhNam.setSelected(false);
        }else{
            jtfGioiTinhNam.setSelected(false);
            jtfGioiTinhNam.setSelected(true);
        }
        jtfGmail.setText(hLuyenVien.getGmail());
        jtaDiaChi.setText(hLuyenVien.getDia_chi());
        jcbKichHoat.setSelected(hLuyenVien.isTinh_trang());
        
    }
     public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
             try {
                    if (!checkNotNull()) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        hLuyenVien.setHo_ten(jtfHoTen.getText().trim());
                         hLuyenVien.setNgay_sinh(jtfNgaySinh.getText());
                        hLuyenVien.setGmail(jtfGmail.getText());
                        hLuyenVien.setDia_chi(jtaDiaChi.getText());
                        hLuyenVien.setGioi_tinh(jtfGioiTinhNam.isSelected());
                        hLuyenVien.setTinh_trang(jcbKichHoat.isSelected());
                        if (showDialog()) {
                             int lastId = hLuyenVienService.createOrUpdate(hLuyenVien);
                            if (lastId != 0) {
                                hLuyenVien.setMa_huan_luyen_vien(lastId);
                                jtfMaHLuyenVien.setText("#" + hLuyenVien.getMa_huan_luyen_vien());
                                jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                            } else {
                                jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                            }
                        }
                    }
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
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
}
