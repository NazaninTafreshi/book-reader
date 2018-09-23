/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Nazanin
 */
public class GUI extends javax.swing.JFrame {
    
    static GUI GUI = new GUI();
    BookSearchResult book;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    
    public void setProgress(int percentage) {
        jProgressBar1.setValue(percentage);
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        cover = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        author = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        pages = new javax.swing.JLabel();
        rates = new javax.swing.JLabel();
        language = new javax.swing.JLabel();
        publish = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        story = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        quote = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nazanin BookReader");

        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        jButton1.setText("Search");
        jButton1.setFocusPainted(false);
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.EAST);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Search :");
        jPanel1.add(jLabel1, java.awt.BorderLayout.WEST);
        jPanel1.add(jTextField1, java.awt.BorderLayout.CENTER);

        author.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        author.setText("Author");

        title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        title.setText("Title");

        pages.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pages.setText("Pages");

        rates.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rates.setText("Rates");

        language.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        language.setText("Language");

        publish.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        publish.setText("Publish");

        jProgressBar1.setMaximumSize(new java.awt.Dimension(146, 14));
        jProgressBar1.setMinimumSize(new java.awt.Dimension(146, 14));
        jProgressBar1.setStringPainted(true);

        story.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        story.setContentType("text/html"); // NOI18N
        story.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        story.setToolTipText("Book Story");
        jScrollPane2.setViewportView(story);

        quote.setEditable(false);
        quote.setBackground(javax.swing.UIManager.getDefaults().getColor("TextField.inactiveBackground"));
        quote.setContentType("text/html"); // NOI18N
        quote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quote.setText("");
        quote.setToolTipText("quote");
        jScrollPane1.setViewportView(quote);

        jButton2.setText("New Quote");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(pages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(publish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(language, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(author)
                        .addGap(18, 18, 18)
                        .addComponent(pages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rates)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(publish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(language))
                    .addComponent(cover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> readUrl = null;
        System.out.println("jTextField1.getText() = " + jTextField1.getText());
        Search searchEngine = new Search(jTextField1.getText());
        searchEngine.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        quote.setText("\""+book.getQuotes().get(new Random().nextInt(book.getQuotes().size() - 1))+"\"");
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void setResult(BookSearchResult book) {
//        try {
//            JsonParser parser = new JsonParser();
//            System.out.println("readUrl.get(0) = " + readUrl.get(0));
//            String asString = parser.parse(readUrl.get(0)).getAsJsonArray().get(0).getAsJsonObject().get("mainUrl").getAsString();
//           // System.err.println(asString);
//            URL url = new URL(asString);
//            Image image = ImageIO.read(url);
//           // System.out.println("image = " + image);
//            cover.setIcon(new ImageIcon(image));
////           GUI.repaint();
//
//            title.setText("Title : " + readUrl.get(1));
//            author.setText("Author : " + readUrl.get(2));
//            rates.setText("Rates : " + readUrl.get(4) + "/5");
//            pages.setText("Pages : " + readUrl.get(5));
//            publish.setText("Publish : " + readUrl.get(6));
//            language.setText("Language : " + readUrl.get(7));
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        
        URL url;
        try {
            url = new URL(book.getCover());
            Image image = ImageIO.read(url);
            cover.setIcon(new ImageIcon(image));
        } catch (Exception ex) {
        }
        this.book=book;
        title.setText("Title : " + book.getTitle());
        author.setText("Author : " + book.getAuthorName());
        rates.setText("Rates : " + book.getRating() + "/5");
        pages.setText("Pages : " + book.getNum_pages());
        publish.setText("Publish : " + book.getPublication_year());
        language.setText("Language : " + book.getLanguage_code());
        story.setText("Story : " + book.getDescription());
        quote.setText("\""+book.getQuotes().get(new Random().nextInt(book.getQuotes().size() - 1))+"\"");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JLabel cover;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel language;
    private javax.swing.JLabel pages;
    private javax.swing.JLabel publish;
    private javax.swing.JTextPane quote;
    private javax.swing.JLabel rates;
    private javax.swing.JTextPane story;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}