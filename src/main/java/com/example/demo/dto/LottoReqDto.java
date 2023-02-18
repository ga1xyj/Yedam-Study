package com.example.demo.dto;

import com.example.demo.entity.Lotto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LottoReqDto {
    private int id;
    private String num;

    public Lotto toEntity(){
        return Lotto.builder()
                .id(this.id)
                .num(this.num)
                .build();
    }
}
