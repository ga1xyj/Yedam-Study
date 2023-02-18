package com.example.demo.controller;

import com.example.demo.dto.LottoReqDto;
import com.example.demo.entity.Lotto;
import com.example.demo.service.impl.LottoService;
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
