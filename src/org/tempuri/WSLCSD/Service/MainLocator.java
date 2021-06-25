/**
 * MainLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class MainLocator extends org.apache.axis.client.Service implements org.tempuri.WSLCSD.Service.Main {

    /**
	 * 
	 */
	private static final long serialVersionUID = 440527684098565724L;

	public MainLocator() {
    }


    public MainLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MainLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for mainSoap
    private java.lang.String mainSoap_address = new Util().getPath("WSLOCATOR");

    public java.lang.String getmainSoapAddress() {
        return mainSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String mainSoapWSDDServiceName = "mainSoap";

    public java.lang.String getmainSoapWSDDServiceName() {
        return mainSoapWSDDServiceName;
    }

    public void setmainSoapWSDDServiceName(java.lang.String name) {
        mainSoapWSDDServiceName = name;
    }

    public org.tempuri.WSLCSD.Service.MainSoap getmainSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(mainSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmainSoap(endpoint);
    }

    public org.tempuri.WSLCSD.Service.MainSoap getmainSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WSLCSD.Service.MainSoapStub _stub = new org.tempuri.WSLCSD.Service.MainSoapStub(portAddress, this);
            _stub.setPortName(getmainSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmainSoapEndpointAddress(java.lang.String address) {
        mainSoap_address = address;
    }


    // Use to get a proxy class for mainSoap12
    private java.lang.String mainSoap12_address = new Util().getPath("WSLOCATOR");

    public java.lang.String getmainSoap12Address() {
        return mainSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String mainSoap12WSDDServiceName = "mainSoap12";

    public java.lang.String getmainSoap12WSDDServiceName() {
        return mainSoap12WSDDServiceName;
    }

    public void setmainSoap12WSDDServiceName(java.lang.String name) {
        mainSoap12WSDDServiceName = name;
    }

    public org.tempuri.WSLCSD.Service.MainSoap getmainSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(mainSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmainSoap12(endpoint);
    }

    public org.tempuri.WSLCSD.Service.MainSoap getmainSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WSLCSD.Service.MainSoap12Stub _stub = new org.tempuri.WSLCSD.Service.MainSoap12Stub(portAddress, this);
            _stub.setPortName(getmainSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmainSoap12EndpointAddress(java.lang.String address) {
        mainSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WSLCSD.Service.MainSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WSLCSD.Service.MainSoapStub _stub = new org.tempuri.WSLCSD.Service.MainSoapStub(new java.net.URL(mainSoap_address), this);
                _stub.setPortName(getmainSoapWSDDServiceName());
                return _stub;
            }
            if (org.tempuri.WSLCSD.Service.MainSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WSLCSD.Service.MainSoap12Stub _stub = new org.tempuri.WSLCSD.Service.MainSoap12Stub(new java.net.URL(mainSoap12_address), this);
                _stub.setPortName(getmainSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("mainSoap".equals(inputPortName)) {
            return getmainSoap();
        }
        else if ("mainSoap12".equals(inputPortName)) {
            return getmainSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "main");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "mainSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "mainSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("mainSoap".equals(portName)) {
            setmainSoapEndpointAddress(address);
        }
        else 
if ("mainSoap12".equals(portName)) {
            setmainSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
