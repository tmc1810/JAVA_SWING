package view;

import controller.BookingRoomDAO;
import controller.CustomerDAO;
import controller.RoomDAO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BookingRoom;
import model.Customer;
import model.FindRoom;
import model.Room;

public class BookRoomView extends javax.swing.JFrame {

    private ArrayList<Room> roomFound;
    private BookingRoomDAO bookingRoomDAO = new BookingRoomDAO();
    private int roomSelectedIndex;
    private boolean isEdit = false;
    DefaultTableModel modelRF;

    public BookRoomView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        modelRF = (DefaultTableModel) tblRoomFind.getModel();
    }

    public void showRoomFound() {
        for (Room r : roomFound) {
            modelRF.addRow(new Object[]{
                r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
            });
        }
    }

    public void showResult() {
        modelRF.setRowCount(0);
        this.showRoomFound();
    }

    public void setCustData(Customer c) {
        txtClientId.setText(c.getID());
        txtCustumerName.setText(c.getName());
        txtPhoneNumber.setText(c.getPhone());
        txtBookingId.setText(String.valueOf(bookingRoomDAO.getBookingId()));
    }

    public void setEditBooking(BookingRoom b) {
        Customer c = new CustomerDAO().getClient(b.getCustID());
        Room r = new RoomDAO().getRoom(b.getRoomID());

        isEdit = true;
        txtBookingId.setText(b.getBookingID());
        txtBookingId.setEditable(false);
        
        txtClientId.setText(b.getCustID());
        txtCustumerName.setText(c.getName());
        txtPhoneNumber.setText(c.getPhone());      
        dcDateFrom.setDate(b.getDateFrom());
        dcDateTo.setDate(b.getDateTo());

        txtRoomId.setText(b.getRoomID());
        txtRoomName.setText(r.getName());
        txtType.setText(r.getType());
        txtBed.setText(String.valueOf(r.getNumberBed()));
        txtPrice.setText(String.valueOf(r.getPrice()));

        btnBook.setText("Lưu Lại");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBookingId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCustumerName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRoomId = new javax.swing.JTextField();
        txtRoomName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBed = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtClientId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnChooseCust = new javax.swing.JButton();
        btnChooseRoom = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRefesh = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        dcDateFrom = new com.toedter.calendar.JDateChooser();
        dcDateTo = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dcDateFromFind = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        dcDateToFind = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cbTypeFind = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtBedFind = new javax.swing.JTextField();
        btnFindRoom = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoomFind = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBookingId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBookingId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookingIdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã Đặt Phòng:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tên Khách Hàng:");

        txtCustumerName.setEditable(false);
        txtCustumerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Số Điện Thoại:");

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhoneNumber.setMinimumSize(new java.awt.Dimension(200, 26));
        txtPhoneNumber.setPreferredSize(new java.awt.Dimension(200, 26));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mã Phòng:");

        txtRoomId.setEditable(false);
        txtRoomId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtRoomName.setEditable(false);
        txtRoomName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tên Phòng:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Ngày Nhận:");

        txtType.setEditable(false);
        txtType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Loại Phòng:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Số Giường:");

        txtBed.setEditable(false);
        txtBed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Giá Phòng Thuê(/đêm):");

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnBook.setBackground(new java.awt.Color(0, 113, 194));
        btnBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Đặt Phòng");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Mã Khách Hàng:");

        txtClientId.setEditable(false);
        txtClientId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientIdActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Ngày Trả:");

        btnChooseCust.setBackground(new java.awt.Color(0, 113, 194));
        btnChooseCust.setForeground(new java.awt.Color(255, 255, 255));
        btnChooseCust.setText("Chọn Khách Hàng");
        btnChooseCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseCustActionPerformed(evt);
            }
        });

        btnChooseRoom.setBackground(new java.awt.Color(0, 113, 194));
        btnChooseRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChooseRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnChooseRoom.setText("Chọn Phòng");
        btnChooseRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseRoomActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(7, 38, 109));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐẶT PHÒNG");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(btnHome)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        dcDateFrom.setDateFormatString("dd/MM/yyyy");
        dcDateFrom.setEnabled(false);
        dcDateFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dcDateTo.setDateFormatString("dd/MM/yyyy");
        dcDateTo.setEnabled(false);
        dcDateTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Nhận:");

        dcDateFromFind.setDateFormatString("dd/MM/yyyy");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setText("Ngày Trả:");

        dcDateToFind.setDateFormatString("dd/MM/yyyy");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Loại Phòng:");

        cbTypeFind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Superior", "Deluxe", "Suite" }));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Số Giường:");

        txtBedFind.setText("1");

        btnFindRoom.setBackground(new java.awt.Color(0, 113, 194));
        btnFindRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFindRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnFindRoom.setText("Tìm");
        btnFindRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBedFind, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTypeFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcDateFromFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcDateToFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFindRoom, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcDateFromFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcDateToFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTypeFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBedFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFindRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng chọn phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tblRoomFind.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Loại Phòng", "Số Giường", "Giá"
            }
        ));
        jScrollPane1.setViewportView(tblRoomFind);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7)
                            .addComponent(jLabel17)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChooseRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCustumerName)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(dcDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txtBookingId)
                                    .addComponent(txtClientId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChooseCust)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRoomId)
                            .addComponent(txtRoomName)
                            .addComponent(txtBed)
                            .addComponent(txtType)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseCust, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustumerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(dcDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(dcDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtRoomId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnChooseRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dcDateFrom, dcDateTo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        BookingRoom booking = new BookingRoom();
        booking.setBookingID(txtBookingId.getText());
        booking.setCustID(txtClientId.getText());
        booking.setRoomID(txtRoomId.getText());
        booking.setStatus(false);
        booking.setDateFrom(dcDateFrom.getDate());
        booking.setDateTo(dcDateTo.getDate());
//        try {
//            booking.setDateFrom(new SimpleDateFormat("dd/MM/yyyy").parse(txtDateForm.getText()));
//            booking.setDateTo(new SimpleDateFormat("dd/MM/yyyy").parse(txtDateTo.getText()));
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
        if (txtBookingId.getText().equals("")
                || txtClientId.getText().equals("")
                || txtRoomId.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy điền đầy đủ thông tin!");
        } else {
            if (isEdit) {
                if (bookingRoomDAO.editBooking(booking)) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Sửa thông tin thành công!");
                    new BookingListView().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane,
                            "Sửa thông tin không thành công! Vui lòng kiểm tra lại thông tin.");
                }
            } else {
                if (bookingRoomDAO.addBooking(booking)) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Đặt phòng thành công!");
                    new HomeView().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane,
                            "Đặt phòng không thành công! Vui lòng kiểm tra lại thông tin.");
                }
            }
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void btnFindRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindRoomActionPerformed

        FindRoom f = new FindRoom();
        f.setType(String.valueOf(cbTypeFind.getSelectedItem()));
        f.setBed(Integer.parseInt(txtBedFind.getText()));
        f.setDateFrom(dcDateFromFind.getDate());
        f.setDateTo(dcDateToFind.getDate());
