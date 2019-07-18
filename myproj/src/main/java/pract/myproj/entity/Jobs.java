package pract.myproj.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "hours")
    private int hours;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "departmen_id", nullable = false)
    private Departments departments;

    public Jobs() {
    }

    public Jobs(String name, int hours, Departments departments){
        this.name=name;
        this.hours=hours;
        this.departments=departments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
