/**
 * ReturnStatusList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class ReturnStatusList  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4249335752593659183L;

	private int returnCode;

    private java.lang.String returnMsg;

    private java.lang.String returnKey;

    public ReturnStatusList() {
    }

    public ReturnStatusList(
           int returnCode,
           java.lang.String returnMsg,
           java.lang.String returnKey) {
           this.returnCode = returnCode;
           this.returnMsg = returnMsg;
           this.returnKey = returnKey;
    }


    /**
     * Gets the returnCode value for this ReturnStatusList.
     * 
     * @return returnCode
     */
    public int getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this ReturnStatusList.
     * 
     * @param returnCode
     */
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnMsg value for this ReturnStatusList.
     * 
     * @return returnMsg
     */
    public java.lang.String getReturnMsg() {
        return returnMsg;
    }


    /**
     * Sets the returnMsg value for this ReturnStatusList.
     * 
     * @param returnMsg
     */
    public void setReturnMsg(java.lang.String returnMsg) {
        this.returnMsg = returnMsg;
    }


    /**
     * Gets the returnKey value for this ReturnStatusList.
     * 
     * @return returnKey
     */
    public java.lang.String getReturnKey() {
        return returnKey;
    }


    /**
     * Sets the returnKey value for this ReturnStatusList.
     * 
     * @param returnKey
     */
    public void setReturnKey(java.lang.String returnKey) {
        this.returnKey = returnKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnStatusList)) return false;
        ReturnStatusList other = (ReturnStatusList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.returnCode == other.getReturnCode() &&
            ((this.returnMsg==null && other.getReturnMsg()==null) || 
             (this.returnMsg!=null &&
              this.returnMsg.equals(other.getReturnMsg()))) &&
            ((this.returnKey==null && other.getReturnKey()==null) || 
             (this.returnKey!=null &&
              this.returnKey.equals(other.getReturnKey())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getReturnCode();
        if (getReturnMsg() != null) {
            _hashCode += getReturnMsg().hashCode();
        }
        if (getReturnKey() != null) {
            _hashCode += getReturnKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnStatusList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
