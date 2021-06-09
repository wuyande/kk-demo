package com.cc.kk.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;

@ApiModel
public class EvaluationsVO {

    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "标签")
    private String[] tags;

    public String toSTring() {

        return "content:     " + this.content + "\n" +
               "type:        " + this.type + "\n" +
               "tags:        " + Arrays.toString(this.tags) + "\n" ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
