package pract.myproj.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "historys")
public class Historys {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "day")
    private Date day;

    @Column(name = "time")
    private Time time;

    @Column(name = "status")
    private Boolean status;

    @OneToMany (fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "officer_id", nullable = false)
    private Officers officers;

    public Historys() {
    }

    public Historys(Date day, Time time, Boolean status,Officers officers){
        this.day=day;
        this.time=time;
        this.status=status;
        this.officers=officers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Date getDay(){
        return day;
    }

    public Time getTime() {
        return time;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
