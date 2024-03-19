
package bean;

/**
 *
 * @author AMIN
 */
public class TranDauBean {
    private String ngayDangKy;
    private int soLuongCauThu;
    private String ngayDangKi;
    private int soLuongHLuyenVien;
    
    public TranDauBean() {
    }

    public TranDauBean(String ngayDangKy, int soLuongCauThu, String ngayDangKi, int soLuongHLuyenVien) {
        this.ngayDangKy = ngayDangKy;
        this.soLuongCauThu = soLuongCauThu;
        this.ngayDangKi = ngayDangKi;
        this.soLuongHLuyenVien = soLuongHLuyenVien;
    }

    public String getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(String ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    public int getSoLuongHLuyenVien() {
        return soLuongHLuyenVien;
    }

    public void setSoLuongHLuyenVien(int soLuongHLuyenVien) {
        this.soLuongHLuyenVien = soLuongHLuyenVien;
    }
 
    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public int getSoLuongCauThu() {
        return soLuongCauThu;
    }

    public void setSoLuongCauThu(int soLuongCauThu) {
        this.soLuongCauThu = soLuongCauThu;
    }
    
    
}
