package com.java.lotto.controller;

import com.java.lotto.dto.LottoReqDto;
import com.java.lotto.entity.Lotto;
import com.java.lotto.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LottoController {

    private final LottoService service;

    @PostMapping("/lotto")
    public Lotto addLotto(@RequestBody LottoReqDto dto){
        return service.addLotto(dto);
    }
}
