package com.example.demo.service.impl;

import com.example.demo.dto.LottoReqDto;
import com.example.demo.entity.Lotto;

public interface LottoService {
    Lotto addLotto(LottoReqDto dto);
}
