package com.example.spisok.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Role_id_seq")
    @SequenceGenerator(name = "user_id_seq",sequenceName = "user_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "Role")
    private String role;
}

