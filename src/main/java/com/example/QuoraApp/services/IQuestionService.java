package com.example.QuoraApp.services;

import com.example.QuoraApp.dto.QuestionRequestDTO;
import com.example.QuoraApp.dto.QuestionResponseDTO;
import com.example.QuoraApp.models.Question;
import reactor.core.publisher.Mono;

public interface IQuestionService {
    public Mono<QuestionResponseDTO> createQuestion(QuestionRequestDTO questionRequestDTO);
}
