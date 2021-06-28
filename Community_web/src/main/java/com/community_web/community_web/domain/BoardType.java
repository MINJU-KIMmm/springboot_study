package com.community_web.community_web.domain;

public enum BoardType {
    notice("공지사향");
    free("자유게시판");

    private String value;

    BoardType(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }
}
