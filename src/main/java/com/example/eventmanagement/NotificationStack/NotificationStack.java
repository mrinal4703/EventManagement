package com.example.eventmanagement.NotificationStack;
import jakarta.persistence.*;

@Entity
@Table(name="notification")
public class NotificationStack {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    private String email;
    private Integer id1;


    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Column(length = 1000)
    private String message;
    public NotificationStack() {
    }
    public NotificationStack(String email, Integer id1, String message) {
        this.email = email;
        this.id1 = id1;
        this.message = message;
    }


}
