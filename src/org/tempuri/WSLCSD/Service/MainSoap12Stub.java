/**
 * MainSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class MainSoap12Stub extends org.apache.axis.client.Stub implements org.tempuri.WSLCSD.Service.MainSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nLoginReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginReq"), org.tempuri.WSLCSD.Service.LoginReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginRsp"));
        oper.setReturnClass(org.tempuri.WSLCSD.Service.LoginRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLCSDSubjectMatterList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nGetLCSDSubjectMatterListReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListReq"), org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListRsp"));
        oper.setReturnClass(org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLCSDMappingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nGetLCSDMappingListReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListReq"), org.tempuri.WSLCSD.Service.GetLCSDMappingListReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListRsp"));
        oper.setReturnClass(org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadLCSDFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nUploadLCSDFileReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileReq"), org.tempuri.WSLCSD.Service.UploadLCSDFileReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileRsp"));
        oper.setReturnClass(org.tempuri.WSLCSD.Service.UploadLCSDFileRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLCSDCaseDetailList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nGetLCSDCaseDetailReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailReq"), org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailRsp"));
        oper.setReturnClass(org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public MainSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MainSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MainSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ArrayOfLCSDCaseDetailList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LCSDCaseDetailList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDCaseDetailList");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDCaseDetailList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ArrayOfLCSDMappingList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LCSDMappingList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDMappingList");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDMappingList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ArrayOfLCSDSubjectMatterList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LCSDSubjectMatterList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterList");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ArrayOfReturnStatusList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.ReturnStatusList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailReq");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailRsp");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListReq");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.GetLCSDMappingListReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingListRsp");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListReq");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListRsp");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDCaseDetailList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LCSDCaseDetailList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDMappingList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LCSDMappingList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LCSDSubjectMatterList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginReq");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LoginReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LoginRsp");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.LoginRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.ReturnStatusList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileReq");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.UploadLCSDFileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileRsp");
            cachedSerQNames.add(qName);
            cls = org.tempuri.WSLCSD.Service.UploadLCSDFileRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.tempuri.WSLCSD.Service.LoginRsp login(org.tempuri.WSLCSD.Service.LoginReq nLoginReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/WSLCSD/Service/Login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nLoginReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.WSLCSD.Service.LoginRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.WSLCSD.Service.LoginRsp) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.WSLCSD.Service.LoginRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp getLCSDSubjectMatterList(org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq nGetLCSDSubjectMatterListReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/WSLCSD/Service/GetLCSDSubjectMatterList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nGetLCSDSubjectMatterListReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp getLCSDMappingList(org.tempuri.WSLCSD.Service.GetLCSDMappingListReq nGetLCSDMappingListReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/WSLCSD/Service/GetLCSDMappingList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDMappingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nGetLCSDMappingListReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.WSLCSD.Service.UploadLCSDFileRsp uploadLCSDFile(org.tempuri.WSLCSD.Service.UploadLCSDFileReq nUploadLCSDFileReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/WSLCSD/Service/UploadLCSDFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nUploadLCSDFileReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.WSLCSD.Service.UploadLCSDFileRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.WSLCSD.Service.UploadLCSDFileRsp) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.WSLCSD.Service.UploadLCSDFileRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp getLCSDCaseDetailList(org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq nGetLCSDCaseDetailReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/WSLCSD/Service/GetLCSDCaseDetailList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nGetLCSDCaseDetailReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
