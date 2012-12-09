package no.jaf.meetingapp.rs;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import no.jaf.meetingapp.domain.Meeting;
import no.jaf.meetingapp.service.MeetingService;

@Path("/meetings")
@Stateless
public class MeetingResource {
    
    @Inject
    MeetingService service;
    
    @Path("/json")
    @GET
    @Produces("application/json")
    public List<Meeting> getMeetingsJson() {
        return service.getMeetings();
    }
    
    @Path("/xml")
    @GET
    @Produces("application/xml")
    public List<Meeting> getMeetingsXML() {
        return service.getMeetings();
    }
    
    @Path("/json/{meetingId}")
    @GET
    @Produces("application/json")
    public Meeting getMeetingJson(@PathParam("meetingId") long id) {
        return service.getMeeting(id);
    }
    
    @Path("/xml/{meetingId}")
    @GET
    @Produces("application/xml")
    public Meeting getMeetingXML(@PathParam("meetingId") long id) {
        return service.getMeeting(id);
    }
}
