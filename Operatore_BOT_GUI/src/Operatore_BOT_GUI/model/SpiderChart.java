package Operatore_BOT_GUI.model;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.NumberFormat;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.RectangleInsets;
import org.jfree.util.TableOrder;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

public class SpiderChart {

	private DefaultCategoryDataset category_dataset = new DefaultCategoryDataset();
	private String[] labels;
	
	public SpiderChart (String[] lbs) {
		this.labels = lbs;
	}
	
	public SpiderChart () {
		
	}

	
	public void insertDataSeries (String azienda, float[] values) {
		for (int i=0; i<labels.length; i++)
			category_dataset.addValue(values[i], azienda, labels[i]);
	}
	
	
	public Image drawSpiderChart () {
		
		final SpiderWebPlot plot = new SpiderWebPlot(category_dataset) {

		private static final long serialVersionUID = 1L;
			//put this many labels on each axis.
            private int ticks = DEFAULT_TICKS;
            private static final int DEFAULT_TICKS = 5;
            private NumberFormat format = NumberFormat.getInstance();
            //constant for creating perpendicular tick marks.
            private static final double PERPENDICULAR = 90;
            //the size of a tick mark, as a percentage of the entire line length.
            private static final double TICK_SCALE = 0.015;
            //the gap between the axis line and the numeric label itself.
            private int valueLabelGap = DEFAULT_GAP;
            private static final int DEFAULT_GAP = 10;
            //the threshold used for determining if something is "on" the axis
            private static final double THRESHOLD = 15;

            /**
             * {@inheritDoc}
             */
            @Override
            protected void drawLabel(final Graphics2D g2, final  Rectangle2D plotArea, final double value, final int cat, final double startAngle, final double extent) {
                super.drawLabel(g2, plotArea, value, cat, startAngle, extent);
                final FontRenderContext frc = g2.getFontRenderContext();
                final double[] transformed = new double[2];
                final double[] transformer = new double[2];
                final Arc2D arc1 = new Arc2D.Double(plotArea, startAngle, 0, Arc2D.OPEN);

                for (int i = 1; i <= ticks; i++) { //for each tick on current axis
                    final Point2D point1 = arc1.getEndPoint();

                    final double deltaX = plotArea.getCenterX();
                    final double deltaY = plotArea.getCenterY();
                    double labelX = point1.getX() - deltaX;
                    double labelY = point1.getY() - deltaY;

                    final double scale = ((double)i/(double)ticks);
                    final AffineTransform tx = AffineTransform.getScaleInstance(scale,scale);
                    //for getting the tick mark start points.
                    final AffineTransform pointTrans = AffineTransform.getScaleInstance(scale + TICK_SCALE, scale + TICK_SCALE);
                    transformer[0] = labelX;
                    transformer[1] = labelY;
                    pointTrans.transform(transformer, 0, transformed, 0, 1);
                    final double pointX = transformed[0] + deltaX;
                    final double pointY = transformed[1] + deltaY;
                    tx.transform(transformer, 0, transformed, 0, 1);
                    labelX = transformed[0] + deltaX;
                    labelY = transformed[1] + deltaY;

                    double rotated = (PERPENDICULAR);
                    AffineTransform rotateTrans = AffineTransform.getRotateInstance(Math.toRadians(rotated), labelX, labelY);
                    transformer[0] = pointX;
                    transformer[1] = pointY;
                    rotateTrans.transform(transformer, 0, transformed, 0, 1);
                    final double x1 = transformed[0];
                    final double y1 = transformed[1];

                    rotated = (-PERPENDICULAR);
                    rotateTrans = AffineTransform.getRotateInstance(Math.toRadians(rotated), labelX, labelY);
                    rotateTrans.transform(transformer, 0, transformed, 0, 1);

                    final Composite saveComposite = g2.getComposite();
                    g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
                    g2.draw(new Line2D.Double(transformed[0], transformed[1], x1, y1));

                    if (startAngle == getStartAngle()) {
                        final String label = format.format(((double)i/(double)ticks)*this.getMaxValue());
                        final LineMetrics lm = getLabelFont().getLineMetrics(label, frc);
                        final double ascent = lm.getAscent();

                        //move based on quadrant.
                        if (Math.abs(labelX -plotArea.getCenterX()) < THRESHOLD) {
                            //on Y Axis, label to right.
                            labelX += valueLabelGap;
                            //center vertically.
                            labelY += ascent/2f;
                        } else if (Math.abs(labelY - plotArea.getCenterY()) < THRESHOLD) {
                            //on X Axis, label underneath.
                            labelY += valueLabelGap;
                        } else if (labelX >= plotArea.getCenterX()) {
                            if (labelY < plotArea.getCenterY()) {
                                //quadrant 1
                                labelX += valueLabelGap;
                                labelY += valueLabelGap;
                            } else {
                                //quadrant 2
                                labelX -= valueLabelGap;
                                labelY += valueLabelGap;
                            }
                        } else {
                            if (labelY > plotArea.getCenterY()) {
                                //quadrant 3
                                labelX -= valueLabelGap;
                                labelY -= valueLabelGap;
                            } else {
                                //quadrant 4
                                labelX += valueLabelGap;
                                labelY -= valueLabelGap;
                            }
                        }
                        g2.setPaint(getLabelPaint());
                        g2.setFont(getLabelFont());
                        g2.drawString(label, (float) labelX, (float) labelY);
                    }
                    g2.setComposite(saveComposite);
                }//next tick
            }//drawLabel()

            /**
             * {@inheritDoc}
             */
            @Override
            public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info) {
//changed code lines to implement web grid are not inlined:
                // adjust for insets...
                RectangleInsets insets = getInsets();
                insets.trim(area);

                if (info != null) {
                    info.setPlotArea(area);
                    info.setDataArea(area);
                }

                drawBackground(g2, area);
                drawOutline(g2, area);
                Shape savedClip = g2.getClip();
                g2.clip(area);
                Composite originalComposite = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, getForegroundAlpha()));

