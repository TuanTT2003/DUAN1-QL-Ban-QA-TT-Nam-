/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.viewCRUD;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PhieuGiamGia;
import service.PhieuGiamGiaService;
import utility.Uhelper;

/**
 *
 * @author User
 */
public class QLPGG extends javax.swing.JFrame {
    private final PhieuGiamGiaService phieuGiamGiaService;
    
  
    public QLPGG() {
        initComponents();
        setLocationRelativeTo(null);
        phieuGiamGiaService = new PhieuGiamGiaService();
         loadDataToTable();
         txtID.setEditable(false); // Không cho phép chỉnh sửa trường input
        if(tblQLPGG.getRowCount()>0){
            tblQLPGG.setRowSelectionInterval(0, 0);
            showDetail();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tên = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLPGG = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản lí phiếu giảm giá");

        jLabel2.setText("ID:");

        jLabel3.setText("Mã:");

        Tên.setText("Tên");

        tblQLPGG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã", "Tên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLPGG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLPGGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLPGG);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tên, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnClear))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tên)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnClear))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(Uhelper.checkRong(txtMa, "Không để trống mã giảm giá")) return;
        if(Uhelper.checkRong(txtTen, "Không để trống tên giảm giá")) return;
       
        PhieuGiamGia pgg = getPhieuGiamGiaFormInput();
        if(phieuGiamGiaService.addPGG(pgg)!=null){
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
         Integer row = tblQLPGG.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn 1 dòng trên table");
            return;
        }
        PhieuGiamGia n = getPhieuGiamGiaFormInput();
        String phieuGiamGiaID = getPhieuGiamGiaFormSelectedRow();
        n.setId(phieuGiamGiaID);
        if(phieuGiamGiaService.updatePGG(n) != null){
            JOptionPane.showMessageDialog(this, "sửa thành công");
        }else{
            JOptionPane.showMessageDialog(this, "sửa thất bại");
        }
        loadDataToTable();
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String phieuGiamGiaID = getPhieuGiamGiaFormSelectedRow();
        if(phieuGiamGiaService.deletePGG(phieuGiamGiaID) != null){
            JOptionPane.showMessageDialog(this, "xóa thành công");
        }else{
            JOptionPane.showMessageDialog(this, "xóa thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblQLPGGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLPGGMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_tblQLPGGMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLPGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPGG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tên;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQLPGG;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
private void loadDataToTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tblQLPGG.getModel();
        dtm.setRowCount(0);
        List<PhieuGiamGia> lst = phieuGiamGiaService.getAllPGG();
        for (PhieuGiamGia pgg : lst) {
            dtm.addRow(new Object[]{
            pgg.getId(),
                pgg.getMa(),
                pgg.getTen()
            });
        }
    }

    private void showDetail() {
        Integer selectedRow = tblQLPGG.getSelectedRow();
        txtID.setText(tblQLPGG.getValueAt(selectedRow, 0).toString());
        txtMa.setText(tblQLPGG.getValueAt(selectedRow, 1).toString());
        txtTen.setText(tblQLPGG.getValueAt(selectedRow, 2).toString());
    }
    public PhieuGiamGia getPhieuGiamGiaFormInput(){
        PhieuGiamGia pgg = new  PhieuGiamGia();
        pgg.setId(txtID.getText());
       pgg.setMa(txtMa.getText());
       pgg.setTen(txtTen.getText());
    return pgg;
    }
    public String getPhieuGiamGiaFormSelectedRow(){
        Integer row = tblQLPGG.getSelectedRow();
        String PhieuGiamGiaID = (String) tblQLPGG.getValueAt(row, 0);
    return PhieuGiamGiaID;
       
    }

    private void clearForm() {
        txtID.setText("");
        txtMa.setText("");
        txtTen.setText("");
        tblQLPGG.clearSelection();
    }
}