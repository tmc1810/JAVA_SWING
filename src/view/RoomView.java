package view;

import controller.RoomDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Room;
import java.sql.ResultSet;
import javax.swing.JFrame;

public class RoomView extends javax.swing.JFrame {

    ResultSet result;
    private RoomDAO roomDAO = new RoomDAO();
    private ArrayList<Room> list;
    DefaultTableModel model;
    private int selectedIndex;

    public RoomView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        list = roomDAO.getListRoom();
        model = (DefaultTableModel) tblRoom.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Tên phòng", "Loại phòng", "Số giường", "Giá"
        });
        showResult();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBed = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        update = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        cbbSX = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnHome4 = new javax.swing.JLabel();
        btnRefesh4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HotelRoom");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã Phòng:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên Phòng:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Loại Phòng:");

        txtType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTypeMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số giường:");

        txtBed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBedMouseClicked(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giá Phòng(/đêm):");

        add.setBackground(new java.awt.Color(0, 113, 194));
        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Thêm Mới");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(0, 113, 194));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Chỉnh Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 113, 194));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Xóa");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblRoom);

        update.setBackground(new java.awt.Color(0, 113, 194));
        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Cập Nhật");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        btnTK.setBackground(new java.awt.Color(0, 113, 194));
        btnTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTK.setForeground(new java.awt.Color(255, 255, 255));
        btnTK.setText("Tìm Kiếm");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        cbbSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Từ thấp đến cao", "Từ cao đến thấp", "Số giường", "Giá phòng", "Loại phòng" }));
        cbbSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSXActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("SẮP XẾP THEO:");

        jPanel6.setBackground(new java.awt.Color(7, 38, 109));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PHÒNG KHÁCH SẠN");

        btnHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-32-view.png"))); // NOI18N
        btnHome4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome4MouseClicked(evt);
            }
        });

        btnRefesh4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reset-32.png"))); // NOI18N
        btnRefesh4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefesh4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefesh4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefesh4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cbbSX, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, delete, edit, update});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add)
                                .addComponent(delete)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, delete, edit, update});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().equals("") || txtName.getText().equals("") || txtType.getText().equals("")
                || txtBed.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Hãy điền đầy đủ thông tin của phòng!");
        } else {
            Room r = new Room();
            r.setID(txtID.getText());
            r.setName(txtName.getText());
            r.setType(txtType.getText());
            r.setNumberBed(Integer.parseInt(txtBed.getText()));
            r.setPrice(Float.parseFloat(txtPrice.getText()));
            if (roomDAO.addRoom(r)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm phòng thành công!");
                list.add(r);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm phòng không thành công, hãy kiểm tra lại thông tin!");
            }
            showResult();
        }
    }//GEN-LAST:event_addActionPerformed

    public void showResult() {
        model.setRowCount(0);
        int i = 1;
        for (Room r : list) {
            model.addRow(new Object[]{
                i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
            });
        }
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String id = tblRoom.getValueAt(tblRoom.getSelectedRow(), 1).toString();
        int DelIndex = tblRoom.getSelectedRow();
        if (roomDAO.deleteRoom(id)) {
            list.remove(DelIndex);
            showResult();
            JOptionPane.showMessageDialog(rootPane, "Xóa phòng thành công");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa phòng không thành công");
        }

    }//GEN-LAST:event_deleteActionPerformed


    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNameMouseClicked

    private void txtTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTypeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTypeMouseClicked

    private void txtBedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBedMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBedMouseClicked

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPriceMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:        
        Room roomSelect = new Room();
        selectedIndex = tblRoom.getSelectedRow();
        roomSelect = list.get(selectedIndex);
        txtID.setText(roomSelect.getID());
        txtID.setEditable(false);
        txtName.setText(roomSelect.getName());
        txtType.setText(roomSelect.getType());
        txtBed.setText(String.valueOf(roomSelect.getNumberBed()));
        txtPrice.setText(String.valueOf(roomSelect.getPrice()));
        showResult();
    }//GEN-LAST:event_editActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Room r = new Room();
        r.setID(txtID.getText());
        r.setName(txtName.getText());
        r.setType(txtType.getText());
        r.setNumberBed(Integer.parseInt(txtBed.getText()));
        r.setPrice(Float.parseFloat(txtPrice.getText()));
        if (roomDAO.editRoom(r, txtID.getText())) {
            roomDAO.editRoom(r, txtID.getText());
            JOptionPane.showMessageDialog(rootPane, "Cập nhật phòng thành công!");
            list.clear();
            list = roomDAO.getListRoom();
            showResult();
            //reset text field
            txtID.setEditable(true);
            txtID.setText("");
            txtName.setText("");
            txtType.setText("");
            txtBed.setText("");
            txtPrice.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cập nhật phòng không thành công!");
        }

    }//GEN-LAST:event_updateActionPerformed

    private ArrayList<Room> listTK;

    public void showResultTK() {
        model.setRowCount(0);
        int i = 1;
        for (Room r : listTK) {
            model.addRow(new Object[]{
                i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
            });
        }
    }
    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        list = roomDAO.getListTKRoom(txtID.getText(), txtType.getText(), txtBed.getText());
        showResult();
    }//GEN-LAST:event_btnTKActionPerformed

    private ArrayList<Room> list1, list2, list3, list4;

    public void showResultSort(ArrayList<Room> l) {
        model.setRowCount(0);
        int i = 1;
        for (Room r : l) {
            model.addRow(new Object[]{
                i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
            });
        }
    }

    private void cbbSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSXActionPerformed
        int index = cbbSX.getSelectedIndex();
        if (index == 0) {
            showResult();
        } else if (index == 1) {
            list1 = roomDAO.getListCBBSX1();
            showResultSort(list1);
        } else if (index == 2) {
            list2 = roomDAO.getListCBBSX2();
            showResultSort(list2);

        } else if (index == 3) {
            list3 = roomDAO.getListCBBSX3();
            showResultSort(list3);

        } else if (index == 4) {
            list4 = roomDAO.getListCBBSX4();
            showResultSort(list4);
        }
    }//GEN-LAST:event_cbbSXActionPerformed

    private void btnHome4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome4MouseClicked
        int conf = JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn về trang chủ?",
                "Trang Chủ",
                JOptionPane.YES_OPTION);
        if (conf == 0) {
            new HomeView().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnHome4MouseClicked

    private void btnRefesh4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefesh4MouseClicked
        txtID.setText("");
        txtName.setText("");
        txtType.setText("");
        txtBed.setText("");
        txtPrice.setText("");
        list = roomDAO.getListRoom();

        showResult();
    }//GEN-LAST:event_btnRefesh4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel btnHome4;
    private javax.swing.JLabel btnRefesh4;
    private javax.swing.JButton btnTK;
    private javax.swing.JComboBox<String> cbbSX;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtType;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
