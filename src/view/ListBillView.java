package view;

import controller.CheckOutDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import java.sql.ResultSet;
import javax.swing.JFrame;
import model.BookingRoom;

public class ListBillView extends javax.swing.JFrame {

    ResultSet result;
    private ArrayList<Bill> colist;
    private CheckOutDAO checkoutDAO = new CheckOutDAO();
    DefaultTableModel model;
    private int selectedIndex;

    public ListBillView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        colist = checkoutDAO.getCheckOutList();
        model = (DefaultTableModel) tblBill.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "Mã Hóa Đơn", "Mã Phòng", "Ngày Check In", "Giờ Check In", "Ngày Trả(dự kiến)"});
        showTable();
    }

    public void showTable() {
        int i = 1;
        model.setRowCount(0);
        for (Bill bill : colist) {
            BookingRoom bookingRoom = new BookingRoom();
            bookingRoom = checkoutDAO.getBooking(bill.getBookingID());
            model.addRow(new Object[]{
                i++, bill.getBillID(), bookingRoom.getRoomID(), bill.getDateFrom(), bill.getTimeFrom(), bookingRoom.getDateTo()});
        }
    }
    
    public void setCheckOut(){
        title.setText("CHỌN HÓA ĐƠN THUÊ PHÒNG CHECK OUT");
        btnBookService.setVisible(false);
        btnCheckOut.setVisible(true);
    }    
    
    public void setBookService(){
        title.setText("CHỌN HÓA ĐƠN THUÊ PHÒNG ĐẶT DỊCH VỤ");
        btnCheckOut.setVisible(false);
        btnBookService.setVisible(true);
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTenPhong = new javax.swing.JTextField();
        btnSearchBill = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnCheckOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnHome2 = new javax.swing.JLabel();
        btnRefesh1 = new javax.swing.JLabel();
        btnBookService = new javax.swing.JButton();

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

        txtTenPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSearchBill.setBackground(new java.awt.Color(0, 113, 194));
        btnSearchBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchBill.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchBill.setText("Tìm Kiếm");
        btnSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBillActionPerformed(evt);
            }
        });

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblBill);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Danh sách hóa đơn thuê phòng hiện tại:");

        btnCheckOut.setBackground(new java.awt.Color(0, 113, 194));
        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("Check Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(7, 38, 109));

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CHỌN HÓA ĐƠN THUÊ PHÒNG CHECK OUT");

        btnHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-32-view.png"))); // NOI18N
        btnHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome2MouseClicked(evt);
            }
        });

        btnRefesh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reset-32.png"))); // NOI18N
        btnRefesh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefesh1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefesh1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefesh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnBookService.setBackground(new java.awt.Color(0, 113, 194));
        btnBookService.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBookService.setForeground(new java.awt.Color(255, 255, 255));
        btnBookService.setText("Ðặt Dịch Vụ");
        btnBookService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookService, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBookService, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        selectedIndex = tblBill.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa chọn hóa đơn cần Check out!");
        } else {
            Bill bill = new Bill();
            bill = colist.get(selectedIndex);
            CheckOutView coView = new CheckOutView();
            coView.TakeCheckOut(bill);
            coView.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBillActionPerformed
        if(txtTenPhong.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Hãy nhập thông tin phòng cần Check out!");
        }else{
        colist = checkoutDAO.FindCheckOutList(txtTenPhong.getText());
        showTable();
        }
    }//GEN-LAST:event_btnSearchBillActionPerformed

    private void btnHome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseClicked
        int conf = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn về trang chủ?",
                "Trang Chủ",
                JOptionPane.YES_OPTION);
        if (conf == 0) {
            new HomeView().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnHome2MouseClicked

    private void btnRefesh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefesh1MouseClicked
        txtTenPhong.setText("");
        colist = checkoutDAO.getCheckOutList();
        showTable();
    }//GEN-LAST:event_btnRefesh1MouseClicked

    private void btnBookServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookServiceActionPerformed
        selectedIndex = tblBill.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa chọn hóa đơn cần Check out!");
        } else {
            Bill bill = new Bill();
            bill = colist.get(selectedIndex);
            BookServiceView bsView = new BookServiceView();
            bsView.SetBookService(bill);
            bsView.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBookServiceActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListBillView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookService;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JLabel btnHome2;
    private javax.swing.JLabel btnRefesh1;
    private javax.swing.JButton btnSearchBill;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblBill;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables

}
