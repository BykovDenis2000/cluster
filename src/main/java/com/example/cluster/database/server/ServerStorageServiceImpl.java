package com.example.cluster.database.server;

import com.example.cluster.model.server.dao.ServerStorageService;
import com.example.cluster.model.server.entity.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ServerStorageServiceImpl implements ServerStorageService {
    private final ServerRepository repository;

    @Override
    public List<Server> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Server server) {
        repository.save(server);
    }
}
