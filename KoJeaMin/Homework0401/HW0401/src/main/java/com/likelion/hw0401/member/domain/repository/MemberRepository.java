package com.likelion.hw0401.member.domain.repository;

import com.likelion.hw0401.member.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberRepository {

    private static Map<Long, Member> database = new HashMap<>();

    //멤버 저장
    public void save(Member member){
        database.put(member.getId(), member);
    }

    //멤버 id로 조회
    public Member findById(Long id){
        return database.get(id);
    }

    //멤버 전체 리스트 조회
    public List<Member> findAll(){
        return database.values().stream().toList();
    }

    //멤버 업데이트
    public void updateById(Long id, Member member){
        database.put(id, member);
    }

    //멤버 삭제
    public void deleteById(Long id){
        database.remove(id);
    }


}