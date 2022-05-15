package com.iamtry.togetherUpdate.repository;

import com.iamtry.togetherUpdate.domain.Kyunghyang;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface KyunghyangRepository extends PagingAndSortingRepository<Kyunghyang, String> {

    Kyunghyang findByTitle(String title);
}
