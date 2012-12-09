package no.jaf.meetingapp.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import no.jaf.meetingapp.domain.Meeting;
import no.jaf.meetingapp.service.MeetingService;

@ManagedBean
public class MeetingListBean {

    @Inject
    MeetingService meetingService;
    
    public List<Meeting> getMeetings() {
        return meetingService.getMeetings();
    }
}
