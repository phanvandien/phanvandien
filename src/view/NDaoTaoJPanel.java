
package view;

import dao.NDaoTaoDao;
import dao.TranDauDao;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import model.NDaoTao2;
import model.TranDau2;

/**
 *
 * @author AMIN
 */
public class NDaoTaoJPanel extends javax.swing.JPanel {
        String[] headers = {"ID nơi đào tao","tên nơi đào tao","mô tả"," ngày bắt đầu ","ngay kết thúc","tinh trang"};
       DefaultTableModel myModel;
   
    public NDaoTaoJPanel() {
        initComponents();
          myModel = new DefaultTableModel(headers,0);
        NDaoTaoDao.loadDataToJTable(myModel);
        jTable1.setModel(myModel);
    }

    
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
        jtfMaDaoTao = new javax.swing.JTextField();
        jtfTenDaoTao = new javax.swing.JTextField();
        jtfMoTa = new javax.swing.JTextField();
        jtfNgayBatDau = new javax.swing.JTextField();
        jtfNgayKetThuc = new javax.swing.JTextField();
        jtfTinhTrang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin đào tạo"));

        jLabel1.setText("Mã đào tạo:");

        jLabel2.setText("Tên đào tạo;");

        jLabel3.setText("Mô tả:");

        jLabel4.setText("Ngày bắt đầu;");

        jLabel5.setText("Ngày kết thúc:");

        jLabel6.setText("Tình trạng:");

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

        btnsua.setBackground(new java.awt.Color(0, 255, 0));
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfMaDaoTao)
                    .addComponent(jtfTenDaoTao)
                    .addComponent(jtfMoTa)
                    .addComponent(jtfNgayBatDau)
                    .addComponent(jtfNgayKetThuc)
                    .addComponent(jtfTinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnadd)
                .addGap(68, 68, 68)
                .addComponent(btnxoa)
                .addGap(75, 75, 75)
                .addComponent(btnsua)
                .addGap(77, 77, 77)
                .addComponent(btnreset)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfMaDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfTenDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(btnreset))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
          Vector v = new Vector();
        v.add(jtfMaDaoTao.getText().trim());
        v.add(jtfTenDaoTao.getText().trim());
        v.add(jtfMoTa.getText().trim());
        v.add(jtfNgayBatDau.getText().trim());
        v.add(jtfNgayKetThuc.getText().trim());
        v.add(jtfTinhTrang.getText().trim());
        
        myModel.addRow(v);
        NDaoTao2 td = new NDaoTao2();
        td.setMa_noi_dao_tao(Integer.parseInt(jtfMaDaoTao.getText().trim()));
        td.setTen_noi_dao_tao(jtfTenDaoTao.getText().trim());
        td.setMo_ta(jtfMoTa.getText().trim());
        td.setNgay_bat_dau(jtfNgayBatDau.getText().trim());
         td.setNgay_ket_thuc(jtfNgayKetThuc.getText().trim());
        td.setTinh_trang(jtfTinhTrang.getText().trim());
        //Scanner TrandauModify = new Scanner(System.in);
        
        int kq=NDaoTaoDao.insert(td);
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
        NDaoTao2 td = new NDaoTao2();
        td.setMa_noi_dao_tao(Integer.parseInt(jtfMaDaoTao.getText().trim()));

        
          int kq=NDaoTaoDao.delete(td);
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
        myModel.setValueAt(jtfMaDaoTao.getText().trim(),row,0);
        myModel.setValueAt(jtfTenDaoTao.getText().trim(),row,1);
        myModel.setValueAt(jtfMoTa.getText().trim(),row,2);
        myModel.setValueAt(jtfNgayBatDau.getText().trim(),row,3);
           myModel.setValueAt(jtfNgayKetThuc.getText(),row,4);
        myModel.setValueAt(jtfTinhTrang.getText(), row, 5);
       
        // update vao du lieu
        NDaoTao2 td = new NDaoTao2();
        td.setMa_noi_dao_tao(Integer.parseInt(jtfMaDaoTao.getText().trim()));
        td.setTen_noi_dao_tao(jtfTenDaoTao.getText().trim());
        td.setMo_ta(jtfMoTa.getText().trim());
        td.setNgay_bat_dau(jtfNgayBatDau.getText().trim());
         td.setNgay_ket_thuc(jtfNgayKetThuc.getText().trim());
        td.setTinh_trang(jtfTinhTrang.getText().trim());
        
        
          int kq=NDaoTaoDao.update(td);
        if(kq>0){
            JOptionPane.showMessageDialog(this,"Cap nhat thanh cong");
        }
        else{
            JOptionPane.showMessageDialog(this,"Cap nhat that bai");
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
          jtfMaDaoTao.setText("");
        jtfTenDaoTao.setText("");
        jtfMoTa.setText("");
        jtfNgayBatDau.setText("");
        jtfNgayKetThuc.setText("");
        jtfTinhTrang.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        jtfMaDaoTao.setText(jTable1.getValueAt(row, 0).toString());
        jtfTenDaoTao.setText(jTable1.getValueAt(row,1).toString());
        jtfMoTa.setText(jTable1.getValueAt(row, 2).toString());
        jtfNgayBatDau.setText(jTable1.getValueAt(row, 3).toString());
        jtfNgayKetThuc.setText(jTable1.getValueAt(row, 4).toString());
        jtfTinhTrang.setText(jTable1.getValueAt(row, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked


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
    private javax.swing.JTextField jtfMaDaoTao;
    private javax.swing.JTextField jtfMoTa;
    private javax.swing.JTextField jtfNgayBatDau;
    private javax.swing.JTextField jtfNgayKetThuc;
    private javax.swing.JTextField jtfTenDaoTao;
    private javax.swing.JTextField jtfTinhTrang;
    // End of variables declaration//GEN-END:variables
}
