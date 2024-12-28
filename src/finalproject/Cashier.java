package finalproject;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Cashier extends javax.swing.JFrame {

    ArrayList<ClassKs>ks;
    public Cashier(ArrayList<ClassKs>listks){
        ks=listks;
        initComponents();
        this.setLocationRelativeTo(null);
        setTextTotal();
    }
    
    public Cashier() {
        initComponents();
    }
    Connection con=null;
    Statement stat=null;
    ResultSet result=null;
    KsDB config= new KsDB();
    
    
    DecimalFormat df = new DecimalFormat("##.##");
    void setTextTotal(){
        double total=0;
        for(int i=0;i<ks.size();i++){
            total+=ks.get(i).Total();  // Total from class Double Total()
        }
        String formattedTotal = df.format(total);
        txt_total.setText(formattedTotal);
        txt_total.setText(String.valueOf(total));    //     កន្លែងកាត់ក្បៀសកន្លែង Total
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        txt_recieve = new javax.swing.JTextField();
        txt_return = new javax.swing.JTextField();
        txt_dis = new javax.swing.JComboBox<>();
        btnCash = new finalproject.MyButton();
        btnBack = new finalproject.MyButton();
        jLabel8 = new javax.swing.JLabel();

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

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 0));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(941, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Image\\cc1.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Cashing With KS");

        txt_total.setBackground(new java.awt.Color(153, 153, 255));
        txt_total.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_total.setForeground(java.awt.Color.white);
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Total");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Return");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("D%scount");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Payment");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Recieve");

        txt_pay.setBackground(new java.awt.Color(153, 153, 255));
        txt_pay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_pay.setForeground(java.awt.Color.white);
        txt_pay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_recieve.setBackground(new java.awt.Color(153, 153, 255));
        txt_recieve.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_recieve.setForeground(java.awt.Color.white);
        txt_recieve.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_recieve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_recieveKeyReleased(evt);
            }
        });

        txt_return.setBackground(new java.awt.Color(153, 153, 255));
        txt_return.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_return.setForeground(java.awt.Color.white);
        txt_return.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_returnActionPerformed(evt);
            }
        });

        txt_dis.setBackground(new java.awt.Color(153, 153, 255));
        txt_dis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_dis.setForeground(java.awt.Color.white);
        txt_dis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "50%" }));
        txt_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_disActionPerformed(evt);
            }
        });

        btnCash.setBackground(new java.awt.Color(102, 102, 255));
        btnCash.setBorder(null);
        btnCash.setForeground(java.awt.Color.white);
        btnCash.setText("Cash");
        btnCash.setBorderColor(new java.awt.Color(153, 102, 255));
        btnCash.setColor(new java.awt.Color(102, 102, 255));
        btnCash.setColorOver(new java.awt.Color(0, 204, 51));
        btnCash.setFocusPainted(false);
        btnCash.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCash.setRadius(30);
        btnCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashActionPerformed(evt);
            }
        });

        btnBack.setBorder(null);
        btnBack.setForeground(java.awt.Color.black);
        btnBack.setText("Back");
        btnBack.setBorderColor(new java.awt.Color(255, 102, 102));
        btnBack.setBorderPainted(false);
        btnBack.setColor(new java.awt.Color(255, 204, 204));
        btnBack.setColorOver(new java.awt.Color(255, 51, 51));
        btnBack.setFocusPainted(false);
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setRadius(30);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Image\\Cash11.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)
                        .addGap(107, 107, 107))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(280, 280, 280))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_return, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                    .addComponent(txt_recieve, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(77, 77, 77)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_pay, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_dis, 0, 200, Short.MAX_VALUE)
                                        .addComponent(txt_total)))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(33, 33, 33)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)
                                    .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(29, 29, 29)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_recieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8))
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_returnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_returnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //Back to KsForm
        new KsForm(KsForm.email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txt_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_disActionPerformed
        // dis %
        
        DecimalFormat fm = new DecimalFormat("#.##");
        double total=Double.parseDouble(txt_total.getText());
        double pay,dis;
        int index=txt_dis.getSelectedIndex();
        switch(index){
            case 1:{
                dis=total*10/100;
                pay=total-dis;
                break;
            }
            case 2:{
                dis=total*20/100;
                pay=total-dis;
                break;
            }
            case 3:{
                dis=total*30/100;
                pay=total-dis;
                break;
            }
            case 4:{
                dis=total*50/100;
                pay=total-dis;
                break;
            }
            default :{
                dis=0;
                pay=total-dis;
                break;
            }
        }
//        ttdis.setText(String.valueOf(fm.format(dis)));
        txt_pay.setText(String.valueOf(fm.format(pay)));
        
    }//GEN-LAST:event_txt_disActionPerformed

    private void txt_recieveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_recieveKeyReleased
        try {
            double payment=Double.parseDouble(txt_pay.getText());
            double recieve=Double.parseDouble(txt_recieve.getText());
            double ret= recieve-payment; // ret to rett edit minh
            txt_return.setText(String.format("%.2f", ret));
        } catch (Exception e) {
            txt_return.setText("0.00");
            System.out.print("Invalid Input "+e.getMessage());
        }
    }//GEN-LAST:event_txt_recieveKeyReleased

    private void btnCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashActionPerformed
        // Cashing
        
        try {
            double total =Double.parseDouble(txt_total.getText());
            System.out.println(total);
            String dis=(String) txt_dis.getSelectedItem();
            dis=dis.substring(0,2);
            System.out.println(dis);
            int discount =Integer.parseInt(dis);
//            double disprice=Double.parseDouble(ttdis.getText());
            double payment =Double.parseDouble(txt_pay.getText());
            double recieve =Double.parseDouble(txt_recieve.getText());
            double Return= Double.parseDouble(txt_return.getText());
            
            
            Map<String,Object> par=new HashMap<>();
            par.put("total", total);
            par.put("discount", discount);
            par.put("paymentt", payment);
            par.put("rec", recieve);
            par.put("ret", Return);
            
            List<Map<String, Object>> data = new ArrayList<>();
            ClassKs item;
            
            for(int i=0;i<ks.size();i++){
                item=ks.get(i);
                Map<String, Object> row= new HashMap<>();    // create new Map for each iteration
                row.put("Name", item.getName());
                row.put("Qty", item.getQty());
                row.put("Price", item.getPrice());
                data.add(row);
                
                System.out.println("Name: "+item.getName());
                System.out.println("Qty: "+item.getQty());
                System.out.println("Price: "+item.getPrice());
                System.out.println("Total: "+item.Total());
                System.out.println("Email: "+KsForm.email);  // UserEmial or email
                
                con=config.connected();
                String sql=" INSERT INTO KsPRODUCT(ID, Name, Qty, Price, Total, Email)"
                        + "VALUES ("
                        + "null,"
                        +"'"+item.getName()+"',"
                        +"'"+item.getQty()+"',"
                        +"'"+item.getPrice()+"',"
                        +"'"+item.Total()+"',"
//                        +"'"+item.Total()+"',"
                        +"'"+KsForm.email+"'"
                        +")";
                try {
                    stat=con.prepareStatement(sql);
                    stat.executeUpdate(sql);
                } catch (Exception e) {
                    System.out.println("Error "+e.getMessage());
                }
            }
            
            String path="C:/Users/pc/Documents/NetBeansProjects/FinalProject/src/reportR/RangeRover.jrxml";
            JasperReport jasper = JasperCompileManager.compileReport(path);
            JRBeanCollectionDataSource dataSource= new JRBeanCollectionDataSource(data);
            JasperPrint jasperPrint= JasperFillManager.fillReport(jasper, par, dataSource);
//            JasperPrintManager.printReport(jasperPrint, true);
            JasperViewer.viewReport(jasperPrint,false);
            ClassKs.listks.clear();
            
            
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }//GEN-LAST:event_btnCashActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproject.MyButton btnBack;
    private finalproject.MyButton btnCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JComboBox<String> txt_dis;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_recieve;
    private javax.swing.JTextField txt_return;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
