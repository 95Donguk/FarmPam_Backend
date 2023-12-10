package com.fp.backend.chat.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;

@Data
public class Message {
    private String fromUserId;

    private String message;

    private String updatedAt;
}