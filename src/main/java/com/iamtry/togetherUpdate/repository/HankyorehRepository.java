package com.iamtry.togetherUpdate.repository;

import com.iamtry.togetherUpdate.domain.Hankyoreh;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HankyorehRepository extends PagingAndSortingRepository<Hankyoreh, String> {

    Hankyoreh findByTitle(String title);
}
