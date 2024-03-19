
package model;

/**
 *
 * @author AMIN
 */
public class TranDau2 {
    private int ma_tran_dau;
    private int ma_cau_thu;
    private int ma_huan_luyen_vien;
    private int ma_noi_dao_tao;
    private String ngay_dang_ky;
    private String tinh_trang;

    public TranDau2() {
    }

    public TranDau2(int ma_tran_dau, int ma_cau_thu, int ma_huan_luyen_vien, int ma_noi_dao_tao, String ngay_dang_ky, String tinh_trang) {
        this.ma_tran_dau = ma_tran_dau;
        this.ma_cau_thu = ma_cau_thu;
        this.ma_huan_luyen_vien = ma_huan_luyen_vien;
        this.ma_noi_dao_tao = ma_noi_dao_tao;
        this.ngay_dang_ky = ngay_dang_ky;
        this.tinh_trang = tinh_trang;
    }

    public int getMa_tran_dau() {
        return ma_tran_dau;
    }

    public void setMa_tran_dau(int ma_tran_dau) {
        this.ma_tran_dau = ma_tran_dau;
    }

    public int getMa_cau_thu() {
        return ma_cau_thu;
    }

    public void setMa_cau_thu(int ma_cau_thu) {
        this.ma_cau_thu = ma_cau_thu;
    }

    public int getMa_huan_luyen_vien() {
        return ma_huan_luyen_vien;
    }

    public void setMa_huan_luyen_vien(int ma_huan_luyen_vien) {
        this.ma_huan_luyen_vien = ma_huan_luyen_vien;
    }

    public int getMa_noi_dao_tao() {
        return ma_noi_dao_tao;
    }

    public void setMa_noi_dao_tao(int ma_noi_dao_tao) {
        this.ma_noi_dao_tao = ma_noi_dao_tao;
    }

    public String getNgay_dang_ky() {
        return ngay_dang_ky;
    }

    public void setNgay_dang_ky(String ngay_dang_ky) {
        this.ngay_dang_ky = ngay_dang_ky;
    }

    public String getTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(String tinh_trang) {
        this.tinh_trang = tinh_trang;
    }

  
    
    
}
