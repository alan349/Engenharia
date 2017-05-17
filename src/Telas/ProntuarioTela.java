/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Paciente;
import Entidades.Prontuario;
import Entidades.Usuario;
import Repositorios.ProntuarioRepositorio;
import Repositorios.UsuarioRepositorio;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class ProntuarioTela extends javax.swing.JFrame {

    public static Prontuario pront;
    public static Paciente paci;
    public static Usuario medico;

    /**
     * Creates new form Prontuario
     *
     * @param prontuario
     * @param Medico
     */
    public ProntuarioTela(Paciente prontuario, Usuario Medico) {
        paci = prontuario;
        medico = Medico;
        initComponents();
        carreganome(paci.getNome(), medico.getNome());

    }

    public void carreganome(String paci, String medico) {
        txtNPaciente.setText(paci);
        txtNMedico.setText(medico);
    }

    public void alterarProntuario(Prontuario prontuario) {
        setVisible(true);
        txtAltura.setText(String.valueOf(prontuario.getAltura()));
        txtPeso.setText(String.valueOf(prontuario.getPeso()));
        txaAnota.setText(prontuario.getAnotacoes());
        carreganome(paci.getNome(), medico.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPeso = new javax.swing.JTextField();
        lblAnota = new javax.swing.JLabel();
        txtNPaciente = new javax.swing.JTextField();
        txtNMedico = new javax.swing.JTextField();
        lblKg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaAnota = new javax.swing.JTextArea();
        lblNpaciente = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        lblNMedico = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAnota.setText("Anotações :");

        txtNPaciente.setEditable(false);

        txtNMedico.setEditable(false);

        lblKg.setText("Kg");

        txaAnota.setColumns(20);
        txaAnota.setRows(5);
        jScrollPane2.setViewportView(txaAnota);

        lblNpaciente.setText("Nome do Paciente:");

        btnOK.setText("Salvar");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });

        lblNMedico.setText("Nome do Medico:");

        lblAltura.setText("Altura:");

        lblPeso.setText("Peso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKg))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNpaciente)
                                    .addComponent(lblNMedico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNMedico)
                                    .addComponent(txtNPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnota)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNpaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNMedico))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeso)
                    .addComponent(lblKg))
                .addGap(18, 18, 18)
                .addComponent(lblAnota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        // TODO add your handling code here:
        ProntuarioRepositorio prontuarioRepositorio = new ProntuarioRepositorio();
        Prontuario prontuario = pront;
        prontuario.setPaciente(paci);
        prontuario.setMedico(medico);
        prontuario.setAltura(Float.valueOf(txtAltura.getText()));
        prontuario.setData(new Date());
        prontuario.setPeso(Float.valueOf(txtPeso.getText()));
        prontuario.setAnotacoes(txaAnota.getText());
        prontuarioRepositorio.inserir(prontuario);
        JOptionPane.showMessageDialog(null, "Prontuario salvo com sucesso!");
        dispose();
    }//GEN-LAST:event_btnOKMouseClicked

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
            java.util.logging.Logger.getLogger(ProntuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProntuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProntuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProntuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProntuarioTela(paci, medico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAnota;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblNMedico;
    private javax.swing.JLabel lblNpaciente;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JTextArea txaAnota;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNMedico;
    private javax.swing.JTextField txtNPaciente;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
