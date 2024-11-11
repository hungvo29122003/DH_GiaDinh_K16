package com.nhom4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nhom4.useCase.deleteInvoice.DeleteInvoiceInputDTO;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceDatabaseBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceInputBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceOutputBoundary;
import com.nhom4.useCase.deleteInvoice.DeleteInvoiceUseCase;
import com.nhom4.database.DeleteInvoiceDAOMySQL;
import com.nhom4.ui.deleteInvoice.DeleteInvoiceController;
import com.nhom4.ui.deleteInvoice.DeleteInvoicePresenter;
import com.nhom4.ui.deleteInvoice.DeleteInvoiceViewModel;

public class DeleteInvoiceTest extends Nhom4Test {
    private DeleteInvoiceInputDTO getRequestData() {
        DeleteInvoiceInputDTO requestData = new DeleteInvoiceInputDTO();

        requestData.setMaHD("8");

        return requestData;
    }

    @Test
    public void deleteInvoiceSuccess() throws Exception {
        DeleteInvoiceViewModel deleteInvoiceViewModel = new DeleteInvoiceViewModel();
        DeleteInvoiceOutputBoundary deleteInvoiceOutputBoundary = new DeleteInvoicePresenter(null, deleteInvoiceViewModel);
        DeleteInvoiceDatabaseBoundary deleteInvoiceDatabaseBoundary = new DeleteInvoiceDAOMySQL(ipAddress, port, db, username, password);
        DeleteInvoiceInputBoundary deleteInvoiceInputBoundary = new DeleteInvoiceUseCase(deleteInvoiceOutputBoundary, deleteInvoiceDatabaseBoundary);
        DeleteInvoiceController deleteInvoiceController = new DeleteInvoiceController(deleteInvoiceInputBoundary);

        DeleteInvoiceInputDTO requestData = getRequestData();
        deleteInvoiceController.execute(requestData);

        assertEquals(deleteInvoiceViewModel.msg, "Đã xóa thành công! (KH: " + requestData.getMaHD() + ")");
    }

    @Test
    public void deleteInvoiceError() throws Exception {
        DeleteInvoiceViewModel deleteInvoiceViewModel = new DeleteInvoiceViewModel();
        DeleteInvoiceOutputBoundary deleteInvoiceOutputBoundary = new DeleteInvoicePresenter(null, deleteInvoiceViewModel);
        DeleteInvoiceDatabaseBoundary deleteInvoiceDatabaseBoundary = new DeleteInvoiceDAOMySQL(ipAddress, port, db, username, password);
        DeleteInvoiceInputBoundary deleteInvoiceInputBoundary = new DeleteInvoiceUseCase(deleteInvoiceOutputBoundary, deleteInvoiceDatabaseBoundary);
        DeleteInvoiceController deleteInvoiceController = new DeleteInvoiceController(deleteInvoiceInputBoundary);

        DeleteInvoiceInputDTO requestData = getRequestData();

        requestData.setMaHD("ID08");
        deleteInvoiceController.execute(requestData);
        assertEquals(deleteInvoiceViewModel.msg, "Dữ liệu không hợp lệ!");

        requestData.setMaHD("0");
        deleteInvoiceController.execute(requestData);
        assertEquals(deleteInvoiceViewModel.msg, "Không tồn tại! (KH: " + requestData.getMaHD() + ")");
    }
}
