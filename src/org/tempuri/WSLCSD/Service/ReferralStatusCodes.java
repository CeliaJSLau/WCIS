package org.tempuri.WSLCSD.Service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "referralStatusCodes")
public class ReferralStatusCodes  extends LCSDMappingList{
     @XmlElement(name = "referralStatusCode")
	 List<LCSDMappingList> referralStatusCodes = new ArrayList<LCSDMappingList>();
	 
	    public List<LCSDMappingList> getReferralStatusCodes() {
	        return referralStatusCodes;
	    }

	    public void setReferralStatusCodes(List<LCSDMappingList> referralStatusCodes) {
	        this.referralStatusCodes = referralStatusCodes;
	    }


}
