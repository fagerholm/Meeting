/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import no.jaf.meetingapp.domain.Meeting;
import no.jaf.meetingapp.infrastructure.repository.MeetingRepository;
import no.jaf.meetingapp.infrastructure.consumer.xml.MeetingFileReader;

/**
 *
 * @author Jon
 */
@Stateless 
public class MeetingServiceBean implements MeetingService {
    
    @Inject
    MeetingFileReader reader;
    
    @Inject
    MeetingRepository repo;
    
    @Override
    public Meeting readAndPersistMeeting(String filename){
        System.out.println("Leser fil");
        Meeting meeting = reader.read(filename);
        System.out.println("Lagrer agenda");
        repo.persist(meeting);
        System.out.println("Returnerer til backingbean");
        return meeting;
    }
    
    @Override
    public Meeting getMeeting(long id){
        return repo.get(id);
    }
    
    @Override
    public List<Meeting> getMeetings(){
        return repo.findAll();
    }
    
}
