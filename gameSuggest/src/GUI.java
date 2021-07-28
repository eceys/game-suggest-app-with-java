import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jPopupMenu1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jPopupMenu1PopupMenuWillBecomeVisible(evt);
            }
        });

        jMenuItem1.setText("Remove");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator1);

        jMenuItem2.setText("Enabled");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Disable");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 600, 200));
        jDialog1.setResizable(false);

        jButton5.setText("Add Game");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Add Game With Steam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Add Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Select Random Game");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete All Game");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String[] globeGameList;
    int selectedGame = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            String path = jFileChooser1.getSelectedFile().getAbsolutePath();
            readFile(path);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection con = getConnection();
        readDatabase(con);
        try{
            con.close();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPopupMenu1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jPopupMenu1PopupMenuWillBecomeVisible
        
        if(selectedGame == 0){
            jMenuItem1.setEnabled(false);
            jMenuItem2.setEnabled(false);
            jMenuItem3.setEnabled(false);
        }else{
            
            if(Integer.parseInt((String) jTable1.getValueAt(selectedGame, 2)) == 1){
                jMenuItem1.setEnabled(true);
                jMenuItem2.setEnabled(false);
                jMenuItem3.setEnabled(true);
                
            }else{
                jMenuItem1.setEnabled(true);
                jMenuItem2.setEnabled(true);
                jMenuItem3.setEnabled(false); 
            }
        }
    }//GEN-LAST:event_jPopupMenu1PopupMenuWillBecomeVisible

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        updateData(selectedGame, String.valueOf(0));
        Connection con = getConnection();
        readDatabase(con);
        try{
            con.close();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        selectedGame = jTable1.getSelectedRow();
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        updateData(selectedGame, String.valueOf(1));
        Connection con = getConnection();
        readDatabase(con);
        try{
            con.close();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int selectedIndex = jTable1.getSelectedRow();
        if(selectedIndex >= 0){
            String gameName = (String) jTable1.getValueAt(selectedIndex, 1);
            int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete your game in list?",gameName,JOptionPane.YES_NO_OPTION);
            if(n == JOptionPane.YES_OPTION){
                Connection con = getConnection();
                try{
                    String strSQL = "DELETE FROM GAMES where GAMENAME = '" + gameName + "'"; 
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate(strSQL);
                    stmt.close();
                    con.close();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this, "Game not deleted.","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
        Connection con = getConnection();
        readDatabase(con);
        readDatabase(con);
        try{
            con.close();
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(true);
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String text = jTextField2.getText();
        if(text.equals("")){
            JOptionPane.showMessageDialog(this, "Please, enter a valid game name");
        }else{
            Connection con = getConnection();
            addData(text,con);
            readDatabase(con);
            try{
                con.close();
            }catch(Exception e){
            
            }
        }
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int rowCount = jTable1.getRowCount();
        if(rowCount > 0){
            int n = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete all games?","",JOptionPane.YES_NO_OPTION);
            if(n == JOptionPane.YES_OPTION){
                deleteAllData();
                Connection con = getConnection();  
                readDatabase(con);
                try{
                    con.close();
                }catch(Exception e){
            
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"List is empty.","",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rowCount = jTable1.getRowCount();
        Random rand = new Random();
        int enabledGameCounter = 0;
        if(rowCount>1){
            String[] randomGameList = new String[rowCount];
            for(int a=0;a<rowCount;a++){
                if(Integer.parseInt((String) jTable1.getValueAt(a, 2)) == 1){
                    randomGameList[a] = (String) jTable1.getValueAt(a, 1);
                    enabledGameCounter += 1;
                }
            }
            int luckyGame = rand.nextInt(enabledGameCounter);
            jTextField1.setText(randomGameList[luckyGame]);
        }else if(rowCount == 0){
            JOptionPane.showMessageDialog(this,"List is empty.","",JOptionPane.INFORMATION_MESSAGE);
        }else if(rowCount == 1){
            JOptionPane.showMessageDialog(this,"Must have more than one game.","",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
                new GUI().setVisible(true);
            }
        });
    }
    
    public void readFile(String path){
      File directoryPath = new File(path);
      String gameList[] = directoryPath.list();
      Connection con = getConnection();
      for(int a=0; a<gameList.length; a++) {
          if(checkGame(gameList[a].toUpperCase()) != 1){
              addData(gameList[a], con);
          }
           
      }
      readDatabase(con);
      try{
          con.close();
      }catch(Exception e){
          
      }
    }
    
    public Connection getConnection(){
        
        Connection con;
        con = null;
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String strdatabase = 
                    "jdbc:ucanaccess://gameList.accdb";
            con = DriverManager.getConnection(strdatabase);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database missed or damaged.","Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    public void readDatabase(Connection con){
        try{
            Object[][] obj;
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT COUNT (*) AS rowcount FROM GAMES");
            
            rs.next();
            int iCount = rs.getInt("rowcount");
            rs.close();
            
            rs = stmt.executeQuery("SELECT * FROM GAMES");
            
            obj = new Object[iCount][3];
            globeGameList = new String[iCount];
            
            iCount = 0;
            
            while(rs.next()){
                obj[iCount][0] = iCount+1;
                obj[iCount][1] = rs.getString("GAMENAME");
                obj[iCount][2] = rs.getString("ENABLED");
                globeGameList[iCount] = rs.getString("GAMENAME");
                iCount = iCount + 1;
                
            }
            
            jTable1.setModel(new DefaultTableModel(obj, new String[] {"NO",  "Game", "Enabled"}));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void addData(String gameName, Connection con){
        try{
            Statement stmt;
            String strSQL;
            int enabled = 1;
            strSQL = "INSERT INTO GAMES (GAMENAME, ENABLED) VALUES('" + gameName.toUpperCase() + "' , '" + enabled + "')";
            stmt = con.createStatement();
            stmt.execute(strSQL);
            stmt.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int checkGame(String gameName){
        for(int a=0;a<globeGameList.length;a++){
            if(globeGameList[a].equals(gameName.toUpperCase())){
                return 1;
            }
        }
        return 0;
    }
    
    public void updateData(int selectedIndeks, String changeEnabled){
        
        Connection con = getConnection();
        try{
            PreparedStatement preparedSt;
            String strSQL;
            String gameName = (String) jTable1.getValueAt(selectedIndeks, 1);
            gameName = gameName.toUpperCase();
            
            strSQL = "update GAMES set GAMENAME = ?,ENABLED = ? where GAMENAME = '" + gameName + "'";
            preparedSt = con.prepareStatement(strSQL);
            preparedSt.setString(1, gameName);
            preparedSt.setString(2, changeEnabled);
            preparedSt.executeUpdate();
            preparedSt.close();
            con.close();
        }catch(Exception e){   
        }
    }
    
    public void deleteAllData(){
        Connection con = getConnection();
        try{
            String strSQL = "DELETE FROM GAMES;"; 
                Statement stmt = con.createStatement();
                stmt.executeUpdate(strSQL);
                stmt.close();
                con.close();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this, "Something went wrong.","Error",JOptionPane.ERROR_MESSAGE);
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
