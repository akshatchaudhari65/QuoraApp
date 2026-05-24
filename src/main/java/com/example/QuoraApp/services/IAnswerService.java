package com.example.QuoraApp.services;

import com.example.QuoraApp.dto.AnswerRequestDTO;
import com.example.QuoraApp.dto.AnswerResopnseDTO;
import com.example.QuoraApp.models.Answer;
import reactor.core.publisher.Mono;

public interface IAnswerService {
    public Mono<AnswerResopnseDTO> createAnswer(AnswerRequestDTO answerRequestDTO);
    public Mono<AnswerResopnseDTO> getAnswerById(String id);
}
