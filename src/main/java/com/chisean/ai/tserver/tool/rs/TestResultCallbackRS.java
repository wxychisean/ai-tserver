package com.chisean.ai.tserver.tool.rs;

import com.chisean.core.rs.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.io.Serializable;
import java.util.Map;

@Slf4j
@Api(tags="测试工具")
@RestController
@RequestMapping("/tool")
public class TestResultCallbackRS implements Serializable {

    @ApiOperation("检测结果")
    @RequestMapping(value = "/{toolName}/result", method =RequestMethod.POST )
    public RestResult<TestResult> result(@PathVariable("toolName") String toolName, @RequestBody Map<String, Object> result, HttpServletRequest request) {
        log.info(" toolName {}" , toolName);
        log.info(" tool id {}" , request.getHeader("tool-id"));
        log.info(" remote address {}" , request.getRemoteAddr());
        log.info("result {}" , result);

        return RestResult.ok();
    }

    @RequestMapping(value = "/{toolName}/result", method =RequestMethod.GET )
    public RestResult<TestResult> result2(@PathVariable("toolName") String toolName, @RequestBody Map<String, Object> result, HttpServletRequest request) {
        log.info(" tool id {}" , request.getHeader("tool-id"));
        log.info(" remote address {}" , request.getRemoteAddr());
        log.info("result {}" , result);

        return RestResult.ok();
    }
}
