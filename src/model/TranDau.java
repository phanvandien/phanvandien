/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author AMIN
 */
public class TranDau {
    private int ma_tran_dau;
    private CauThu cauThu;
    private HLuyenVien hLuyenVien;
    private NDaoTao nDaoTao;
    private Date ngay_dang_ky;
    private boolean tinh_trang;

    public TranDau() {
    }

    public TranDau(int ma_tran_dau, CauThu cauThu, HLuyenVien hLuyenVien, NDaoTao nDaoTao, Date ngay_dang_ky, boolean tinh_trang) {
        this.ma_tran_dau = ma_tran_dau;
        this.cauThu = cauThu;
        this.hLuyenVien = hLuyenVien;
        this.nDaoTao = nDaoTao;
        this.ngay_dang_ky = ngay_dang_ky;
        this.tinh_trang = tinh_trang;
    }
    
    
    public int getMa_tran_dau() {
        return ma_tran_dau;
    }

    public void setMa_tran_dau(int ma_tran_dau) {
        this.ma_tran_dau = ma_tran_dau;
    }

    public CauThu getCauThu() {
        return cauThu;
    }

    public void setCauThu(CauThu cauThu) {
        this.cauThu = cauThu;
    }

    public HLuyenVien gethLuyenVien() {
        return hLuyenVien;
    }

    public void sethLuyenVien(HLuyenVien hLuyenVien) {
        this.hLuyenVien = hLuyenVien;
    }

    public Date getNgay_dang_ky() {
        return ngay_dang_ky;
    }

    public void setNgay_dang_ky(Date ngay_dang_ky) {
        this.ngay_dang_ky = ngay_dang_ky;
    }

    public boolean isTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(boolean tinh_trang) {
        this.tinh_trang = tinh_trang;
    }

    public NDaoTao getnDaoTao() {
        return nDaoTao;
    }

    public void setnDaoTao(NDaoTao nDaoTao) {
        this.nDaoTao = nDaoTao;
    }
    
    
}
