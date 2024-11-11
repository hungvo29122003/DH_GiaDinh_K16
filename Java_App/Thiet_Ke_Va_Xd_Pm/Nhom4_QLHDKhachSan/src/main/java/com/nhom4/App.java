package com.nhom4;

import java.util.ArrayList;
import java.util.List;

import com.nhom4.useCase.addInvoice.AddInvoiceDatabaseBoundary;
import com.nhom4.useCase.addInvoice.AddInvoiceInputBoundary;
import com.nhom4.useCase.addInvoice.AddInvoiceOutputBoundary;
import com.nhom4.useCase.addInvoice.AddInvoiceUseCase;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceDatabaseBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceInputBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceOutputBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceUseCase;
import com.nhom4.useCase.editInvoice.EditInvoiceDatabaseBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceInputBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceOutputBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceUseCase;
import com.nhom4.useCase.findInvoice.FindInvoiceDatabaseBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceInputBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceOutputBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceUseCase;
import com.nhom4.useCase.getListInvoice.GetListInvoiceDatabaseBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceInputBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceOutputBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceUseCase;
import com.nhom4.database.AddInvoiceDAOMySQL;
import com.nhom4.database.DeleteInvoiceDAOMySQL;
import com.nhom4.database.EditInvoiceDAOMySQL;
import com.nhom4.database.FindInvoiceDAOMySQL;
import com.nhom4.database.GetListInvoiceDAOMySQL;
import com.nhom4.ui.MainGUI;
import com.nhom4.ui.addInvoice.AddInvoiceController;
import com.nhom4.ui.addInvoice.AddInvoicePresenter;
import com.nhom4.ui.addInvoice.AddInvoiceView;
import com.nhom4.ui.addInvoice.AddInvoiceViewModel;
import com.nhom4.ui.deleteInvoice.DeleteInvoiceController;
import com.nhom4.ui.deleteInvoice.DeleteInvoicePresenter;
import com.nhom4.ui.deleteInvoice.DeleteInvoiceView;
import com.nhom4.ui.deleteInvoice.DeleteInvoiceViewModel;
import com.nhom4.ui.editInvoice.EditInvoiceController;
import com.nhom4.ui.editInvoice.EditInvoicePresenter;
import com.nhom4.ui.editInvoice.EditInvoiceView;
import com.nhom4.ui.editInvoice.EditInvoiceViewModel;
import com.nhom4.ui.findInvoice.FindInvoiceController;
import com.nhom4.ui.findInvoice.FindInvoicePresenter;
import com.nhom4.ui.findInvoice.FindInvoiceView;
import com.nhom4.ui.findInvoice.FindInvoiceViewModel;
import com.nhom4.ui.getListInvoice.GetListInvoiceController;
import com.nhom4.ui.getListInvoice.GetListInvoicePresenter;
import com.nhom4.ui.getListInvoice.GetListInvoiceView;
import com.nhom4.ui.getListInvoice.GetListInvoiceViewModel;

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

        // delete Invoice
        DeleteInvoiceViewModel DeleteInvoiceViewModel = new DeleteInvoiceViewModel();
        DeleteInvoiceView deleteInvoiceView = new DeleteInvoiceView();
        DeleteInvoiceOutputBoundary deleteInvoiceOutputBoundary = new DeleteInvoicePresenter(deleteInvoiceView, DeleteInvoiceViewModel);
        DeleteInvoiceDatabaseBoundary deleteInvoiceDatabaseBoundary = new DeleteInvoiceDAOMySQL(ipAddress, port, db, username, password);
        DeleteInvoiceInputBoundary deleteInvoiceInputBoundary = new DeleteInvoiceUseCase(deleteInvoiceOutputBoundary, deleteInvoiceDatabaseBoundary);
        DeleteInvoiceController deleteInvoiceController = new DeleteInvoiceController(deleteInvoiceInputBoundary);
        deleteInvoiceView.setDeleteInvoiceController(deleteInvoiceController);

        // edit Invoice
        EditInvoiceViewModel editInvoiceViewModel = new EditInvoiceViewModel();
        EditInvoiceView editInvoiceView = new EditInvoiceView();
        EditInvoiceOutputBoundary editInvoiceOutputBoundary = new EditInvoicePresenter(editInvoiceView, editInvoiceViewModel);
        EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary = new EditInvoiceDAOMySQL(ipAddress, port, db, username, password);
        EditInvoiceInputBoundary editInvoiceInputBoundary = new EditInvoiceUseCase(editInvoiceOutputBoundary, editInvoiceDatabaseBoundary);
        EditInvoiceController editInvoiceController = new EditInvoiceController(editInvoiceInputBoundary);
        editInvoiceView.setEditInvoiceController(editInvoiceController);

        // get list Invoice
        List<GetListInvoiceViewModel> listGetListInvoiceViewModel = new ArrayList<>();
        GetListInvoiceView getListInvoiceView = new GetListInvoiceView();
        GetListInvoiceOutputBoundary getListInvoiceOutputBoundary = new GetListInvoicePresenter(getListInvoiceView, listGetListInvoiceViewModel);
        GetListInvoiceDatabaseBoundary getListInvoiceDatabaseBoundary = new GetListInvoiceDAOMySQL(ipAddress, port, db, username, password);
        GetListInvoiceInputBoundary getListInvoiceInputBoundary = new GetListInvoiceUseCase(getListInvoiceOutputBoundary, getListInvoiceDatabaseBoundary);
        GetListInvoiceController getListInvoiceController = new GetListInvoiceController(getListInvoiceInputBoundary);
        getListInvoiceView.setGetListInvoiceController(getListInvoiceController);

        // find Invoice
        List<FindInvoiceViewModel> listFindInvoiceViewModel = new ArrayList<>();
        FindInvoiceView findInvoiceView = new FindInvoiceView();
        FindInvoiceOutputBoundary findInvoiceOutputBoundary = new FindInvoicePresenter(findInvoiceView, listFindInvoiceViewModel);
        FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary = new FindInvoiceDAOMySQL(ipAddress, port, db, username, password);
        FindInvoiceInputBoundary findInvoiceInputBoundary = new FindInvoiceUseCase(findInvoiceOutputBoundary, findInvoiceDatabaseBoundary);
        FindInvoiceController findInvoiceController = new FindInvoiceController(findInvoiceInputBoundary);
        findInvoiceView.setFindInvoiceController(findInvoiceController);

        // MainGUI
        MainGUI mainGUI = new MainGUI();
        mainGUI.setAddInvoiceView(addInvoiceView);
        mainGUI.setDeleteInvoiceView(deleteInvoiceView);
        mainGUI.setEditInvoiceView(editInvoiceView);
        mainGUI.setGetListInvoiceView(getListInvoiceView);
        mainGUI.setFindInvoiceView(findInvoiceView);

        // setVisible(true)
        mainGUI.showGUI();
    }
}
