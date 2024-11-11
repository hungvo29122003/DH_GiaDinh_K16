package com.nhom4.ui.getListInvoice;

import java.util.List;

import com.nhom4.useCase.getListInvoice.GetListInvoiceOutputBoundary;
import com.nhom4.useCase.getListInvoice.GetListInvoiceOutputDTO;

public class GetListInvoicePresenter implements GetListInvoiceOutputBoundary {
    private GetListInvoiceView getListInvoiceView;
    private List<GetListInvoiceViewModel> listViewModel;

    public GetListInvoicePresenter(GetListInvoiceView getListInvoiceView, List<GetListInvoiceViewModel> getListInvoiceViewModel) {
        this.getListInvoiceView = getListInvoiceView;
        this.listViewModel = getListInvoiceViewModel;
    }

    @Override
    public void exportError(GetListInvoiceOutputDTO responseError) {
        this.listViewModel.clear();
        GetListInvoiceViewModel getListInvoiceViewModel = new GetListInvoiceViewModel(responseError.getStatus(), responseError.getMsg());

        if (this.getListInvoiceView != null) {
            this.getListInvoiceView.showMsgError(getListInvoiceViewModel);
        }
    }

    @Override
    public void present(List<GetListInvoiceOutputDTO> listOutputDTO) {
        this.listViewModel.clear();

        String maHD;
        String tenKH;
        String ngayHD;
        String maPhong;
        String donGia;
        String loaiHoaDon;
        String soNgay;
        String soGio;
        String thanhTien;

        for (GetListInvoiceOutputDTO outputDTO : listOutputDTO) {
            maHD = String.valueOf(outputDTO.getMaHD());
            tenKH = String.valueOf(outputDTO.getTenKH());
            ngayHD = String.valueOf(outputDTO.getNgayHD());
            maPhong = String.valueOf(outputDTO.getMaPhong());
            donGia = String.valueOf(outputDTO.getDonGia());
            loaiHoaDon = String.valueOf(outputDTO.getLoaiHoaDon());
            soNgay = String.valueOf(outputDTO.getSoNgay());
            soGio = String.valueOf(outputDTO.getSoGio());
            thanhTien = String.valueOf(outputDTO.getThanhTien());

            this.listViewModel.add(new GetListInvoiceViewModel("success", "", maHD, tenKH, ngayHD, maPhong, donGia, loaiHoaDon, soNgay, soGio, thanhTien));
        }

        if (this.getListInvoiceView != null) {
            this.getListInvoiceView.showResult(this.listViewModel);
        }
    }
}
