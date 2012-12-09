package no.jaf.meetingapp.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Meeting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String meetingDate;
    private String meetingHost;
    private String bgColor;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<MeetingSlot> slots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MeetingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<MeetingSlot> slots) {
        this.slots = slots;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingHost() {
        return meetingHost;
    }

    public void setMeetingHost(String meetingHost) {
        this.meetingHost = meetingHost;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 11 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 11 * hash + (this.meetingDate != null ? this.meetingDate.hashCode() : 0);
        hash = 11 * hash + (this.meetingHost != null ? this.meetingHost.hashCode() : 0);
        hash = 11 * hash + (this.bgColor != null ? this.bgColor.hashCode() : 0);
        hash = 11 * hash + (this.slots != null ? this.slots.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Meeting other = (Meeting) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }
        if ((this.meetingDate == null) ? (other.meetingDate != null) : !this.meetingDate.equals(other.meetingDate)) {
            return false;
        }
        if ((this.meetingHost == null) ? (other.meetingHost != null) : !this.meetingHost.equals(other.meetingHost)) {
            return false;
        }
        if ((this.bgColor == null) ? (other.bgColor != null) : !this.bgColor.equals(other.bgColor)) {
            return false;
        }
        if (this.slots != other.slots && (this.slots == null || !this.slots.equals(other.slots))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Meeting{" + "id=" + id + ", title=" + title + ", date=" + meetingDate + ", host=" + meetingHost + ", bgColor=" + bgColor + ", slots=" + slots + '}';
    }
}
