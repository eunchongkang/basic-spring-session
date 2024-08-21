package basic.service;

import basic.repository.MemberRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
}