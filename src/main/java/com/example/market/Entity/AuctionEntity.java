package com.example.market.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString(exclude = {"itemEntity"})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "auction")
@SequenceGenerator(name = "auction_sql", sequenceName = "auction_sql",
        initialValue = 1,allocationSize = 1)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "auctionNo")
public class AuctionEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "auction_sql")
    @Column(name="auction_sql")
    private Long auctionNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_no")
    private ItemEntity itemEntity;
}
