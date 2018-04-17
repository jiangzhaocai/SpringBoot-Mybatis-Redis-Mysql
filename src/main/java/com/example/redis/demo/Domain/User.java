package com.example.redis.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User  implements Serializable {

    int id;
    String username;
    String password;
}
