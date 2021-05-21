package org.tempuri.WSLCSD.Service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "cases")
public class LCSDCaseDetailLists extends LCSDCaseDetailList {
	
	  @XmlElement(name = "case")
		 List<LCSDCaseDetailList> LCSDCaseDetailLists = new ArrayList<LCSDCaseDetailList>();
		 
		    public List<LCSDCaseDetailList> getLCSDCaseDetailLists() {
		        return LCSDCaseDetailLists;
		    }

		    public void setLCSDCaseDetailLists(List<LCSDCaseDetailList> LCSDCaseDetailLists) {
		        this.LCSDCaseDetailLists = LCSDCaseDetailLists;
		    }


}
