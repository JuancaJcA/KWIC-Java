/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huachimingos.kwic;

import com.huachimingos.kwic.kwic.KWIC;
import com.huachimingos.kwic.kwic.Line;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author juanca
 */
public class Home extends javax.swing.JFrame {

    private Line[] lines;
    private String[] books;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFile = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIndex = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));

        main.setBackground(new java.awt.Color(47, 49, 54));

        jLabel1.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Key Word in Context");
        jLabel1.setPreferredSize(new java.awt.Dimension(370, 45));

        btnFile.setBackground(new java.awt.Color(59, 165, 93));
        btnFile.setForeground(new java.awt.Color(255, 255, 255));
        btnFile.setText("Seleccionar Archivo");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(148, 156, 247));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtIndex.setColumns(20);
        txtIndex.setRows(5);
        jScrollPane1.setViewportView(txtIndex);

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane2.setViewportView(txtResult);

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(btnFile))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(txtSearch)
                                .addGap(26, 26, 26)
                                .addComponent(btnSearch)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFile)
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(66, 66, 66)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String search = txtSearch.getText().toLowerCase();
            String[] arrSearch = search.split(" ");
            int[] arrResult = new int[books.length];
            int kont = 0;

            for (int i = 0; i < arrResult.length; i++) {
                arrResult[i] = -1;
            }

            for (int i = 0; i < lines.length; i++) {
                String booksTitle = "";
                booksTitle += lines[i].getLine().toLowerCase();
                String[] arrLine = booksTitle.split(" ");

                int c = 0;

                for (int j = 0; j < arrSearch.length; j++) {
                    if (arrLine.length >= arrSearch.length) {
                        /*for (int k = 0; k < arrLine.length; k++) {
                            if (arrSearch[j].equals(arrLine[k])) {
                                c++;
                                break;
                            }
                        }*/
                        
                        if (arrSearch[j].equals(arrLine[j])) {
                            c++;
                        }
                    }               
                }
                
                if (c == arrSearch.length) {
                    arrResult[kont] = lines[i].getIndex();
                    kont++;
                    /*int bookIndex = lines[i].getIndex();
                    boolean isAddedBook = false;

                    for (int j = 0; j < arrResult.length; j++) {
                       if (arrResult[j] == bookIndex) {
                           isAddedBook = true;
                           break;
                       }
                    }

                    if (!isAddedBook)
                    {
                        arrResult[kont] = lines[i].getIndex();
                        kont++;
                    }
                    */
                }
            }
            int kontArr = 0;
            for (int i = 0; i < arrResult.length; i++) {
                if (arrResult[i] >= 0) {
                    kontArr++;
                }
            }

            String[] arrBooksResult = new String[kontArr];
            for (int i = 0; i < kontArr; i++) {
                for (int j = 0; j < books.length; j++) {
                    if (arrResult[i] == j) {
                        arrBooksResult[i] = books[j];
                    }
                }
            }

            String res = "";
            for (int i = 0; i < arrBooksResult.length; i++) {
                res += (i + 1) + ": " + arrBooksResult[i] + "\n";
            }
            txtResult.setText(res);
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        // TODO add your handling code here:
        String curDir = System.getProperty("user.dir");
        File userDir = new File(curDir);
        JFileChooser chooser = new JFileChooser(userDir);

        chooser.setDialogTitle("Select a .txt file");

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            KWIC kwic = new KWIC(file);
            lines = kwic.getOutput().getLines();
            books = kwic.getCharacters().getLines();

            String booksTxt = "";
            for (int i = 0; i < kwic.getLineIndex().length; i++) {
                booksTxt += (i + 1) + ": " + kwic.getLineIndex()[i].getLine() + "\n";
            }
            txtIndex.setText(booksTxt);

        }
    }//GEN-LAST:event_btnFileActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel main;
    private javax.swing.JTextArea txtIndex;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
