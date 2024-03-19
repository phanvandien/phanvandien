
package view;

import bean.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AMIN
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setTitle("Quản Lý Clb bóng đá ");
        ChuyenManHinhController controller = new  ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangChu,jlbTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMucBean("CauThu",jpnCauThu,jlbCauThu));
        listItem.add(new DanhMucBean("HLuyenVien",jpnHLuyenVien,jlbHLuyenVien));
        listItem.add(new DanhMucBean("NDaoTao",jpnNDaoTao,jlbNDaoTao));
        listItem.add(new DanhMucBean("TranDau",jpnTranDau,jlbTranDau));
        listItem.add(new DanhMucBean("ThongKe",jpnThongKe,jlbThongKe));
        
        controller.setEvent(listItem);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnCauThu = new javax.swing.JPanel();
        jlbCauThu = new javax.swing.JLabel();
        jpnHLuyenVien = new javax.swing.JPanel();
        jlbHLuyenVien = new javax.swing.JLabel();
        jpnNDaoTao = new javax.swing.JPanel();
        jlbNDaoTao = new javax.swing.JLabel();
        jpnTranDau = new javax.swing.JPanel();
        jlbTranDau = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(0, 204, 0));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-group-custom (1).png"))); // NOI18N
        jLabel1.setText("Quản Lý CLB Bóng Đá ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(0, 204, 0));

        jlbTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fit-to-screen-outline-custom (1).png"))); // NOI18N
        jlbTrangChu.setText("Màn hình chính ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbTrangChu)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnCauThu.setBackground(new java.awt.Color(0, 204, 0));

        jlbCauThu.setBackground(new java.awt.Color(255, 255, 255));
        jlbCauThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbCauThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCauThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-custom.png"))); // NOI18N
        jlbCauThu.setText("Quản lý cầu thủ ");

        javax.swing.GroupLayout jpnCauThuLayout = new javax.swing.GroupLayout(jpnCauThu);
        jpnCauThu.setLayout(jpnCauThuLayout);
        jpnCauThuLayout.setHorizontalGroup(
            jpnCauThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCauThuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnCauThuLayout.setVerticalGroup(
            jpnCauThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCauThuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbCauThu)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnHLuyenVien.setBackground(new java.awt.Color(0, 204, 0));

        jlbHLuyenVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbHLuyenVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHLuyenVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/human-male-board-custom.png"))); // NOI18N
        jlbHLuyenVien.setText("Quản lý huấn luyện viên ");

        javax.swing.GroupLayout jpnHLuyenVienLayout = new javax.swing.GroupLayout(jpnHLuyenVien);
        jpnHLuyenVien.setLayout(jpnHLuyenVienLayout);
        jpnHLuyenVienLayout.setHorizontalGroup(
            jpnHLuyenVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHLuyenVienLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbHLuyenVien)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpnHLuyenVienLayout.setVerticalGroup(
            jpnHLuyenVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHLuyenVienLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbHLuyenVien)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnNDaoTao.setBackground(new java.awt.Color(0, 204, 0));

        jlbNDaoTao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbNDaoTao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNDaoTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/school-custom.png"))); // NOI18N
        jlbNDaoTao.setText("Nơi đào tạo");

        javax.swing.GroupLayout jpnNDaoTaoLayout = new javax.swing.GroupLayout(jpnNDaoTao);
        jpnNDaoTao.setLayout(jpnNDaoTaoLayout);
        jpnNDaoTaoLayout.setHorizontalGroup(
            jpnNDaoTaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNDaoTaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbNDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNDaoTaoLayout.setVerticalGroup(
            jpnNDaoTaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNDaoTaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbNDaoTao)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnTranDau.setBackground(new java.awt.Color(0, 204, 0));

        jlbTranDau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbTranDau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTranDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soccer-field-custom.png"))); // NOI18N
        jlbTranDau.setText("Trận đấu");

        javax.swing.GroupLayout jpnTranDauLayout = new javax.swing.GroupLayout(jpnTranDau);
        jpnTranDau.setLayout(jpnTranDauLayout);
        jpnTranDauLayout.setHorizontalGroup(
            jpnTranDauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTranDauLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTranDauLayout.setVerticalGroup(
            jpnTranDauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTranDauLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbTranDau)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnThongKe.setBackground(new java.awt.Color(0, 204, 0));

        jlbThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart-bar-custom.png"))); // NOI18N
        jlbThongKe.setText("Thống kê");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jlbThongKe)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnCauThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnHLuyenVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnNDaoTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTranDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHLuyenVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbCauThu;
    private javax.swing.JLabel jlbHLuyenVien;
    private javax.swing.JLabel jlbNDaoTao;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbTranDau;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnCauThu;
    private javax.swing.JPanel jpnHLuyenVien;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNDaoTao;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnTranDau;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
