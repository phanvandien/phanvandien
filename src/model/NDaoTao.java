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
public class NDaoTao {
    private int ma_noi_dao_tao;
    private String ten_noi_dao_tao;
    private String mo_ta;
    private Date ngay_bat_dau;
    private Date ngay_ket_thuc;
    private boolean tinh_trang;

    public int getMa_noi_dao_tao() {
        return ma_noi_dao_tao;
    }

    public void setMa_noi_dao_tao(int ma_noi_dao_tao) {
        this.ma_noi_dao_tao = ma_noi_dao_tao;
    }

    public String getTen_noi_dao_tao() {
        return ten_noi_dao_tao;
    }

    public void setTen_noi_dao_tao(String ten_noi_dao_tao) {
        this.ten_noi_dao_tao = ten_noi_dao_tao;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public Date getNgay_bat_dau() {
        return ngay_bat_dau;
    }

    public void setNgay_bat_dau(Date ngay_bat_dau) {
        this.ngay_bat_dau = ngay_bat_dau;
    }

    public Date getNgay_ket_thuc() {
        return ngay_ket_thuc;
    }

    public void setNgay_ket_thuc(Date ngay_ket_thuc) {
        this.ngay_ket_thuc = ngay_ket_thuc;
    }

    public boolean isTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(boolean tinh_trang) {
        this.tinh_trang = tinh_trang;
    }
    
    
}
