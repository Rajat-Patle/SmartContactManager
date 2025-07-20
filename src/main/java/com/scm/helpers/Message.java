package com.scm.helpers;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Message {
    private String content;
    @Builder.Default
    private MessageType type = MessageType.green; // success, error, info, warning 
}
