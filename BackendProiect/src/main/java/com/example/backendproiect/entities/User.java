package com.example.backendproiect.entities;

import com.example.backendproiect.dao.UserDAO;
import com.example.backendproiect.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User{

    @Id
    private String email;
    private String password;
}
