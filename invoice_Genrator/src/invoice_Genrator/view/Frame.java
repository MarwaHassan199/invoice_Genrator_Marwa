package invoice_Genrator.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

import invoice_Genrator.controls.ActionsListener;
import invoice_Genrator.controls.TableListener;
import invoice_Genrator.model.Header;
import invoice_Genrator.model.HeaderTable;
import invoice_Genrator.model.Lines;

public class Frame extends javax.swing.JFrame {


    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invHTbl = new javax.swing.JTable();
        createInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custNameLbl = new javax.swing.JLabel();
        invDateLbl = new javax.swing.JLabel();
        invNumLbl = new javax.swing.JLabel();
        invTotalIbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invLTbl = new javax.swing.JTable();
        createLineButton = new javax.swing.JButton();
        deleteLineButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invHTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        invHTbl.getSelectionModel().addListSelectionListener(selectionListener);
        jScrollPane1.setViewportView(invHTbl);

        createInvoiceButton.setText("New Invoice");
        createInvoiceButton.setActionCommand("Create New Invoice");
        createInvoiceButton.addActionListener(actionListener);

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.addActionListener(actionListener);

        jLabel1.setText("Invoice Num");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        invLTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invLTbl);

        createLineButton.setText("New Item");
        createLineButton.addActionListener(actionListener);

        deleteLineButton.setText("Delete Item");
        deleteLineButton.addActionListener(actionListener);

        jMenu1.setText("File");

        loadMenuItem.setText("Load Files");
        loadMenuItem.addActionListener(actionListener);
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save Files");
        saveMenuItem.addActionListener(actionListener);
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invTotalIbl)
                            .addComponent(invNumLbl)
                            .addComponent(invDateLbl)
                            .addComponent(custNameLbl)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(createInvoiceButton)
                .addGap(67, 67, 67)
                .addComponent(deleteInvoiceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createLineButton)
                .addGap(69, 69, 69)
                .addComponent(deleteLineButton)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invNumLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invDateLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(custNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invTotalIbl))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvoiceButton)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(createLineButton)
                    .addComponent(deleteLineButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createLineButton;
    private javax.swing.JLabel custNameLbl;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JLabel invDateLbl;
    private javax.swing.JTable invHTbl;
    private javax.swing.JTable invLTbl;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalIbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    private ActionsListener actionListener = new ActionsListener(this);
    private ArrayList<Header> invoicesArray;
    private ArrayList<Lines> linesArray;
    private HeaderTable headerTableModel;
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private TableListener selectionListener = new TableListener(this);

    public ArrayList<Lines> getLinesArray() {
        return linesArray;
    }

    public void setLinesArray(ArrayList<Lines> linesArray) {
        this.linesArray = linesArray;
    }
    
    public void setInvoicesArray(ArrayList<Header> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    public ArrayList<Header> getInvoicesArray() {
        return invoicesArray;
    }
    
    public Header getInvObject(int code) {
        for (Header inv : invoicesArray) {
            if (inv.getNum() == code) {
                return inv;
            }
        }
        return null;
    }

    public HeaderTable getHeaderTableModel() {
        return headerTableModel;
    }

    public void setHeaderTableModel(HeaderTable headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    public JTable getInvHTbl() {
        return invHTbl;
    }

    public JTable getInvLTbl() {
        return invLTbl;
    }

    public JLabel getCustNameLbl() {
        return custNameLbl;
    }

    public JLabel getInvDateLbl() {
        return invDateLbl;
    }

    public JLabel getInvNumLbl() {
        return invNumLbl;
    }

    public JLabel getInvTotalIbl() {
        return invTotalIbl;
    }

    public ActionsListener getActionListener() {
        return actionListener;
    }
    
    
}
