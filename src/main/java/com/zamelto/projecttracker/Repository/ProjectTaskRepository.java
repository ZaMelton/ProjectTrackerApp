package com.zamelto.projecttracker.Repository;

import com.zamelto.projecttracker.Models.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    //Created own getById that returns type ProjectTask, rather than using findById that returns type Optional<?>
    ProjectTask getById(Long id);
}