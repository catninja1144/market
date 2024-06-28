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
@Table(name = "market")
@SequenceGenerator(name = "market_sql", sequenceName = "market_sql",
        initialValue = 1,allocationSize = 1)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "marketNo")
public class MarketEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hotelImg_sql")
    @Column(name="market_sql")
    private Long marketNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_no")
    private UserEntity userEntity;

//    @OneToMany(mappedBy = "hotelEntity", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<StoreEntity> storeEntities;

}
