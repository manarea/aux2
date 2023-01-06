/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 09:14:02 GMT 2020
 */

package com.liferay.portal.spring.context;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.spring.context.ArrayApplicationContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericXmlApplicationContext;

 
public class ArrayApplicationContextTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "QL8Y.))'S";
      stringArray0[1] = "0O%Z+qEY;N1@`";
      stringArray0[2] = "";
      stringArray0[3] = "\"tu]O< `stq3;e7IM`";
      stringArray0[4] = "Alg.Alias.Cipher.1.2.840.113549.1.12.1.3";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "4GGJq}KG&zJx8b";
      stringArray0[8] = "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC";
      ArrayApplicationContext arrayApplicationContext0 = new ArrayApplicationContext(stringArray0);
      assertEquals(1392409281320L, arrayApplicationContext0.getStartupDate());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ArrayApplicationContext arrayApplicationContext0 = new ArrayApplicationContext(stringArray0);
      GenericXmlApplicationContext genericXmlApplicationContext0 = new GenericXmlApplicationContext();
      arrayApplicationContext0.setConfigLocation("applicationEventMulticaster");
      XmlBeanDefinitionReader xmlBeanDefinitionReader0 = new XmlBeanDefinitionReader(genericXmlApplicationContext0);
      arrayApplicationContext0.loadBeanDefinitions(xmlBeanDefinitionReader0);
      assertEquals(1, XmlBeanDefinitionReader.VALIDATION_AUTO);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "AcQ?e7RQ";
      ArrayApplicationContext arrayApplicationContext0 = null;
      try {
        arrayApplicationContext0 = new ArrayApplicationContext(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/util/ResourceUtils
         //
         verifyException("org.springframework.core.io.support.PathMatchingResourcePatternResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ArrayApplicationContext arrayApplicationContext0 = new ArrayApplicationContext(stringArray0);
      assertEquals(1392409281320L, arrayApplicationContext0.getStartupDate());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayApplicationContext arrayApplicationContext0 = new ArrayApplicationContext((String[]) null);
      assertEquals(1392409281320L, arrayApplicationContext0.getStartupDate());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ArrayApplicationContext arrayApplicationContext0 = null;
      try {
        arrayApplicationContext0 = new ArrayApplicationContext(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Config locations must not be null
         //
         verifyException("org.springframework.util.Assert", e);
      }
  }
}
