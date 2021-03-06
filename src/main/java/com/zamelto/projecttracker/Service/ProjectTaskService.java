package com.zamelto.projecttracker.Service;

import com.zamelto.projecttracker.Models.ProjectTask;
import com.zamelto.projecttracker.Repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;
    
    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){
        
        if(projectTask.getStatus() == null || projectTask.getStatus() == ""){
            projectTask.setStatus("TO_DO");
        }

        return projectTaskRepository.save(projectTask);
    }

    public Iterable<ProjectTask> getAllProjects(){
        return projectTaskRepository.findAll();
    }

    public ProjectTask getProjectById(Long id){
        return projectTaskRepository.getById(id);
    }

    public void deleteProject(Long id){
        ProjectTask projectTask = getProjectById(id);
        projectTaskRepository.delete(projectTask);
    }
}