/**
 * UploadLCSDFileReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class UploadLCSDFileReq  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -994992666669066112L;

	private java.lang.String token;

    private java.lang.String upload_Date;

    private java.lang.String file_Name;

    private java.lang.String file_Content;

    public UploadLCSDFileReq() {
    }

    public UploadLCSDFileReq(
           java.lang.String token,
           java.lang.String upload_Date,
           java.lang.String file_Name,
           java.lang.String file_Content) {
           this.token = token;
           this.upload_Date = upload_Date;
           this.file_Name = file_Name;
           this.file_Content = file_Content;
    }


    /**
     * Gets the token value for this UploadLCSDFileReq.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this UploadLCSDFileReq.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the upload_Date value for this UploadLCSDFileReq.
     * 
     * @return upload_Date
     */
    public java.lang.String getUpload_Date() {
        return upload_Date;
    }


    /**
     * Sets the upload_Date value for this UploadLCSDFileReq.
     * 
     * @param upload_Date
     */
    public void setUpload_Date(java.lang.String upload_Date) {
        this.upload_Date = upload_Date;
    }


    /**
     * Gets the file_Name value for this UploadLCSDFileReq.
     * 
     * @return file_Name
     */
    public java.lang.String getFile_Name() {
        return file_Name;
    }


    /**
     * Sets the file_Name value for this UploadLCSDFileReq.
     * 
     * @param file_Name
     */
    public void setFile_Name(java.lang.String file_Name) {
        this.file_Name = file_Name;
    }


    /**
     * Gets the file_Content value for this UploadLCSDFileReq.
     * 
     * @return file_Content
     */
    public java.lang.String getFile_Content() {
        return file_Content;
    }


    /**
     * Sets the file_Content value for this UploadLCSDFileReq.
     * 
     * @param file_Content
     */
    public void setFile_Content(java.lang.String file_Content) {
        this.file_Content = file_Content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadLCSDFileReq)) return false;
        UploadLCSDFileReq other = (UploadLCSDFileReq) obj;
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
            ((this.upload_Date==null && other.getUpload_Date()==null) || 
             (this.upload_Date!=null &&
              this.upload_Date.equals(other.getUpload_Date()))) &&
            ((this.file_Name==null && other.getFile_Name()==null) || 
             (this.file_Name!=null &&
              this.file_Name.equals(other.getFile_Name()))) &&
            ((this.file_Content==null && other.getFile_Content()==null) || 
             (this.file_Content!=null &&
              this.file_Content.equals(other.getFile_Content())));
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
        if (getUpload_Date() != null) {
            _hashCode += getUpload_Date().hashCode();
        }
        if (getFile_Name() != null) {
            _hashCode += getFile_Name().hashCode();
        }
        if (getFile_Content() != null) {
            _hashCode += getFile_Content().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadLCSDFileReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "UploadLCSDFileReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upload_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "Upload_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "File_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_Content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "File_Content"));
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
