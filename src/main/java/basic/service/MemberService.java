package basic.service;


import basic.dto.MemberSaveRequestDto;
import basic.dto.MemberSaveResponseDto;
import basic.entity.Member;
import basic.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberSaveResponseDto saveMember(MemberSaveRequestDto memberSaveRequestDto) {
    Member newMember = new Member(MemberSaveRequestDto.??);
    Member savedMember = memberRepository.save(newMember);

    return new MemberSaveResponseDto(savedMember.getName());
    }

}