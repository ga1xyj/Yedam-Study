package com.java.lotto.service.impl;

import com.java.lotto.dto.LottoReqDto;
import com.java.lotto.entity.Lotto;
import com.java.lotto.repository.LottoRepository;
import com.java.lotto.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LottoServiceImpl implements LottoService {
    private final LottoRepository repository;

    @Override
    public Lotto addLotto(LottoReqDto dto) {
        return repository.save(dto.toEntity());
    }
}
