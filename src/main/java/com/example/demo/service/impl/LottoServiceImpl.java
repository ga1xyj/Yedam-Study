package com.example.demo.service.impl;

import com.example.demo.dto.LottoReqDto;
import com.example.demo.entity.Lotto;
import com.example.demo.repository.LottoRepository;
import lombok.RequiredArgsConstructor;
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
