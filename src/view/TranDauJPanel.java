
package view;

import dao.TranDauDao;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.TranDau2;

/**
 *
 * @author AMIN
 */
public class TranDauJPanel extends javax.swing.JPanel {

   String[] headers = {"ID tran dau","ID cau thu","ID huan luyen vien"," ID noi dao tao","ngay dang ky","tinh trang"};
       DefaultTableModel myModel;
    public TranDauJPanel() {
        initComponents();
         myModel = new DefaultTableModel(headers,0);
        TranDauDao.loadDataToJTable(myModel);
        jTable1.setModel(myModel);
    }
/*
    j
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfMaTranDau = new javax.swing.JTextField();
        jtfMaCauThu = new javax.swing.JTextField();
        jtfMaHuanLuyenVien = new javax.swing.JTextField();
        jtfMaNoiDaoTao = new javax.swing.JTextField();
        jtfNgayDangKy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jcbKichHoat = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin trận đấu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID trận đấu:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID cầu thủ:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID huấn luyện viên:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID nơi  đào tạo:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày đăng ký:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tình trạng:");

        jtfMaCauThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMaCauThuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnadd.setBackground(new java.awt.Color(0, 255, 0));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(51, 255, 0));
        btnxoa.setText("Delete");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(51, 255, 0));
        btnsua.setText("Update");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(0, 255, 0));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbKichHoat, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(jtfMaTranDau)
                                    .addComponent(jtfMaCauThu)
                                    .addComponent(jtfMaHuanLuyenVien)
                                    .addComponent(jtfMaNoiDaoTao)
                                    .addComponent(jtfNgayDangKy)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnxoa))))
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnsua)
                        .addGap(105, 105, 105)
                        .addComponent(btnreset)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfMaTranDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMaCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMaHuanLuyenVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfMaNoiDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbKichHoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(btnreset))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 825, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
          Vector v = new Vector();
        v.add(jtfMaTranDau.getText().trim());
        v.add(jtfMaCauThu.getText().trim());
        v.add(jtfMaHuanLuyenVien.getText().trim());
        v.add(jtfMaNoiDaoTao.getText().trim());
        v.add(jtfNgayDangKy.getText().trim());
        v.add(jcbKichHoat.getText().trim());
        
        myModel.addRow(v);
        TranDau2 td = new TranDau2();
        td.setMa_tran_dau(Integer.parseInt(jtfMaTranDau.getText().trim()));
        td.setMa_cau_thu(Integer.parseInt(jtfMaCauThu.getText().trim()));
        td.setMa_huan_luyen_vien(Integer.parseInt(jtfMaHuanLuyenVien.getText().trim()));
        td.setMa_noi_dao_tao(Integer.parseInt(jtfMaNoiDaoTao.getText().trim()));
         td.setNgay_dang_ky(jtfNgayDangKy.getText().trim());
        td.setTinh_trang(jcbKichHoat.getText().trim());
        //Scanner TrandauModify = new Scanner(System.in);
        
        int kq=TranDauDao.insert(td);
        if(kq>0){
            JOptionPane.showMessageDialog(this,"Them thanh cong");
        }
        else{
            JOptionPane.showMessageDialog(this,"Them that bai");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
         int row = jTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Chua chon dong xoa");
            
        }
        else{
           myModel.removeRow(row);//xoa trong model 
        }
        TranDau2 td = new TranDau2();
        td.setMa_tran_dau(Integer.parseInt(jtfMaTranDau.getText().trim()));

        
          int kq=TranDauDao.delete(td);
        if(kq>0){
            JOptionPane.showMessageDialog(this,"Xoa thanh cong");
        }
        else{
            JOptionPane.showMessageDialog(this,"Xoa that bai");
        }
        
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
            int row= jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        myModel.setValueAt(jtfMaTranDau.getText().trim(),row,0);
        myModel.setValueAt(jtfMaCauThu.getText().trim(),row,1);
        myModel.setValueAt(jtfMaHuanLuyenVien.getText().trim(),row,2);
        myModel.setValueAt(jtfMaNoiDaoTao.getText().trim(),row,3);
           myModel.setValueAt(jtfNgayDangKy.getText(),row,4);
        myModel.setValueAt(jcbKichHoat.getText(), row, 5);
       
        // update vao du lieu
        TranDau2 td = new TranDau2();
        td.setMa_tran_dau(Integer.parseInt(jtfMaTranDau.getText().trim()));
        td.setMa_cau_thu(Integer.parseInt(jtfMaCauThu.getText().trim()));
        td.setMa_huan_luyen_vien(Integer.parseInt(jtfMaHuanLuyenVien.getText().trim()));
        td.setMa_noi_dao_tao(Integer.parseInt(jtfMaNoiDaoTao.getText().trim()));
         td.setNgay_dang_ky(jtfNgayDangKy.getText().trim());
        td.setTinh_trang(jcbKichHoat.getText().trim());
        
        
          int kq=TranDauDao.update(td);
        if(kq>0){
            JOptionPane.showMessageDialog(this,"Cap nhat thanh cong");
        }
        else{
            JOptionPane.showMessageDialog(this,"Cap nhat that bai");
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
         jtfMaTranDau.setText("");
        jtfMaCauThu.setText("");
        jtfMaHuanLuyenVien.setText("");
        jtfMaNoiDaoTao.setText("");
        jtfNgayDangKy.setText("");
        jcbKichHoat.setText("");
      
    }//GEN-LAST:event_btnresetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        jtfMaTranDau.setText(jTable1.getValueAt(row, 0).toString());
        jtfMaCauThu.setText(jTable1.getValueAt(row,1).toString());
        jtfMaHuanLuyenVien.setText(jTable1.getValueAt(row, 2).toString());
        jtfMaNoiDaoTao.setText(jTable1.getValueAt(row, 3).toString());
        jtfNgayDangKy.setText(jTable1.getValueAt(row, 4).toString());
        jcbKichHoat.setText(jTable1.getValueAt(row, 5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtfMaCauThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMaCauThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMaCauThuActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jcbKichHoat;
    private javax.swing.JTextField jtfMaCauThu;
    private javax.swing.JTextField jtfMaHuanLuyenVien;
    private javax.swing.JTextField jtfMaNoiDaoTao;
    private javax.swing.JTextField jtfMaTranDau;
    private javax.swing.JTextField jtfNgayDangKy;
    // End of variables declaration//GEN-END:variables
}
