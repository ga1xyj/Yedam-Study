package com.java.lotto.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lotto")
@Builder
public class Lotto {
    @Id
    @GeneratedValue
    private int id;

    private String num;
}
