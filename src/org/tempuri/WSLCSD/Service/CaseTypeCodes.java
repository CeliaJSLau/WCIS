package org.tempuri.WSLCSD.Service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "caseTypeCodes")
public class CaseTypeCodes  extends LCSDMappingList{
    @XmlElement(name = "caseTypeCode")
	 List<LCSDMappingList> caseTypeCodes = new ArrayList<LCSDMappingList>();
	 
	    public List<LCSDMappingList> getCaseTypeCodes() {
	        return caseTypeCodes;
	    }

	    public void setCaseTypeCodes(List<LCSDMappingList> caseTypeCodes) {
	        this.caseTypeCodes = caseTypeCodes;
	    }


}

