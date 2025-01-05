package org.example.loggingstudy.service;

import org.example.loggingstudy.controller.dto.MemberRequest;
import org.example.loggingstudy.domain.Member;
import org.example.loggingstudy.domain.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(MemberRequest memberRequest) {
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }
}
