/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:33:31 GMT 2020
 */

package com.aelitis.azureus.core.peermanager.messaging.azureus;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.networkmanager.ProtocolEndpoint;
import com.aelitis.azureus.core.networkmanager.Transport;
import com.aelitis.azureus.core.networkmanager.impl.TransportCipher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterInserter;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterStreamCipher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterSwitcher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterTransparent;
import com.aelitis.azureus.core.networkmanager.impl.tcp.LightweightTCPTransport;
import com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper;
import com.aelitis.azureus.core.peermanager.messaging.Message;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

 
public class AZMessageDecoderTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)14;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, (byte)14);
      int int0 = aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 7);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      int int0 = aZMessageDecoder0.performStreamDecode((Transport) null, (-1679));
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertEquals(0, int0);
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)14;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterSwitcher0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 317);
      int int0 = aZMessageDecoder0.getProtocolBytesDecoded();
      assertTrue(aZMessageDecoder0.getLastReadMadeProgress());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-10);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 64);
      int int0 = aZMessageDecoder0.getPercentDoneOfCurrentMessage();
      assertTrue(aZMessageDecoder0.getLastReadMadeProgress());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)14;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterSwitcher0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, (byte)14);
      int int0 = aZMessageDecoder0.getPercentDoneOfCurrentMessage();
      assertTrue(aZMessageDecoder0.getLastReadMadeProgress());
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)14;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 64);
      boolean boolean0 = aZMessageDecoder0.getLastReadMadeProgress();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      SocketChannel socketChannel0 = SocketChannel.open();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper(socketChannel0);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, true);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterTransparent0);
      // Undeclared exception!
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 10000);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      SocketChannel socketChannel0 = SocketChannel.open();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper(socketChannel0);
      TransportHelperFilterStreamCipher transportHelperFilterStreamCipher0 = new TransportHelperFilterStreamCipher(tCPTransportHelper0, (TransportCipher) null, (TransportCipher) null);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterStreamCipher0, transportHelperFilterStreamCipher0, byteBuffer0);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter(transportHelperFilterSwitcher0, byteBuffer0);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterInserter0);
      // Undeclared exception!
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 114);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      // Undeclared exception!
      try { 
        aZMessageDecoder0.performStreamDecode((Transport) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)34;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher0);
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 1798);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid message length given for AZ message decode: 570425344 (max=131072)
         //
         verifyException("com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, 10000, (-571));
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(800);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter(transportHelperFilterSwitcher0, byteBuffer0);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterInserter0);
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 10000);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid message length given for AZ message decode: 0 (max=131072)
         //
         verifyException("com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, 10000, 4);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher0);
      int int0 = aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 7202);
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
      assertFalse(aZMessageDecoder0.getLastReadMadeProgress());
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)71;
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)71);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter(transportHelperFilterTransparent0, byteBuffer0);
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterInserter transportHelperFilterInserter1 = new TransportHelperFilterInserter(transportHelperFilterInserter0, byteBuffer1);
      ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterInserter1, byteBuffer2);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterSwitcher0);
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 20000);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AZ message decode failed: invalid AZ id length given: 71, stream_payload.remaining(): 67, BT id?=0
         //
         verifyException("com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)8;
      byteArray0[4] = (byte)113;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterSwitcher0);
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 2396);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid id_size [1895825408]
         //
         verifyException("com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-1);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterTransparent0, byteBuffer0);
      ProtocolEndpoint protocolEndpoint0 = mock(ProtocolEndpoint.class, new ViolatedAssumptionAnswer());
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport(protocolEndpoint0, transportHelperFilterSwitcher0);
      try { 
        aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, (byte)24);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid id_size [0]
         //
         verifyException("com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)113;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter(transportHelperFilterTransparent0, byteBuffer0);
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterInserter0, transportHelperFilterInserter0, byteBuffer1);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterSwitcher0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, 10000);
      int int0 = aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, (byte)113);
      assertEquals(4, byteBuffer1.position());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, true);
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)14;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter(transportHelperFilterTransparent0, byteBuffer0);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterInserter0);
      aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, (byte)14);
      aZMessageDecoder0.destroy();
      assertTrue(aZMessageDecoder0.getLastReadMadeProgress());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      Message[] messageArray0 = aZMessageDecoder0.removeDecodedMessages();
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertNull(messageArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      aZMessageDecoder0.destroy();
      int int0 = aZMessageDecoder0.performStreamDecode((Transport) null, 1);
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterTransparent transportHelperFilterTransparent0 = new TransportHelperFilterTransparent(tCPTransportHelper0, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)62;
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)62);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter(transportHelperFilterTransparent0, byteBuffer0);
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterInserter transportHelperFilterInserter1 = new TransportHelperFilterInserter(transportHelperFilterInserter0, byteBuffer1);
      ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArray0);
      TransportHelperFilterSwitcher transportHelperFilterSwitcher0 = new TransportHelperFilterSwitcher(transportHelperFilterTransparent0, transportHelperFilterInserter1, byteBuffer2);
      LightweightTCPTransport lightweightTCPTransport0 = new LightweightTCPTransport((ProtocolEndpoint) null, transportHelperFilterSwitcher0);
      int int0 = aZMessageDecoder0.performStreamDecode(lightweightTCPTransport0, (byte)62);
      assertEquals(0, byteBuffer2.remaining());
      assertEquals(62, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      aZMessageDecoder0.pauseDecoding();
      int int0 = aZMessageDecoder0.performStreamDecode((Transport) null, 1);
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertEquals(0, int0);
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      aZMessageDecoder0.resumeDecoding();
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      aZMessageDecoder0.setMaximumMessageSize((-1027));
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      int int0 = aZMessageDecoder0.getPercentDoneOfCurrentMessage();
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      int int0 = aZMessageDecoder0.getDataBytesDecoded();
      assertEquals(0, int0);
      assertEquals(0, aZMessageDecoder0.getProtocolBytesDecoded());
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      int int0 = aZMessageDecoder0.getProtocolBytesDecoded();
      assertEquals(0, aZMessageDecoder0.getDataBytesDecoded());
      assertEquals(0, int0);
      assertEquals((-1), aZMessageDecoder0.getPercentDoneOfCurrentMessage());
  }
}
