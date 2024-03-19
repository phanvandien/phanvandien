
package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Taikhoan;
import service.TaiKhoanService;
import service.TaiKhoanServiceImpl;
import view.MainJFrame;

/**
 *
 * @author AMIN
 */
public class TaiKhoanController {
    private JDialog dialog ;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JPasswordField jtfMatKhau;
    private JLabel jlbMsg;

    
    private TaiKhoanService taiKhoanService = null;
    
    public TaiKhoanController(JDialog dialog, JButton btnSubmit, JTextField jtfTenDangNhap, JPasswordField  jtfMatKhau,JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;
        
        taiKhoanService = new TaiKhoanServiceImpl();
    }
    
    public void setEvent(){
      btnSubmit.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
                    if (jtfTenDangNhap.getText().length() ==0 || jtfMatKhau.getText().length()==0) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                       Taikhoan taiKhoan =taiKhoanService.login(jtfTenDangNhap.getText(), jtfMatKhau.getText());
                       if(taiKhoan == null) {
                            jlbMsg.setText("Tên đăng nhập hoặc mật khẩu sai");
                       }else{
                           if(!taiKhoan.isTinh_trang()){
                                jlbMsg.setText("Tai khoản bị tạm khóa!");
                           }else{
                               dialog.dispose();
                               MainJFrame frame = new MainJFrame();
                               frame.setTitle("Quản Lý CLB Bóng Đá");
                               frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                               frame.setVisible(true);
                           }
                       }
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
}
