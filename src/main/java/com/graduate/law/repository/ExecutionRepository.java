package com.graduate.law.repository;

import com.graduate.law.bean.Execution;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ExecutionRepository extends ElasticsearchRepository<Execution,String> {
}
