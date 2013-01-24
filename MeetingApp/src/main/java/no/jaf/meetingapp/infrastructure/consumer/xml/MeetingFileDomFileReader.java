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

        Meeting meeting = null;
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(filename);

        try {

            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            
            meeting = new Meeting();            
            meeting.setMeetingDate(rootNode.getChildText(MeetingFileConstants.NODE_DATE));
            meeting.setTitle(rootNode.getChildText(MeetingFileConstants.NODE_TITLE));
            meeting.setMeetingHost(rootNode.getChildText(MeetingFileConstants.NODE_HOST));
            meeting.setBgColor(rootNode.getChildText(MeetingFileConstants.NODE_BG_COLOR));
            List list = rootNode.getChildren(MeetingFileConstants.NODE_SLOT);

            List<MeetingSlot> slots = new ArrayList<MeetingSlot>();
            
            for (int i = 0; i < list.size(); i++) {
                MeetingSlot slot = new MeetingSlot();
                
                Element node = (Element) list.get(i);

                slot.setTimeStart(node.getChildText(MeetingFileConstants.NODE_TIME_START));
                slot.setTimeStop(node.getChildText(MeetingFileConstants.NODE_TIME_END));
                slot.setPresenter(node.getChildText(MeetingFileConstants.NODE_BY));
                slot.setSubject(node.getChildText(MeetingFileConstants.NODE_SUBJECT));

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
