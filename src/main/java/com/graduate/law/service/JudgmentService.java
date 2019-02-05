package com.graduate.law.service;

import com.graduate.law.bean.Judgment;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface JudgmentService {
    List<Judgment> simpleSearch(String message, Pageable pageable);
    List<Judgment> getAllJudgment();
    void deleteAllJudgment();
    void saveCivil();
}
