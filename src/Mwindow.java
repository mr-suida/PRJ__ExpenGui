
import com.exp.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;



public class Mwindow extends javax.swing.JFrame {
    private Expense selectedExpenseExp;
    private int selectedExpenseRow= -1;
    private int categorsCount = 0;
    private int expensesCount = 0;

    
    private final App app = new App();
    
    public Mwindow() {initComponents();}
    
    
    public void attrowB() {
         if (this.selectedExpenseRow >= 0 ) {
            String type = (this.selectedExpenseExp.getBtype()) ? "gasto ⮝" : "entrada ⮟";
            
            this.tableB.setValueAt(this.selectedExpenseExp.getName(), 0, 0);
            this.tableB.setValueAt(this.selectedExpenseExp.getDate(), 0, 1);
            this.tableB.setValueAt(String.format("%.2f R$",this.selectedExpenseExp.getBalence()), 0, 2);
            this.tableB.setValueAt(type, 0, 3);
            this.expensesLogTextArea.setText(this.selectedExpenseExp.getDesc());
         }else {
            this.tableB.setValueAt("", 0, 0);
            this.tableB.setValueAt("", 0, 1);
            this.tableB.setValueAt("", 0, 2);
            this.tableB.setValueAt("", 0, 3);
            this.expensesLogTextArea.setText("");
         }
    }
    public void setLabelStatus() {
        this.catExpLabel.setText(String.format("Categorias: %d  Dispesas: %d",this.categorsCount,this.expensesCount));
    }
    
    public void showMsg(String msg) { JOptionPane.showMessageDialog(null,msg);}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        mothValue = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputDesc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        inputDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputCoin = new javax.swing.JTextField();
        inputType = new javax.swing.JCheckBox();
        saveBnt = new javax.swing.JButton();
        clearBnt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableB = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        expensesLogTextArea = new javax.swing.JTextArea();
        deletBnt = new javax.swing.JButton();
        cashStatus = new javax.swing.JLabel();
        inputCatg = new javax.swing.JComboBox<>();
        newCategorie = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        selectCat = new javax.swing.JComboBox<>();
        typeSelecte = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        catExpLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Dispesas 1.0");
        setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        setResizable(false);

        mothValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"all","Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
mothValue.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        mothValueItemStateChanged(evt);
    }
    });
    mothValue.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            mothValueActionPerformed(evt);
        }
    });

    tableA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    tableA.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "id", "categoria", "titulo", "data", "valor R$"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tableA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    tableA.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableA.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableA.setShowGrid(true);
    tableA.getTableHeader().setReorderingAllowed(false);
    tableA.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableAMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tableA);
    tableA.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (tableA.getColumnModel().getColumnCount() > 0) {
        tableA.getColumnModel().getColumn(0).setMinWidth(0);
        tableA.getColumnModel().getColumn(0).setPreferredWidth(0);
        tableA.getColumnModel().getColumn(0).setMaxWidth(0);
        tableA.getColumnModel().getColumn(1).setResizable(false);
        tableA.getColumnModel().getColumn(2).setResizable(false);
        tableA.getColumnModel().getColumn(3).setResizable(false);
        tableA.getColumnModel().getColumn(4).setResizable(false);
    }

    jLabel1.setText("categoria");

    jLabel2.setText("titulo");

    inputName.setMargin(new java.awt.Insets(4, 4, 4, 4));

    jLabel3.setText("descrição");

    inputDesc.setColumns(10);
    inputDesc.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
    inputDesc.setLineWrap(true);
    inputDesc.setRows(2);
    inputDesc.setTabSize(4);
    inputDesc.setWrapStyleWord(true);
    inputDesc.setAutoscrolls(false);
    inputDesc.setMargin(new java.awt.Insets(4, 4, 4, 4));
    jScrollPane2.setViewportView(inputDesc);

    jLabel4.setText("dd/mm/aa");

    inputDate.setMargin(new java.awt.Insets(4, 4, 4, 4));

    jLabel5.setText("valor R$ BRL");

    inputCoin.setMargin(new java.awt.Insets(4, 4, 4, 4));

    inputType.setText("é um gasto?");
    inputType.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            inputTypeMouseClicked(evt);
        }
    });
    inputType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            inputTypeActionPerformed(evt);
        }
    });

    saveBnt.setText("salvar");
    saveBnt.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            saveBntMouseClicked(evt);
        }
    });

    clearBnt.setText("limpar");
    clearBnt.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            clearBntMouseClicked(evt);
        }
    });

    tableB.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null}
        },
        new String [] {
            "titulo", "data", "valor R$", "tipo"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tableB.setEnabled(false);
    tableB.setFocusable(false);
    tableB.setRequestFocusEnabled(false);
    jScrollPane3.setViewportView(tableB);
    if (tableB.getColumnModel().getColumnCount() > 0) {
        tableB.getColumnModel().getColumn(0).setResizable(false);
        tableB.getColumnModel().getColumn(1).setResizable(false);
        tableB.getColumnModel().getColumn(2).setResizable(false);
        tableB.getColumnModel().getColumn(3).setResizable(false);
    }

    expensesLogTextArea.setEditable(false);
    expensesLogTextArea.setColumns(20);
    expensesLogTextArea.setRows(5);
    expensesLogTextArea.setMargin(new java.awt.Insets(4, 4, 4, 4));
    jScrollPane4.setViewportView(expensesLogTextArea);

    deletBnt.setText("remover");
    deletBnt.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            deletBntMouseClicked(evt);
        }
    });

    cashStatus.setText("Entrada: 00.00 R$ ⮟ | Gasto: 00.00 R$ ⮝");

    inputCatg.setModel(new javax.swing.DefaultComboBoxModel<>(this.app.categoriesToStrings()));
    inputCatg.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            inputCatgItemStateChanged(evt);
        }
    });

    newCategorie.setText("nova");
    newCategorie.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            newCategorieMouseClicked(evt);
        }
    });

    jButton1.setText("filtrar");
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton1MouseClicked(evt);
        }
    });

    selectCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"all"}));

    typeSelecte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "Entradas", "Gastos"}));

    jLabel6.setText("mes");

    jLabel7.setText("categoria");

    jLabel8.setText("tipo");

    jTextField1.setToolTipText("Pesquisar por nome/descricao");
    jTextField1.setAutoscrolls(false);
    jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jTextField1.setMargin(new java.awt.Insets(4, 4, 4, 4));
    jTextField1.setMaximumSize(new java.awt.Dimension(6, 23));
    jTextField1.setMinimumSize(new java.awt.Dimension(6, 23));
    jTextField1.setName(""); // NOI18N
    jTextField1.setPreferredSize(new java.awt.Dimension(6, 23));

    catExpLabel.setText("Categorias: 0  Dispesas: 0");

    jLabel13.setText("Controle de Dispesas 1.0");

    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(deletBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(mothValue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(selectCat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(typeSelecte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(127, 127, 127)
                    .addComponent(jLabel7)
                    .addGap(99, 99, 99)
                    .addComponent(jLabel8)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clearBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputCatg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(newCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)
                                                .addComponent(inputType, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(inputCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cashStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(catExpLabel)))
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel13)
                    .addGap(149, 149, 149))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel13)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputCatg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newCategorie))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputType)
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(clearBnt)
                                .addComponent(saveBnt))))
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cashStatus)
                        .addComponent(catExpLabel))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGap(2, 2, 2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mothValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeSelecte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletBnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBntMouseClicked
        String  name = FormatInputs.textInput(this.inputName.getText());
        String  desc = FormatInputs.areaInput(this.inputDesc.getText(),30);
        String  date = FormatInputs.dateInput(this.inputDate.getText());
        double  coin = FormatInputs.coinInput(this.inputCoin.getText());
        String  catg = FormatInputs.seltInput(this.inputCatg.getSelectedItem());
        boolean type = this.inputType.isSelected();
            
        if ( name == null ||
             desc == null ||
             date == null ||
             catg == null ) {this.showMsg("verifique os campos"); return;}
        
        Expense exp = new Expense(name,desc,date,coin,type);
        this.selectedExpenseExp = exp;
        this.app.addExpense(catg, exp);
        

        DefaultTableModel model = (DefaultTableModel) tableA.getModel();        
        String cash = (type) ? String.format("%.2f R$ ⮝",coin) : String.format("%.2f R$ ⮟",coin);
        model.addRow(new Object[]{exp.getUuid(),catg,name,date,cash});
        this.expensesCount +=1;
        this.setLabelStatus();
        this.attrowB();
    }//GEN-LAST:event_saveBntMouseClicked

    private void mothValueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mothValueItemStateChanged

    }//GEN-LAST:event_mothValueItemStateChanged

    private void newCategorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCategorieMouseClicked

        String name = JOptionPane.showInputDialog(null, "Nova categoria");
        
        if ( name != null && name.length() > 0 ) {
            if (this.app.addCategorie(name)) {
                this.selectCat.addItem(name);
                this.inputCatg.addItem(name);
                this.showMsg("categoria adicionada");
                this.categorsCount +=1;
                this.setLabelStatus();
            }   
        }
        
    }//GEN-LAST:event_newCategorieMouseClicked

    private void clearBntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBntMouseClicked
        this.inputName.setText("");           
        this.inputDesc.setText("");
        this.inputDate.setText("");
        this.inputCoin.setText("");
    }//GEN-LAST:event_clearBntMouseClicked

    private void deletBntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletBntMouseClicked
        
        if (this.selectedExpenseRow >= 0 ) {
            int opt = JOptionPane.showConfirmDialog(null,"tem certeza?","Deletar registro!!",JOptionPane.YES_NO_OPTION);
            if (opt == 0 ) {
                String catgore = this.tableA.getValueAt(this.selectedExpenseRow, 1).toString();
                String expUuid = this.tableA.getValueAt(this.selectedExpenseRow, 0).toString();
                
                // GUI remove
                DefaultTableModel tableATemp = (DefaultTableModel) this.tableA.getModel();
                tableATemp.removeRow(this.selectedExpenseRow);
                
                // Data remove
                this.app.delExpense(catgore, expUuid);
                this.selectedExpenseRow = -1;
                this.expensesCount -=1;
                this.setLabelStatus();
            }
        }
        
    }//GEN-LAST:event_deletBntMouseClicked

    private void inputCatgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_inputCatgItemStateChanged
        // categora para salvar 
    }//GEN-LAST:event_inputCatgItemStateChanged

    private void inputTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputTypeMouseClicked

    }//GEN-LAST:event_inputTypeMouseClicked

    private void inputTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTypeActionPerformed

    private void tableAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAMouseClicked
        String catgore = this.tableA.getValueAt(this.tableA.getSelectedRow(), 1).toString();
        String expUuid = this.tableA.getValueAt(this.tableA.getSelectedRow(), 0).toString();
        
        
        this.selectedExpenseExp = app.getExpense(catgore,expUuid);
        this.selectedExpenseRow = this.tableA.getSelectedRow();
        this.attrowB();   
    }//GEN-LAST:event_tableAMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String month = FormatInputs.textInput(this.mothValue.getSelectedItem().toString());
        String catgo = FormatInputs.textInput(this.selectCat.getSelectedItem().toString());
    
        ArrayList<String[]> expArray = new ArrayList<>();
        expArray = app.FilterExpense(catgo, month);
        int type = this.typeSelecte.getSelectedIndex();
        double in=0, ot = 0;
        
        DefaultTableModel tableAtemp = (DefaultTableModel) this.tableA.getModel();
        tableAtemp.setRowCount(0);
        
        if ( expArray != null ) {
            for (String[] row : expArray ) {
                switch(type){
                    case 0:
                        tableAtemp.addRow(new String[]{row[1],row[0],row[2],row[4],row[5]});
                        if (row[6].equals("yes")) {
                            ot += FormatInputs.coinInput(row[5]);
                        }else { 
                            in += FormatInputs.coinInput(row[5]);
                        }
                    break;

                    case 1:
                        if (row[6].equals("not")){
                            tableAtemp.addRow(new String[]{row[1],row[0],row[2],row[4],row[5]});
                            in += FormatInputs.coinInput(row[5]);}

                    break;
                    case 2:
                        if (row[6].equals("yes")){
                            tableAtemp.addRow(new String[]{row[1],row[0],row[2],row[4],row[5]});
                            ot += FormatInputs.coinInput(row[5]);
                        }
                    break;
                }
            }
            this.cashStatus.setText(String.format("Entrada: %.2f R$ ⮟ | Gasto: %.2f R$ ⮝",in,ot));
            return;
        }
        this.cashStatus.setText("Entrada: 00.00 R$ ⮟ | Gasto: 00.00 R$ ⮝");
        return;
    }//GEN-LAST:event_jButton1MouseClicked

    private void mothValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mothValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mothValueActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashStatus;
    private javax.swing.JLabel catExpLabel;
    private javax.swing.JButton clearBnt;
    private javax.swing.JButton deletBnt;
    private javax.swing.JTextArea expensesLogTextArea;
    private javax.swing.JComboBox<String> inputCatg;
    private javax.swing.JTextField inputCoin;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextArea inputDesc;
    private javax.swing.JTextField inputName;
    private javax.swing.JCheckBox inputType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> mothValue;
    private javax.swing.JButton newCategorie;
    private javax.swing.JButton saveBnt;
    private javax.swing.JComboBox<String> selectCat;
    private javax.swing.JTable tableA;
    private javax.swing.JTable tableB;
    private javax.swing.JComboBox<String> typeSelecte;
    // End of variables declaration//GEN-END:variables
}
