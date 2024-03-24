package com.example.cluster.model.response.service.dto;

import com.example.cluster.model.response.service.dto.enums.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {
    private ResponseStatus result;
    private Long hostId;
}
