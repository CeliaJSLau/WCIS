package org.tempuri.WSLCSD.Service;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "subjectMatters")
public class LCSDSubjectMatterLists  extends LCSDSubjectMatterList{
    @XmlElement(name = "subjectMatterCode")
    List<LCSDSubjectMatterList> LCSDSubjectMatterLists = new ArrayList<LCSDSubjectMatterList>();
    
    public List<LCSDSubjectMatterList> getLCSDSubjectMatterLists() {
        return LCSDSubjectMatterLists;
    }

    public void setLCSDSubjectMatterLists(List<LCSDSubjectMatterList> LCSDSubjectMatterLists) {
        this.LCSDSubjectMatterLists = LCSDSubjectMatterLists;
    }

}
