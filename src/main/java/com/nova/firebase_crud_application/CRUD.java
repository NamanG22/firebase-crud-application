package com.nova.firebase_crud_application;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CRUD {
    private String documentId;
    private String name;
    private String id;
    private Map<String,String> subjectMarks;
}
