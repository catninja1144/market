package com.example.market.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String userId;
    private String password;
    private String email;
    private String tel;
}
