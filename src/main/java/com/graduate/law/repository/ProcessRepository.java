package com.graduate.law.repository;

import com.graduate.law.bean.Process;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProcessRepository extends ElasticsearchRepository<Process,String> {
}
