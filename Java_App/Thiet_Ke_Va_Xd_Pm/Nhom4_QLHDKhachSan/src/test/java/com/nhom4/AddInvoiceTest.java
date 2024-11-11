package com.nhom4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nhom4.useCase.addInvoice.*;
import com.nhom4.database.AddInvoiceDAOMySQL;
import com.nhom4.ui.addInvoice.AddInvoiceController;
import com.nhom4.ui.addInvoice.AddInvoicePresenter;
import com.nhom4.ui.addInvoice.AddInvoiceViewModel;


public class AddInvoiceTest extends Nhom4Test {
    private AddInvoiceInputDTO getRequestData() {
        AddInvoiceInputDTO addInvoiceInputDTO = new AddInvoiceInputDTO();

        addInvoiceInputDTO.setTenKH("Hưng");
        addInvoiceInputDTO.setNgayHD("2023-12-30");
        addInvoiceInputDTO.setMaPhong("h12");
        addInvoiceInputDTO.setDonGia("150.00");
        addInvoiceInputDTO.setLoaiHD("Theo ngày");
        addInvoiceInputDTO.setSoNgay("2");

        return addInvoiceInputDTO;
    }

    @Test
    public void addInvoiceSuccess() throws Exception {
        AddInvoiceViewModel addInvoiceViewModel = new AddInvoiceViewModel();
        AddInvoiceOutputBoundary addInvoiceOutputBoundary = new AddInvoicePresenter(null, addInvoiceViewModel);
        AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary = new AddInvoiceDAOMySQL(ipAddress, port, db, username, password);
        AddInvoiceInputBoundary addInvoiceInputBoundary = new AddInvoiceUseCase(addInvoiceDatabaseBoundary, addInvoiceOutputBoundary);
        AddInvoiceController addInvoiceController = new AddInvoiceController(addInvoiceInputBoundary);

        AddInvoiceInputDTO addInvoiceInputDTO = getRequestData();
        addInvoiceController.execute(addInvoiceInputDTO);

        assertEquals(addInvoiceViewModel.msg, "Đã thêm thành công! (TenKH: " + addInvoiceInputDTO.getTenKH() + ")");
    }

    @Test
    public void addInvoiceError() throws Exception {
        AddInvoiceViewModel addInvoiceViewModel = new AddInvoiceViewModel();
        AddInvoiceOutputBoundary addInvoiceOutputBoundary = new AddInvoicePresenter(null, addInvoiceViewModel);
        AddInvoiceDatabaseBoundary addInvoiceDatabaseBoundary = new AddInvoiceDAOMySQL(ipAddress, port, db, username, password);
        AddInvoiceInputBoundary addInvoiceInputBoundary = new AddInvoiceUseCase(addInvoiceDatabaseBoundary, addInvoiceOutputBoundary);
        AddInvoiceController addInvoiceController = new AddInvoiceController(addInvoiceInputBoundary);

        AddInvoiceInputDTO requestData = getRequestData();

        requestData.setNgayHD("20240101");
        addInvoiceController.execute(requestData);

        assertEquals(addInvoiceViewModel.msg, "Dữ liệu không hợp lệ!");
    }
}
