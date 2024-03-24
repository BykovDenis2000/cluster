package com.example.cluster.database.server;

import com.example.cluster.model.server.entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
}
