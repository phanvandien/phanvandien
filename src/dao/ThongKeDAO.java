
package dao;

import bean.NDaoTaoBean;
import bean.TranDauBean;
import java.util.List;

/**
 *
 * @author AMIN
 */
public interface ThongKeDAO {
    public List<TranDauBean> getListByTranDau();
    public List<NDaoTaoBean> getListByNDaoTao();
}
