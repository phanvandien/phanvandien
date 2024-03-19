
package dao;

import java.util.List;

import model.HLuyenVien;


/**
 *
 * @author AMIN
 */
public interface HLuyenVienDAO {
     public List<HLuyenVien> getList();
     
     public int createOrUpdate(HLuyenVien hLuyenVien);
}
