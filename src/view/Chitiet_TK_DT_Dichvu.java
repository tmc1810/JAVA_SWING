package view;

import controller.StatisticalDAO;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.StatisticalService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Chitiet_TK_DT_Dichvu extends javax.swing.JFrame {

    private ArrayList<StatisticalService> list;
    private StatisticalDAO stDAO = new StatisticalDAO();
    DefaultTableModel model;
    
    public Chitiet_TK_DT_Dichvu() {
        initComponents();
        this.setLocationRelativeTo(null);

        StatisticalDAO stDAO = new StatisticalDAO();
        list = stDAO.getListDTDV();
        model = (DefaultTableModel) tblDTDV.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Tên Dịch Vụ", "Ngày Dùng", "Giá", "Số lượng", "Ghi chú", "Thành tiền"
        });
        showTable();
        SumDTDV();
    }

    public void showTable() {
        int i = 1;
        for (StatisticalService r : list) {
            model.addRow(new Object[]{
                i++, r.getID_DV(), r.getTen_DV(), r.getNgayDung(), r.getGia_DV(), r.getSoLuong(),
                 r.getGhiChu(), r.getThanhtien()
            });
        }
    }

    public void showTable1() {
        int i = 1;
        model.setRowCount(0);
        for (StatisticalService r : list1) {
            model.addRow(new Object[]{
                i++, r.getID_DV(), r.getTen_DV(), r.getNgayDung(), r.getGia_DV(), r.getSoLuong(),
                 r.getGhiChu(), r.getThanhtien()
            });
        }
    }

    public void SumDTDV() {
        DecimalFormat x = new DecimalFormat("###,###,###,###,###,###,###");
        float Tong = 0;
        for (int i = 0; i < tblDTDV.getRowCount(); i++) {
            Tong += Float.parseFloat(tblDTDV.getValueAt(i, 7).toString());
        }
        txtDTDV.setText(x.format(Tong) + " " + "VND");
        txtDTDV.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        begin = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        dcDateFrom = new com.toedter.calendar.JDateChooser();
        dcDateTo = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDTDV = new javax.swing.JTable();
        ThongKeDV = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        txtDTDV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý khách sạn");

        begin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maunen2.jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        begin.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        begin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 570, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("THỐNG KÊ DOANH THU DỊCH VỤ");
        begin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 50));

        dcDateFrom.setDateFormatString("dd/MM/yyyy");
        dcDateFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        begin.add(dcDateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 190, 50));

        dcDateTo.setDateFormatString("dd/MM/yyyy");
        dcDateTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        begin.add(dcDateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, 50));

        tblDTDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDTDV);

        begin.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1020, 490));

        ThongKeDV.setBackground(new java.awt.Color(112, 26, 98));
        ThongKeDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ThongKeDV.setForeground(new java.awt.Color(255, 255, 255));
        ThongKeDV.setText("Xem Thống kê");
        ThongKeDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeDVActionPerformed(evt);
            }
        });
        begin.add(ThongKeDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 145, 50));

        btnXuatFile.setBackground(new java.awt.Color(112, 26, 98));
        btnXuatFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatFile.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xuatfile.png"))); // NOI18N
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });
        begin.add(btnXuatFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 50, 50));

        txtDTDV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDTDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDTDVActionPerformed(evt);
            }
        });
        begin.add(txtDTDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 260, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Từ ngày:");
        begin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Đến ngày:");
        begin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tổng doanh thu:");
        begin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 200, 50));

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

    private ArrayList<StatisticalService> list1;
    
    private void ThongKeDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKeDVActionPerformed
        StatisticalService ss = new StatisticalService();
        ss.setDateFrom(dcDateFrom.getDate());
        ss.setDateTo(dcDateTo.getDate());
        list1 = stDAO.getListDTDV(ss);
        showTable1();
        SumDTDV();

    }//GEN-LAST:event_ThongKeDVActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        //Tạo một bộ lọc để chỉ hiển thị các file excel
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xlsx");
        fileChooser.setFileFilter(filter);
        //Hiển thị hộp thoại chọn File và lấy kết quả trả về từ người dùng
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Thống kê doanh thu dịch vụ");

                Row headerRow = sheet.createRow(0);
                String[] columns = {"STT", "ID", "Tên Dịch Vụ", "Ngày Dùng", "Giá", "Số lượng", "Ghi chú", "Thành tiền"};
                for (int i = 0; i < columns.length; i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(columns[i]);
                }

                int rowNum = 1;
                for (StatisticalService TK : list) {
                    Row row = sheet.createRow(rowNum++);
                    row.createCell(0).setCellValue(rowNum - 1);
                    row.createCell(1).setCellValue(TK.getID_DV());
                    row.createCell(2).setCellValue(TK.getTen_DV());
                    row.createCell(3).setCellValue(TK.getNgayDung());
                    row.createCell(4).setCellValue(TK.getGia_DV());
                    row.createCell(5).setCellValue(TK.getSoLuong());
                    row.createCell(6).setCellValue(TK.getGhiChu());
                    row.createCell(7).setCellValue(TK.getThanhtien());

                }

                Cell cell = headerRow.createCell(1);
                cell.setCellValue(columns[1]);
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue("Tổng tiền");
                row.createCell(1).setCellFormula("SUM(OFFSET(H1,1,0,COUNT(H:H)))");

                // Lưu workbook vào một file
                FileOutputStream fileOut = new FileOutputStream(filePath + ".xlsx");
                workbook.write(fileOut);
                fileOut.close();
                workbook.close();
                JOptionPane.showMessageDialog(this, "Xuất Excel thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Xuất Excel thất bại: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void txtDTDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDTDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDTDVActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(null,
            "Bạn có chắc chắn muốn thoát?",
            "Chi tiết doanh thu dịch vụ",
            JOptionPane.YES_OPTION);
        if (conf == 0) {
            new TK_DT_Dichvu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Chitiet_TK_DT_Dichvu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chitiet_TK_DT_Dichvu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chitiet_TK_DT_Dichvu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chitiet_TK_DT_Dichvu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chitiet_TK_DT_Dichvu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ThongKeDV;
    private javax.swing.JPanel begin;
    private javax.swing.JButton btnXuatFile;
    private com.toedter.calendar.JDateChooser dcDateFrom;
    private com.toedter.calendar.JDateChooser dcDateTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDTDV;
    private javax.swing.JTextField txtDTDV;
    // End of variables declaration//GEN-END:variables
}
