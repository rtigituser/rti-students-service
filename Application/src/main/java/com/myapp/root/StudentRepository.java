// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.myapp.root;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends CosmosRepository<Student, String> {


    List<Student> findByFirstName(String firstName);

    Student findByStateId(String stateId);

}
