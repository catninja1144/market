package com.example.market.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "brand")
@SequenceGenerator(name = "brand_sql", sequenceName = "brand_sql",
        initialValue = 1,allocationSize = 1)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "brandNo")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "brand_sql")
    @Column(name="brand_sql")
    private Long brandNo;
}
