package ir.negah.bank.arch.corporate.servicecatalogue.domain.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.io.*;
import java.util.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.domain.entity
 **/

@Setter
@Getter
@Entity
@Table(name = "ENDPOINT")
public class Endpoint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endpoint_s")
    @SequenceGenerator(sequenceName = "endpoint_s", allocationSize = 1, name = "endpoint_s")
    @Column(name = "SEQ_NO")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "URL", nullable = false)
    private String url;

    @Column(name = "CURL", nullable = false)
    private String curl;

    @Column(name = "TEST_ENV")
    private Boolean testEnv;

    @Column(name = "PROD_ENV")
    private Boolean prodEnv;

    @Column(name = "DESCRIPTION")
    private String description;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(name = "COMPANY_ENDPOINT",
//            joinColumns = { @JoinColumn(name = "ENDPOINT_ID") },
//            inverseJoinColumns = { @JoinColumn(name = "COMPANY_ID") })
    private List<Company> companies = new ArrayList<Company>();

    @ManyToOne
    private Project project;


}
