package com.cursoapirest.Módulos.status.Rest;

import com.cursoapirest.Módulos.status.DTO.StatusDTO;
import org.springframework.http.ResponseEntity;

public interface StatusApi {

    ResponseEntity<StatusDTO> getStatus();
}
