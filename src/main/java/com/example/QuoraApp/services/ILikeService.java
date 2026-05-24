package com.example.QuoraApp.services;

import com.example.QuoraApp.dto.LikeRequestDTO;
import com.example.QuoraApp.dto.LikeResponseDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ILikeService {

    Mono<LikeResponseDTO> createLike(LikeRequestDTO likeRequestDTO);
    Mono<LikeResponseDTO> countLikesByTargetIdAndTargetType(String targetId, String targetType);
    Mono<LikeResponseDTO> countDisLikesByTargetIdAndTargetType(String targetId, String targetType);
    Mono<LikeResponseDTO> toggleLike(String targetId, String targetType, Boolean isLike);
}
