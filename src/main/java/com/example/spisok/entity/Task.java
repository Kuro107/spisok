package com.example.spisok.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "task_id_seq")
    @SequenceGenerator(name = "task_id_seq", sequenceName = "city_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "Title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name="task")
    private String task;

    @Column(name = "date_to_do")
    private Date dateToDo;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users users;



}

