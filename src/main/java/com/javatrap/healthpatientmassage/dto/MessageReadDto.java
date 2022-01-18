package com.javatrap.healthpatientmassage.dto;

import com.javatrap.healthpatientmassage.model.Message;
import com.javatrap.healthpatientmassage.repo.entity.MessageRead;
import com.javatrap.healthpatientmassage.repo.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
public class MessageReadDto {
    private String id;
    private PatientDto patient;
    private Set<MessageDto> messages;

    public static List<MessageReadDto> map(List<MessageRead> messageList, Set<Patient> patientSet) {
        return messageList.stream().map(message ->
                MessageReadDto.builder()
        .id(message.getId())
        .patient(patientSet.stream().filter(patient1 -> patient1.getId().equals(message.getPatientId()))
        .map(PatientDto::map).findFirst().orElse(null))
        .build())
        .collect(Collectors.toList());

    }

}
