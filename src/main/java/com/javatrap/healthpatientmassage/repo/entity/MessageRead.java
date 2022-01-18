package com.javatrap.healthpatientmassage.repo.entity;

import com.javatrap.healthpatientmassage.model.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document(collation = "messages")
public class MessageRead {
    @Id
    private String id;
    private Set<Message> messages = new LinkedHashSet<>();


}
