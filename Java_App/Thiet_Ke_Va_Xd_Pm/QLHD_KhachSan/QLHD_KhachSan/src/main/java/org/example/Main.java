package org.example;

import org.example.database.AddInvoiceDAOMySQL;
import org.example.database.FindInvoiceDAOMySQL;
import org.example.database.GetListInvoiceDAOMySQL;
import org.example.ui.MainGUI;
import org.example.ui.addInvoice.*;
import org.example.ui.findInvoice.FindInvoiceController;
import org.example.ui.findInvoice.FindInvoicePresenter;
import org.example.ui.findInvoice.FindInvoiceView;
import org.example.ui.findInvoice.FindInvoiceViewModel;
import org.example.ui.getListInvoice.GetListInvoiceController;
import org.example.ui.getListInvoice.GetListInvoicePresenter;
import org.example.ui.getListInvoice.GetListInvoiceView;
import org.example.ui.getListInvoice.GetListInvoiceViewModel;
import org.example.useCase.addInvoice.AddInvoiceDatabaseBoundary;
import org.example.useCase.addInvoice.AddInvoiceInputBoundary;
import org.example.useCase.addInvoice.AddInvoiceOutputBoundary;
import org.example.useCase.addInvoice.AddInvoiceUseCase;
import org.example.useCase.findInvoice.FindInvocieInputBoundary;
import org.example.useCase.findInvoice.FindInvocieUseCase;
import org.example.useCase.findInvoice.FindInvoiceDatabaseBoundary;
import org.example.useCase.findInvoice.FindInvoiceOutputBoundary;
import org.example.useCase.getListInvoice.GetListInvoiceDatabaseBoundary;
import org.example.useCase.getListInvoice.GetListInvoiceInputBoundary;
import org.example.useCase.getListInvoice.GetListInvoiceOutputBoundary;
import org.example.useCase.getListInvoice.GetListInvoiceUseCase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("org.jdesktop.swingx.JXDatePicker");

        final String ip = "127.0.0.1";
        final int port = 3306;
        final  String db = "invoice";
        final String username = "root";
        final String password = "Scarlett 2003";

        AddInvoiceViewModel addInvoiceViewModel = new AddInvoiceViewModel();
        AddInvoiceView addInvoiceView = new AddInvoiceView();
        AddInvoiceOutputBoundary addInvoiceOutputBoundary = new AddInvoicePresenter(addInvoiceView, addInvoiceViewModel);
        AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary = new AddInvoiceDAOMySQL(ip, port, db, username, password);
        AddInvoiceInputBoundary addInvoiceInputBoundary = new AddInvoiceUseCase(addInvoiceDatabaseBoundary, addInvoiceOutputBoundary);
        AddInvoiceController addInvoiceController = new AddInvoiceController(addInvoiceInputBoundary);
        addInvoiceView.setAddInvoiceController(addInvoiceController);

        List<FindInvoiceViewModel> listFindInvoiceViewModel = new ArrayList<>();
        FindInvoiceView findInvoiceView = new FindInvoiceView();
        FindInvoiceOutputBoundary findInvoiceOutputBoundary = new FindInvoicePresenter(findInvoiceView, listFindInvoiceViewModel);
        FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary = new FindInvoiceDAOMySQL(ip, port, db, username, password);
        FindInvocieInputBoundary findInvoiceInputBoundary = new FindInvocieUseCase(findInvoiceDatabaseBoundary, findInvoiceOutputBoundary);
        FindInvoiceController findInvoiceController = new FindInvoiceController(findInvoiceInputBoundary);
        findInvoiceView.setFindInvoiceController(findInvoiceController);

        List<GetListInvoiceViewModel> listGetListInvoiceViewModel = new ArrayList<>();
        GetListInvoiceView getListInvoiceView = new GetListInvoiceView();
        GetListInvoiceOutputBoundary getListInvoiceOutputBoundary = new GetListInvoicePresenter(getListInvoiceView, listGetListInvoiceViewModel);
        GetListInvoiceDatabaseBoundary getListInvoiceDatabaseBoundary = new GetListInvoiceDAOMySQL(ip, port, db, username, password);
        GetListInvoiceInputBoundary getListInvoiceInputBoundary = new GetListInvoiceUseCase(getListInvoiceOutputBoundary, getListInvoiceDatabaseBoundary);
        GetListInvoiceController getListInvoiceController = new GetListInvoiceController(getListInvoiceInputBoundary);
        getListInvoiceView.setGetListInvoiceController(getListInvoiceController);


        MainGUI main = new MainGUI();
        main.setAddInvoiceView(addInvoiceView);
        main.setFindInvoiceView(findInvoiceView);
        main.setGetListInvoiceView(getListInvoiceView);
        main.showGUI();
    }

}