
package service;

import dao.CauThuDAO;
import dao.CauThuDAOImpl;
import java.util.List;
import model.CauThu;

/**
 *
 * @author AMIN
 */
public class CauThuServiceImpl implements CauThuService {
         private CauThuDAO cauThuDAO = null;
      
         
         public CauThuServiceImpl(){
             cauThuDAO = new CauThuDAOImpl();
         }
    @Override
    public List<CauThu> getList() {
      return cauThuDAO.getList();
    }

    @Override
    public int createOrUpdate(CauThu cauThu) {
        return cauThuDAO.createOrUpdate(cauThu);
    }
    
}
