package org.serratec.backand.finalWork.repository;

import org.serratec.backand.finalWork.models.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleEntity, Long> {

}
