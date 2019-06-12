package com.telran.demo.model.entity;


import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

@Table(name = "users")
public class User {

    @Id
    private long id;

    private LocalDateTime createdDate;

    private String fullName;

    private String email;



}
