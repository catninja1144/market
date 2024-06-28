package com.example.market.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
@SequenceGenerator(name = "user_sql", sequenceName = "user_sql",
        initialValue = 1,allocationSize = 1)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userNo")
public class UserEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sql")
    @Column(name="user_sql")
    private Long userNo;


    @OneToMany(mappedBy = "marketEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MarketEntity> marketEntityList;

}
