
package model;

import java.util.Date;

/**
 *
 * @author AMIN
 */
public class HLuyenVien {
    private int ma_huan_luyen_vien;
    private String ho_ten;
    private String ngay_sinh;
    private boolean gioi_tinh;
    private boolean tinh_trang;
    private String dia_chi;
    private String gmail;

    public int getMa_huan_luyen_vien() {
        return ma_huan_luyen_vien;
    }

    public void setMa_huan_luyen_vien(int ma_huan_luyen_vien) {
        this.ma_huan_luyen_vien = ma_huan_luyen_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
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

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    
    
}
