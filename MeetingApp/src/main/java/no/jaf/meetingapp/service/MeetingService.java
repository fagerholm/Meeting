/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.service;

import java.util.List;
import no.jaf.meetingapp.domain.Meeting;

/**
 *
 * @author Jon
 */
public interface MeetingService {

    Meeting getMeeting(long id);
    List<Meeting> getMeetings();
    Meeting readAndPersistMeeting(String filename);
    
    
    
}
