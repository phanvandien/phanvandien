
package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView.TableRow;
import model.CauThu;
import service.CauThuService;
import service.CauThuServiceImpl;
import utity.ClassTableModel1;
import view.CauThuJFrame;
  import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AMIN
 */
public class QuanLyCauThuController {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    
    private CauThuService cauThuService = null;
    private JTable jTable1 = null;
    
    private  String[] listColumn = {"Ma cau thu","Ho va ten","Ngay sinh","Gioi tinh"," So dien thoai","dia chi","tinh trang"};
    
    private TableRowSorter    rowSorter = null;

    public QuanLyCauThuController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
      
        this.cauThuService = new CauThuServiceImpl();
    }
    
    public void setDataToTable(){
        List<CauThu> listItem =  cauThuService.getList();
        
        DefaultTableModel model = new ClassTableModel1().setTableCauThu(listItem, listColumn);
        JTable table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
              String text = jtfSearch.getText();
              if(text.trim().length() ==0){
                  rowSorter.setRowFilter(null);
              }else{
                  rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
              }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               String text = jtfSearch.getText();
              if(text.trim().length() ==0){
                  rowSorter.setRowFilter(null);
              }else{
                  rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
              }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            
        }
        
        
        
    });
//        table.getColumnModel().getColumn(1).setMaxWidth(80);
//        table.getColumnModel().getColumn(1).setMinWidth(80);
//        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        
        table.addMouseListener(new MouseAdapter()  {
            @Override 
            public void mouseClicked(MouseEvent e)  {
                if(e.getClickCount() == 2 && table.getSelectedRow() !=-1){
                    DefaultTableModel model =(DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    System.out.println(selectedRowIndex);
                    
                    CauThu cauThu = new CauThu();
                    cauThu.setMa_cau_thu((int) model.getValueAt(selectedRowIndex,0));
                    cauThu.setHo_ten(model.getValueAt(selectedRowIndex,1).toString());
                     cauThu.setNgay_sinh( model.getValueAt(selectedRowIndex, 2).toString());
                            
                    cauThu.setGioi_tinh(model.getValueAt(selectedRowIndex,3).toString().equalsIgnoreCase("Nam"));
                    cauThu.setSo_dien_thoai(model.getValueAt(selectedRowIndex, 4) != null ?
                           model.getValueAt(selectedRowIndex, 4).toString():null );
                    
                   cauThu.setDia_chi(model.getValueAt(selectedRowIndex, 5) != null
                            ? model.getValueAt(selectedRowIndex, 5).toString() : null);
                            
                    cauThu.setTinh_trang((boolean) model.getValueAt(selectedRowIndex, 6));
                    
                    
                    CauThuJFrame frame = new CauThuJFrame(cauThu);
                    frame.setTitle("Thong tin cau thu");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }  
                }
            });
            
        
        
         table.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
     } 
    public void setEvent(){
        btnAdd.addMouseListener( new MouseAdapter()  {
            @Override
        public void mouseClicked(MouseEvent e) {
            CauThuJFrame frame = new CauThuJFrame(new CauThu());
            frame.setTitle("Thông tin cầu thủ");
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
    }
        
          @Override
        public void mouseEntered(MouseEvent e) {
             btnAdd.setBackground(new Color(0,200,83));
    }
        
          @Override
        public void mouseExited(MouseEvent e) {
             btnAdd.setBackground(new Color(100,221,23));
    }  
        });
     
//        btnPrint.addMouseListener( new MouseAdapter()  {
//             List<CauThu> listItem =  cauThuService.getList();
//        
//        DefaultTableModel model = new ClassTableModel1().setTableCauThu(listItem, listColumn);
//        JTable table = new JTable(model);
//        
////        rowSorter = new TableRowSorter<>(table.getModel());
////        table.setRowSorter(rowSorter);
////        
//            @Override
//        public void mouseClicked(MouseEvent e) {
//                 try {
//                     OPCPackage pkg = OPCPackage.open("D:/cau_thu.xlsx");
//                      XSSFWorkbook wb =  (XSSFWorkbook) WorkbookFactory.create(pkg);
//                       XSSFSheet ws = wb.createSheet();
//            DefaultTableModel model = new ClassTableModel1().setTableCauThu(listItem, listColumn);
//           TreeMap<String,Object[]> map = new TreeMap<>();
//           
//           map.put("0", new Object[]{model.getColumnName(0),model.getColumnName(1),model.getColumnName(2),
//           model.getColumnName(3),model.getColumnName(4),model.getColumnName(5),model.getColumnName(6)}  );
//            
//////           for(Map.Entry<String,Object[]> entry : map.entrySet()) {
//////               String key = entry.getKey();
//////               Object[] rowSorter = entry.getValue();
//////                System.out.println(rowSorter); 
////            
////        } 
//            for(int i = 1; i< model.getRowCount();i++){
//                map.put(Integer.toString(i),new Object[]{model.getValueAt(i, 0),model.getValueAt(i, 1),model.getValueAt(i, 2),
//                model.getValueAt(i, 3),model.getValueAt(i, 4),model.getValueAt(i, 5),model.getValueAt(i, 6)});
//            }
//            
//            Set<String> id = map.keySet();
//            XSSFRow fRow;
//            
//            int rowId = 0;
//            for(String key :id){
//                 fRow = ws.createRow(rowId++);
//                 Object[] rowSorter = map.get(key);
//                 int cellId = 0;
//            for(Object object : rowSorter){
//                XSSFCell cell = fRow.createCell(cellId);
//                cell.setCellValue(object.toString());
//                 }
//             }
//            
//                 FileOutputStream fos = new  FileOutputStream(new File("D:/cau_thu.xlsx")); 
//                 wb.write(fos);
//                 JOptionPane.showMessageDialog(btnPrint, "file exported success ");
//          
//                 } catch (InvalidFormatException ex) {
//                     Logger.getLogger(QuanLyCauThuController.class.getName()).log(Level.SEVERE, null, ex);
//                 }
        
          
//            
//    }      
//        
//          @Override
//        public void mouseEntered(MouseEvent e) {
//             btnPrint.setBackground(new Color(0,200,83));
//    }
//        
//          @Override
//        public void mouseExited(MouseEvent e) {
//             btnPrint.setBackground(new Color(100,221,23));
//    }  
//        });

           
}
}