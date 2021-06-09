package com.cc.kk.controller;
import com.cc.kk.util.LogBox;
import com.cc.kk.vo.EvaluationsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api(tags = "回忆相关接口")
@RequestMapping(produces = "application/json; charset=UTF-8")
public class MemoryController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private LogBox logBox = new LogBox();

    @ApiOperation("查询会议接口")
    @GetMapping(value = "/memories")
    public EvaluationsVO getEvaluation(HttpServletRequest request, String pageNum, String pageSize) {

        logBox.recordRequest(request, "MemoryController:start");

        log.info("\nMemoryController:start:/memories\n" +
                "queryParams:" + pageNum + "\n" +
                "pageNum:" + pageNum + "\n");



        return null;
    }

}
