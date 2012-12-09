/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.jaf.meetingapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Jon
 */
@Entity
public class MeetingSlot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)/*, generator="meetingSlotSeq" )
    @SequenceGenerator(name="meetingSlotSeq", sequenceName="meetingslot_seq")*/
    private Long id;
    
    private String timeStart;
    private String timeStop;
    private String presenter;
    private String subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(String timeStop) {
        this.timeStop = timeStop;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 79 * hash + (this.timeStart != null ? this.timeStart.hashCode() : 0);
        hash = 79 * hash + (this.timeStop != null ? this.timeStop.hashCode() : 0);
        hash = 79 * hash + (this.presenter != null ? this.presenter.hashCode() : 0);
        hash = 79 * hash + (this.subject != null ? this.subject.hashCode() : 0);
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
        final MeetingSlot other = (MeetingSlot) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.timeStart == null) ? (other.timeStart != null) : !this.timeStart.equals(other.timeStart)) {
            return false;
        }
        if ((this.timeStop == null) ? (other.timeStop != null) : !this.timeStop.equals(other.timeStop)) {
            return false;
        }
        if ((this.presenter == null) ? (other.presenter != null) : !this.presenter.equals(other.presenter)) {
            return false;
        }
        if ((this.subject == null) ? (other.subject != null) : !this.subject.equals(other.subject)) {
            return false;
        }
        return true;
    }

    
    

    @Override
    public String toString() {
        return "MeetingSlot{" + "id=" + id + ", timeStart=" + timeStart + ", timeStop=" + timeStop + ", presenter=" + presenter + ", subject=" + subject + '}';
    }

    
    
}
