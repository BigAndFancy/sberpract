package crud.vaadin;

import crud.backend.Departments;

import java.io.Serializable;

public class PersonModifiedEvent implements Serializable {

    private final Departments departments;

    public PersonModifiedEvent(Departments p) {
        this.departments = p;
    }

    public Departments getPerson() {
        return departments;
    }
    
}
