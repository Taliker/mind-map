package com.fclerget.mindmap.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Leaf {

    @Id
    private String path;

    private String text;
}
