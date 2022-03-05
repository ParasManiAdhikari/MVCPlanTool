package de.luebeck.plantool.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeTable {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    public void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }
}
