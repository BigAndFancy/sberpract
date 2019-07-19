package pract.myproj.entity;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "name",length=64, nullable = false)
    private String name;

    @Column(name="hours", nullable = false)
    private int hours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

}
