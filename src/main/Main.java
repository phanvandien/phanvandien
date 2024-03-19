
package main;

import view.DangNhapJDialog;
import view.MainJFrame;

/**
 *
 * @author AMIN
 */
public class Main {
    public static void main(String[] args) {
      DangNhapJDialog dialog = new DangNhapJDialog(null,true);
      dialog.setTitle("Đăng nhập hệ thống");
      dialog.setResizable(false);
      dialog.setLocationRelativeTo(null);
      dialog.setVisible(true);
    }
}
