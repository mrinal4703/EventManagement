package com.example.eventmanagement.NotificationStack;

import com.example.eventmanagement.Faculty.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("https://localhost:3000")
public class NotificationStackController {

    private NotificationStackRepository notificationStackRepository;

    @Autowired
    public NotificationStackController(NotificationStackRepository notificationStackRepository) {
        this.notificationStackRepository = notificationStackRepository;
    }

    @PostMapping("/newmessage")
    public NotificationStack newMessage(@RequestBody NotificationStack newMessage) {
        return notificationStackRepository.save(newMessage);
    }
}
