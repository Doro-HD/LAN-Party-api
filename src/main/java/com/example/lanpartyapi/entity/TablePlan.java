package com.example.lanpartyapi.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class TablePlan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tableplan_id;

    @OneToMany
    public List<Segment> segments = new ArrayList<>();


    private String name;

}
