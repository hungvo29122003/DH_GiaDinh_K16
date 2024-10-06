package com.example;

public interface OutputBoundary {
    void outError(ResponseError error);
    void outResult(ResponseResult result);

}
