package com.main.babble.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.babble.vo.Message;

@RestController
public class MessageController {


    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message) {

        try {
            //processing
          Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }

}
