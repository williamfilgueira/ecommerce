package org.serratec.backand.finalWork.repository;

import org.serratec.backand.finalWork.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Client_Repository extends JpaRepository<Clients, Long> {

}
