
package utity;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import model.HLuyenVien;

/**
 *
 * @author AMIN
 */
public class ClassTableModel2 {
     public DefaultTableModel setTableHLuyenVien(List<HLuyenVien> listItem , String[] listColumn){
        DefaultTableModel dtm2 = new DefaultTableModel(){
            @Override
             public boolean isCellEditable(int row , int column) {
                 return false;
             }
        };
        dtm2.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows >0 ){
            for(int i=0;i<rows;i++){
                HLuyenVien hLuyenVien = listItem.get(i);
                obj = new Object[columns];
                obj[0] = hLuyenVien.getMa_huan_luyen_vien();
                obj[1] = hLuyenVien.getHo_ten();
                obj[2] = hLuyenVien.getNgay_sinh();
                obj[3] = hLuyenVien.isGioi_tinh() == true ? "Nam" : "Nu";
                obj[4] = hLuyenVien.getGmail();
                obj[5] = hLuyenVien.getDia_chi();
                obj[6] = hLuyenVien.isTinh_trang();
                dtm2.addRow(obj);

            }
        }
        return dtm2;
    }
}
