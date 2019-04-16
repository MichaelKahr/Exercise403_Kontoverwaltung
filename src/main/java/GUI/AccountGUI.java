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
        liUser.setModel(bl);
        bl.register(this);
    }

    @Override
    public void update(Account acc, String msg) {
        Random rand = new Random();

        int time = 1 + rand.nextInt(1000);

        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
        lbBalance.setText(String.format("%.2f €", acc.getBalance()));
        taOutput.append(msg + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountPopupMenu = new javax.swing.JPopupMenu();
        btCreateAcc = new javax.swing.JMenuItem();
        UserPopupMenu = new javax.swing.JPopupMenu();
        btAddUser = new javax.swing.JMenuItem();
        btPerformTest = new javax.swing.JMenuItem();
        UserPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liUser = new javax.swing.JList<>();
        OutputPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        AccountPanel = new javax.swing.JPanel();
        lbBalance = new javax.swing.JLabel();

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

        UserPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));

        liUser.setComponentPopupMenu(UserPopupMenu);
        jScrollPane1.setViewportView(liUser);

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-output"));

        taOutput.setEditable(false);
        taOutput.setColumns(20);
        taOutput.setRows(5);
        taOutput.setComponentPopupMenu(AccountPopupMenu);
        jScrollPane2.setViewportView(taOutput);

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

        lbBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(AccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateAccActionPerformed
        account = new Account(50);
        bl.setAccount(account);
        lbBalance.setText(String.format("%.2f Euro", account.getBalance()));
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
    private javax.swing.JPanel UserPanel;
    private javax.swing.JPopupMenu UserPopupMenu;
    private javax.swing.JMenuItem btAddUser;
    private javax.swing.JMenuItem btCreateAcc;
    private javax.swing.JMenuItem btPerformTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbBalance;
    private javax.swing.JList<String> liUser;
    private javax.swing.JTextArea taOutput;
    // End of variables declaration//GEN-END:variables

}
