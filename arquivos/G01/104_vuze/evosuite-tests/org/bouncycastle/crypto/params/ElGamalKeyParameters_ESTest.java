/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:49:18 GMT 2020
 */

package org.bouncycastle.crypto.params;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ElGamalKeyParametersTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      ElGamalParameters elGamalParameters0 = new ElGamalParameters(bigInteger0, bigInteger0);
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(true, elGamalParameters0);
      ElGamalParameters elGamalParameters1 = elGamalKeyParameters0.getParameters();
      assertSame(elGamalParameters1, elGamalParameters0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElGamalParameters elGamalParameters0 = new ElGamalParameters((BigInteger) null, (BigInteger) null);
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(true, elGamalParameters0);
      // Undeclared exception!
      try { 
        elGamalKeyParameters0.equals(elGamalKeyParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.bouncycastle.crypto.params.ElGamalParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElGamalParameters elGamalParameters0 = new ElGamalParameters((BigInteger) null, (BigInteger) null);
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(true, elGamalParameters0);
      ElGamalKeyParameters elGamalKeyParameters1 = new ElGamalKeyParameters(true, (ElGamalParameters) null);
      boolean boolean0 = elGamalKeyParameters0.equals(elGamalKeyParameters1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      ElGamalParameters elGamalParameters0 = new ElGamalParameters(bigInteger0, bigInteger0);
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(true, elGamalParameters0);
      boolean boolean0 = elGamalKeyParameters0.equals(elGamalKeyParameters0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(false, (ElGamalParameters) null);
      Object object0 = new Object();
      boolean boolean0 = elGamalKeyParameters0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(false, (ElGamalParameters) null);
      boolean boolean0 = elGamalKeyParameters0.equals(elGamalKeyParameters0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ElGamalKeyParameters elGamalKeyParameters0 = new ElGamalKeyParameters(false, (ElGamalParameters) null);
      ElGamalParameters elGamalParameters0 = elGamalKeyParameters0.getParameters();
      assertNull(elGamalParameters0);
  }
}
