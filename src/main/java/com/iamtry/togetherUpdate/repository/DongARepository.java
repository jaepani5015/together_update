package com.iamtry.togetherUpdate.repository;

import com.iamtry.togetherUpdate.domain.DongA;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DongARepository extends PagingAndSortingRepository<DongA, String> {

    DongA findByTitle(String title);
}
