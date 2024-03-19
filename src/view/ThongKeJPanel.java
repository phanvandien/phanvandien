
package view;

import controller.QuanLyThongKeController;
import javax.swing.JPanel;

/**
 *
 * @author AMIN
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
        initComponents();
        QuanLyThongKeController controller = new QuanLyThongKeController();
        controller.setDateToChart1(jpnView1);
        controller.setDataToChart2(jpnView2);
         controller.setDataToChart3(jpnView3);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnView1 = new javax.swing.JPanel();
        jpnView2 = new javax.swing.JPanel();
        jpnView3 = new javax.swing.JPanel();

        jpnView1.setBackground(new java.awt.Color(204, 255, 153));

        javax.swing.GroupLayout jpnView1Layout = new javax.swing.GroupLayout(jpnView1);
        jpnView1.setLayout(jpnView1Layout);
        jpnView1Layout.setHorizontalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnView1Layout.setVerticalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        jpnView2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jpnView2Layout = new javax.swing.GroupLayout(jpnView2);
        jpnView2.setLayout(jpnView2Layout);
        jpnView2Layout.setHorizontalGroup(
            jpnView2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );
        jpnView2Layout.setVerticalGroup(
            jpnView2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        jpnView3.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jpnView3Layout = new javax.swing.GroupLayout(jpnView3);
        jpnView3.setLayout(jpnView3Layout);
        jpnView3Layout.setHorizontalGroup(
            jpnView3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnView3Layout.setVerticalGroup(
            jpnView3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnView2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnView3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnView3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView1;
    private javax.swing.JPanel jpnView2;
    private javax.swing.JPanel jpnView3;
    // End of variables declaration//GEN-END:variables
}
