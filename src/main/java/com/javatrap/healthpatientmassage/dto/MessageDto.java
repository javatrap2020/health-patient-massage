package com.javatrap.healthpatientmassage.dto;

import com.javatrap.healthpatientmassage.model.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MessageDto {
    private Long patientId;
    private String message;

    public static Message map(MessageDto messageDto) {
        return Message.builder()
                .patientId(messageDto.getPatientId())
                .message(messageDto.getMessage())
                .build();
    }

}
