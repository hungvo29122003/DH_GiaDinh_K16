package com.nhom4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.nhom4.useCase.getListInvoice.GetListInvoiceDatabaseBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceInputBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceOutputBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceUseCase;
import com.nhom4.database.GetListInvoiceDAOMySQL;
import com.nhom4.ui.getListInvoice.GetListInvoiceController;
import com.nhom4.ui.getListInvoice.GetListInvoicePresenter;
import com.nhom4.ui.getListInvoice.GetListInvoiceViewModel;

public class GetListInvoiceTest extends Nhom4Test {
    @Test
    public void getListInvoiceSuccess() throws Exception {
        List<GetListInvoiceViewModel> getListInvoiceViewModel = new ArrayList<>();
        GetListInvoiceOutputBoundary getListInvoiceOutputBoundary = new GetListInvoicePresenter(null, getListInvoiceViewModel);
        GetListInvoiceDatabaseBoundary getListInvoiceDatabaseBoundary = new GetListInvoiceDAOMySQL(ipAddress, port, db, username, password);
        GetListInvoiceInputBoundary getListInvoiceInputBoundary = new GetListInvoiceUseCase(getListInvoiceOutputBoundary, getListInvoiceDatabaseBoundary);
        GetListInvoiceController getListInvoiceController = new GetListInvoiceController(getListInvoiceInputBoundary);

        getListInvoiceController.execute();
        assertEquals(getListInvoiceViewModel.size(), 8);
    }
}
