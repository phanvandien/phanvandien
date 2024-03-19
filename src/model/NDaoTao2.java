
package model;

/**
 *
 * @author AMIN
 */
public class NDaoTao2 {
    private int ma_noi_dao_tao;
    private String ten_noi_dao_tao;
    private String mo_ta;
    private String ngay_bat_dau;
    private String ngay_ket_thuc;
    private String tinh_trang;

    public NDaoTao2() {
    }

    public NDaoTao2(int ma_noi_dao_tao, String ten_noi_dao_tao, String mo_ta, String ngay_bat_dau, String ngay_ket_thuc, String tinh_trang) {
        this.ma_noi_dao_tao = ma_noi_dao_tao;
        this.ten_noi_dao_tao = ten_noi_dao_tao;
        this.mo_ta = mo_ta;
        this.ngay_bat_dau = ngay_bat_dau;
        this.ngay_ket_thuc = ngay_ket_thuc;
        this.tinh_trang = tinh_trang;
    }

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

    public String getNgay_bat_dau() {
        return ngay_bat_dau;
    }

    public void setNgay_bat_dau(String ngay_bat_dau) {
        this.ngay_bat_dau = ngay_bat_dau;
    }

    public String getNgay_ket_thuc() {
        return ngay_ket_thuc;
    }

    public void setNgay_ket_thuc(String ngay_ket_thuc) {
        this.ngay_ket_thuc = ngay_ket_thuc;
    }

    public String getTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(String tinh_trang) {
        this.tinh_trang = tinh_trang;
    }
    
    
}
