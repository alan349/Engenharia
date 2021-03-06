/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Acessos;
import Entidades.Usuario;
import Repositorios.AcessosRepositorio;
import Repositorios.UsuarioRepositorio;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jiconfont.icons.FontAwesome;

import jiconfont.swing.IconFontSwing;

/**
 *
 * @author Alan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        hiber();
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon iconlogin = IconFontSwing.buildIcon(FontAwesome.ID_CARD_O, 20);
        Icon iconsenha = IconFontSwing.buildIcon(FontAwesome.LOCK, 20);
        jLabel1.setIcon(iconlogin);
        jLabel2.setIcon(iconsenha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Senha");

        btnLogar.setText("Logar");
        btnLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogarMouseClicked(evt);
            }
        });

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(txtSenha))
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogarMouseClicked
        // TODO add your handling code here:
        Logar();
    }//GEN-LAST:event_btnLogarMouseClicked

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
        Logar();
    }//GEN-LAST:event_txtSenhaActionPerformed

    public void Logar(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();

        String user = txtLogin.getText();
        String senha = txtSenha.getText();
        Usuario usuario = usuarioRepositorio.buscarPorUsuario(user);
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha incorretos!");
        } else {
            String pass = usuario.getSenha();
            if (senha.equals(pass)) {
                AcessosRepositorio acessosRepositorio = new AcessosRepositorio();
                Acessos acessos = new Acessos();

                acessos.setData(new Date());
                acessos.setNome("aa");
                acessos.setUsuario("a");
                acessosRepositorio.inserir(acessos);
                if (usuario.getNP() == 1) {
                    new MedicoTela(usuario.getUsuario()).setVisible(true);
                } else if (usuario.getNP() == 2) {
                    new SecretarioTela(usuario.getUsuario()).setVisible(true);
                } else if (usuario.getNP() == 3) {
                    new AdminTela(usuario.getUsuario()).setVisible(true);
                }
                setVisible(false);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha incorretos!");
            }
        }
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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void hiber() {
        Hibernate.NewHibernateUtil.getSessionFactory();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
