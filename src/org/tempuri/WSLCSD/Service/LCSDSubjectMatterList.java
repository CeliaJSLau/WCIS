/**
 * LCSDSubjectMatterList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public class LCSDSubjectMatterList  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5857535764384463909L;

	private java.lang.String id;

    private java.lang.String name;

    private java.lang.String nameChi;

    private java.lang.String effStartDate;

    private java.lang.String effEndDate;

    public LCSDSubjectMatterList() {
    }

    public LCSDSubjectMatterList(
           java.lang.String id,
           java.lang.String name,
           java.lang.String nameChi,
           java.lang.String effStartDate,
           java.lang.String effEndDate) {
           this.id = id;
           this.name = name;
           this.nameChi = nameChi;
           this.effStartDate = effStartDate;
           this.effEndDate = effEndDate;
    }


    /**
     * Gets the id value for this LCSDSubjectMatterList.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this LCSDSubjectMatterList.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LCSDSubjectMatterList.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LCSDSubjectMatterList.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nameChi value for this LCSDSubjectMatterList.
     * 
     * @return nameChi
     */
    public java.lang.String getNameChi() {
        return nameChi;
    }


    /**
     * Sets the nameChi value for this LCSDSubjectMatterList.
     * 
     * @param nameChi
     */
    public void setNameChi(java.lang.String nameChi) {
        this.nameChi = nameChi;
    }


    /**
     * Gets the effStartDate value for this LCSDSubjectMatterList.
     * 
     * @return effStartDate
     */
    public java.lang.String getEffStartDate() {
        return effStartDate;
    }


    /**
     * Sets the effStartDate value for this LCSDSubjectMatterList.
     * 
     * @param effStartDate
     */
    public void setEffStartDate(java.lang.String effStartDate) {
        this.effStartDate = effStartDate;
    }


    /**
     * Gets the effEndDate value for this LCSDSubjectMatterList.
     * 
     * @return effEndDate
     */
    public java.lang.String getEffEndDate() {
        return effEndDate;
    }


    /**
     * Sets the effEndDate value for this LCSDSubjectMatterList.
     * 
     * @param effEndDate
     */
    public void setEffEndDate(java.lang.String effEndDate) {
        this.effEndDate = effEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LCSDSubjectMatterList)) return false;
        LCSDSubjectMatterList other = (LCSDSubjectMatterList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameChi==null && other.getNameChi()==null) || 
             (this.nameChi!=null &&
              this.nameChi.equals(other.getNameChi()))) &&
            ((this.effStartDate==null && other.getEffStartDate()==null) || 
             (this.effStartDate!=null &&
              this.effStartDate.equals(other.getEffStartDate()))) &&
            ((this.effEndDate==null && other.getEffEndDate()==null) || 
             (this.effEndDate!=null &&
              this.effEndDate.equals(other.getEffEndDate())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameChi() != null) {
            _hashCode += getNameChi().hashCode();
        }
        if (getEffStartDate() != null) {
            _hashCode += getEffStartDate().hashCode();
        }
        if (getEffEndDate() != null) {
            _hashCode += getEffEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LCSDSubjectMatterList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "LCSDSubjectMatterList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameChi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "nameChi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "effStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/WSLCSD/Service", "effEndDate"));
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
