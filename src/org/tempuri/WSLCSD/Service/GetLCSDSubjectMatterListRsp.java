/**
 * GetLCSDSubjectMatterListRsp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class GetLCSDSubjectMatterListRsp  implements java.io.Serializable {
    private org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists;

    private org.tempuri.WSLCSD.Service.LCSDSubjectMatterList[] LCSDSubjectMatterLists;

    public GetLCSDSubjectMatterListRsp() {
    }

    public GetLCSDSubjectMatterListRsp(
           org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists,
           org.tempuri.WSLCSD.Service.LCSDSubjectMatterList[] LCSDSubjectMatterLists) {
           this.returnStatusLists = returnStatusLists;
           this.LCSDSubjectMatterLists = LCSDSubjectMatterLists;
    }


    /**
     * Gets the returnStatusLists value for this GetLCSDSubjectMatterListRsp.
     * 
     * @return returnStatusLists
     */
    public org.tempuri.WSLCSD.Service.ReturnStatusList[] getReturnStatusLists() {
        return returnStatusLists;
    }


    /**
     * Sets the returnStatusLists value for this GetLCSDSubjectMatterListRsp.
     * 
     * @param returnStatusLists
     */
    public void setReturnStatusLists(org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists) {
        this.returnStatusLists = returnStatusLists;
    }


    /**
     * Gets the LCSDSubjectMatterLists value for this GetLCSDSubjectMatterListRsp.
     * 
     * @return LCSDSubjectMatterLists
     */
    public org.tempuri.WSLCSD.Service.LCSDSubjectMatterList[] getLCSDSubjectMatterLists() {
        return LCSDSubjectMatterLists;
    }


    /**
     * Sets the LCSDSubjectMatterLists value for this GetLCSDSubjectMatterListRsp.
     * 
     * @param LCSDSubjectMatterLists
     */
    public void setLCSDSubjectMatterLists(org.tempuri.WSLCSD.Service.LCSDSubjectMatterList[] LCSDSubjectMatterLists) {
        this.LCSDSubjectMatterLists = LCSDSubjectMatterLists;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLCSDSubjectMatterListRsp)) return false;
        GetLCSDSubjectMatterListRsp other = (GetLCSDSubjectMatterListRsp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnStatusLists==null && other.getReturnStatusLists()==null) || 
             (this.returnStatusLists!=null &&
              java.util.Arrays.equals(this.returnStatusLists, other.getReturnStatusLists()))) &&
            ((this.LCSDSubjectMatterLists==null && other.getLCSDSubjectMatterLists()==null) || 
             (this.LCSDSubjectMatterLists!=null &&
              java.util.Arrays.equals(this.LCSDSubjectMatterLists, other.getLCSDSubjectMatterLists())));
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
        if (getReturnStatusLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnStatusLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnStatusLists(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLCSDSubjectMatterLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLCSDSubjectMatterLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLCSDSubjectMatterLists(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLCSDSubjectMatterListRsp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListRsp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnStatusLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCSDSubjectMatterLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterList"));
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
