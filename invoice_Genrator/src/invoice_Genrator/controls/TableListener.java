package invoice_Genrator.controls;

import invoice_Genrator.model.Header;
import invoice_Genrator.model.Lines;
import invoice_Genrator.model.LinesTable;
import invoice_Genrator.view.Frame;

import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableListener implements ListSelectionListener {

    private final Frame frame;

    public TableListener(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedInvIndex = frame.getInvHTbl().getSelectedRow();
        System.out.println("Invoice number : " + selectedInvIndex);
        if (selectedInvIndex != -1) {
            Header selectedInv = frame.getInvoicesArray().get(selectedInvIndex);
            ArrayList<Lines> inv_lines = selectedInv.getLines();
            LinesTable lineTableModel = new LinesTable(inv_lines);
            frame.setLinesArray(inv_lines);
            frame.getInvLTbl().setModel(lineTableModel);
            frame.getCustNameLbl().setText(selectedInv.getCustomer());
            frame.getInvNumLbl().setText(String.valueOf(selectedInv.getNum()));
            frame.getInvTotalIbl().setText(String.valueOf(selectedInv.getInvoiceTotal()));
            frame.getInvDateLbl().setText(Frame.dateFormat.format(selectedInv.getInvDate()));
        }
    }

}
