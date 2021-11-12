// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.myapp.root;


import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "students")
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String stateId;
    private String schoolId;
    private String dob;
    private int grade;




    private String school;

    public Student() {
    }

    public Student(String id, String stateId, String firstName, String lastName) {
        this.stateId = stateId;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("com.rti.root.Student: %s %s, %s", firstName, lastName, id);
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
