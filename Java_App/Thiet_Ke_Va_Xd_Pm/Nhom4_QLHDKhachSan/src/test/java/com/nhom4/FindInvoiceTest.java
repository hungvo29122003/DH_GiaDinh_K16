package com.nhom4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.nhom4.useCase.findInvoice.FindInvoiceDatabaseBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceInputBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceInputDTO;
import com.nhom4.useCase.findInvoice.FindInvoiceOutputBoundary;
import com.nhom4.useCase.findInvoice.FindInvoiceUseCase;
import com.nhom4.database.FindInvoiceDAOMySQL;
import com.nhom4.ui.findInvoice.FindInvoiceController;
import com.nhom4.ui.findInvoice.FindInvoicePresenter;
import com.nhom4.ui.findInvoice.FindInvoiceViewModel;

public class FindInvoiceTest extends Nhom4Test {
    private FindInvoiceInputDTO getFindInvoiceInputBoundary() {
        FindInvoiceInputDTO findInvoiceInputDTO = new FindInvoiceInputDTO();
        findInvoiceInputDTO.setTenKH("Khanh");
        return findInvoiceInputDTO;
    }

    @Test
    public void findInvoiceSuccess() throws Exception {
        List<FindInvoiceViewModel> findInvoiceViewModels = new ArrayList<>();
        FindInvoiceOutputBoundary findInvoiceOutputBoundary = new FindInvoicePresenter(null, findInvoiceViewModels);
        FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary = new FindInvoiceDAOMySQL(ipAddress, port, db, username, password);
        FindInvoiceInputBoundary findInvoiceInputBoundary = new FindInvoiceUseCase(findInvoiceOutputBoundary, findInvoiceDatabaseBoundary);
        FindInvoiceController findInvoiceController = new FindInvoiceController(findInvoiceInputBoundary);

        findInvoiceController.execute(getFindInvoiceInputBoundary());
        assertEquals(findInvoiceViewModels.size(), 2);
    }

    @Test
    public void findInvoiceEmpty() throws Exception {
        List<FindInvoiceViewModel> findInvoiceViewModels = new ArrayList<>();
        FindInvoiceOutputBoundary findInvoiceOutputBoundary = new FindInvoicePresenter(null, findInvoiceViewModels);
        FindInvoiceDatabaseBoundary findInvoiceDatabaseBoundary = new FindInvoiceDAOMySQL(ipAddress, port, db, username, password);
        FindInvoiceInputBoundary findInvoiceInputBoundary = new FindInvoiceUseCase(findInvoiceOutputBoundary, findInvoiceDatabaseBoundary);
        FindInvoiceController findInvoiceController = new FindInvoiceController(findInvoiceInputBoundary);

        FindInvoiceInputDTO findInvoiceInputDTO = getFindInvoiceInputBoundary();
        findInvoiceInputDTO.setTenKH("Nhom2");

        findInvoiceController.execute(findInvoiceInputDTO);
        assertEquals(findInvoiceViewModels.size(), 0);
    }
}
