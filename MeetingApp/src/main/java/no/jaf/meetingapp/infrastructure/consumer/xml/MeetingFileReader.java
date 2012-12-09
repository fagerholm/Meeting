/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.infrastructure.consumer.xml;

import no.jaf.meetingapp.domain.Meeting;

/**
 *
 * @author Jon
 */
public interface MeetingFileReader {

    Meeting read(String filename); 
    
}
