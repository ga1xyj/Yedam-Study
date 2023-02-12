package com.java.lotto.dto;

import com.java.lotto.entity.Lotto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LottoReqDto {

    @Nullable
    private int id;
    private String num;


    public Lotto toEntity(){
        return Lotto.builder()
                .id(this.id)
                .num(this.num)
                .build();
    }
}
