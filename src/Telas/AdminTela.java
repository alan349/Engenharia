/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Usuario;
import Repositorios.UsuarioRepositorio;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan
 */
public class AdminTela extends javax.swing.JFrame {
    public static String user ; 
    /**
     * Creates new form AdminTela
     */
    public AdminTela(String usuario) {
        user = usuario;
        initComponents();
        TabelaUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        txtCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAlt = new javax.swing.JToggleButton();
        lblCpf = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btnInserir1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        txtSus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAlt1 = new javax.swing.JToggleButton();
        lblSus = new javax.swing.JLabel();
        btnExcluir1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setPreferredSize(new java.awt.Dimension(640, 480));

        btnInserir.setLabel("Inserir");
        btnInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInserirMouseClicked(evt);
            }
        });

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Usuario", "Senha", "N.P.", "CPF", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        jLabel1.setText("Digite o CPF do Usuário desejado:");

        btnAlt.setText("Habilitar Alterações");
        btnAlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltMouseClicked(evt);
            }
        });

        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlt)
                                .addGap(173, 173, 173)
                                .addComponent(btnExcluir)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlt)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuários", jPanel5);

        btnInserir1.setLabel("Inserir");
        btnInserir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInserir1MouseClicked(evt);
            }
        });

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "SUS", "Data Nasc.", "Endereço", "Fone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPacientes);

        txtSus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSusKeyReleased(evt);
            }
        });

        jLabel2.setText("Digite o Código Sus do Paciente:");

        btnAlt1.setText("Habilitar Alterações");
        btnAlt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlt1MouseClicked(evt);
            }
        });

        lblSus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnExcluir1.setText("Excluir");
        btnExcluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblSus, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSus, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInserir1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlt1)
                                .addGap(170, 170, 170)
                                .addComponent(btnExcluir1)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir1)
                    .addComponent(btnAlt1)
                    .addComponent(btnExcluir1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pacientes", jPanel1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agendamentos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Prontuários", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Relatórios", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private static boolean alterarUsuario = false, alterarPaciente = false;
    private static boolean excluirUsuario = false, excluirPaciente = false;
    private void btnAltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltMouseClicked
        // TODO add your handling code here:
        if(btnAlt.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Clique no campo que deseja alterar.");
            btnAlt.setText("Desabilitar Alterações");
            alterarUsuario = true;
        }else{
            btnAlt.setText("Habilitar Alterações");
            alterarUsuario = false;
        }
    }//GEN-LAST:event_btnAltMouseClicked

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        // TODO add your handling code here:
        if(alterarUsuario == true){
            AlterarUsuario();
        }else if(excluirUsuario ==true){
            ExcluirUsuario();
        }
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void btnInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseClicked
        // TODO add your handling code here:
       
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Usuario usuario = new Usuario();
        String nome = JOptionPane.showInputDialog("Insira o Nome:");
        usuario.setNome(nome);
        String usuarioUser = JOptionPane.showInputDialog("Insira o Usuário:");
        usuario.setUsuario(usuarioUser);
        String senha = JOptionPane.showInputDialog("Insira a Senha:");
        usuario.setSenha(senha);
        String np = JOptionPane.showInputDialog("Insira o Nível de Privilégio:");
        usuario.setNP(Integer.parseInt(np));
        String cpf = JOptionPane.showInputDialog("Insira o CPF:");
        usuario.setCPF(cpf);
        String rg = JOptionPane.showInputDialog("Insira o RG:");
        usuario.setRG(rg);
        usuarioRepositorio.inserir(usuario);
        TabelaUsuario();
    }//GEN-LAST:event_btnInserirMouseClicked

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        // TODO add your handling code here:
        Integer rows = tbUsuarios.getRowCount();
        for(int i = 0; i<rows; i++){
            if(tbUsuarios.getValueAt(i, 4).equals(txtCpf.getText())){
                tbUsuarios.setRowSelectionInterval(i, i);
                tbUsuarios.scrollRectToVisible(new Rectangle(tbUsuarios.getCellRect(i, 0, true)));
                lblCpf.setText("Usuário encontrado.");
                Thread.currentThread().stop();
            }else{
                lblCpf.setText("Nenhum Usuário com este CPF foi encontrado.");
            }
            if(txtCpf.getText().equals("")){
                lblCpf.setText(null);
            }
        }        
    }//GEN-LAST:event_txtCpfKeyReleased

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
        if(btnExcluir.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Clique no partido que deseja excluir.");
            btnExcluir.setText("Cancelar Exclusão");
            excluirUsuario = true;
        }else{
            btnExcluir.setText("Excluir");
            excluirUsuario = false;
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnInserir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserir1MouseClicked

    private void tbPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPacientesMouseClicked

    private void txtSusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSusKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSusKeyReleased

    private void btnAlt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlt1MouseClicked

    private void btnExcluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluir1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTela(user).setVisible(true);
            }
        });
    }
    
    public void AlterarUsuario(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Integer row = tbUsuarios.getSelectedRow();
        Integer col = tbUsuarios.getSelectedColumn();
        String title = (String) tbUsuarios.getColumnName(col);
        String nome = (String) tbUsuarios.getValueAt(row, 0);
        Usuario usuario = usuarioRepositorio.buscarPorNome(nome);
        switch (title) {
            case "Nome":
                usuario.setNome(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "Usuario":
                usuario.setUsuario(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "Senha":
                usuario.setSenha(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "NP":
                usuario.setNP(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo valor:")));
                break;
            case "CPF":
                usuario.setCPF(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "RG":
                usuario.setRG(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            default:
                break;
        }
        usuarioRepositorio.editar(usuario);
        TabelaUsuario();
    }
    
    public void ExcluirUsuario(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Integer row = tbUsuarios.getSelectedRow();
        String nome = (String) tbUsuarios.getValueAt(row, 0);
        Usuario usuario = usuarioRepositorio.buscarPorNome(nome);
        usuarioRepositorio.excluir(usuario);
        TabelaUsuario();
        JOptionPane.showMessageDialog(null, "Excluido Com Sucesso.");
        btnExcluir.setText("Excluir");
        excluirUsuario = false;
        btnExcluir.setSelected(false);
    }
    
    public void TabelaUsuario(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        List<Usuario> usuarios = usuarioRepositorio.buscarTudoOrdenado();
        String[] colunasTabela = new String []{"Nome", "Usuario", "Senha", "NP", "CPF", "RG"};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela){};
        tbUsuarios.setModel(modeloTabela);
        for (Usuario usuario : usuarios) {
            modeloTabela.addRow(new Object[]{usuario.getNome(),usuario.getUsuario(),usuario.getSenha(),
            usuario.getNP(),usuario.getCPF(),usuario.getRG()});   
        }
    }
    
    public void AlterarPaciente(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Integer row = tbUsuarios.getSelectedRow();
        Integer col = tbUsuarios.getSelectedColumn();
        String title = (String) tbUsuarios.getColumnName(col);
        String nome = (String) tbUsuarios.getValueAt(row, 0);
        Usuario usuario = usuarioRepositorio.buscarPorNome(nome);
        switch (title) {
            case "Nome":
                usuario.setNome(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "Usuario":
                usuario.setUsuario(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "Senha":
                usuario.setSenha(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "NP":
                usuario.setNP(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo valor:")));
                break;
            case "CPF":
                usuario.setCPF(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            case "RG":
                usuario.setRG(JOptionPane.showInputDialog("Digite o novo valor:"));
                break;
            default:
                break;
        }
        usuarioRepositorio.editar(usuario);
        TabelaUsuario();
    }
    
    public void ExcluirPaciente(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Integer row = tbUsuarios.getSelectedRow();
        String nome = (String) tbUsuarios.getValueAt(row, 0);
        Usuario usuario = usuarioRepositorio.buscarPorNome(nome);
        usuarioRepositorio.excluir(usuario);
        TabelaUsuario();
        JOptionPane.showMessageDialog(null, "Excluido Com Sucesso.");
        btnExcluir.setText("Excluir");
        excluirUsuario = false;
        btnExcluir.setSelected(false);
    }
    
    public void TabelaPaciente(){
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        List<Usuario> usuarios = usuarioRepositorio.buscarTudoOrdenado();
        String[] colunasTabela = new String []{"Nome", "Usuario", "Senha", "NP", "CPF", "RG"};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela){};
        tbUsuarios.setModel(modeloTabela);
        for (Usuario usuario : usuarios) {
            modeloTabela.addRow(new Object[]{usuario.getNome(),usuario.getUsuario(),usuario.getSenha(),
            usuario.getNP(),usuario.getCPF(),usuario.getRG()});   
            
        }
    }
    
    /*@Override
    public void dispose() {
    new Login().setVisible(true);
    super.dispose();
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlt;
    private javax.swing.JToggleButton btnAlt1;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnExcluir1;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnInserir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblSus;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtSus;
    // End of variables declaration//GEN-END:variables
}
