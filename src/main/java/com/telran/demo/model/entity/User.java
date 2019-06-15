package com.telran.demo.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime createdDate;

    private String fullName;

    @Column (unique = true)
    private String email;

}
