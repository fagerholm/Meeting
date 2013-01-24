/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.infrastructure.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import no.jaf.meetingapp.domain.Meeting;

/**
 *
 * @author Jon
 */
public class MeetingRepository {
    
    @PersistenceContext(unitName="MeetingAppPU")
    EntityManager em;
    
    public void persist(Meeting meeting){
        if(meeting != null){
            em.persist(meeting);
        }
    }
    
    public List<Meeting> findAll(){
        
        TypedQuery<Meeting> q = em.createQuery("SELECT m FROM Meeting m", Meeting.class);
        return q.getResultList();
    }
    
    public Meeting get(long id){
        return em.find(Meeting.class, id);
    }
}
