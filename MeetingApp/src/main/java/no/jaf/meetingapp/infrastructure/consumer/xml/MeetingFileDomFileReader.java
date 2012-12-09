package no.jaf.meetingapp.infrastructure.consumer.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import no.jaf.meetingapp.domain.Meeting;
import no.jaf.meetingapp.domain.MeetingSlot;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class MeetingFileDomFileReader implements MeetingFileReader {

    @Override
    public Meeting read(String filename)  {

        Meeting meeting = new Meeting();
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(filename);

        try {

            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            
            meeting.setMeetingDate(rootNode.getChildText("dato"));
            meeting.setTitle(rootNode.getChildText("tittel"));
            meeting.setMeetingHost(rootNode.getChildText("arrangor"));
            meeting.setBgColor(rootNode.getChildText("bakgrunnsfarge"));
            List list = rootNode.getChildren("presentasjon");

            List<MeetingSlot> slots = new ArrayList<MeetingSlot>();
            
            for (int i = 0; i < list.size(); i++) {
                MeetingSlot slot = new MeetingSlot();
                
                Element node = (Element) list.get(i);

                slot.setTimeStart(node.getChildText("tidStart"));
                slot.setTimeStop(node.getChildText("tidSlutt"));
                slot.setPresenter(node.getChildText("av"));
                slot.setSubject(node.getChildText("emne"));

                System.out.println(slot.getTimeStart() + " - " + slot.getTimeStop() + ": (" + slot.getPresenter() + ") " + slot.getSubject());
                slots.add(slot);
            }
            meeting.setSlots(slots);

        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        } finally{
            return meeting;
        }
    }
}
