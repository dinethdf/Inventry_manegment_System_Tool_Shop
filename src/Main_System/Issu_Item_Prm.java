package Main_System;

import Main_System.Product_Select;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Issu_Item_Prm extends javax.swing.JFrame {
    public Issu_Item_Prm() {
        initComponents();
        data_load();
        Con_select_B.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Product = new javax.swing.JTable();
        Submit_Data = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Con_Id = new javax.swing.JLabel();
        Con_Fname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Time_T = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Inv_Id = new javax.swing.JLabel();
        Con_select_B = new javax.swing.JButton();
        Add_P = new javax.swing.JButton();
        Delete_P = new javax.swing.JButton();
        Delete_All = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tot_P = new javax.swing.JLabel();
        Tot_Q = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Issue");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        Table_Product.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Table_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "QTY"
            }
        ));
        jScrollPane1.setViewportView(Table_Product);

        Submit_Data.setBackground(new java.awt.Color(255, 255, 153));
        Submit_Data.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        Submit_Data.setForeground(new java.awt.Color(0, 0, 0));
        Submit_Data.setText("Issue");
        Submit_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_DataActionPerformed(evt);
            }
        });
        Submit_Data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Submit_DataKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Submit_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Consumer :-");

        Con_Id.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Con_Id.setText("Select");
        Con_Id.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Con_IdPropertyChange(evt);
            }
        });

        Con_Fname.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Con_Fname.setText("Consumer");
        Con_Fname.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Con_FnamePropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("Date : -");

        Time_T.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Time_T.setText("MNT001");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Invoise No :-");

        Inv_Id.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Inv_Id.setText("00");

        Con_select_B.setBackground(new java.awt.Color(51, 0, 102));
        Con_select_B.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Con_select_B.setForeground(new java.awt.Color(255, 255, 153));
        Con_select_B.setText("Select Consumer");
        Con_select_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Con_select_BActionPerformed(evt);
            }
        });
        Con_select_B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Con_select_BKeyPressed(evt);
            }
        });

        Add_P.setBackground(new java.awt.Color(204, 255, 204));
        Add_P.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Add_P.setForeground(new java.awt.Color(0, 0, 0));
        Add_P.setText("Add Product");
        Add_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_PActionPerformed(evt);
            }
        });
        Add_P.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Add_PKeyPressed(evt);
            }
        });

        Delete_P.setBackground(new java.awt.Color(255, 102, 102));
        Delete_P.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Delete_P.setForeground(new java.awt.Color(0, 0, 0));
        Delete_P.setText("Delete Product");
        Delete_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PActionPerformed(evt);
            }
        });

        Delete_All.setBackground(new java.awt.Color(255, 51, 51));
        Delete_All.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Delete_All.setForeground(new java.awt.Color(255, 255, 255));
        Delete_All.setText("Remove All");
        Delete_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_AllActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Total Product :-");

        Tot_P.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Tot_P.setText("00");
        Tot_P.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tot_PPropertyChange(evt);
            }
        });

        Tot_Q.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Tot_Q.setText("00");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Total QTY :-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Time_T, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Con_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Con_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(Con_select_B))
                            .addComponent(Inv_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tot_P, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(Tot_Q, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delete_All, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete_P)
                            .addComponent(Add_P, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Con_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Con_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Con_select_B, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time_T, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inv_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add_P, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Delete_P)
                                .addGap(18, 18, 18)
                                .addComponent(Delete_All))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tot_P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tot_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(169, 169, 169))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_PActionPerformed
        // TODO add your handling code here:
        Product_Select Pselect = new Product_Select() ;
        Pselect.setVisible(true);
        Pselect.pack();
        Pselect.setLocationRelativeTo(null);
        Pselect.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_Add_PActionPerformed

    private void Delete_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PActionPerformed
        // TODO add your handling code here:
           try {
            DefaultTableModel dt = (DefaultTableModel) Table_Product.getModel();
            int rw = Table_Product.getSelectedRow();
            dt.removeRow(rw);     
        } catch (Exception e) {
        } 
           cart_total();
    }//GEN-LAST:event_Delete_PActionPerformed

    private void Delete_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_AllActionPerformed
               DefaultTableModel dt = (DefaultTableModel) Table_Product.getModel();
               dt.setRowCount(0);
         cart_total();
    }//GEN-LAST:event_Delete_AllActionPerformed

    private void Con_select_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Con_select_BActionPerformed
        // TODO add your handling code here:
        addConsumer_Select();
    }//GEN-LAST:event_Con_select_BActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void Con_select_BKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Con_select_BKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
          try {
               addConsumer_Select();
//                Product_Select Pselect = new Product_Select() ;
//                Pselect.setVisible(true);
//                Pselect.pack();
//                Pselect.setLocationRelativeTo(null);
//                Pselect.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
                }
          catch (Exception e) { }
        }   
    }//GEN-LAST:event_Con_select_BKeyPressed

    private void Submit_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_DataActionPerformed
               send_data_dataBase();
               setVisible(false);   
        //       new Issu_Item_Prm().setVisible(true);   
    }//GEN-LAST:event_Submit_DataActionPerformed

    private void Con_IdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Con_IdPropertyChange
        Add_P.requestFocus();      
    }//GEN-LAST:event_Con_IdPropertyChange

    private void Con_FnamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Con_FnamePropertyChange
    }//GEN-LAST:event_Con_FnamePropertyChange

    private void Add_PKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Add_PKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_F2) {
                 Product_Select Pselect = new Product_Select() ;
                 Pselect.setVisible(true);
                 Pselect.pack();
                 Pselect.setLocationRelativeTo(null);
                 Pselect.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
          }
    }//GEN-LAST:event_Add_PKeyPressed

    private void Submit_DataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Submit_DataKeyPressed
          if (evt.getKeyCode()==KeyEvent.VK_ENTER) {   
                send_data_dataBase();
                setVisible(false);   
                new Issu_Item_Prm().setVisible(true);
          }
    }//GEN-LAST:event_Submit_DataKeyPressed

    private void Tot_PPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tot_PPropertyChange
          Submit_Data.requestFocus();
    }//GEN-LAST:event_Tot_PPropertyChange
   
    public static void AddRowToTable (Object[] dataRow)
     {
         DefaultTableModel model_1 = (DefaultTableModel) Table_Product.getModel();
         model_1.addRow(dataRow);  
         cart_total();
     }
    
        public static void AddConsumer (Object[] dataRow1)
     {
        // DefaultTableModel model_1 = (DefaultTableModel) Table_Product.getModel();
        // model_1.addRow(dataRow);  
       //  cart_total();
      //   String set1 = (String) dataRow1[0];
         Con_Id.setText((String) dataRow1[0]);
         Con_Fname.setText((String) dataRow1[1]);
     }
    public void addConsumer_Select()
     {       Consumer_Select SelectCon = new  Consumer_Select();
              SelectCon.setVisible(true);
             // dispose();
            //  setVisible(false);   
              SelectCon.pack();
              SelectCon.setLocationRelativeTo(null);
              SelectCon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
     }
    
     public static void data_load(){
         
         // get date and time
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
           LocalDateTime now = LocalDateTime.now();  
           Time_T.setText(dtf.format(now));   
           
           
       // load last invoice number
        try {   
          Statement s = databaseCon.connection().createStatement();
          ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE e_id  =1");
          
          if (rs.next()) {     
              Inv_Id.setText(rs.getString("prm_last_Invoice"));
          }
          } catch (Exception e) {  }
        
         int i = Integer.parseInt(Inv_Id.getText());
         i++;
        Inv_Id.setText(String.valueOf(i));
      
        
        // Add item to table collom zero
        
           try {
                    Statement tabledatReset =databaseCon.connection().createStatement(); 
                    ResultSet ResetDat = tabledatReset.executeQuery("SELECT * FROM tools WHERE IsAddTbl = '1' ");
                          while (ResetDat.next()) {                
                              String P_id =ResetDat.getString(2);    
                              Statement tableValReset =databaseCon.connection().createStatement(); 
                              tableValReset.executeUpdate("UPDATE  tools SET Add_table_qty='0' WHERE Item_Code = '"+P_id+"'");
                              tableValReset.executeUpdate("UPDATE  tools SET IsAddTbl='0' WHERE Item_Code = '"+P_id+"'");
                           }
                 }                                   
            catch (SQLException e) {   System.out.println(e); }
    
      
     }  
     public static void cart_total(){
 
         int nmRow = Table_Product.getRowCount();
         int totals = 0;
    
        for (int i = 0; i < nmRow; i++) {      
            int values = Integer.valueOf(Table_Product.getValueAt(i, 2).toString());
            totals += values ;
        }
                Tot_P.setText(Integer.toString(nmRow));
                Tot_Q.setText(Integer.toString(totals));
   }  
     
      // ###########################################################################################################
     public void send_data_dataBase(){
    
      try {
            
          DefaultTableModel dt = (DefaultTableModel) Table_Product.getModel();
          int rc = dt.getRowCount();
          int Inv_nm = Integer.parseInt(Inv_Id.getText());
          
            for (int i = 0; i < rc; i++) {
                
                String inid = dt.getValueAt(i, 0).toString(); // get inid
                String P_name = dt.getValueAt(i, 1).toString(); // get product name
                String qty = dt.getValueAt(i, 2).toString(); // get product qty

                // cart DB
            
                  try {
                    Statement Qty_updt =databaseCon.connection().createStatement(); 
                    ResultSet qtyupdatetbl = Qty_updt.executeQuery("SELECT * FROM tools WHERE Item_Code ='"+inid+"'");
                    
                    
                           while (qtyupdatetbl.next()) {                
                                    int newValueQty = Integer.parseInt(qtyupdatetbl.getString(4)) - Integer.parseInt(qty) ;
                                       Statement qUpdate =databaseCon.connection().createStatement(); 
                                       qUpdate.executeUpdate("UPDATE  tools SET Qty='"+newValueQty+"' WHERE Item_Code = '"+inid+"'");
                     
                          }
                   }                                    
            catch (SQLException e) {    System.out.println(e); }
                           
              Statement s = databaseCon.connection().createStatement();
             s.executeUpdate(" INSERT INTO perm_order_item_list ( Invoice_Number, Item_Code, Item_Name, Qty, SPR) VALUES ('"+Inv_nm+"','"+inid+"','"+P_name+"','"+qty+"','') ");
             
            }
            
                JOptionPane.showMessageDialog(null, "Products Issue Is Complete");
            
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

        //@@@@@@@@@@@@@@@@@@@@@@@
            try {
             // Invoice DB
            int inv_id = Integer.parseInt(Inv_Id.getText());
            String empId  = Con_Id.getText();
            String empName = Con_Fname.getText();
            String date = Time_T.getText();
            int totProduct = Integer.parseInt(Tot_P.getText());           
            int totQty = Integer.parseInt(Tot_Q.getText());           
 
             Statement ss = databaseCon.connection().createStatement();
             ss.executeUpdate("INSERT INTO pernamat_iss_invoice(Invoice_ID, Emp_ID, Emp_Name, Date, Tot_Product, Qty, SPr, Spr1) VALUES('"+inv_id+"','"+empId+"','"+empName+"','"+date+"','"+totProduct+"','"+totQty+"','','')");
  
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
  
        // save las inid number
        try {
             int inv_id = Integer.parseInt(Inv_Id.getText());
            Statement s = databaseCon.connection().createStatement();
            s.executeUpdate("UPDATE  extra SET prm_last_Invoice='"+inv_id+"' WHERE e_id = 1");

        } catch (SQLException e) {
            System.out.println(e);
        }  
    //@@@@@@@@@@@@@@@@@@@@@@@

    }                                        

    
     // ###########################################################################################################
     

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
            java.util.logging.Logger.getLogger(Issu_Item_Prm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issu_Item_Prm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issu_Item_Prm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issu_Item_Prm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new Issu_Item_Prm().setVisible(true);
             
               }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Add_P;
    public static javax.swing.JLabel Con_Fname;
    public static javax.swing.JLabel Con_Id;
    public static javax.swing.JButton Con_select_B;
    private javax.swing.JButton Delete_All;
    private javax.swing.JButton Delete_P;
    private static javax.swing.JLabel Inv_Id;
    private static javax.swing.JButton Submit_Data;
    private static javax.swing.JTable Table_Product;
    private static javax.swing.JLabel Time_T;
    public static javax.swing.JLabel Tot_P;
    public static javax.swing.JLabel Tot_Q;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
