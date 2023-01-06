/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:43:10 GMT 2020
 */

package com.hf.sfm.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hf.sfm.util.DaoFactory;
import java.sql.ResultSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hibernate.Session;
import org.hibernate.jdbc.ColumnNameCache;
import org.hibernate.jdbc.ResultSetWrapper;
import org.junit.runner.RunWith;

public class DaoFactoryTest { 

  @Test
  public void test00()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      // Undeclared exception!
      try { 
        daoFactory0.encrypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.DaoFactory", e);
      }
  }

  @Test
  public void test01()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      // Undeclared exception!
      try { 
        daoFactory0.decrypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.crypt.Base64", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      // Undeclared exception!
      try { 
        daoFactory0.decrypt("2EJ](X$YJ`[OEw>Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character ]
         //
         verifyException("com.hf.sfm.crypt.Base64", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      // Undeclared exception!
      try { 
        daoFactory0.decrypt("1c9~");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 126
         //
         verifyException("com.hf.sfm.crypt.Base64", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      daoFactory0.closeAll();
      daoFactory0.closeSession();
  }

  @Test
  public void test05()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      daoFactory0.encrypt("");
      daoFactory0.decrypt("");
      // Undeclared exception!
      try { 
        daoFactory0.beginTransaction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.HibernateSessionFactory", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      // Undeclared exception!
      try { 
        daoFactory0.currentSession();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.HibernateSessionFactory", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        daoFactory0.save(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.DaoFactory", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      Session session0 = null;
      // Undeclared exception!
      try { 
        daoFactory0.commit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.DaoFactory", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      daoFactory0.decrypt("");
      ColumnNameCache columnNameCache0 = new ColumnNameCache(254);
      ResultSetWrapper resultSetWrapper0 = new ResultSetWrapper((ResultSet) null, columnNameCache0);
      daoFactory0.rs = (ResultSet) resultSetWrapper0;
      // Undeclared exception!
      try { 
        daoFactory0.closeAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hibernate.jdbc.ResultSetWrapper", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      // Undeclared exception!
      try { 
        daoFactory0.rollback();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.DaoFactory", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      daoFactory0.closeSession();
      Integer integer0 = new Integer((-1));
      Integer.divideUnsigned((-1), (-4629));
      Integer.getInteger("6Th6icG{^3", 0);
      // Undeclared exception!
      try { 
        daoFactory0.update(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hf.sfm.util.DaoFactory", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DaoFactory daoFactory0 = new DaoFactory();
      String string0 = daoFactory0.encrypt("com.hf.sfm.util.DaoFactory");
      String string1 = daoFactory0.decrypt("Y29tLmhmLnNmbS51dGlsLkRhb0ZhY3Rvcnk=");
      assertFalse(string1.equals((Object)string0));
  }
}
