/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:27:49 GMT 2020
 */

package dk.statsbiblioteket.summa.common.rpc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dk.statsbiblioteket.summa.common.configuration.Configuration;
import dk.statsbiblioteket.summa.common.configuration.storage.FileStorage;
import dk.statsbiblioteket.summa.common.configuration.storage.XStorage;
import dk.statsbiblioteket.summa.common.rpc.ConnectionConsumer;
import java.io.BufferedInputStream;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

 
public class ConnectionConsumerTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<String> connectionConsumer0 = new ConnectionConsumer<String>(configuration0, "");
      String string0 = connectionConsumer0.getVendorId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<String> connectionConsumer0 = null;
      try {
        connectionConsumer0 = new ConnectionConsumer<String>(configuration0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // summa.rpc.vendor not set. No RPC vendor
         //
         verifyException("dk.statsbiblioteket.summa.common.rpc.ConnectionConsumer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConnectionConsumer<String> connectionConsumer0 = null;
      try {
        connectionConsumer0 = new ConnectionConsumer<String>((Configuration) null, "java.specification.version");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dk.statsbiblioteket.summa.common.rpc.GenericConnectionFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      configuration0.createSubConfiguration("summa.rpc.initial.retries");
      ConnectionConsumer<Object> connectionConsumer0 = null;
      try {
        connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "summa.api.version");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad number format for 'summa.rpc.initial.retries': For input string: \"dk.statsbiblioteket.summa.common.configuration.storage.MemoryStorage@0000000265\"
         //
         verifyException("dk.statsbiblioteket.summa.common.configuration.Configuration", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConnectionConsumer<Object> connectionConsumer0 = null;
      try {
        connectionConsumer0 = new ConnectionConsumer<Object>((Configuration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dk.statsbiblioteket.summa.common.rpc.GenericConnectionFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileStorage fileStorage0 = new FileStorage();
      XStorage xStorage0 = new XStorage(true);
      xStorage0.put("summa.rpc.vendor", fileStorage0);
      Configuration configuration0 = new Configuration(xStorage0);
      ConnectionConsumer<BufferedInputStream> connectionConsumer0 = new ConnectionConsumer<BufferedInputStream>(configuration0);
      assertEquals(1000, ConnectionConsumer.DEFAULT_INITIAL_GRACE_TIME);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "@summa.api.version@");
      connectionConsumer0.connectionError("summa.persistent");
      assertEquals(0, ConnectionConsumer.DEFAULT_SUBSEQUENT_RETRIES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "");
      connectionConsumer0.getConnection();
      connectionConsumer0.connectionError("summa.configuration");
      assertEquals(0, ConnectionConsumer.DEFAULT_SUBSEQUENT_RETRIES);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "");
      MockThrowable mockThrowable0 = new MockThrowable();
      connectionConsumer0.connectionError((Throwable) mockThrowable0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "");
      connectionConsumer0.getConnection();
      MockThrowable mockThrowable0 = new MockThrowable();
      connectionConsumer0.connectionError((Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "");
      connectionConsumer0.releaseConnection();
      assertEquals(0, ConnectionConsumer.DEFAULT_SUBSEQUENT_RETRIES);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "");
      connectionConsumer0.getConnection();
      connectionConsumer0.releaseConnection();
      assertEquals(1000, ConnectionConsumer.DEFAULT_INITIAL_GRACE_TIME);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<ConnectionConsumer<Object>> connectionConsumer0 = new ConnectionConsumer<ConnectionConsumer<Object>>(configuration0, "`dlq]JFC");
      ConnectionConsumer<Object> connectionConsumer1 = connectionConsumer0.getConnection();
      assertNull(connectionConsumer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<Object> connectionConsumer0 = new ConnectionConsumer<Object>(configuration0, "");
      connectionConsumer0.getConnection();
      Object object0 = connectionConsumer0.getConnection();
      assertEquals("RegistryImpl_Stub[UnicastRef [liveRef: [endpoint:[10.141.0.34:1099](remote),objID:[0:0:0, 0]]]]", object0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      Configuration configuration0 = Configuration.newMemoryBased(serializableArray0);
      ConnectionConsumer<ConnectionConsumer<Object>> connectionConsumer0 = new ConnectionConsumer<ConnectionConsumer<Object>>(configuration0, "summa.api.version");
      String string0 = connectionConsumer0.getVendorId();
      assertEquals("summa.api.version", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      ConnectionConsumer<BufferedInputStream> connectionConsumer0 = null;
      try {
        connectionConsumer0 = new ConnectionConsumer<BufferedInputStream>(configuration0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // summa.rpc.vendor not set. No RPC vendor
         //
         verifyException("dk.statsbiblioteket.summa.common.rpc.ConnectionConsumer", e);
      }
  }
}
