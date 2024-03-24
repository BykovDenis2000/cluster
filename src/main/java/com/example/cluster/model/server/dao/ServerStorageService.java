package com.example.cluster.model.server.dao;

import com.example.cluster.model.server.entity.Server;

import java.util.List;

public interface ServerStorageService {
    List<Server> findAll();
    void save(Server server);
}
