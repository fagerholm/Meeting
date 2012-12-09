/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.web;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import no.jaf.meetingapp.domain.Meeting;
import no.jaf.meetingapp.service.MeetingService;

/**
 *
 * @author Jon
 */
@ManagedBean
public class MeetingBean {
    
    @Inject
    MeetingService meetingService;
    
    public Meeting getMeeting() {
        
        long id = Long.parseLong(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("meetingId"));
        System.out.println("MeetingId: " + id);
        return meetingService.getMeeting(id);
    }
}
