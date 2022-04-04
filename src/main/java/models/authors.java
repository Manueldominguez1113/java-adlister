package models;

import java.io.Serializable;

public class authors implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    public authors(int id, String firstName, String lastName){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    }
}
