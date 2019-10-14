package Operatore_BOT_GUI.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.dial.ArcDialFrame;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.DialTextAnnotation;
import org.jfree.chart.plot.dial.DialValueIndicator;
import org.jfree.chart.plot.dial.StandardDialRange;
import org.jfree.chart.plot.dial.StandardDialScale;
import org.jfree.data.general.DefaultValueDataset;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

public class DialChart {
	
	private DefaultValueDataset value_dataset;
	
	public DialChart (double value) {
		value_dataset = new DefaultValueDataset (value);
	}
	
	
	public Image drawDialChart(double max, String nome_azienda) {
		
		DialPlot dialplot = new DialPlot();		

		this.setColorRadius(dialplot, max);
		
		dialplot.setDataset(this.value_dataset);
		dialplot.setDialFrame(new ArcDialFrame(-172, -196));
		dialplot.setBackground(new DialBackground());
		DialTextAnnotation dialtextannotation = new DialTextAnnotation("indicatore");
		dialtextannotation.setFont(new Font("Dialog", 1, 14));
		dialtextannotation.setRadius(0.69999999999999996D);
		dialplot.addLayer(dialtextannotation);
		DialValueIndicator dialvalueindicator = new DialValueIndicator(0);
		dialplot.addLayer(dialvalueindicator);
		StandardDialScale standarddialscale = new StandardDialScale(0, max, -180, -180, 1, 4);
		standarddialscale.setMajorTickIncrement(1);
		standarddialscale.setMinorTickCount(4);
		standarddialscale.setTickRadius(0.72D);
		standarddialscale.setTickLabelOffset(0.12D);
		standarddialscale.setTickLabelFont(new Font("Dialog", Font.BOLD, 14));
		standarddialscale.setTickLabelPaint(Color.BLACK);
		dialplot.addScale(0, standarddialscale);
		org.jfree.chart.plot.dial.DialPointer.Pointer pointer = new org.jfree.chart.plot.dial.DialPointer.Pointer();
		pointer.setFillPaint(Color.DARK_GRAY);
		pointer.setRadius(0.54);
		dialplot.addPointer(pointer);
		DialCap dialcap = new DialCap();
		dialplot.setCap(dialcap);
		

		
		
		
		
		
		
		
		JFreeChart chart = new JFreeChart(nome_azienda + "\n" + value_dataset.getValue(), dialplot);
		
		BufferedImage image = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

		chart.draw(g2, new Rectangle2D.Double(0, 0, 400, 400), null, null);
        g2.dispose();
		
        BufferedImage chart_image = chart.createBufferedImage(400, 400);
//        File outputfile = new File("C:\\Users\\fabio\\Desktop\\prova1.png");
//        try {
//			ImageIO.write(chart_image, "png", outputfile);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        System.out.println("Finito");
        
        return SwingFXUtils.toFXImage(chart_image, null );
        
	}
	
	
	private void setColorRadius (DialPlot dialplot, double max) {
		double fraction = max / 7;
		double radiusMin = 0.71d, radiusMax = 0.73d, max_value;
//		double radiusMin = 0.40d, radiusMax = 0.42d;
		
		StandardDialRange range1 = new StandardDialRange(0, fraction, Color.red);
		range1.setInnerRadius(radiusMin);
		range1.setOuterRadius(radiusMax);
		dialplot.addLayer(range1);
		StandardDialRange range2 = new StandardDialRange(fraction, 2*fraction, new Color(255, 140, 26));
		range2.setInnerRadius(radiusMin);
		range2.setOuterRadius(radiusMax);
		dialplot.addLayer(range2);
		StandardDialRange range3 = new StandardDialRange(2*fraction, 3*fraction, new Color(255, 204, 0));
		range3.setInnerRadius(radiusMin);
		range3.setOuterRadius(radiusMax);
		dialplot.addLayer(range3);
//		StandardDialRange range4 = new StandardDialRange(3*fraction, 4*fraction, new Color(255, 153, 51));
//		range4.setInnerRadius(radiusMin);
//		range4.setOuterRadius(radiusMax);
//		dialplot.addLayer(range4);
		StandardDialRange range5 = new StandardDialRange(3*fraction, 4*fraction, new Color(255, 255, 0));
		range5.setInnerRadius(radiusMin);
		range5.setOuterRadius(radiusMax);
		dialplot.addLayer(range5);
		StandardDialRange range6 = new StandardDialRange(4*fraction, 5*fraction, new Color(204, 255, 51));
		range6.setInnerRadius(radiusMin);
		range6.setOuterRadius(radiusMax);
		dialplot.addLayer(range6);
		StandardDialRange range7 = new StandardDialRange(5*fraction, 6*fraction, new Color(153, 255, 51));
		range7.setInnerRadius(radiusMin);
		range7.setOuterRadius(radiusMax);
		dialplot.addLayer(range7);
		StandardDialRange range8 = new StandardDialRange(6*fraction, 7*fraction, new Color(57, 230, 0));
		range8.setInnerRadius(radiusMin);
		range8.setOuterRadius(radiusMax);
		dialplot.addLayer(range8);
	}

}