
package model;

import java.util.Date;

/**
 *
 * @author AMIN
 */
public class CauThu {
    private int ma_cau_thu;
    private String ho_ten;
    private String so_dien_thoai;
    private String dia_chi;
    private String ngay_sinh;
    private boolean gioi_tinh;
    private boolean tinh_trang;

    public int getMa_cau_thu() {
        return ma_cau_thu;
    }

    public void setMa_cau_thu(int ma_cau_thu) {
        this.ma_cau_thu = ma_cau_thu;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

   

    public boolean isGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(boolean gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public boolean isTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(boolean tinh_trang) {
        this.tinh_trang = tinh_trang;
    }
    
    
}
