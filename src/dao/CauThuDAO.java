
package dao;

import java.util.List;
import model.CauThu;

/**
 *
 * @author AMIN
 */
public interface CauThuDAO {
    public List<CauThu> getList();
     public int createOrUpdate(CauThu cauThu);
}
