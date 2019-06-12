package com.telran.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UserDto {

    private long id;

    private LocalDateTime createdDate;

    private String fullName;

    private String email;
}
