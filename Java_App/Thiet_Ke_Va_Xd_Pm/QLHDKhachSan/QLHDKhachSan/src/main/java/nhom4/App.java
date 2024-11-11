package nhom4;

import nhom4.database.AddInvoiceDAOMySQL;
import nhom4.database.EditInvoiceDAOMySQL;
import nhom4.ui.MainGUI;
import nhom4.ui.addInvoice.AddInvoiceController;
import nhom4.ui.addInvoice.AddInvoicePresenter;
import nhom4.ui.addInvoice.AddInvoiceView;
import nhom4.ui.addInvoice.AddInvoiceViewModel;
import nhom4.ui.editInvoice.EditInvoiceController;
import nhom4.ui.editInvoice.EditInvoicePresenter;
import nhom4.ui.editInvoice.EditInvoiceView;
import nhom4.ui.editInvoice.EditInvoiceViewModel;
import nhom4.useCase.addInvoice.AddInvoiceDatabaseBoundary;
import nhom4.useCase.addInvoice.AddInvoiceInputBoundary;
import nhom4.useCase.addInvoice.AddInvoiceOutputBoundary;
import nhom4.useCase.addInvoice.AddInvoiceUseCase;
import nhom4.useCase.editInvoice.EditInvocieOutputBoundary;
import nhom4.useCase.editInvoice.EditInvoiceDatabaseBoundary;
import nhom4.useCase.editInvoice.EditInvoiceInputBoundary;
import nhom4.useCase.editInvoice.EditInvoiceUseCase;
import nhom4.useCase.getListInvoice.GetListInvoiceInputBoundary;
import nhom4.useCase.getListInvoice.GetListInvoiceUseCase;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("org.jdesktop.swingx.JXDatePicker");

        // config db
        final String ipAddress = "127.0.0.1";
        final int port = 3306;
        final String db = "invoice";
        final String username = "root";
        final String password = "17052004";

        // add Invoice
        AddInvoiceViewModel addInvoiceViewModel = new AddInvoiceViewModel();
        AddInvoiceView addInvoiceView = new AddInvoiceView();
        AddInvoiceOutputBoundary addInvoiceOutputBoundary = new AddInvoicePresenter(addInvoiceView, addInvoiceViewModel);
        AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary = new AddInvoiceDAOMySQL(ipAddress, port, db, username, password);
        AddInvoiceInputBoundary addInvoiceInputBoundary = new AddInvoiceUseCase(addInvoiceDatabaseBoundary, addInvoiceOutputBoundary);
        AddInvoiceController addInvoiceController = new AddInvoiceController(addInvoiceInputBoundary);
        addInvoiceView.setAddInvoiceController(addInvoiceController);

//        // delete Invoice
//        DeleteInvoiceViewModel DeleteInvoiceViewModel = new DeleteInvoiceViewModel();
//        DeleteInvoiceView deleteInvoiceView = new DeleteInvoiceView();
//        DeleteInvoiceOutputBoundary deleteInvoiceOutputBoundary = new DeleteInvoicePresenter(deleteInvoiceView, DeleteInvoiceViewModel);
//        DeleteInvoiceDatabaseBoundary deleteInvoiceDatabaseBoundary = new DeleteInvoiceDAOMySQL(ipAddress, port, db, username, password);
//        DeleteInvoiceInputBoundary deleteInvoiceInputBoundary = new DeleteInvoiceUseCase(deleteInvoiceOutputBoundary, deleteInvoiceDatabaseBoundary);
//        DeleteInvoiceController deleteInvoiceController = new DeleteInvoiceController(deleteInvoiceInputBoundary);
//        deleteInvoiceView.setDeleteInvoiceController(deleteInvoiceController);

        // edit Invoice
        EditInvoiceViewModel editInvoiceViewModel = new EditInvoiceViewModel();
        EditInvoiceView editInvoiceView = new EditInvoiceView();
        EditInvocieOutputBoundary editInvoiceOutputBoundary = new EditInvoicePresenter(editInvoiceView, editInvoiceViewModel);
        EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary = new EditInvoiceDAOMySQL(ipAddress, port, db, username, password);
        EditInvoiceInputBoundary editInvoiceInputBoundary = new EditInvoiceUseCase(editInvoiceOutputBoundary, editInvoiceDatabaseBoundary);
        EditInvoiceController editInvoiceController = new EditInvoiceController(editInvoiceInputBoundary);
        editInvoiceView.setEditInvoiceController(editInvoiceController);

        // get list Invoice
//        List<GetListInvoiceViewModel> listGetListInvoiceViewModel = new ArrayList<>();
//        GetListInvoiceView getListInvoiceView = new GetListInvoiceView();
//        GetListInvoiceOutputBoundary getListInvoiceOutputBoundary = new GetListInvoicePresenter(getListInvoiceView, listGetListInvoiceViewModel);
//        GetListInvoiceDatabaseBoundary getListInvoiceDatabaseBoundary = new GetListInvoiceDAOMySQL(ipAddress, port, db, username, password);
//        GetListInvoiceInputBoundary getListInvoiceInputBoundary = new GetListInvoiceUseCase(getListInvoiceOutputBoundary, getListInvoiceDatabaseBoundary);
//        GetListInvoiceController getListInvoiceController = new GetListInvoiceController(getListInvoiceInputBoundary);
//        getListInvoiceView.setGetListInvoiceController(getListInvoiceController);

//        // find Invoice
//        List<FindInvoiceViewModel> listFindInvoiceViewModel = new ArrayList<>();
//        FindInvoiceView findInvoiceView = new FindInvoiceView();
//        FindInvoiceOutputBoundary findInvoiceOutputBoundary = new FindInvoicePresenter(findInvoiceView, listFindInvoiceViewModel);
//        FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary = new FindInvoiceDAOMySQL(ipAddress, port, db, username, password);
//        FindInvoiceInputBoundary findInvoiceInputBoundary = new FindInvoiceUseCase(findInvoiceOutputBoundary, findInvoiceDatabaseBoundary);
//        FindInvoiceController findInvoiceController = new FindInvoiceController(findInvoiceInputBoundary);
//        findInvoiceView.setFindInvoiceController(findInvoiceController);

        // MainGUI
        MainGUI mainGUI = new MainGUI();
        mainGUI.setAddInvoiceView(addInvoiceView);
//        mainGUI.setDeleteInvoiceView(deleteInvoiceView);
        mainGUI.setEditInvoiceView(editInvoiceView);
//        mainGUI.setGetListInvoiceView(getListInvoiceView);
//        mainGUI.setFindInvoiceView(findInvoiceView);

        // setVisible(true)
        mainGUI.showGUI();
    }
}
