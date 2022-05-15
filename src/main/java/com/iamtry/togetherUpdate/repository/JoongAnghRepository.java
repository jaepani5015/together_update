package com.iamtry.togetherUpdate.repository;

import com.iamtry.togetherUpdate.domain.JoongAng;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JoongAnghRepository extends PagingAndSortingRepository<JoongAng, String> {

    JoongAng findByTitle(String title);
}
