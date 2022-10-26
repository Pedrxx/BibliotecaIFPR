/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.ifpr.biblioteca.view;

import br.ifpr.biblioteca.dao.AlunoDaoImpl;
import br.ifpr.biblioteca.dao.ArmarioDaoImpl;
import br.ifpr.biblioteca.dao.PessoaDaoImpl;
import br.ifpr.biblioteca.modelo.Aluno;
import br.ifpr.biblioteca.modelo.Armario;
import br.ifpr.biblioteca.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author pedro
 */
public class ViewAlunos extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TelaReserva
     */
    public ViewAlunos() {
        initComponents();
        
        atualizarTabelaView();
    }
    
    private void popularTabelaView(List<Pessoa> listaPessoa) {
        
        DefaultTableModel modeloTabela = new DefaultTableModel();
        
        this.jTable1.setModel(modeloTabela);
      
        modeloTabela.addColumn("ID");
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Email");
        modeloTabela.addColumn("Telefone");
        modeloTabela.addColumn("CPF");
        modeloTabela.addColumn("Ativo");
        
        
        for(Pessoa pessoa: listaPessoa) {
            modeloTabela.addRow(
                    new Object[]{
                        pessoa.getPessoaID(),
                        pessoa.getNome(),
                        pessoa.getEmail(),
                        pessoa.getTelefone(),
                        pessoa.getCPF(),
                        pessoa.getAtivo(),
                        
                }
            );
        }
      
    }
    
    private void atualizarTabelaView() {
        PessoaDaoImpl dao = new PessoaDaoImpl();
        
        List<Pessoa> listaPessoa = new ArrayList();
        
        listaPessoa = dao.buscarTodos();
        
        this.popularTabelaView(listaPessoa);
    }
    
    private void FiltraAlunosId() {
        PessoaDaoImpl dao = new PessoaDaoImpl();
        
        List<Pessoa> listaPessoa = new ArrayList();
        
        listaPessoa = dao.buscarPorIdList(Integer.parseInt(jTextField2.getText()));
        
        this.popularTabelaView(listaPessoa);
    }
    
    private void FiltraAlunosCPF() {
        PessoaDaoImpl dao = new PessoaDaoImpl();
        
        List<Pessoa> listaPessoa = new ArrayList();
        
        listaPessoa = dao.buscarPorCPFList(jTextField2.getText());
        
        this.popularTabelaView(listaPessoa);
    }
    
    private void FiltraAlunosNome() {
        PessoaDaoImpl dao = new PessoaDaoImpl();
        
        List<Pessoa> listaPessoa = new ArrayList();
        
        listaPessoa = dao.buscarPorNomeList(jTextField2.getText());
        
        this.popularTabelaView(listaPessoa);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Aluno", "Nome", "CPF", " " }));
        jComboBox1.setBorder(null);

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jComboBox1.getSelectedItem().equals("Id Aluno")) {
            FiltraAlunosId();
            
        }
        
        else if (jComboBox1.getSelectedItem().equals("CPF")) {
            FiltraAlunosCPF();
        }
        
        else if (jComboBox1.getSelectedItem().equals("Nome")) {
            FiltraAlunosNome();
        }
        
        else {
            atualizarTabelaView();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
