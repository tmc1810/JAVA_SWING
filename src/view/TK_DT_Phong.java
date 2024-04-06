package view;

import javax.swing.JOptionPane;

public class TK_DT_Phong extends javax.swing.JFrame {

    public TK_DT_Phong() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        begin = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        navHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnViewRoom = new javax.swing.JButton();
        dcDateFrom = new com.toedter.calendar.JDateChooser();
        ThongKe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dcDateTo = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý khách sạn");

        begin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        begin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 550, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("THỐNG KÊ DOANH THU PHÒNG");
        begin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 60));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navHome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        navHome.setForeground(new java.awt.Color(255, 255, 255));
        navHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-32-view.png"))); // NOI18N
        navHome.setToolTipText("");
        navHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navHomeMouseClicked(evt);
            }
        });
        jPanel3.add(navHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maunen2.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        begin.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        btnViewRoom.setBackground(new java.awt.Color(112, 26, 98));
        btnViewRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnViewRoom.setText("Xem Chi Tiết");
        btnViewRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRoomActionPerformed(evt);
            }
        });
        begin.add(btnViewRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, -1, 50));

        dcDateFrom.setDateFormatString("dd/MM/yyyy");
        dcDateFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        begin.add(dcDateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, 50));

        ThongKe.setBackground(new java.awt.Color(112, 26, 98));
        ThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ThongKe.setForeground(new java.awt.Color(255, 255, 255));
        ThongKe.setText("Xem Thống kê");
        ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeActionPerformed(evt);
            }
        });
        begin.add(ThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 147, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Từ ngày:");
        begin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Đến ngày:");
        begin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 30));

        dcDateTo.setDateFormatString("dd/MM/yyyy");
        dcDateTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        begin.add(dcDateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 190, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        begin.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1000, 570));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maunen.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        begin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(begin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(begin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navHomeMouseClicked
        int conf = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn về trang chủ?",
                "Trang Chủ",
                JOptionPane.YES_OPTION);
        if (conf == 0) {
            new TrangChu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_navHomeMouseClicked

    private void btnViewRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRoomActionPerformed
        new Chitiet_TK_DT_Phong().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewRoomActionPerformed

    private void ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKeActionPerformed

    }//GEN-LAST:event_ThongKeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TK_DT_Phong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TK_DT_Phong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TK_DT_Phong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TK_DT_Phong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TK_DT_Phong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ThongKe;
    private javax.swing.JPanel begin;
    private javax.swing.JButton btnViewRoom;
    private com.toedter.calendar.JDateChooser dcDateFrom;
    private com.toedter.calendar.JDateChooser dcDateTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel navHome;
    // End of variables declaration//GEN-END:variables
}
