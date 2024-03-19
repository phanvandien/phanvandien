
package service;

import java.util.List;

import model.HLuyenVien;

/**
 *
 * @author AMIN
 */
public interface HLuyenVienService {
     public List<HLuyenVien> getList();
      public int createOrUpdate(HLuyenVien hLuyenVien);
}
