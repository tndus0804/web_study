package net.datasa.web4.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.web4.dto.GuestBookDTO;
import net.datasa.web4.entity.GuestBookEntity;
import net.datasa.web4.repository.GuestRepository;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class GuestServiceImpl implements GuestService {

	private final GuestRepository repository;

    /**
     * 글 저장
     * @param dto 저장할 글 내용
     */
	@Override
	public void write(GuestBookDTO guestbook) {
		
		log.debug("param [GuestBook]: {}", guestbook);
		
		GuestBookEntity entity = GuestBookEntity.builder()
								 .name(guestbook.getName())
								 .password(guestbook.getPassword())
								 .message(guestbook.getMessage())
								 .build();
		repository.save(entity);
	}

    /**
     * 글 목록 조회
     * @return 글 정보 객체가 저장된 목록
     */
	@Override
	public List<GuestBookDTO> selectAll() {
		
    	Sort sort = Sort.by(Sort.Direction.DESC, "num");
    	
		List<GuestBookEntity> entityList = repository.findAll(sort);
		log.debug("DB [GuestBookEntity]: {}", entityList);
		
		// ArrayList 생성
		List<GuestBookDTO> dtoList = new ArrayList<>();
		
		for (GuestBookEntity entity : entityList) {
			GuestBookDTO dto = GuestBookDTO.builder()
							   .num(entity.getNum())
							   .name(entity.getName())
							   .message(entity.getMessage())
							   .inputdate(entity.getInputdate())
							   .build();
			dtoList.add(dto);
		}
		
		return dtoList;
	}

    /**
     * 글번호와 비밀번호를 전달받아 비번이 맞으면 글 삭제
     * @param num 삭제할 글 번호
     * @param password 비밀번호
     */
	@Override
	public void delete(GuestBookDTO guestbook) {
		
		// 전달된 번호로 글 정보 조회
		// 글이 없으면 예외
		GuestBookEntity entity = repository.findById(guestbook.getNum())
				.orElseThrow(() -> new EntityNotFoundException("해당 글이 없습니다."));
		
		// 글이 있으면 비밀번호 비교
		// 비밀번호 틀리면 예외
		if (!guestbook.getPassword().equals(entity.getPassword())) {
			throw new RuntimeException("비밀번호가 틀립니다.");
		}
		
		// 일치하면 글 삭제
		repository.delete(entity);
	}

}
