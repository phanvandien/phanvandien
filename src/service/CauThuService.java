/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.CauThu;

/**
 *
 * @author AMIN
 */
public interface CauThuService {
    public List<CauThu> getList();
     public int createOrUpdate(CauThu cauThu);
}
