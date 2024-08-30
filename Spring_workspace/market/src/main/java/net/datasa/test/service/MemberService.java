package net.datasa.test.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.datasa.test.domain.dto.MemberDTO;
import net.datasa.test.domain.entity.MemberEntity;
import net.datasa.test.repository.MemberRepository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 회원정보 서비스
 */
@RequiredArgsConstructor
@Service
@Transactional
public class MemberService {

	private final MemberRepository memberRepository;
	
    //WebSecurityConfig에서 생성한 암호화 인코더
    private final BCryptPasswordEncoder passwordEncoder;

	public void joinMember(MemberDTO memberdto) {
		MemberEntity memberEntity = MemberEntity.builder()
									.memberId(memberdto.getMemberId())
									.memberPassword(
										passwordEncoder.encode(memberdto.getMemberPw()))
									.memberName(memberdto.getMemberName())
									.phone(memberdto.getPhone())
									.build();
		
		memberRepository.save(memberEntity);
	}
}
