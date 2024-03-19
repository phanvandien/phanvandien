
package controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import model.HLuyenVien;


import service.HLuyenVienService;
import service.HLuyenVienServiceImpl;

import utity.ClassTableModel2;

import view.HLuyenVienJFrame;
/**
 *
 * @author AMIN
 */
public class QuanLyHLuyenVienController {
     private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
   
    private HLuyenVienService hLuyenVienService = null;
    
    private  String[] listColumn = {"Ma huan luyen vien","Ho va ten","Ngay sinh","Gioi tinh"," Gmail ","dia chi","tinh trang"};
    
    private TableRowSorter    rowSorter = null;

    public QuanLyHLuyenVienController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        
        this.hLuyenVienService = new HLuyenVienServiceImpl();
    }
    
    public void setDataToTable(){
        List<HLuyenVien> listItem =  hLuyenVienService.getList();
        
        DefaultTableModel model = new ClassTableModel2().setTableHLuyenVien(listItem, listColumn);
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
                    
                    HLuyenVien hLuyenVien = new HLuyenVien();
                    hLuyenVien.setMa_huan_luyen_vien((int) model.getValueAt(selectedRowIndex,0));
                    hLuyenVien.setHo_ten(model.getValueAt(selectedRowIndex,1).toString());
                     hLuyenVien.setNgay_sinh( model.getValueAt(selectedRowIndex, 2).toString());
                            
                    hLuyenVien.setGioi_tinh(model.getValueAt(selectedRowIndex,3).toString().equalsIgnoreCase("Nam"));
                   hLuyenVien.setGmail(model.getValueAt(selectedRowIndex, 4) != null ?
                           model.getValueAt(selectedRowIndex, 4).toString():null );
                    
                   hLuyenVien.setDia_chi(model.getValueAt(selectedRowIndex, 5) != null
                            ? model.getValueAt(selectedRowIndex, 5).toString() : null);
                            
                   hLuyenVien.setTinh_trang((boolean) model.getValueAt(selectedRowIndex, 6));
                    
                    
                    HLuyenVienJFrame frame = new HLuyenVienJFrame(hLuyenVien);
                    frame.setTitle("Thong tin huan luyen vien");
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
            HLuyenVienJFrame frame = new HLuyenVienJFrame(new HLuyenVien());
            frame.setTitle("Thong tin huan luyen vien");
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
    }
}
