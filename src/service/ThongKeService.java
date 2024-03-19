
package service;

import bean.NDaoTaoBean;
import bean.TranDauBean;
import java.util.List;

/**
 *
 * @author AMIN
 */
public interface ThongKeService {
    List<TranDauBean> getListByTranDau();
     public List<NDaoTaoBean> getListByNDaoTao();
     
}
