package ir.negah.bank.arch.servicecatalogue.domain.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * created by f.rashidabadi created on 6/19/2021 inside the package -
 * ir.negah.bank.arch.corporate.servicecatalogue.domain.entity
 */
@Setter
@Getter
@Entity
@Table(name = "PROJECT")
public class Project implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_s")
  @SequenceGenerator(sequenceName = "project_s", allocationSize = 1, name = "project_s")
  @Column(name = "SEQ_NO")
  private Long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "DESCRIPTION")
  private String description;

  @JsonBackReference
  @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Endpoint> endpoints;
}
