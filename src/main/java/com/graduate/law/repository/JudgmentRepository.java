package com.graduate.law.repository;

import com.graduate.law.bean.Judgment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface JudgmentRepository extends ElasticsearchRepository<Judgment,String> {

}
