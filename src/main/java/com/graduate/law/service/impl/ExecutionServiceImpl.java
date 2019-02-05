package com.graduate.law.service.impl;

import com.graduate.law.bean.Judgment;
import com.graduate.law.repository.JudgmentRepository;
import com.graduate.law.service.ExecutionService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ExecutionServiceImpl implements ExecutionService {
}
