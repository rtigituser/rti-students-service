// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.myapp.root;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "attendants", path = "attendants")
public interface AttendantRepository extends CosmosRepository<Attendant, String> {


    List<Attendant> findByStateId(String stateId);

    List<Attendant> findBySchoolId(String schoolId);

}
