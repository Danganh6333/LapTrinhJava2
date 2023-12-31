package Assigment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Assignment extends javax.swing.JFrame implements Runnable {

    Thread t1 = new Thread(this);
    List<Employee> employees;
    DefaultTableModel defaultTableModel;
    EmployeeService employeeService;
    Employee employee;
    int Index;
    private static final String EMAIL_REGEX
            = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    /**
     * Creates new form Assignment
     */
    public Assignment() {
        initComponents();
        this.employeeService = new EmployeeService();
        this.employeeService.Nhap(new Employee(1, "Phi Ly Hoa", 22, "Hoa22@gmail.com", 7000000.0));
        this.employeeService.Nhap(new Employee(2, "Phan Huy Quang", 28, "Quang28@gmail.com", 9000000.0));
        this.employeeService.Nhap(new Employee(3, "Vu Cam Nam", 25, "Nam25@gmail.com", 6000000.0));
        this.employeeService.Nhap(new Employee(4, "La Tu Minh", 23, "Minh23@gmail.com", 8000000.0));
        this.employeeService.Nhap(new Employee(5, "Ninh Cam Lan", 21, "Lan21@gmail.com", 9000000.0));
        this.fillToTable();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JLabel();
        tfMaNhanVien = new javax.swing.JTextField();
        lblMaNhanVien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblHoVaTen = new javax.swing.JLabel();
        tfHoVaTen = new javax.swing.JTextField();
        lblTuoi = new javax.swing.JLabel();
        tfTuoi = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblLuong = new javax.swing.JLabel();
        tfLuong = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnStream = new javax.swing.JButton();
        lblRecord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTitle.setText("Quản Lý Nhân Viên");

        tfMaNhanVien.setMinimumSize(new java.awt.Dimension(7, 26));
        tfMaNhanVien.setPreferredSize(new java.awt.Dimension(8, 30));
        tfMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaNhanVienActionPerformed(evt);
            }
        });
        tfMaNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMaNhanVienKeyTyped(evt);
            }
        });

        lblMaNhanVien.setText("MÃ NHÂN VIÊN ");
        lblMaNhanVien.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN ", "TUỔI ", "EMAIL ", "LƯƠNG "
            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        lblHoVaTen.setText("      HỌ VÀ TÊN ");
        lblHoVaTen.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        tfHoVaTen.setMinimumSize(new java.awt.Dimension(7, 26));
        tfHoVaTen.setPreferredSize(new java.awt.Dimension(8, 30));

        lblTuoi.setText("                 TUỔI ");
        lblTuoi.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        tfTuoi.setMinimumSize(new java.awt.Dimension(7, 26));
        tfTuoi.setPreferredSize(new java.awt.Dimension(8, 30));

        lblEmail.setText("                EMAIL ");
        lblEmail.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        tfEmail.setMinimumSize(new java.awt.Dimension(7, 26));
        tfEmail.setPreferredSize(new java.awt.Dimension(8, 30));

        lblLuong.setText("              LƯƠNG ");
        lblLuong.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        tfLuong.setMinimumSize(new java.awt.Dimension(7, 26));
        tfLuong.setPreferredSize(new java.awt.Dimension(8, 30));
        tfLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLuongActionPerformed(evt);
            }
        });
        tfLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLuongKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 255, 51)));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew)
                            .addComponent(btnFind)
                            .addComponent(btnOpen))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnExit, btnFind, btnNew, btnOpen, btnSave});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFirst.setText("|< ");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("<< ");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnStream.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStream.setForeground(new java.awt.Color(255, 51, 51));
        btnStream.setText("Giờ");
        btnStream.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStreamActionPerformed(evt);
            }
        });

        lblRecord.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(255, 0, 51));
        lblRecord.setText("Record of 0 of 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(tfMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(tfTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(tfLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFirst)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPrevious)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNext)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLast)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRecord)))))
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitle)
                        .addGap(215, 215, 215)
                        .addComponent(btnStream, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfEmail, tfHoVaTen, tfMaNhanVien, tfTuoi});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmail, lblHoVaTen, lblLuong, lblMaNhanVien, lblTuoi});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrevious});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitle)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnStream, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst)
                            .addComponent(btnPrevious)
                            .addComponent(btnNext)
                            .addComponent(btnLast)
                            .addComponent(lblRecord)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfEmail, tfHoVaTen, tfMaNhanVien, tfTuoi});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaNhanVienActionPerformed

    private void btnStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreamActionPerformed
        // TODO add your handling code here:
        t1.start();
    }//GEN-LAST:event_btnStreamActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        // TODO add your handling code here:

        showDetail();
    }//GEN-LAST:event_tblEmployeeMouseClicked
     public String layThongTinBanGhi(){
        return " Record " + (Index + 1) + " of " + employees.size();
    }
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        Index = 0;
        tblEmployee.setRowSelectionInterval(Index, Index);
        showDetail();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        saveFile();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        this.openFile();
        if(employees.size() > 0){
             Index=0;
             showDetail();
        }else{
            Index = -1;
            clearForm();
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        if (findEmployee(tfMaNhanVien.getText()) == null) {
            JOptionPane.showMessageDialog(null,"Không tìm thấy");
        }else{
            showDetail(findEmployee(tfMaNhanVien.getText()));
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        this.removeEmployee();
        this.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Index = tblEmployee.getSelectedRow();
        if (tfMaNhanVien.getText().equalsIgnoreCase("") || tfHoVaTen.getText().equalsIgnoreCase("")
                || tfEmail.getText().equalsIgnoreCase("")
                || tfTuoi.getText().equalsIgnoreCase("") || tfLuong.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Không nên để trống các trường dữ liệu");
            return;
        }
        String email = tfEmail.getText().trim();
        if (!email.matches(EMAIL_REGEX)) {
            JOptionPane.showMessageDialog(null, "Email không đúng định dạng");
        }
        try {
            int tuoi = Integer.parseInt(tfTuoi.getText());
            if (tuoi > 16 && tuoi < 55) {
            } else {
                JOptionPane.showMessageDialog(null, "Tuổi không phù hợp");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Tuổi phải là 1 con số");
        }
        double luong = Double.parseDouble(tfLuong.getText());
        if (luong <= 5000000) {
            JOptionPane.showMessageDialog(null, "Lương phải trên 5 triệu");
            return;
        }
        if (Index == -1) {
            this.addEmployee();
        } else {
            this.updateEmployee();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (Index < employees.size() - 1) {
            Index++;
            tblEmployee.setRowSelectionInterval(Index, Index);
            showDetail();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if (Index > 0) {
            Index--;
            tblEmployee.setRowSelectionInterval(Index, Index);
            showDetail();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        Index = employees.size() - 1;
        tblEmployee.setRowSelectionInterval(Index, Index);
        showDetail();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tfLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLuongActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfLuongActionPerformed

    private void tfMaNhanVienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMaNhanVienKeyTyped
        // TODO add your handling code here:
        char s = evt.getKeyChar();
        if (Character.isAlphabetic(s)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfMaNhanVienKeyTyped

    private void tfLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLuongKeyTyped
        // TODO add your handling code here:
        char s = evt.getKeyChar();
        if (Character.isAlphabetic(s)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfLuongKeyTyped

    public void fillToTable() {
        defaultTableModel = (DefaultTableModel) tblEmployee.getModel();
        defaultTableModel.setRowCount(0);
        employees = employeeService.LayDanhSach();
        for (Employee em : employees) {
            Object[] objects = new Object[]{
                em.maNV, em.hoTenNV, em.tuoiNV, em.emailNV,
                em.luongNV
            };
            defaultTableModel.addRow(objects);
        }
       
    }

    public void showDetail() {
        Index = tblEmployee.getSelectedRow();
        if (Index == -1) {
            return;
        }
        String col1 = this.tblEmployee.getValueAt(Index, 0).toString();
        String col2 = this.tblEmployee.getValueAt(Index, 1).toString();
        String col3 = this.tblEmployee.getValueAt(Index, 2).toString();
        String col4 = this.tblEmployee.getValueAt(Index, 3).toString();
        String col5 = this.tblEmployee.getValueAt(Index, 4).toString();

        tfMaNhanVien.setText(col1);
        tfHoVaTen.setText(col2);
        tfTuoi.setText(col3);
        tfEmail.setText(col4);
        tfLuong.setText(col5);
        lblRecord.setText(layThongTinBanGhi());
        
    }
  
    public void showDetail(Employee employee) {
        tfMaNhanVien.setText(String.valueOf(employee.getMaNV()));
        tfHoVaTen.setText(employee.getHoTenNV());
        tfTuoi.setText(String.valueOf(employee.getTuoiNV()));
        tfEmail.setText(employee.getEmailNV());
        tfLuong.setText(String.valueOf(employee.getLuongNV()));
    }
    public void openFile() {
        try {
            FileInputStream fis = new FileInputStream("NhanVien.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();
            employeeService.DatDanhSach(list);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Lỗi Mở File");
        }
        JOptionPane.showMessageDialog(rootPane, "Mở Thành Công");
        fillToTable();
    }

    public void saveFile() {
      ArrayList<Employee> list = employeeService.LayDanhSach();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("NhanVien.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        } catch (IOException e) {
        }
        JOptionPane.showInternalMessageDialog(rootPane, "gHI tHÀNH CÔNG");
    }

    public void addEmployee() {
        int col1 = Integer.parseInt(tfMaNhanVien.getText());
        String col2 = tfHoVaTen.getText();
        int col3 = Integer.parseInt(tfTuoi.getText());
        String col4 = tfEmail.getText();
        double col5 = Double.parseDouble(tfLuong.getText());

        int value = Integer.parseInt(tfMaNhanVien.getText());
        for (var e : employees) {
            if (e.getMaNV() == value) {
                JOptionPane.showMessageDialog(null, "Không nên để trùng");
                return;
            }
        }
        employee = new Employee(col1, col2, col3, col4, col5);
        this.employeeService.Nhap(employee);
        this.fillToTable();
    }

    public void updateEmployee() {
        Index = tblEmployee.getSelectedRow();
        int col1 = Integer.parseInt(tfMaNhanVien.getText());
        String col2 = tfHoVaTen.getText();
        int col3 = Integer.parseInt(tfTuoi.getText());
        String col4 = tfEmail.getText();
        double col5 = Double.parseDouble(tfLuong.getText());

        employee = new Employee(col1, col2, col3, col4, col5);
        this.employeeService.Sua(Index, employee);
        fillToTable();

    }

    public void removeEmployee() {
        Index = tblEmployee.getSelectedRow();
        if (Index == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn dòng để xóa");
            return;
        }
        int Check = JOptionPane.showConfirmDialog(this, "Có mưốn xóa không ?", "Delete", JOptionPane.YES_NO_OPTION);
        if (Check != JOptionPane.YES_OPTION) {
            return;
        }
        this.employeeService.Xoa(Index);
        this.fillToTable();
    }

    public Employee findEmployee(String id) {
        for (Employee employee1 : employees) {
            if (id == null ? String.valueOf(employee1.getMaNV()) == null : id.equals(String.valueOf(employee1.getMaNV()))) {
                return employee1;
            }
        }
        return null;
    }

    public void clearForm() {
        tfMaNhanVien.setText("");
        tfHoVaTen.setText("");
        tfTuoi.setText("");
        tfEmail.setText("");
        tfLuong.setText("");
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Flatlaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStream;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoVaTen;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoVaTen;
    private javax.swing.JTextField tfLuong;
    private javax.swing.JTextField tfMaNhanVien;
    private javax.swing.JTextField tfTuoi;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
    int count = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("\"hh:mm a\"");

    @Override
    public void run() {
        while (true) {
            try {
                Date date = new Date();
                String st = sdf.format(date);
                btnStream.setText(st);
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
