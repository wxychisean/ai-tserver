package com.chisean.ai.tserver.tool.rs;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class TestResult implements Serializable {
    String id;
    String status;

}
