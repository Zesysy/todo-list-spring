package fr.wcs.sylene.yourtodolist.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @Type(type = "uuid-char")
    private UUID uuid;

    @Column(name = "content")
    private String content;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}