package com.iamtry.togetherUpdate.repository;

import com.iamtry.togetherUpdate.domain.Chosun;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ChosunRepository extends PagingAndSortingRepository<Chosun, String> {
    Chosun findByTitle(String title);
}
