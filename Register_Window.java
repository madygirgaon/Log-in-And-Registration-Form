/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregistrationproject;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class Register_Window extends javax.swing.JFrame {

    /**
     * Creates new form Register_Window
     */
    ButtonGroup bg;
    MySQLConnect myc;
    public Register_Window() {
        initComponents();
        bg=new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        jRadioButtonMale.setSelected(true);
        myc=new MySQLConnect();
        
    }

    String photopath=null;
    public ImageIcon resizeImageIcon(String photopath,byte[] photo){
        ImageIcon myphoto=null;
        if(photopath !=null){
            myphoto=new ImageIcon(photopath);
                    
        }
        else{
            myphoto=new ImageIcon(photo);
        }
        Image img=myphoto.getImage();
        Image img1=img.getScaledInstance(label_photo.getWidth(),
                label_photo.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ph=new ImageIcon(img1);
        return ph;
    
    
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        UploadImageButton = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmailid = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPasswordFieldConifrmPass = new javax.swing.JPasswordField();
        jTextFieldMobileNo = new javax.swing.JTextField();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();
        label_photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("  Register New User");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ag.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("A.G.Patil College Institute Of Technology,     18/ [2 A 2] 2 ,Pratap Nagar , Opp.SRP Camp Vijapur Road, Solapur, Maharashtra, India. Pin code: 413008");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Full Name :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email -id :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Confirm Password :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Mobile Number :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Gender :");

        UploadImageButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UploadImageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-folder-48.png"))); // NOI18N
        UploadImageButton.setText("Select Image");
        UploadImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageButtonActionPerformed(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(0, 0, 255));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(255, 204, 0));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(51, 51, 51));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("     Click Here To Login ");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Date Of Birth :");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(255, 102, 102));
        jTextFieldName.setText("Enter Full Name");

        jTextFieldEmailid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEmailid.setForeground(new java.awt.Color(255, 102, 102));
        jTextFieldEmailid.setText("Enter Email Id");
        jTextFieldEmailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailidActionPerformed(evt);
            }
        });

        jPasswordFieldPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordFieldPass.setForeground(new java.awt.Color(255, 102, 102));
        jPasswordFieldPass.setText("Enter password");

        jPasswordFieldConifrmPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordFieldConifrmPass.setForeground(new java.awt.Color(255, 102, 102));
        jPasswordFieldConifrmPass.setText("Confirm password");
        jPasswordFieldConifrmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConifrmPassActionPerformed(evt);
            }
        });

        jTextFieldMobileNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMobileNo.setForeground(new java.awt.Color(255, 102, 102));
        jTextFieldMobileNo.setText("Enter Mobile Number");
        jTextFieldMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMobileNoActionPerformed(evt);
            }
        });

        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        jRadioButtonMale.setText("Male");

        jDateChooserDOB.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UploadImageButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldName)
                        .addComponent(jTextFieldEmailid)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButtonFemale))
                        .addComponent(jDateChooserDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldConifrmPass, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldPass)
                        .addComponent(jTextFieldMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label_photo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordFieldConifrmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonMale)
                        .addComponent(jRadioButtonFemale)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jDateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(UploadImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //selected to be displayed in label_photo 
    private void UploadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageButtonActionPerformed
        JFileChooser chooser=new JFileChooser();

        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fnef=new FileNameExtensionFilter("images","jpg","png");
        chooser.addChoosableFileFilter(fnef);
        
        int ans=chooser.showSaveDialog(null);
        
        if(ans==JFileChooser.APPROVE_OPTION){
            File selectedPhoto=chooser.getSelectedFile();
                    String path=selectedPhoto.getAbsolutePath();
                    label_photo.setIcon(resizeImageIcon(path,null));
                    this.photopath=path;
        }
        else
        {
            
            System.out.println("Photo not Selected!!!!\n");
            
        }
          
                    
    }//GEN-LAST:event_UploadImageButtonActionPerformed
