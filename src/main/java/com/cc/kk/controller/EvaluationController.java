package com.cc.kk.controller;

import com.cc.kk.util.LogBox;
import com.cc.kk.vo.EvaluationsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api(tags = "评价管理相关接口")
@RequestMapping(produces = "application/json; charset=UTF-8")
public class EvaluationController {

    private LogBox logBox = new LogBox();

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @ApiOperation("查询评论接口")
    @GetMapping(value = "/evaluations")
    public EvaluationsVO getEvaluation(HttpServletRequest request,String type, String key) {

        logBox.recordRequest(request, "EvaluationController:start");

        log.info("\nEvaluationController:start:/evaluations\n" +
                "queryParams:" + type + "\n" +
                "key:" + "*********");

        return null;
    }

    @ApiOperation("添加评论接口")
    @PostMapping(value = "/evaluation")
    public EvaluationsVO postEvaluation( @RequestBody  EvaluationsVO requestBody ){

        log.info("\n" +
                "postEvaluationController:start:" + "\n" +
                "" + requestBody.toSTring());

        return null;
    }

}
