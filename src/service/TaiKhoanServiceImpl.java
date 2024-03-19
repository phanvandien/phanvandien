/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.TaiKhoanDao;
import dao.TaiKhoanDaoImpl;
import model.Taikhoan;

/**
 *
 * @author AMIN
 */
public class TaiKhoanServiceImpl implements TaiKhoanService {
       private TaiKhoanDao taiKhoanDao = null;
       public TaiKhoanServiceImpl(){
           taiKhoanDao = new TaiKhoanDaoImpl();
       }
    @Override
    public Taikhoan login(String tdn, String mk) {
       return taiKhoanDao.login(tdn,mk);
    }
    
    
}