//Logic to save/insert the user information in the  table 
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        String name=jTextFieldName.getText();
        String email=jTextFieldEmailid.getText();
        String pass=jPasswordFieldPass.getText();
        String CPass=jPasswordFieldConifrmPass.getText();
        String mob=jTextFieldMobileNo.getText();
        String gen="Male";
        if(jRadioButtonFemale.isShowing()){
            gen="Female";
            
             
        }
        Date dob=jDateChooserDOB.getDate();
        
        //apply the validation logic for checking all controls are empty or not
        if(name.trim().equals("")|| name.trim().equals("Enter Full Name") ||
           email.trim().equals("") || email.trim().equals("Enter Email Id")||
           pass.trim().equals("")|| pass.trim().equals("Enter password")||
           CPass.trim().equals("")|| CPass.trim().equals("Confirm password")||
           mob.trim().equals("") || mob.trim().equals("Enter Mobile Number"))
        
        {
            JOptionPane.showMessageDialog(null,"All Fields Are Compulsory Kindly Check Missing Field in Registration Form");
        }else if(pass.equals(CPass)){
                if(dob==null){ //If dob not selected
                    JOptionPane.showMessageDialog(null,"Please Enter Date Of Birth");
                    jDateChooserDOB.grabFocus();
                }else{
                    //if everyrthing if fine
                    //All swing control fields has been selected
                    //then we can save /insert / register user into database table
                    JOptionPane.showMessageDialog(null, "All Fields are filled");
                    
                    //to check whether email id and user id is already used or not
                    try{
                        
                        Connection con=myc.getConn();
                        String chkEmail="select name from users where email=?";
                        PreparedStatement pst=con.prepareStatement(chkEmail);
                        pst.setString(1,email);
                        ResultSet rs=pst.executeQuery();
                        if(rs.next()){ //Email id has been already taken then we need to ask
                            // to choose another mail id / different email id
                            JOptionPane.showMessageDialog(null,"This"+ email+"  Email id" + 
                                    "  has been already registered/taken by " + " "
                                    + "other user please choose another email");
                            
                            jTextFieldEmailid.setText("");
                            jTextFieldEmailid.grabFocus();
                            
                            
                        }
                        else{
                            String saveQry="insert into users (name,email,password,mobile,gender,dob,photo) values (?,?,?,?,?,?,?)";
                            pst=con.prepareStatement(saveQry);
                            pst.setString(1,name);
                            pst.setString(2,email);
                            pst.setString(3,pass);
                            pst.setString(4,mob);
                            pst.setString(5,gen);
                            
                            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                            String dob1=sdf.format(jDateChooserDOB.getDate());
                            pst.setString(6,dob1);
                            
                            InputStream is=new FileInputStream(new File(photopath));
                            pst.setBlob(7, is);
                            
                            int i=pst.executeUpdate();
                            if(i>=1){
                                JOptionPane.showMessageDialog(null,"User Registration" +
                                        "SuccessFul with User Id as Email id " +email);
                                jButtonResetActionPerformed(evt);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"User Registration" +
                                        "Failed  with User Id as Email id "+ email+" Try Again");
                                
                            }
                        }
                                
                    }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null," User Not Insertede/Saved Expection e email:"+ e);
                }
                }//DOB else block
                
        }// pass==Cpass  
        else{
            JOptionPane.showMessageDialog(null,"Password and Confirm password are not same");
            jPasswordFieldPass.setText("");
            jPasswordFieldConifrmPass.setText("");
            
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed
              
                
}
    
    private void jTextFieldEmailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailidActionPerformed

    private void jPasswordFieldConifrmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConifrmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConifrmPassActionPerformed

    private void jTextFieldMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMobileNoActionPerformed
//REset the all the swing controls
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextFieldName.setText("");
        jTextFieldEmailid.setText("");
        jTextFieldMobileNo.setText("");
        jPasswordFieldPass.setText("");
        jPasswordFieldConifrmPass.setText("");
        jDateChooserDOB.setDate(null);
       
         bg.clearSelection();
        label_photo.setIcon(resizeImageIcon("/image/user.png",null));
    }//GEN-LAST:event_jButtonResetActionPerformed
  //To close current Registration  form and open log in form
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
            Login_Window lw=new Login_Window();
            lw.show();
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadImageButton;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonReset;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldConifrmPass;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextFieldEmailid;
    private javax.swing.JTextField jTextFieldMobileNo;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JLabel label_photo;
    // End of variables declaration//GEN-END:variables

    void sh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