//        try {
//            f.setDateFrom(new SimpleDateFormat("dd/MM/yyyy").parse(txtDateFromFind.getText()));
//            f.setDateTo(new SimpleDateFormat("dd/MM/yyyy").parse(txtDateToFind.getText()));
//        } catch (ParseException ex) {
//            JOptionPane.showMessageDialog(rootPane,
//                    "Thông tin ngày chưa phù hợp hoặc chưa đúng định dạng(dd/mm/yyyy)");
//            ex.printStackTrace();
//        }
        roomFound = bookingRoomDAO.getRoomFound(f);
        showResult();


    }//GEN-LAST:event_btnFindRoomActionPerformed

    private void btnChooseRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseRoomActionPerformed
        roomSelectedIndex = tblRoomFind.getSelectedRow();
        if (roomSelectedIndex == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Chưa chọn phòng muốn đặt!");
        } else {
            Room roomSelect = new Room();
            roomSelect = roomFound.get(roomSelectedIndex);
            txtRoomId.setText(roomSelect.getID());
            txtRoomName.setText(roomSelect.getName());
            txtType.setText(roomSelect.getType());
            txtBed.setText(String.valueOf(roomSelect.getNumberBed()));
            txtPrice.setText(String.valueOf(roomSelect.getPrice()));
            dcDateFrom.setDate(dcDateFromFind.getDate());
            dcDateTo.setDate(dcDateToFind.getDate());
            //txtDateForm.setText(dcDateFromFind.getDate().toString());
            //txtDateTo.setText(dcDateToFind.getDateFormatString());
        }
    }//GEN-LAST:event_btnChooseRoomActionPerformed

    private void btnChooseCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseCustActionPerformed
        if (isEdit) {
            JOptionPane.showMessageDialog(rootPane,
                    "Không thể thay đổi thông tin khách hàng!");
        } else {
            CustomerView clientView = new CustomerView();
            clientView.setVisible(true);
            clientView.setBookingClient();
            this.dispose();
        }
    }//GEN-LAST:event_btnChooseCustActionPerformed

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

    private void btnRefeshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefeshMouseClicked
        txtBookingId.setText("");
        txtClientId.setText("");
        txtCustumerName.setText("");
        txtPhoneNumber.setText("");
        txtRoomId.setText("");
        //txtDateForm.setText("");
        //txtDateTo.setText("");
        dcDateFrom.setDate(null);
        dcDateTo.setDate(null);
        txtRoomName.setText("");
        txtType.setText("");
        txtBed.setText("");
        txtPrice.setText("");

        //txtDateFromFind.setText("");
        //txtDateToFind.setText("");
        dcDateFromFind.setDate(null);
        dcDateToFind.setDate(null);
        txtBedFind.setText("1");

        roomFound.clear();
        showResult();
    }//GEN-LAST:event_btnRefeshMouseClicked

    private void txtBookingIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookingIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookingIdActionPerformed

    private void txtClientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientIdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRoomView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnChooseCust;
    private javax.swing.JButton btnChooseRoom;
    private javax.swing.JButton btnFindRoom;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRefesh;
    private javax.swing.JComboBox<String> cbTypeFind;
    private com.toedter.calendar.JDateChooser dcDateFrom;
    private com.toedter.calendar.JDateChooser dcDateFromFind;
    private com.toedter.calendar.JDateChooser dcDateTo;
    private com.toedter.calendar.JDateChooser dcDateToFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoomFind;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtBedFind;
    private javax.swing.JTextField txtBookingId;
    private javax.swing.JTextField txtClientId;
    private javax.swing.JTextField txtCustumerName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomId;
    private javax.swing.JTextField txtRoomName;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
