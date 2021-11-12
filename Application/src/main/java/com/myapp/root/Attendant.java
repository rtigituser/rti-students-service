// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.myapp.root;


import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "attendance")
public class Attendant {
    private String id;
    private String date;
    private String reason;
    private String description;
    private String stateId;
    private String schoolId;
    private int grade;




    private String school;

    public Attendant() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("com.rti.root.entity.Attendant: %s %s, %s", stateId, date, schoolId);
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
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
}
