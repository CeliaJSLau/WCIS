/**
 * MainSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WSLCSD.Service;

public interface MainSoap extends java.rmi.Remote {
    public org.tempuri.WSLCSD.Service.LoginRsp login(org.tempuri.WSLCSD.Service.LoginReq nLoginReq) throws java.rmi.RemoteException;

    /**
     * This method is getting the LCSD Subject Matter List
     */
    public org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListRsp getLCSDSubjectMatterList(org.tempuri.WSLCSD.Service.GetLCSDSubjectMatterListReq nGetLCSDSubjectMatterListReq) throws java.rmi.RemoteException;

    /**
     * This method is getting the LCSD Mapping information
     */
    public org.tempuri.WSLCSD.Service.GetLCSDMappingListRsp getLCSDMappingList(org.tempuri.WSLCSD.Service.GetLCSDMappingListReq nGetLCSDMappingListReq) throws java.rmi.RemoteException;

    /**
     * This method is used to upload LCSD file
     */
    public org.tempuri.WSLCSD.Service.UploadLCSDFileRsp uploadLCSDFile(org.tempuri.WSLCSD.Service.UploadLCSDFileReq nUploadLCSDFileReq) throws java.rmi.RemoteException;

    /**
     * This method is getting the LCSD Case List
     */
    public org.tempuri.WSLCSD.Service.GetLCSDCaseDetailRsp getLCSDCaseDetailList(org.tempuri.WSLCSD.Service.GetLCSDCaseDetailReq nGetLCSDCaseDetailReq) throws java.rmi.RemoteException;
}
