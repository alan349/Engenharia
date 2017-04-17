/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Paciente;
import Entidades.Prontuario;
import Entidades.Usuario;
import Repositorios.PacienteRepositorio;
import Repositorios.ProntuarioRepositorio;
import Repositorios.UsuarioRepositorio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan
 */
public class MedicoTela extends javax.swing.JFrame {
    public static String user ;
    /**
     * Creates new form MedicoTela
     * @param usuario
     */
    
    public MedicoTela(String usuario) {
        user = usuario;
        initComponents();
       carregartabela();
   
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProntu = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedPane1.setName("Prontuários"); // NOI18N

        tbProntu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null}
            },
            new String [] {
                "Data", "Nome"
            }
        ));
        tbProntu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProntuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProntu);

        btnCadastrar.setText("Adicionar Novo Prontuario");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Prontuários", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Atendimentos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Prontuários");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbProntuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProntuMouseClicked
        // TODO add your handling code here:
        ProntuarioRepositorio prontuarioRepositorio = new ProntuarioRepositorio();
       UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Integer row = tbProntu.getSelectedRow();
        //Integer col = tbProntu.getSelectedColumn();
        //String title = (String) tbProntu.getColumnName(col);
        String nome = (String) tbProntu.getValueAt(row, 1);
        Prontuario prontuario = prontuarioRepositorio.buscarPorNome(nome);
        Usuario usuario = usuarioRepositorio.buscarPorUsuario(user);
        new ProntuarioTela(prontuario.getPaciente(),usuario).alterarProntuario(prontuario);
        
        
    }//GEN-LAST:event_tbProntuMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        // TODO add your handling code here:
        PacienteRepositorio pacienteRepositorio = new PacienteRepositorio();
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        String pront = JOptionPane.showInputDialog("Insira o CPF do paciente:");
        Paciente paciente = pacienteRepositorio.buscarPorCpf(pront);
        Usuario usuario = usuarioRepositorio.buscarPorUsuario(user);
        new ProntuarioTela(paciente,usuario).setVisible(true);
      
       
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        carregartabela();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(MedicoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MedicoTela(user).setVisible(true); 
                
            }
        });
        
    }
    
    @Override
    public void dispose() {
    new Login().setVisible(true);
    super.dispose();
    }
    
    public void carregartabela(){
    ProntuarioRepositorio prontuarioRepositorio = new ProntuarioRepositorio();
        List<Prontuario> prontuarios = prontuarioRepositorio.buscarTudoOrdenado();
        String[] colunasTabela = new String []{"Data", "Nome"};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela){};
        tbProntu.setModel(modeloTabela);
        for (Prontuario prontuario : prontuarios) {
            modeloTabela.addRow(new Object[]{prontuario.getData(),prontuario.getPaciente().getNome()});   
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbProntu;
    // End of variables declaration//GEN-END:variables
}
