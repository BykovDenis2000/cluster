package com.example.cluster.model.server.service;

import com.example.cluster.model.request.service.dto.RequestDto;
import com.example.cluster.model.response.service.dto.ResponseDto;

public interface ServerService {
    ResponseDto getResponse(RequestDto requestDto);
}
