package pract.myproj.entity;

import org.hibernate.annotations.GenericGenerator;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "officer")
public class Officers {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday")
    private Date birthday;


    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "job_id", nullable = false)
    private Jobs jobs;

    public Officers() {
    }

    public Officers(String firstName, String lastName, Date birthday,Jobs jobs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.jobs=jobs;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName(){
        return lastName;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday){
        this.birthday=birthday;
    }

}