                if (!DatasetUtilities.isEmptyOrNull(getDataset())) {
                    int seriesCount = 0, catCount = 0;
                    if (getDataExtractOrder() == TableOrder.BY_ROW) {
                        seriesCount = getDataset().getRowCount();
                        catCount = getDataset().getColumnCount();
                    } else {
                        seriesCount = getDataset().getColumnCount();
                        catCount = getDataset().getRowCount();
                    }

                    // ensure we have a maximum value to use on the axes
                    if (getMaxValue() == DEFAULT_MAX_VALUE) calculateMaxValue(seriesCount, catCount);

                    // Next, setup the plot area
                    // adjust the plot area by the interior spacing value
                    double gapHorizontal = area.getWidth() * getInteriorGap();
                    double gapVertical = area.getHeight() * getInteriorGap();

                    double X = area.getX() + gapHorizontal / 2;
                    double Y = area.getY() + gapVertical / 2;
                    double W = area.getWidth() - gapHorizontal;
                    double H = area.getHeight() - gapVertical;

                    double headW = area.getWidth() * this.headPercent;
                    double headH = area.getHeight() * this.headPercent;

                    // make the chart area a square
                    double min = Math.min(W, H) / 2;
                    X = (X + X + W) / 2 - min;
                    Y = (Y + Y + H) / 2 - min;
                    W = 2 * min;
                    H = 2 * min;

                    Point2D  centre = new Point2D.Double(X + W / 2, Y + H / 2);
                    Rectangle2D radarArea = new Rectangle2D.Double(X, Y, W, H);

                    // draw the axis and category label
                    for (int cat = 0; cat < catCount; cat++) { //for each category
                        double angle = getStartAngle()+ (getDirection().getFactor() * cat * 360 / catCount);
                        Point2D endPoint = getWebPoint(radarArea, angle, 1); // 1 = end of axis
                        Line2D  line = new Line2D.Double(centre, endPoint);
                        g2.setPaint(getAxisLinePaint());
                        g2.setStroke(getAxisLineStroke());
                        g2.draw(line);
                        drawLabel(g2, radarArea, 0.0, cat, angle, 360.0 / catCount);

                    }//next category
                    
drawRadarGrid(g2, radarArea,   catCount); //<<<!!! call new method to draw web grid polygons

                    // Now actually plot each of the series polygons:
                    for (int series = 0; series < seriesCount; series++) {
                        drawRadarPoly(g2, radarArea, centre, info, series, catCount, headH, headW);
                    }
                } else {
                    drawNoDataMessage(g2, area);
                }
                g2.setClip(savedClip);
                g2.setComposite(originalComposite);
                drawOutline(g2, area);
            }//draw()

            /**
             * Draws a radar grid polygon.
             *
             * @param g2 the graphics device.
             * @param plotArea the area we are plotting in (already adjusted).
             * @param catCount the number of categories per radar plot
             * @author mh
             */
            protected void drawRadarGrid(Graphics2D g2, Rectangle2D plotArea,   int catCount) {
                //code based on drawRadarPoly()!

                double maxVal = getMaxValue();
                double distance = maxVal / ticks;
                double dataValue = 0;
                for (double i = 0; i < maxVal; i += distance) { //for each web grid polygon
                    Polygon polygon = new Polygon();
                    dataValue += distance;
                    // plot the data...
                    for (int cat = 0; cat < catCount; cat++) { //for each axis on current web grid
                        if (0.0 < dataValue) {
                            double value = dataValue;
                            if (value >= 0) { // draw the polygon series...
                                // Finds our starting angle from the centre for this axis
                                double angle = getStartAngle() + (getDirection().getFactor() * cat * 360 / catCount);
    
                                // find the point at the appropriate distance end point
                                // along the axis/angle identified above and add it to the polygon
    
                                Point2D point = getWebPoint(plotArea, angle, value / getMaxValue());
                                polygon.addPoint((int) point.getX(), (int) point.getY());
                            }
                        }
                    }
                    // Plot the polygon
                 //   Paint paint = getSeriesPaint(series);
                 //   g2.setPaint(paint);
                  //  g2.setStroke(getSeriesOutlineStroke(series));
                    g2.draw(polygon);
                }//next web grid
            }//drawRadarGrid()
            
            /**
             * Overwrites super method.
             */
            private void calculateMaxValue(int seriesCount, int catCount) {
                double v = 0;
                Number nV = null;

                for (int seriesIndex = 0; seriesIndex < seriesCount; seriesIndex++) {
                    for (int catIndex = 0; catIndex < catCount; catIndex++) {
                        nV = getPlotValue(seriesIndex, catIndex);
                        if (nV != null) {
                            v = nV.doubleValue();
                            if (v > getMaxValue()) {
                                setMaxValue(v);
                            }
                        }
                    }
                }
            }
            
            /**
             * sets the number of tick marks on this spider chart.
             * 
             * @param t the new number of tickmarks.
             */
            public void setTicks(final int t) {
                ticks = t;
            }

            /**
             * sets the numberformat for the tick labels on this spider chart.
             * 
             * @param f the new number format object.
             */
            public void setFormat(final NumberFormat f) {
                format = f;
            }
            
        };
	    //plot.setAxisLabelGap(0.1);

	    JFreeChart chart = new JFreeChart(plot);

	    try {
	        BufferedImage image = new BufferedImage(400, 400, 
	                BufferedImage.TYPE_INT_RGB);
	        Graphics2D g2 = image.createGraphics();
	        chart.draw(g2, new Rectangle2D.Double(0, 0, 600, 600), null, null);
	        g2.dispose();
	        
	        BufferedImage spiderchart_image = chart.createBufferedImage(500, 400);
//	        File outputfile = new File("C:\\Users\\fabio\\Desktop\\prova.png");
//	        ImageIO.write(spiderchart_image, "png", outputfile);
	        
//	        System.out.println("Finito");
		    return SwingFXUtils.toFXImage(spiderchart_image, null );

	    }
	    catch (Exception e) {
	        System.out.println(e);

	    }
	    
	    return null;
	}
	
	
	
	
	
	
}
