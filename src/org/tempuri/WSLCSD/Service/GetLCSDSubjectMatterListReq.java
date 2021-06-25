/**
 * GetLCSDSubjectMatterListReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class GetLCSDSubjectMatterListReq  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1589353404481656234L;

	private java.lang.String token;

    private java.lang.String report_Date;

    private java.lang.String dataset_Key;

    public GetLCSDSubjectMatterListReq() {
    }

    public GetLCSDSubjectMatterListReq(
           java.lang.String token,
           java.lang.String report_Date,
           java.lang.String dataset_Key) {
           this.token = token;
           this.report_Date = report_Date;
           this.dataset_Key = dataset_Key;
    }


    /**
     * Gets the token value for this GetLCSDSubjectMatterListReq.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this GetLCSDSubjectMatterListReq.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the report_Date value for this GetLCSDSubjectMatterListReq.
     * 
     * @return report_Date
     */
    public java.lang.String getReport_Date() {
        return report_Date;
    }


    /**
     * Sets the report_Date value for this GetLCSDSubjectMatterListReq.
     * 
     * @param report_Date
     */
    public void setReport_Date(java.lang.String report_Date) {
        this.report_Date = report_Date;
    }


    /**
     * Gets the dataset_Key value for this GetLCSDSubjectMatterListReq.
     * 
     * @return dataset_Key
     */
    public java.lang.String getDataset_Key() {
        return dataset_Key;
    }


    /**
     * Sets the dataset_Key value for this GetLCSDSubjectMatterListReq.
     * 
     * @param dataset_Key
     */
    public void setDataset_Key(java.lang.String dataset_Key) {
        this.dataset_Key = dataset_Key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLCSDSubjectMatterListReq)) return false;
        GetLCSDSubjectMatterListReq other = (GetLCSDSubjectMatterListReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.report_Date==null && other.getReport_Date()==null) || 
             (this.report_Date!=null &&
              this.report_Date.equals(other.getReport_Date()))) &&
            ((this.dataset_Key==null && other.getDataset_Key()==null) || 
             (this.dataset_Key!=null &&
              this.dataset_Key.equals(other.getDataset_Key())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getReport_Date() != null) {
            _hashCode += getReport_Date().hashCode();
        }
        if (getDataset_Key() != null) {
            _hashCode += getDataset_Key().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLCSDSubjectMatterListReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "GetLCSDSubjectMatterListReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Report_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataset_Key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Dataset_Key"));
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
