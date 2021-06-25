/**
 * GetLCSDCaseDetailRsp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class GetLCSDCaseDetailRsp  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4215590108946180773L;

	private org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists;

    private org.tempuri.WSLCSD.Service.LCSDCaseDetailList[] LCSDCaseDetailLists;

    public GetLCSDCaseDetailRsp() {
    }

    public GetLCSDCaseDetailRsp(
           org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists,
           org.tempuri.WSLCSD.Service.LCSDCaseDetailList[] LCSDCaseDetailLists) {
           this.returnStatusLists = returnStatusLists;
           this.LCSDCaseDetailLists = LCSDCaseDetailLists;
    }


    /**
     * Gets the returnStatusLists value for this GetLCSDCaseDetailRsp.
     * 
     * @return returnStatusLists
     */
    public org.tempuri.WSLCSD.Service.ReturnStatusList[] getReturnStatusLists() {
        return returnStatusLists;
    }


    /**
     * Sets the returnStatusLists value for this GetLCSDCaseDetailRsp.
     * 
     * @param returnStatusLists
     */
    public void setReturnStatusLists(org.tempuri.WSLCSD.Service.ReturnStatusList[] returnStatusLists) {
        this.returnStatusLists = returnStatusLists;
    }


    /**
     * Gets the LCSDCaseDetailLists value for this GetLCSDCaseDetailRsp.
     * 
     * @return LCSDCaseDetailLists
     */
    public org.tempuri.WSLCSD.Service.LCSDCaseDetailList[] getLCSDCaseDetailLists() {
        return LCSDCaseDetailLists;
    }


    /**
     * Sets the LCSDCaseDetailLists value for this GetLCSDCaseDetailRsp.
     * 
     * @param LCSDCaseDetailLists
     */
    public void setLCSDCaseDetailLists(org.tempuri.WSLCSD.Service.LCSDCaseDetailList[] LCSDCaseDetailLists) {
        this.LCSDCaseDetailLists = LCSDCaseDetailLists;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLCSDCaseDetailRsp)) return false;
        GetLCSDCaseDetailRsp other = (GetLCSDCaseDetailRsp) obj;
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
            ((this.LCSDCaseDetailLists==null && other.getLCSDCaseDetailLists()==null) || 
             (this.LCSDCaseDetailLists!=null &&
              java.util.Arrays.equals(this.LCSDCaseDetailLists, other.getLCSDCaseDetailLists())));
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
        if (getLCSDCaseDetailLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLCSDCaseDetailLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLCSDCaseDetailLists(), i);
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
        new org.apache.axis.description.TypeDesc(GetLCSDCaseDetailRsp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDCaseDetailRsp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnStatusLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "ReturnStatusList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCSDCaseDetailLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDCaseDetailLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDCaseDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDCaseDetailList"));
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
