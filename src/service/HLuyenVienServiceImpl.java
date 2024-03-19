
package service;


import dao.HLuyenVienDAO;
import dao.HLuyenVienDAOImpl;
import java.util.List;
import model.HLuyenVien;


/**
 *
 * @author AMIN
 */
public class HLuyenVienServiceImpl implements HLuyenVienService  {
     private HLuyenVienDAO hLuyenVienDAO = null;
         
         public HLuyenVienServiceImpl(){
             hLuyenVienDAO = new HLuyenVienDAOImpl();
         }
    @Override
    public List<HLuyenVien> getList() {
      return hLuyenVienDAO.getList();
    }

    @Override
    public int createOrUpdate(HLuyenVien hLuyenVien) {
       return hLuyenVienDAO.createOrUpdate(hLuyenVien);
    }
}
