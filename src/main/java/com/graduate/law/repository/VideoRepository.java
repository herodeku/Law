package com.graduate.law.repository;

import com.graduate.law.bean.Video;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface VideoRepository extends ElasticsearchRepository<Video,String> {
}
