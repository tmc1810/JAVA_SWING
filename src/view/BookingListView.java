package view;

import controller.BookingRoomDAO;
import controller.CustomerDAO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BookingRoom;
import model.Customer;

public class BookingListView extends javax.swing.JFrame {

    private ArrayList<BookingRoom> bookingList;
    private BookingRoomDAO bookingRoomDAO = new BookingRoomDAO();
    private int selectedIndex;
    DefaultTableModel model;

    /**
     * Creates new form BookingListView
     */
    public BookingListView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        bookingList = new BookingRoomDAO().getBookingList();
        model = (DefaultTableModel) tblBookingList.getModel();
        btnCheckin.setVisible(false);
        showResult();
    }

    public void showResult() {
        model.setRowCount(0);
        int i = 1;
        for (BookingRoom b : bookingList) {
            Customer c = new CustomerDAO().getClient(b.getCustID());
            model.addRow(new Object[]{
                i++, b.getBookingID(), b.getRoomID(), b.getCustID(), c.getName(),
                c.getPhone(), b.getDateFrom(), b.getDateTo(), showStatus(b.isStatus())});
        }
    }
    
    public String showStatus(boolean status){
        if(status){
            return "Đã Check In";
        }else{
            return "Chưa Check In";
        }
    }
    
    public void setCheckin(){
        title.setText("DANH SÁCH ĐẶT PHÒNG CHECK IN");
        cbFilter.setSelectedIndex(2);
        btnCheckin.setVisible(true);
        bookingList = bookingRoomDAO.getBookingListFound(txtSearch.getText(), "0");
        showResult();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookingList = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCheckin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnRefesh = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        cbFilter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBookingList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Đặt Phòng", "Mã Phòng", "Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại", "Ngày Nhận Phòng", "Ngày Trả Phòng", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tblBookingList);
        if (tblBookingList.getColumnModel().getColumnCount() > 0) {
            tblBookingList.getColumnModel().getColumn(0).setMaxWidth(50);
            tblBookingList.getColumnModel().getColumn(4).setMinWidth(180);
            tblBookingList.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        txtSearch.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 113, 194));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 113, 194));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa Thông Tin Đặt Phòng");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 113, 194));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Sửa Thông Tin Đặt Phòng");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCheckin.setBackground(new java.awt.Color(0, 113, 194));
        btnCheckin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckin.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckin.setText("CHECK IN");
        btnCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckinActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(7, 38, 109));

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("DANH SÁCH ĐẶT PHÒNG");

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reset-32.png"))); // NOI18N
        btnRefesh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefeshMouseClicked(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-32-view.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
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
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cbFilter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Ðã Check In", "Chưa Check In" }));
        cbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                        .addComponent(btnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCheckin, btnDelete, btnEdit});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String status = "";
        int index = cbFilter.getSelectedIndex();
        if(index == 1){
            status = "1";
        }else if(index == 2){
            status = "0";
        }
        bookingList = bookingRoomDAO.getBookingListFound(txtSearch.getText(), status);
        showResult();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        selectedIndex = tblBookingList.getSelectedRow();
       if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chưa chọn thông tin đặt phòng cần xóa!");
        } else {
            String id = tblBookingList.getValueAt(selectedIndex, 1).toString();
            bookingRoomDAO.deleteBooking(id);
            bookingList.remove(selectedIndex);
            JOptionPane.showMessageDialog(rootPane,
                    "Xóa thông tin đặt phòng thành công!");
            showResult();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        selectedIndex = tblBookingList.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chưa chọn thông tin đặt phòng cần sửa!");
        } else {
            BookingRoom booking = bookingList.get(selectedIndex);
            BookRoomView bookRoomView = new BookRoomView();
            bookRoomView.setVisible(true);
            bookRoomView.setEditBooking(booking);
            this.dispose();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRefeshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefeshMouseClicked
        txtSearch.setText("");
        bookingList = new BookingRoomDAO().getBookingList();
        showResult();
    }//GEN-LAST:event_btnRefeshMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        int conf = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn về trang chủ?",
                "Trang Chủ",
                JOptionPane.YES_OPTION);
        if (conf == 0) {
            new HomeView().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckinActionPerformed
        selectedIndex = tblBookingList.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chưa chọn thông tin đặt phòng cần sửa!");
        } else {
            BookingRoom booking = bookingList.get(selectedIndex);
            CheckInView View = new CheckInView();
            View.TakeBooking(booking);
            View.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCheckinActionPerformed

    private void cbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFilterActionPerformed
        String status = "";
        int index = cbFilter.getSelectedIndex();
        if(index == 1){
            status = "1";
        }else if(index == 2){
            status = "0";
        }
        bookingList = bookingRoomDAO.getBookingListFound(txtSearch.getText(), status);
        showResult();
    }//GEN-LAST:event_cbFilterActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingListView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckin;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbFilter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBookingList;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
