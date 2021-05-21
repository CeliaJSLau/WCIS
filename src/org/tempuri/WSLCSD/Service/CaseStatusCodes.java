package org.tempuri.WSLCSD.Service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "caseStatusCodes")
public class CaseStatusCodes  extends LCSDMappingList{
    @XmlElement(name = "caseStatusCode")
	 List<LCSDMappingList> caseStatusCodes = new ArrayList<LCSDMappingList>();
	 
	    public List<LCSDMappingList> getCaseStatusCodes() {
	        return caseStatusCodes;
	    }

	    public void setCaseStatusCodes(List<LCSDMappingList> caseStatusCodes) {
	        this.caseStatusCodes = caseStatusCodes;
	    }


}

