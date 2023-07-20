package Main_System;

import Main_System.databaseCon;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product_Select extends javax.swing.JFrame {
    
    public Product_Select() {
        initComponents();
        Search_T.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addrtbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product_Select_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Search_T = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Add_P_Btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        P_Qty = new javax.swing.JTextField();
        P_Name_Lable = new javax.swing.JLabel();
        P_Id_Lable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P_Cat_Lable = new javax.swing.JLabel();
        Close_P_Selec = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        avlQ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Add Product");

        addrtbl.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(addrtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addrtbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Product_Select_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "Aval_QTY", "Catagory"
            }
        ));
        Product_Select_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Select_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product_Select_Table);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Search Hear");

        Search_T.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        Search_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TActionPerformed(evt);
            }
        });
        Search_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_TKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_TKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name  :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product ID  :");

        Add_P_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add_P_Btn.setText("Add Product");
        Add_P_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_P_BtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Qty :");

        P_Qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P_Qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                P_QtyKeyPressed(evt);
            }
        });

        P_Name_Lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        P_Id_Lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Product Cat :");

        P_Cat_Lable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Close_P_Selec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close_P_Selec.setText("Close");
        Close_P_Selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_P_SelecActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Avl QTY :");

        avlQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P_Id_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P_Name_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P_Cat_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(avlQ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Add_P_Btn)
                                        .addGap(29, 29, 29)
                                        .addComponent(Close_P_Selec)))))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(P_Id_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P_Name_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(P_Cat_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(avlQ, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_P_Btn)
                    .addComponent(Close_P_Selec))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 159, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search_T, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_T, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_TActionPerformed

    private void Search_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TKeyReleased
        String Result_P = Search_T.getText();
        try {       
             DefaultTableModel Table_Presult = (DefaultTableModel) Product_Select_Table.getModel();
             Table_Presult.setRowCount(0);
             Statement P_Select =databaseCon.connection().createStatement();
             ResultSet Result_Product_Set = P_Select.executeQuery("SELECT * FROM tools WHERE Item_Code LIKE '%"+Result_P+"%' ");
            
            while (Result_Product_Set.next()) {                
                Vector P_List = new Vector();
                P_List.add(Result_Product_Set.getString(2));
                P_List.add(Result_Product_Set.getString(3));
                P_List.add(Result_Product_Set.getString(4));
                P_List.add(Result_Product_Set.getString(5));
                
                Table_Presult.addRow(P_List);  
                }

              } catch (Exception e) { }
        
    }//GEN-LAST:event_Search_TKeyReleased

    private void Product_Select_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Select_TableMouseClicked
            int r = Product_Select_Table.getSelectedRow();    
          String P_id  = Product_Select_Table.getValueAt(r, 0).toString();
                try {
                     Statement P_Select =databaseCon.connection().createStatement(); 
                     ResultSet Result_Product_Set = P_Select.executeQuery("SELECT * FROM tools WHERE Item_Code LIKE '%"+P_id+"%' ");
                        while (Result_Product_Set.next()) {                
                             P_Id_Lable.setText(Result_Product_Set.getString(2));    
                             P_Name_Lable.setText(Result_Product_Set.getString(3));
                           P_Cat_Lable.setText(Result_Product_Set.getString(5));
                             addrtbl.setText(Result_Product_Set.getString(8));
                             avlQ.setText(Result_Product_Set.getString(4));
                           }
                 }                                   
            catch (SQLException e) { }
            P_Qty.requestFocus();
    }//GEN-LAST:event_Product_Select_TableMouseClicked

    private void Add_P_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_P_BtnActionPerformed
     
        if(! P_Qty.getText().equals("") ) {
                 Product_send_list();
            }       else{
          System.out.println("QTY field is emty");    
            } 
        
    }//GEN-LAST:event_Add_P_BtnActionPerformed

    private void P_QtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_P_QtyKeyPressed
        // TODO add your handling code here:
     
            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
                
                 if(! P_Qty.getText().equals("") ) {
                 Product_send_list();
                } 
               else{
                   System.out.println("QTY field is emty");    
                } 
           }
    }//GEN-LAST:event_P_QtyKeyPressed

    private void Search_TKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TKeyPressed
    
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String Result_P = Search_T.getText();
                try {
                    Statement P_Select =databaseCon.connection().createStatement(); 
                    ResultSet Result_Product_Set = P_Select.executeQuery("SELECT * FROM tools WHERE Item_Code LIKE '%"+Result_P+"%' ");
                         while (Result_Product_Set.next()) {                
                             P_Id_Lable.setText(Result_Product_Set.getString(2));    
                             P_Name_Lable.setText(Result_Product_Set.getString(3));
                             P_Cat_Lable.setText(Result_Product_Set.getString(5));
                             addrtbl.setText(Result_Product_Set.getString(8));
                             avlQ.setText(Result_Product_Set.getString(4));
                           }
                 }                                   
            catch (SQLException e) { }
            P_Qty.requestFocus();
    }//GEN-LAST:event_Search_TKeyPressed
       
     if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);   
          }
    }
    private void Close_P_SelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_P_SelecActionPerformed
        // TODO add your handling code here:
           setVisible(false);   
             
    }//GEN-LAST:event_Close_P_SelecActionPerformed
    
    
    private void  Product_send_list () {
        
        String P_id  =  P_Id_Lable.getText();
          int Qty  =   Integer.parseInt(P_Qty.getText());
          int Avl_P_Qty  =  Integer.parseInt(avlQ.getText()) - Integer.parseInt(addrtbl.getText());
         
          int newAddRVal = Avl_P_Qty - Qty ;
         
          if (newAddRVal >= 0) {
            
                      Issu_Item_Prm.AddRowToTable(new Object[]{
              
              P_Id_Lable.getText(),
              P_Name_Lable.getText(),
              P_Qty.getText()}) ;
 int addtabletot = Integer.parseInt(addrtbl.getText()) + Qty ;
              System.out.println(Qty);
              System.out.println(Avl_P_Qty);
              System.out.println(newAddRVal);
              System.out.println(addtabletot);
          
          try {
          //   int inv_id = Integer.parseInt(Inv_Id.getText());
           Statement Q_set =databaseCon.connection().createStatement(); 
            Q_set.executeUpdate("UPDATE  tools SET Add_table_qty='"+addtabletot+"' WHERE Item_Code = '"+P_id+"'");
            Q_set.executeUpdate("UPDATE  tools SET IsAddTbl='1' WHERE Item_Code = '"+P_id+"'");
            

        } catch (SQLException e) {
            System.out.println(e);
        }  
                
                   
               P_Name_Lable.setText("");
               P_Id_Lable.setText("");
               P_Qty.setText("");
               Search_T.setText("");
               avlQ.setText("");
               addrtbl.setText("");
            

               DefaultTableModel Table_Presult = (DefaultTableModel) Product_Select_Table.getModel();
               Table_Presult.setRowCount(0);
               Search_T.requestFocus();   
        } else {
              System.out.println("Not Enough");
                JOptionPane.showMessageDialog(null, "Not Enough Qty");
          }
  
            
     }
    
    public void getaSetLables(){
        
    }
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
            java.util.logging.Logger.getLogger(Consumer_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consumer_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consumer_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consumer_Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Select().setVisible(true);

            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_P_Btn;
    private javax.swing.JButton Close_P_Selec;
    private javax.swing.JLabel P_Cat_Lable;
    private javax.swing.JLabel P_Id_Lable;
    private javax.swing.JLabel P_Name_Lable;
    private javax.swing.JTextField P_Qty;
    private static javax.swing.JTable Product_Select_Table;
    private javax.swing.JTextField Search_T;
    private javax.swing.JLabel addrtbl;
    private javax.swing.JLabel avlQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
