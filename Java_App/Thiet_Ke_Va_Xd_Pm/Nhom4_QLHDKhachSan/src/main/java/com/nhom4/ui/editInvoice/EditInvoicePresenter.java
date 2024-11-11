package com.nhom4.ui.editInvoice;

import com.nhom4.useCase.editInvoice.EditInvoiceOutputBoundary;
import com.nhom4.useCase.editInvoice.EditInvoiceOutputDTO;

public class EditInvoicePresenter implements EditInvoiceOutputBoundary {
    private EditInvoiceView editInvoiceView;
    private EditInvoiceViewModel editInvoiceViewModel;

    public EditInvoicePresenter(EditInvoiceView editInvoiceView, EditInvoiceViewModel editInvoiceViewModel) {
        this.editInvoiceView = editInvoiceView;
        this.editInvoiceViewModel = editInvoiceViewModel;
    }

    public EditInvoiceViewModel getEditInvoiceViewModel() {
        return this.editInvoiceViewModel;
    }

    @Override
    public void exportError(EditInvoiceOutputDTO responseError) {
        editInvoiceViewModel.status = responseError.getStatus();
        editInvoiceViewModel.msg = responseError.getMsg();

        if (this.editInvoiceView != null) {
            this.editInvoiceView.showMsgError(this.editInvoiceViewModel);
        }
    }

    @Override
    public void present(EditInvoiceOutputDTO outputDTO) {
        editInvoiceViewModel.msg = outputDTO.getMsg();
        editInvoiceViewModel.status = outputDTO.getStatus();

        if (this.editInvoiceView != null) {
            this.editInvoiceView.showMsgResult(this.editInvoiceViewModel);
        }
    }

    @Override
    public void presentFind(EditInvoiceOutputDTO editInvoiceOutputDTO) {
        editInvoiceViewModel.status = editInvoiceOutputDTO.getStatus();
        editInvoiceViewModel.msg = editInvoiceOutputDTO.getMsg();
        editInvoiceViewModel.maHD = editInvoiceOutputDTO.getMaHD();
        editInvoiceViewModel.tenKH = editInvoiceOutputDTO.getTenKH();
        editInvoiceViewModel.ngayHD = editInvoiceOutputDTO.getNgayHD();
        editInvoiceViewModel.donGia = editInvoiceOutputDTO.getDonGia();
        editInvoiceViewModel.maPhong = editInvoiceOutputDTO.getMaPhong();
        editInvoiceViewModel.loaiHoaDon = editInvoiceOutputDTO.getLoaiHoaDon();
        editInvoiceViewModel.soNgay = editInvoiceOutputDTO.getSoNgay();
        editInvoiceViewModel.soGio = editInvoiceOutputDTO.getSogio();

        if (this.editInvoiceView != null) {
            this.editInvoiceView.showInvoice(this.editInvoiceViewModel);
        }
    }
}
