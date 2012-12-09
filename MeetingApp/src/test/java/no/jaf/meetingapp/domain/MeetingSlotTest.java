/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.domain;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Jon
 */
public class MeetingSlotTest {
    
    /**
     * Test of getId method, of class MeetingSlot.
     */
    @Test
    public void testGetId() {
        MeetingSlot instance = new MeetingSlot();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class MeetingSlot.
     */
    @Test
    public void testSetId() {
        Long id = null;
        MeetingSlot instance = new MeetingSlot();
        instance.setId(id);
    }

    /**
     * Test of getTimeStart method, of class MeetingSlot.
     */
    @Test
    public void testGetTimeStart() {
        MeetingSlot instance = new MeetingSlot();
        String expResult = null;
        String result = instance.getTimeStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeStart method, of class MeetingSlot.
     */
    @Test
    public void testSetTimeStart() {
        String timeStart = "";
        MeetingSlot instance = new MeetingSlot();
        instance.setTimeStart(timeStart);
    }

    /**
     * Test of getTimeStop method, of class MeetingSlot.
     */
    @Test
    public void testGetTimeStop() {
        MeetingSlot instance = new MeetingSlot();
        String expResult = null;
        String result = instance.getTimeStop();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeStop method, of class MeetingSlot.
     */
    @Test
    public void testSetTimeStop() {
        String timeStop = "";
        MeetingSlot instance = new MeetingSlot();
        instance.setTimeStop(timeStop);
    }

    /**
     * Test of getPresenter method, of class MeetingSlot.
     */
    @Test
    public void testGetPresenter() {
        MeetingSlot instance = new MeetingSlot();
        String expResult = null;
        String result = instance.getPresenter();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPresenter method, of class MeetingSlot.
     */
    @Test
    public void testSetPresenter() {
        String presenter = "";
        MeetingSlot instance = new MeetingSlot();
        instance.setPresenter(presenter);
    }

    /**
     * Test of getSubject method, of class MeetingSlot.
     */
    @Test
    public void testGetSubject() {
        MeetingSlot instance = new MeetingSlot();
        String expResult = null;
        String result = instance.getSubject();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSubject method, of class MeetingSlot.
     */
    @Test
    public void testSetSubject() {
        String subject = "";
        MeetingSlot instance = new MeetingSlot();
        instance.setSubject(subject);
    }

    /**
     * Test of hashCode method, of class MeetingSlot.
     */
    @Test
    public void testHashCode() {
        MeetingSlot instance = new MeetingSlot();
        int expResult = 64558313;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MeetingSlot.
     */
    @Test
    public void testEquals() {
        Object obj = null;
        MeetingSlot instance = new MeetingSlot();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class MeetingSlot.
     */
    @Test
    public void testToString() {
        MeetingSlot instance = new MeetingSlot();
        String expResult = "MeetingSlot{id=null, timeStart=null, timeStop=null, presenter=null, subject=null}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
