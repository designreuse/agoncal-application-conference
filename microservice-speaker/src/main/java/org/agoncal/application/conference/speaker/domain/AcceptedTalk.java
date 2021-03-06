package org.agoncal.application.conference.speaker.domain;

import org.agoncal.application.conference.commons.domain.LinkableResource;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Entity
@Table(name = "sp_talk")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AcceptedTalk extends LinkableResource {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    private String id;
    private String title;
    private String language;

    // ======================================
    // =            Constructors            =
    // ======================================

    public AcceptedTalk() {
    }

    public AcceptedTalk(String id, String title, String language) {
        this.id = id;
        this.title = title;
        this.language = language;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcceptedTalk that = (AcceptedTalk) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AcceptedTalk{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", language='" + language + '\'' +
            '}';
    }
}
