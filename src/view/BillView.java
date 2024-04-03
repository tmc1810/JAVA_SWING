package view;

import controller.CheckInDAO;
import controller.CheckOutDAO;
import controller.ServiceDAO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import model.Service;
import model.ServiceBill;

public class BillView extends javax.swing.JFrame {

    private ArrayList<Bill> billList;
    private ArrayList<Bill> billTK;
    private ArrayList<ServiceBill> svbills;
    private CheckInDAO checkinDAO = new CheckInDAO();
    private CheckOutDAO checkoutDAO = new CheckOutDAO();
    private ServiceDAO ServiceDAO = new ServiceDAO();
    private int selectedIndex;
    DefaultTableModel model1;
    DefaultTableModel model2;

    public BillView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        billList = checkinDAO.getListBill();
        model1 = (DefaultTableModel) tblBill.getModel();
        model1.setColumnIdentifiers(new Object[]{
            "STT", "Mã Hóa Đơn", "Mã Phòng", "Mã Đặt Phòng", "Mã Nhân Viên", "Ngày Check In", "Giờ Check In", "Ngày Chẹck Out", "Giờ Check Out",
            "Số Đêm", "Trạng Thái"
        });      
        model2 = (DefaultTableModel) tblService.getModel();
        model2.setColumnIdentifiers(new Object[]{
            "STT", "Mã Dịch Vụ", "Tên Dịch Vụ", "Ngày Dùng", "Đơn Giá", "Số Lượng", "Ghi Chú", "Đền Bù"
        });
        showResult();
    }

    public void showResult() {
        model1.setRowCount(0);
        int i = 1;
        for (Bill b : billList) {
            model1.addRow(new Object[]{
                i++, b.getBillID(), b.getRoomID(), b.getBookingID(), b.getEmployeeID(), b.getDateFrom(), b.getTimeFrom(), b.getDateTo(), b.getTimeTo(),
                b.getSoDem(), showStatus(b.isStatus())});
        }
    }

    public void showResultService() {
        model2.setRowCount(0);
        int i = 1;
        for (ServiceBill sb : svbills) {
            Service s = ServiceDAO.getSerivce(sb.getServiceID());
            model2.addRow(new Object[]{
                i++, sb.getServiceID(), s.getName(), sb.getServiceDay(), s.getPrice(), sb.getServiceAmount(), sb.getServiceNote(), sb.getCompensation()});
        }
    }

    public String showStatus(boolean status) {
        if (status) {
            return "Đã Thanh Toán";
        } else {
            return "Chưa Thanh Toán";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSearchBill = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblService = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnViewBill = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnHome1 = new javax.swing.JLabel();
        btnRefesh = new javax.swing.JLabel();
        dcDateFrom = new com.toedter.calendar.JDateChooser();
        dcDateTo = new com.toedter.calendar.JDateChooser();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Ngày Check In:");

        btnSearchBill.setBackground(new java.awt.Color(0, 113, 194));
        btnSearchBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSearchBill.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchBill.setText("Tìm Kiếm");
        btnSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBillActionPerformed(evt);
            }
        });

        tblBill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblBill);

        tblService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblService);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Danh sách dịch vụ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Danh sách hóa đơn");

        btnViewBill.setBackground(new java.awt.Color(0, 113, 194));
        btnViewBill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewBill.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBill.setText("Xem Chi Tiết");
        btnViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Trạng Thái:");

        cbStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Tất Cả", "Ðã Thanh Toán", "Chưa Thanh Toán" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày Check Out:");

        jPanel1.setBackground(new java.awt.Color(7, 38, 109));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("DANH SÁCH HÓA ĐƠN THUÊ PHÒNG");

        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-32-view.png"))); // NOI18N
        btnHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome1MouseClicked(evt);
            }
        });

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reset-32.png"))); // NOI18N
        btnRefesh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefeshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefesh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        dcDateFrom.setDateFormatString("dd/MM/yyyy");

        dcDateTo.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dcDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dcDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewBill))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(dcDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dcDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnViewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillActionPerformed
        selectedIndex = tblBill.getSelectedRow();
        String svbills1 = (String) tblBill.getValueAt(selectedIndex, 1);
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chưa chọn thông tin cần xem!");
        } else {
            svbills = checkoutDAO.getSerivceBill(svbills1);
            showResultService();
        }
    }//GEN-LAST:event_btnViewBillActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        Bill b = new Bill();     
        b.setDateFrom(dcDateFrom.getDate());
        b.setDateTo(dcDateTo.getDate());
        String status = "";
        int index = cbStatus.getSelectedIndex();
        if (index == 1) {
            status = "1";
        } else if (index == 2) {
            status = "0";
        }
        billList = checkinDAO.getBillFound(txtSearch.getText(), b ,status);
        showResult();
    }//GEN-LAST:event_cbStatusActionPerformed

    private void btnSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBillActionPerformed

        Bill b = new Bill();
        b.setRoomID(txtSearch.getText());
        b.setDateFrom(dcDateFrom.getDate());
        b.setDateTo(dcDateTo.getDate());
        String status = "";
        int index = cbStatus.getSelectedIndex();
        if (index == 1) {
            status = "1";
        } else if (index == 2) {
            status = "0";
        }
        billList = new CheckInDAO().getBillFound(txtSearch.getText(), b, status);
        showResult();
    }//GEN-LAST:event_btnSearchBillActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseClicked
        int conf = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn về trang chủ?",
                "Trang Chủ",
                JOptionPane.YES_OPTION);
        if (conf == 0) {
            new HomeView().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnHome1MouseClicked

    private void btnRefeshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefeshMouseClicked
        dcDateFrom.setDate(null);
        dcDateTo.setDate(null);
        txtSearch.setText("");

    }//GEN-LAST:event_btnRefeshMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome1;
    private javax.swing.JLabel btnRefesh;
    private javax.swing.JButton btnSearchBill;
    private javax.swing.JButton btnViewBill;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser dcDateFrom;
    private com.toedter.calendar.JDateChooser dcDateTo;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblBill;
    private javax.swing.JTable tblService;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
