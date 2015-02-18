import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class TheFrame extends javax.swing.JFrame {

    
    public TheFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        middleRotor = new javax.swing.JTextField();
        innerRotor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        plainText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cipherText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ManualRadio = new javax.swing.JRadioButton();
        AutoRadio = new javax.swing.JRadioButton();
        EncryptButton = new javax.swing.JButton();
        DecryptButton = new javax.swing.JButton();
        cipherTextClear = new javax.swing.JButton();
        plainTextClear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enigma Machine");

        jLabel1.setText("Middle Rotor");

        jLabel2.setText("Inner Rotor");

        plainText.setColumns(20);
        plainText.setRows(5);
        jScrollPane1.setViewportView(plainText);

        cipherText.setColumns(20);
        cipherText.setRows(5);
        jScrollPane2.setViewportView(cipherText);

        jLabel3.setText("Plain Text");

        jLabel4.setText("Cipher Text");

        buttonGroup1.add(ManualRadio);
        ManualRadio.setSelected(true);
        ManualRadio.setText("Manual");
        ManualRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(AutoRadio);
        AutoRadio.setText("Automatic");
        AutoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadUserFile(evt);
            }
        });

        EncryptButton.setText("Encrypt ->");
        EncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptPlainText(evt);
            }
        });

        DecryptButton.setText("<- Decrypt");
        DecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptCipherText(evt);
            }
        });

        cipherTextClear.setText("Clear ->");
        cipherTextClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCipherText(evt);
            }
        });

        plainTextClear.setText("<- Clear");
        plainTextClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPlainText(evt);
            }
        });

        jButton5.setText("Save Message");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMessage(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(middleRotor, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(innerRotor, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cipherTextClear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plainTextClear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel3)
                .addGap(143, 143, 143)
                .addComponent(ManualRadio)
                .addGap(2, 2, 2)
                .addComponent(AutoRadio)
                .addGap(143, 143, 143)
                .addComponent(jLabel4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(middleRotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(innerRotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EncryptButton)
                        .addGap(6, 6, 6)
                        .addComponent(DecryptButton)
                        .addGap(35, 35, 35)
                        .addComponent(cipherTextClear)
                        .addGap(6, 6, 6)
                        .addComponent(plainTextClear)
                        .addGap(33, 33, 33)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManualRadio)
                            .addComponent(AutoRadio))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManualRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualRadioActionPerformed
       
    }//GEN-LAST:event_ManualRadioActionPerformed

    private void ReadUserFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadUserFile
        try
        {
            String fileName = JOptionPane.showInputDialog("File name?");
             File theFile = new File(fileName);
             Scanner inputFile = new Scanner(theFile);
        
             String userMessage = inputFile.nextLine();
             
            String message = "Does this file contain plain text?";
            String title = "Plain text";
        
            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
            
            if (reply == JOptionPane.YES_OPTION)
            {
                plainText.setText(userMessage);
            }
            else
            {
                cipherText.setText(userMessage);
            }    
         }catch(Exception e){}
        
        ManualRadio.setSelected(true);
    }//GEN-LAST:event_ReadUserFile

    private void clearPlainText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPlainText
        
        plainText.setText("");
        
    }//GEN-LAST:event_clearPlainText

    private void clearCipherText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCipherText
    
        cipherText.setText("");
        
    }//GEN-LAST:event_clearCipherText

    private void EncryptPlainText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptPlainText
       
        String middleRing = middleRotor.getText();
        String innerRing = innerRotor.getText();
        String messageToEncrypt = plainText.getText();
        
        StringBuffer yay = new StringBuffer();
        
        ThreeRingDisk machine = new ThreeRingDisk();
        machine.setMiddle(middleRing);
        machine.setInner(innerRing);
        
        
        for(int i = 0; i < messageToEncrypt.length(); i++)
        {
            yay.append(machine.encrypt(messageToEncrypt.charAt(i)));
        }    
        
        String cipher = yay.toString();
        
       cipherText.setText(cipher); 
        
    }//GEN-LAST:event_EncryptPlainText

    private void DecryptCipherText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptCipherText
       
        String middleRing = middleRotor.getText();
        String innerRing = innerRotor.getText();
        String messageToDecrypt = cipherText.getText();
  
        StringBuffer yay = new StringBuffer();
        
        ThreeRingDisk machine = new ThreeRingDisk();
        machine.setMiddle(middleRing);
        machine.setInner(innerRing);
        
        for(int i = 0; i < messageToDecrypt.length(); i++)
        {
            yay.append(Character.toString(machine.decrypt(messageToDecrypt.charAt(i))));
        }
        
        String cipher = yay.toString();
        
        plainText.setText(cipher); 
            
    }//GEN-LAST:event_DecryptCipherText

    private void SaveMessage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMessage
        
        String message = "Do you want to save the plain text?";
        String title = "Save";
        
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        try{
            if (reply == JOptionPane.YES_OPTION) 
            {
                String fileName = JOptionPane.showInputDialog("File name?");
          
                PrintWriter outputFile = new PrintWriter(fileName);
                outputFile.println(plainText.getText());
                outputFile.close();
            }
            else 
            {   
                String fileName = JOptionPane.showInputDialog("File name?");
           
                PrintWriter outputFile = new PrintWriter(fileName);
                outputFile.println(cipherText.getText());
                outputFile.close();
                }
          }catch(Exception e){} 
    }//GEN-LAST:event_SaveMessage

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AutoRadio;
    private javax.swing.JButton DecryptButton;
    private javax.swing.JButton EncryptButton;
    private javax.swing.JRadioButton ManualRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea cipherText;
    private javax.swing.JButton cipherTextClear;
    private javax.swing.JTextField innerRotor;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField middleRotor;
    private javax.swing.JTextArea plainText;
    private javax.swing.JButton plainTextClear;
    // End of variables declaration//GEN-END:variables
}
