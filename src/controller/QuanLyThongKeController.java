
package controller;

import bean.NDaoTaoBean;
import bean.TranDauBean;
import java.awt.CardLayout;
import java.awt.Dimension;


import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;

import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import service.ThongKeService;
import service.ThongKeServiceImpl;

/**
 *
 * @author AMIN
 */
public class QuanLyThongKeController {
    
      private ThongKeService thongKeService = null;
    
    public QuanLyThongKeController() {
       thongKeService =  new ThongKeServiceImpl();
    }
    
   public void setDateToChart1(JPanel jpnItem){
       List<TranDauBean> listItem = thongKeService.getListByTranDau();
      if(listItem != null){
       DefaultCategoryDataset dataset = new  DefaultCategoryDataset();
       for(TranDauBean item : listItem){
           dataset.addValue(item.getSoLuongCauThu(),"Cau Thu",item.getNgayDangKy());
           
       }
       JFreeChart chart = ChartFactory.createBarChart("Thong ke so luong cau thu dang ky","Thoi gian","So luong",dataset);
       
       ChartPanel chartPanel = new ChartPanel(chart);
       chartPanel.setPreferredSize(new Dimension (50,300));
       //chartPanel.setPreferredSize(new Dimension (jpnItem.getWidth(),300));
       
       jpnItem.removeAll();
       jpnItem.setLayout(new CardLayout());
       jpnItem.add(chartPanel);
       jpnItem.validate();
       jpnItem.repaint();
    }
    
   }
    
    public void setDataToChart3(JPanel jpnItem){
       List<TranDauBean> listItem = thongKeService.getListByTranDau();
      if(listItem != null){
       DefaultCategoryDataset dataset = new  DefaultCategoryDataset();
       for(TranDauBean item : listItem){
           dataset.addValue(item.getSoLuongHLuyenVien(),"Huan Luyen Vien",item.getNgayDangKy());
           
       }
      
       JFreeChart chart = ChartFactory.createBarChart("Thong ke so luong huan luyen vien dang ky","Thoi gian","So luong",dataset);
       
       ChartPanel chartPanel = new ChartPanel(chart);
       chartPanel.setPreferredSize(new Dimension (jpnItem.getWidth(),300));
       
       jpnItem.removeAll();
       jpnItem.setLayout(new CardLayout());
       jpnItem.add(chartPanel);
       jpnItem.validate();
       jpnItem.repaint();
    }
    }
   
   public void setDataToChart2(JPanel jpnItem){
       List<NDaoTaoBean> listItem =  thongKeService.getListByNDaoTao();
       if(listItem != null) {
           TaskSeriesCollection ds = new TaskSeriesCollection();
           TaskSeries taskSeries;
           Task task;
           for(NDaoTaoBean item :listItem) {
               taskSeries =new TaskSeries(item.getTenNDaoTao());
               task= new Task(item.getTenNDaoTao(),item.getNgayBatDau(),item.getNgayKetThuc());
               taskSeries.add(task);
               ds.add(taskSeries);
           }
           
        JFreeChart chart = ChartFactory.createGanttChart(
                "Thong ke tinh trang luyen tap cua cau thu ","Thời gian", "Số lượng",
                ds);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
       }
   }

   
}
