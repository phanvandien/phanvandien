
package utity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.CauThu;

/**
 *
 * @author AMIN
 */
public class ClassTableModel1 {
    
    public DefaultTableModel setTableCauThu(List<CauThu> listItem , String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
             public boolean isCellEditable(int row , int column) {
                 return false;
             }
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows >0 ){
            for(int i=0;i<rows;i++){
                CauThu cauThu = listItem.get(i);
                obj = new Object[columns];
                obj[0] = cauThu.getMa_cau_thu();
                obj[1] = cauThu.getHo_ten();
                obj[2] = cauThu.getNgay_sinh();
                obj[3] = cauThu.isGioi_tinh() == true ? "Nam" : "Nu";
                obj[4] = cauThu.getSo_dien_thoai();
                obj[5] = cauThu.getDia_chi();
                obj[6] = cauThu.isTinh_trang();
                dtm.addRow(obj);

            }
        }
        return dtm;
    }
    
}
