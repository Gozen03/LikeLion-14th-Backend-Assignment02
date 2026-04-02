package com.likelion.hw0401.member.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Member {

    private Long id;
    private String name;
    private int age;

    @Builder
    public Member(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void update(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
