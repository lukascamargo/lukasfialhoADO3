/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CarroController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lukas.camargo
 */
public class CarroView extends javax.swing.JFrame {

    
    private String modoTela; //   "Criar/Editar"
    
    
    public CarroView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();
        
    }
    
    public void LoadTable(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasCarros = CarroController.getCarros();
        
        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmCarros = new DefaultTableModel();
        tmCarros.addColumn("Id");
        tmCarros.addColumn("Modelo");
        tmCarros.addColumn("Ano");
        tmCarros.addColumn("Valor");
        tblCarros.setModel(tmCarros);
        
        //Opção 2 - Descomentar linhas abaixo caso queira reutilizar o modelo padrão
        //Resgato o modelo da tabela
        //DefaultTableModel tmClientes = (DefaultTableModel) this.tblClientes.getModel();
        ////Limpo a tabela, excluindo todas as linhas
        //tmClientes.setRowCount(0);
        
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for(String[] c:linhasCarros)
        {
            tmCarros.addRow(c);
        }
        
        //Defino o tamanho para cada coluna
        tblCarros.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblCarros.getColumnModel().getColumn(1).setPreferredWidth(250); //Modelo
        tblCarros.getColumnModel().getColumn(2).setPreferredWidth(150); //Ano
        tblCarros.getColumnModel().getColumn(2).setPreferredWidth(150); //Valor
    }
    
    public void LimparFormulario()
    {
        txtModelo.setText("");
        txtAno.setText("");
        txtValor.setText("");
        
    }
    
    /**
     * Método auxiliar para desabilitar campos do formulário
     */
    public void DesabilitarFormulario()
    {
        txtModelo.setEditable(false);
        txtAno.setEditable(false);
        txtValor.setEditable(false);
        
        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    
    /**
     * Método auxiliar para habilitar campos do formulário
     */
    public void HabilitarFormulario()
    {
        txtModelo.setEditable(true);
        txtAno.setEditable(true);
        txtValor.setEditable(true);
        
        btnSalvarCliente.setEnabled(true);
        btnCancelar.setEnabled(true);
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
        pnlAbaCadastroCliente = new javax.swing.JPanel();
        pnlFormulario = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblIDCliente = new javax.swing.JLabel();
        pnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        pnlBotoesFormulario = new javax.swing.JPanel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jTabbedPane1.setToolTipText("");

        lblValorUnitario.setText("Valor");

        lblNomeCliente.setText("Ano");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        lblIDCliente.setText("Modelo:");

        pnlTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Modelo", "Ano", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarros);
        if (tblCarros.getColumnModel().getColumnCount() > 0) {
            tblCarros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblCarros.getColumnModel().getColumn(0).setMaxWidth(50);
            tblCarros.getColumnModel().getColumn(1).setMinWidth(250);
            tblCarros.getColumnModel().getColumn(2).setMinWidth(60);
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCliente)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTabelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });
        pnlBotoesFormulario.add(btnSalvarCliente);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoesFormulario.add(btnCancelar);

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNomeCliente)
                                .addComponent(lblValorUnitario))
                            .addComponent(lblIDCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtValor)))
                    .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCliente)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorUnitario))
                .addGap(27, 27, 27)
                .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAbaCadastroClienteLayout = new javax.swing.GroupLayout(pnlAbaCadastroCliente);
        pnlAbaCadastroCliente.setLayout(pnlAbaCadastroClienteLayout);
        pnlAbaCadastroClienteLayout.setHorizontalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAbaCadastroClienteLayout.setVerticalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar Carro", pnlAbaCadastroCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cadastrar Carro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        if(tblCarros.getRowCount()>0)
        {
            int numeroLinha = tblCarros.getSelectedRow();
            if(CarroController.excluir( Integer.parseInt(tblCarros.getValueAt(numeroLinha,0).toString()) ) )
            {
                this.LoadTable();
                JOptionPane.showMessageDialog(this,"Carro excluído da base de dados");
            }else{
                JOptionPane.showMessageDialog(this,"Falha ao excluir o carro!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há carros para excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        //Verifico se há linhas para poder editar
        if(tblCarros.getRowCount()>0)
        {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if(tblCarros.getSelectedRow()>=0)
            {
                HabilitarFormulario();
                
                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                txtModelo.setText(tblCarros.getModel().getValueAt(tblCarros.getSelectedRow(), 1).toString());
                txtAno.setText(tblCarros.getModel().getValueAt(tblCarros.getSelectedRow(), 2).toString());
                txtValor.setText(tblCarros.getModel().getValueAt(tblCarros.getSelectedRow(), 3).toString());
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Selecione um carro para editar!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Não há carros para editar!");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed

        
        if(ValidarFormulario())
        {
            if(modoTela.equals("Criar"))
            {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if(CarroController.salvar(txtModelo.getText(), Integer.parseInt(txtAno.getText()),Double.parseDouble(txtValor.getText())))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    
                    JOptionPane.showMessageDialog(null,"Carro cadastrado com sucesso!");
                    LimparFormulario();
                }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar carro!");
                }

            }else
            {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if(CarroController.atualizar(Integer.parseInt(tblCarros.getModel().getValueAt(tblCarros.getSelectedRow(), 0).toString()), txtModelo.getText(), Integer.parseInt(txtAno.getText()),Double.parseDouble(txtValor.getText())))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this,"Carro atualizado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this,"Falha ao atualizar carro!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
        
        }
       
            
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnlAbaCadastroCliente;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {
        
        if(this.txtModelo.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Modelo para o carro!");
            return false;
        }
        
        if(this.txtAno.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Ano para o carro!");
            return false;
        }
        
        if(this.txtValor.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Valor para o carro!");
            return false;
        }
        
        return true;
        
    }
}