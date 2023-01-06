/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 09:13:12 GMT 2020
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.PieChartRenderer;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class PieChartRendererTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 8);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        pieChartRenderer0.renderChart(graphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.PieChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0);
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer(coordSystem0, objectChartDataModel0);
  }
}
