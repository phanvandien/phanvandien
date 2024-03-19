
package controller;

import bean.DanhMucBean;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import view.CauThuJPanel;
import view.HLuyenVienJPanel;
import view.NDaoTaoJPanel;
import view.ThongKeJPanel;
import view.TranDauJPanel;
import view.TrangChuJPanel;
/**
 *
 * @author AMIN
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected ="";
    
    List<DanhMucBean> listItem = null;
    
    public ChuyenManHinhController (JPanel jpnRoot){
        this.root =jpnRoot;
    }
    
    public void setView(JPanel jpnItem , JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
         jlbItem.setBackground(new Color(96,100,191));
        
         root.removeAll();
         root.setLayout(new BorderLayout());
         root.add(new TrangChuJPanel());
         root.validate();
         root.repaint();
    }
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
        
    }
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        
        private String kind;
        
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

       
        
        @Override
        public void mouseClicked(MouseEvent e) {
           switch(kind){
               case "TrangChu":
               node = new TrangChuJPanel();
               break;
               case "CauThu":
                   node= new CauThuJPanel();
                   break;
               case "HLuyenVien":
                   node = new HLuyenVienJPanel();
                   break;
                   case "NDaoTao":
                   node = new NDaoTaoJPanel();
                   break;
                   case "TranDau":
                   node = new TranDauJPanel();
                   break;
                   case "ThongKe":
                   node = new ThongKeJPanel();
                   break;
               default:
                    node = new TrangChuJPanel();
                   break;
                   
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jlbItem.setBackground(new Color(0,204,0));
           jpnItem.setBackground(new Color(0,204,0));
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
              jlbItem.setBackground(new Color(0,204,0));
           jpnItem.setBackground(new Color(0,204,0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(kindSelected.equalsIgnoreCase(kind)){
                  jlbItem.setBackground(new Color(0,204,0));
           jpnItem.setBackground(new Color(0,204,0));
            }
        }
        
    }
    private void setChangeBackground(String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(0,204,0));
                item.getJlb().setBackground(new Color(0,204,0));
            }else{
                item.getJpn().setBackground(new Color(0,204,0));
                item.getJlb().setBackground(new Color(0,204,0));
            }
        }
    }
}
