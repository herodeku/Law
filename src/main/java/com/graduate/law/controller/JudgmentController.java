package com.graduate.law.controller;

import com.graduate.law.bean.Judgment;
import com.graduate.law.repository.JudgmentRepository;
import com.graduate.law.service.JudgmentService;
import com.graduate.law.util.LoadSource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/Judgment")
@Api(description = "操作裁判文书网")
public class JudgmentController {

    @Autowired
    private JudgmentRepository judgmentRepository;

    @Autowired
    private JudgmentService judgmentService;

    @ApiOperation(value = "简单查询")
    @GetMapping("/simpleSearch/{message}/{page}/{size}")
    public List<Judgment> simpleSearch(
            @ApiParam(name = "message", value = "查询内容", required = true)@PathVariable String message,
            @ApiParam(name = "page", value = "第page页（从0开始）", required = true)@PathVariable Integer page,
            @ApiParam(name = "size", value = "每页size条数据", required = true)@PathVariable Integer size ){
        PageRequest pageRequest = new PageRequest(page, size);
        return judgmentService.simpleSearch(message,pageRequest);
    }

    @ApiOperation(value = "获取所有文书")
    @GetMapping("getAllJudgment")
    public List<Judgment> getAllJudgment(){
        return judgmentService.getAllJudgment();
    }

    @GetMapping("deleteAllJudgment")
    public void deleteAllJudgment(){
        judgmentService.deleteAllJudgment();
    }
    @GetMapping("/saveJudgment")
    public void saveCivil(){
        judgmentService.saveCivil();
    }
}
