package com.example.cluster.model.server.service;

import com.example.cluster.model.request.service.dto.RequestDto;
import com.example.cluster.model.response.service.dto.ResponseDto;
import com.example.cluster.model.response.service.dto.enums.ResponseStatus;
import com.example.cluster.model.server.dao.ServerStorageService;
import com.example.cluster.model.server.entity.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ServerServiceImpl implements ServerService {
    private final ServerStorageService storageService;

    public Long calcRam(Integer ram) {
        List<Server> serverList = storageService.findAll();
        for (Server server : serverList) {
            int resultRam = server.getFreeRam() - ram;
            if (resultRam >= 0) {
                server.setFreeRam(resultRam);
                storageService.save(server);
                return server.getId();
            }
        }
        return null;
    }

    public ResponseDto getResponse(RequestDto requestDto) {
        Long hostId = calcRam(requestDto.getSize());
        ResponseDto responseDto = new ResponseDto();
        
        if (Objects.nonNull(hostId)) {
            responseDto.setHostId(hostId);
            responseDto.setResult(ResponseStatus.OK);
        } else {
            responseDto.setResult(ResponseStatus.NOT_OK);
        }
        return responseDto;
    }
}
