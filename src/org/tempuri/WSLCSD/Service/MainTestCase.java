/**
 * MainTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

import junit.framework.TestResult;

public class MainTestCase extends junit.framework.TestCase {
    public MainTestCase(java.lang.String name) {
        super(name);
    }

    public void testmainSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.tempuri.WSLCSD.Service.MainLocator().getmainSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.tempuri.WSLCSD.Service.MainLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1mainSoapLogin() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoapStub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.LoginRsp value = null;
        value = binding.login(new org.tempuri.WSLCSD.Service.LoginReq("LCSD_WS","12345Abc"));
        org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists=value.getReturnStatusLists();
//        System.out.println(returnStatusLists[0].getReturnCode()+" "+returnStatusLists[0].getReturnMsg()+" "+returnStatusLists[0].getReturnKey()+" Celia: "+value.getToken());
        // TBD - validate results
    }

    public void test2mainSoapGetLCSDSubjectMatterList() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoapStub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp value = null;
        value = binding.getLCSDSubjectMatterList(new org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq());
        // TBD - validate results
    }

    public void test3mainSoapGetLCSDMappingList() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoapStub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value = null;
        value = binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq());
        // TBD - validate results
    }

    public void test4mainSoapUploadLCSDFile() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoapStub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.UploadLCSDFileRsp value = null;
        value = binding.uploadLCSDFile(new org.tempuri.WSLCSD.Service.UploadLCSDFileReq());
        // TBD - validate results
    }

    public void test5mainSoapGetLCSDCaseDetailList() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoapStub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoapStub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp value = null;
        value = binding.getLCSDCaseDetailList(new org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq());
        // TBD - validate results
    }

    public void testmainSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.tempuri.WSLCSD.Service.MainLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test6mainSoap12Login() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoap12Stub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoap12Stub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.LoginRsp value = null;
        value = binding.login(new org.tempuri.WSLCSD.Service.LoginReq());
        // TBD - validate results
    }

    public void test7mainSoap12GetLCSDSubjectMatterList() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoap12Stub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoap12Stub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp value = null;
        value = binding.getLCSDSubjectMatterList(new org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq());
        // TBD - validate results
    }

    public void test8mainSoap12GetLCSDMappingList() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoap12Stub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoap12Stub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp value = null;
        value = binding.getLCSDMappingList(new org.tempuri.WSLCSD.Service.GetLCSDMappingListReq());
        // TBD - validate results
    }

    public void test9mainSoap12UploadLCSDFile() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoap12Stub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoap12Stub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.UploadLCSDFileRsp value = null;
        value = binding.uploadLCSDFile(new org.tempuri.WSLCSD.Service.UploadLCSDFileReq());
        // TBD - validate results
    }

    public void test10mainSoap12GetLCSDCaseDetailList() throws Exception {
        org.tempuri.WSLCSD.Service.MainSoap12Stub binding;
        try {
            binding = (org.tempuri.WSLCSD.Service.MainSoap12Stub)
                          new org.tempuri.WSLCSD.Service.MainLocator().getmainSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp value = null;
        value = binding.getLCSDCaseDetailList(new org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq());
        // TBD - validate results
    }
    
    

}
