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
@Table(name = "COMPANY")
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_s")
    @SequenceGenerator(sequenceName = "company_s", allocationSize = 1, name = "company_s")
    @Column(name = "SEQ_NO")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "IP")
    private String ip;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "DESCRIPTION")
    private String description;

//    @JsonManagedReference
    @ManyToMany(mappedBy="companies", fetch = FetchType.LAZY)
    private List<Endpoint> endpoints = new ArrayList<Endpoint>();


}
