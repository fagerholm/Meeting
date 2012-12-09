package no.jaf.meetingapp.web;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import no.jaf.meetingapp.service.MeetingService;

@ManagedBean
public class UploadMeetingBean {

    private String filename;
    
    @Inject
    MeetingService service;
    
    public String upload(){
        System.out.println("Kaller tjenesten for å lese fil");
        service.readAndPersistMeeting(filename);
        return "index";
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    
}
