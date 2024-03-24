package com.example.cluster.web;

import com.example.cluster.model.request.service.dto.RequestDto;
import com.example.cluster.model.response.service.dto.ResponseDto;
import com.example.cluster.model.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ServiceController {
    private final ServerService service;
    
    @PostMapping({"/getResult"})
    public ResponseDto list(@RequestBody RequestDto requestDto) {
        return service.getResponse(requestDto);
    }
}
