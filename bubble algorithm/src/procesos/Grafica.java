/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;
//import java.aut.Color;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author raufa
 */
public class Grafica {
    public void crearHistograma( int[] histograma,JPanel Panel,Color ColorBarra){
        DefaultCategoryDataset dataset =new DefaultCategoryDataset();
        String serie="numero";
        for(int i=0;i < histograma.length;i++){
            dataset.addValue(histograma[i],serie,""+i);
            
            
        }
        JFreeChart chart= ChartFactory.createBarChart("histograma",null,null,dataset,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot trama =(CategoryPlot)chart.getPlot();
        BarRenderer render=(BarRenderer) trama.getRenderer();
        render.setSeriesPaint(0,ColorBarra);
        chart.setAntiAlias(true);
        chart.setBackgroundPaint(new Color(214,217,223));
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
        
        
        
        
    }
    
}
