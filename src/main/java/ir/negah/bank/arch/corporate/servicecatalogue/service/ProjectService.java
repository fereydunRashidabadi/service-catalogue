package ir.negah.bank.arch.corporate.servicecatalogue.service;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import ir.negah.bank.arch.corporate.servicecatalogue.domain.entity.*;
import ir.negah.bank.arch.corporate.servicecatalogue.repository.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import java.util.*;

/**
 * created by f.rashidabadi created on 6/19/2021 inside the package -
 * ir.negah.bank.arch.corporate.servicecatalogue.service
 */
@Service
@Transactional
@Slf4j
public class ProjectService {
  @Autowired private ProjectRepository projectRepository;

  @Autowired ObjectMapper objectMapper;

  public String getAllProjects() {
    try {
      List<Project> Project = projectRepository.findAll();
      return objectMapper.writeValueAsString(Project);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }

  public String saveProject(Project project) {
    projectRepository.save(project);
    return getAllProjects();
  }

  public String deleteProjectById(Long projectId) {
    projectRepository.deleteById(projectId);
    return getAllProjects();
  }
}
