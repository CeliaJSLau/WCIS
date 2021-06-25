/**
 * MainSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class MainSoapSkeleton implements org.tempuri.WSLCSD.Service.MainSoap, org.apache.axis.wsdl.Skeleton {
    private org.tempuri.WSLCSD.Service.MainSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nLoginReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginReq"), org.tempuri.WSLCSD.Service.LoginReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("login", _params, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginRsp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Login"));
        _oper.setSoapAction("http://tempuri.org/WSLCSD/Service/Login");
        _myOperationsList.add(_oper);
        if (_myOperations.get("login") == null) {
            _myOperations.put("login", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("login")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nGetLCSDSubjectMatterListReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListReq"), org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getLCSDSubjectMatterList", _params, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListRsp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterList"));
        _oper.setSoapAction("http://tempuri.org/WSLCSD/Service/GetLCSDSubjectMatterList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLCSDSubjectMatterList") == null) {
            _myOperations.put("getLCSDSubjectMatterList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLCSDSubjectMatterList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nGetLCSDMappingListReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListReq"), org.tempuri.WSLCSD.Service.GetLCSDMappingListReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getLCSDMappingList", _params, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListRsp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingList"));
        _oper.setSoapAction("http://tempuri.org/WSLCSD/Service/GetLCSDMappingList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLCSDMappingList") == null) {
            _myOperations.put("getLCSDMappingList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLCSDMappingList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nUploadLCSDFileReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileReq"), org.tempuri.WSLCSD.Service.UploadLCSDFileReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("uploadLCSDFile", _params, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileRsp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFile"));
        _oper.setSoapAction("http://tempuri.org/WSLCSD/Service/UploadLCSDFile");
        _myOperationsList.add(_oper);
        if (_myOperations.get("uploadLCSDFile") == null) {
            _myOperations.put("uploadLCSDFile", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("uploadLCSDFile")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nGetLCSDCaseDetailReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailReq"), org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getLCSDCaseDetailList", _params, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailRsp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailList"));
        _oper.setSoapAction("http://tempuri.org/WSLCSD/Service/GetLCSDCaseDetailList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLCSDCaseDetailList") == null) {
            _myOperations.put("getLCSDCaseDetailList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLCSDCaseDetailList")).add(_oper);
    }

    public MainSoapSkeleton() {
        this.impl = new org.tempuri.WSLCSD.Service.MainSoapImpl();
    }

    public MainSoapSkeleton(org.tempuri.WSLCSD.Service.MainSoap impl) {
        this.impl = impl;
    }
    public org.tempuri.WSLCSD.Service.LoginRsp login(org.tempuri.WSLCSD.Service.LoginReq nLoginReq) throws java.rmi.RemoteException
    {
        org.tempuri.WSLCSD.Service.LoginRsp ret = impl.login(nLoginReq);
        return ret;
    }

    public org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp getLCSDSubjectMatterList(org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq nGetLCSDSubjectMatterListReq) throws java.rmi.RemoteException
    {
        org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp ret = impl.getLCSDSubjectMatterList(nGetLCSDSubjectMatterListReq);
        return ret;
    }

    public org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp getLCSDMappingList(org.tempuri.WSLCSD.Service.GetLCSDMappingListReq nGetLCSDMappingListReq) throws java.rmi.RemoteException
    {
        org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp ret = impl.getLCSDMappingList(nGetLCSDMappingListReq);
        return ret;
    }

    public org.tempuri.WSLCSD.Service.UploadLCSDFileRsp uploadLCSDFile(org.tempuri.WSLCSD.Service.UploadLCSDFileReq nUploadLCSDFileReq) throws java.rmi.RemoteException
    {
        org.tempuri.WSLCSD.Service.UploadLCSDFileRsp ret = impl.uploadLCSDFile(nUploadLCSDFileReq);
        return ret;
    }

    public org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp getLCSDCaseDetailList(org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq nGetLCSDCaseDetailReq) throws java.rmi.RemoteException
    {
        org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp ret = impl.getLCSDCaseDetailList(nGetLCSDCaseDetailReq);
        return ret;
    }

}
