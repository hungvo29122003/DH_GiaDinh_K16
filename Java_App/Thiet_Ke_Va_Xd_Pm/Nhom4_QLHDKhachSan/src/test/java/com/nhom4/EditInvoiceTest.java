package com.nhom4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nhom4.useCase.editInvoice.EditInvoiceDatabaseBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceInputBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceOutputBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceUseCase;
import com.nhom4.useCase.editInvoice.EditInvoiceInputDTO;
import com.nhom4.database.EditInvoiceDAOMySQL;
import com.nhom4.ui.editInvoice.EditInvoiceController;
import com.nhom4.ui.editInvoice.EditInvoicePresenter;
import com.nhom4.ui.editInvoice.EditInvoiceViewModel;

public class EditInvoiceTest extends Nhom4Test {
    private EditInvoiceInputDTO getEditInvoiceInputDTO() {
        EditInvoiceInputDTO editInvoiceInputDTO = new EditInvoiceInputDTO();
        editInvoiceInputDTO.setMaHD("8");

        return editInvoiceInputDTO;
    }

    @Test
    public void editInvoiceSuccess() throws Exception {
        EditInvoiceViewModel editInvoiceViewModel = new EditInvoiceViewModel();
        EditInvoiceOutputBoundary editInvoiceOutputBoundary = new EditInvoicePresenter(null, editInvoiceViewModel);
        EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary = new EditInvoiceDAOMySQL(ipAddress, port, db, username, password);
        EditInvoiceInputBoundary editInvoiceInputBoundary = new EditInvoiceUseCase(editInvoiceOutputBoundary, editInvoiceDatabaseBoundary);
        EditInvoiceController editInvoiceController = new EditInvoiceController(editInvoiceInputBoundary);

        // find id 1
        EditInvoiceInputDTO editInvoiceInputDTO = getEditInvoiceInputDTO();
        editInvoiceController.executeFind(editInvoiceInputDTO);

        assertEquals(editInvoiceViewModel.msg, "Đã lấy thành công hóa đơn! (KH: " + editInvoiceInputDTO.getMaHD() + ")");
        assertEquals(editInvoiceViewModel.maHD, editInvoiceInputDTO.getMaHD());

        // update name (+ "0") for id 1
        editInvoiceInputDTO.setTenKH(editInvoiceViewModel.tenKH + "0");
        editInvoiceInputDTO.setNgayHD(editInvoiceViewModel.ngayHD);
        editInvoiceInputDTO.setMaPhong(editInvoiceViewModel.maPhong);
        editInvoiceInputDTO.setDonGia(editInvoiceViewModel.donGia);
        editInvoiceInputDTO.setLoaiHoaDon(editInvoiceViewModel.loaiHoaDon);
        editInvoiceInputDTO.setSoNgay(editInvoiceViewModel.soNgay);
        editInvoiceInputDTO.setSoGio(editInvoiceViewModel.soGio);

        editInvoiceController.execute(editInvoiceInputDTO);
        assertEquals(editInvoiceViewModel.msg, "Đã sửa thành công (KH: " + editInvoiceInputDTO.getMaHD() + ")");
    }

    @Test
    public void editInvoiceError() throws Exception {
        EditInvoiceViewModel editInvoiceViewModel = new EditInvoiceViewModel();
        EditInvoiceOutputBoundary editInvoiceOutputBoundary = new EditInvoicePresenter(null, editInvoiceViewModel);
        EditInvoiceDatabaseBoundary editInvoiceDatabaseBoundary = new EditInvoiceDAOMySQL(ipAddress, port, db, username, password);
        EditInvoiceInputBoundary editInvoiceInputBoundary = new EditInvoiceUseCase(editInvoiceOutputBoundary, editInvoiceDatabaseBoundary);
        EditInvoiceController editInvoiceController = new EditInvoiceController(editInvoiceInputBoundary);

        // find id 1
        EditInvoiceInputDTO editInvoiceInputDTO = getEditInvoiceInputDTO();
        editInvoiceController.executeFind(editInvoiceInputDTO);

        assertEquals(editInvoiceViewModel.maHD, editInvoiceInputDTO.getMaHD());

        // update donGia (+ "a") for id 1
        editInvoiceInputDTO.setTenKH(editInvoiceViewModel.tenKH);
        editInvoiceInputDTO.setNgayHD(editInvoiceViewModel.ngayHD);
        editInvoiceInputDTO.setMaPhong(editInvoiceViewModel.maPhong);
        editInvoiceInputDTO.setDonGia(editInvoiceViewModel.donGia + "a");
        editInvoiceInputDTO.setLoaiHoaDon(editInvoiceViewModel.loaiHoaDon);
        editInvoiceInputDTO.setSoNgay(editInvoiceViewModel.soNgay);
        editInvoiceInputDTO.setSoGio(editInvoiceViewModel.soGio);

        editInvoiceController.execute(editInvoiceInputDTO);
        assertEquals(editInvoiceViewModel.msg, "Dữ liệu không hợp lệ!");
    }
}
