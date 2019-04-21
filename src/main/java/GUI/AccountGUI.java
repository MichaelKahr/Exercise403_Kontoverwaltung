package GUI;

import BL.Account;
import BL.User;
import BL.UsrModel;
import Observer.AccObs;
import java.util.Random;
import javax.swing.JOptionPane;

public class AccountGUI extends javax.swing.JFrame implements AccObs {

    private Account account;
    private UsrModel bl = new UsrModel();

    public AccountGUI() {
        initComponents();
        liUsr.setModel(bl);
        bl.register(this);
    }

    @Override
    public void update(Account acc, String msg) {
        Random rand = new Random();

        try {
            Thread.sleep(rand.nextInt(1000));
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
        lbBal.setText(String.format("%.2f €", acc.getBalance()));
        taOut.append(msg + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountPopupMenu = new javax.swing.JPopupMenu();
        btCreateAcc = new javax.swing.JMenuItem();
        UserPopupMenu = new javax.swing.JPopupMenu();
        btAddUser = new javax.swing.JMenuItem();
        btPerformTest = new javax.swing.JMenuItem();
        UstPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liUsr = new javax.swing.JList<>();
        OutputPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOut = new javax.swing.JTextArea();
        AccountPanel = new javax.swing.JPanel();
        lbBal = new javax.swing.JLabel();

        btCreateAcc.setText("Create New Account");
        btCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateAccActionPerformed(evt);
            }
        });
        AccountPopupMenu.add(btCreateAcc);

        btAddUser.setText("Add User");
        btAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddUserActionPerformed(evt);
            }
        });
        UserPopupMenu.add(btAddUser);

        btPerformTest.setText("Perform Account Test");
        btPerformTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerformTestActionPerformed(evt);
            }
        });
        UserPopupMenu.add(btPerformTest);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        UstPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));

        liUsr.setComponentPopupMenu(UserPopupMenu);
        jScrollPane1.setViewportView(liUsr);

        javax.swing.GroupLayout UstPanelLayout = new javax.swing.GroupLayout(UstPanel);
        UstPanel.setLayout(UstPanelLayout);
        UstPanelLayout.setHorizontalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-output"));

        taOut.setEditable(false);
        taOut.setColumns(20);
        taOut.setRows(5);
        taOut.setComponentPopupMenu(AccountPopupMenu);
        jScrollPane2.setViewportView(taOut);

        javax.swing.GroupLayout OutputPanelLayout = new javax.swing.GroupLayout(OutputPanel);
        OutputPanel.setLayout(OutputPanelLayout);
        OutputPanelLayout.setHorizontalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        OutputPanelLayout.setVerticalGroup(
            OutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        AccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        lbBal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbBal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBal, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(AccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateAccActionPerformed
        account = new Account(50);
        bl.setAccount(account);
        lbBal.setText(String.format("%.2f Euro", account.getBalance()));
    }//GEN-LAST:event_btCreateAccActionPerformed

    private void btPerformTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerformTestActionPerformed
        try {
            bl.test();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btPerformTestActionPerformed

    private void btAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddUserActionPerformed
        String name = JOptionPane.showInputDialog("Input Name: ");
        bl.add(new User(name));
    }//GEN-LAST:event_btAddUserActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JPopupMenu AccountPopupMenu;
    private javax.swing.JPanel OutputPanel;
    private javax.swing.JPopupMenu UserPopupMenu;
    private javax.swing.JPanel UstPanel;
    private javax.swing.JMenuItem btAddUser;
    private javax.swing.JMenuItem btCreateAcc;
    private javax.swing.JMenuItem btPerformTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbBal;
    private javax.swing.JList<String> liUsr;
    private javax.swing.JTextArea taOut;
    // End of variables declaration//GEN-END:variables

}
