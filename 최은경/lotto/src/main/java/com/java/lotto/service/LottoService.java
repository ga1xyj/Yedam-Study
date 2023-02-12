package com.java.lotto.service;

import com.java.lotto.dto.LottoReqDto;
import com.java.lotto.entity.Lotto;

public interface LottoService {

    public Lotto addLotto(LottoReqDto dto);
}
