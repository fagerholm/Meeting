/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.domain;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jon
 */
public class MeetingTest {
    
    @Test
    public void testGetSet(){
        
        Meeting meeting = new Meeting();
        
       meeting.setId(Long.MAX_VALUE);
       meeting.setBgColor("TestColor");
       meeting.setMeetingDate("Tomorrow");
       meeting.setMeetingHost("Someone");
       meeting.setSlots(null);
       meeting.setTitle("Sometitle");
       
       assertEquals("Id has wrong value", Long.MAX_VALUE, meeting.getId().longValue());
       assertEquals("Color has wrong value", "TestColor", meeting.getBgColor());
       assertEquals("MeetingDate has wrong value", "Tomorrow", meeting.getMeetingDate());
       assertEquals("MeetingHost has wrong value", "Someone", meeting.getMeetingHost());
       assertEquals("Slots has wrong value", null, meeting.getSlots());
       assertEquals("Title has wrong value", "Sometitle", meeting.getTitle());
       
        
    }
    
}
