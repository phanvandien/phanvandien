/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.NDaoTaoBean;
import bean.TranDauBean;
import dao.ThongKeDAO;
import dao.ThongKeDaoImpl;
import java.util.List;

/**
 *
 * @author AMIN
 */
public class ThongKeServiceImpl implements ThongKeService {
  
    private ThongKeDAO thongKeDAO = null;
    
    public ThongKeServiceImpl() {
        thongKeDAO = new ThongKeDaoImpl();
    }
    @Override
    public List<TranDauBean> getListByTranDau() {
       return thongKeDAO.getListByTranDau();
    }

    @Override
    public List<NDaoTaoBean> getListByNDaoTao() {
       return thongKeDAO.getListByNDaoTao();
    }
    
}
