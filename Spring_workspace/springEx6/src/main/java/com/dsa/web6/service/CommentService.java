package com.dsa.web6.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web6.dto.CommentDTO;
import com.dsa.web6.entity.CommentEntity;
import com.dsa.web6.repository.CommentRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {
	
	private final CommentRepository commentRepository;
	
	/**
	 * 댓글 목록 조회
	 * @return 댓글 목록
	 */
	public List<CommentDTO> getList() {
		List<CommentEntity> entityList = commentRepository.findAll();
		List<CommentDTO> dtoList = new ArrayList<>();
		
		for (CommentEntity entity : entityList) {
			CommentDTO dto = CommentDTO.builder()
					  .num(entity.getNum())
					  .name(entity.getName())
					  .comment(entity.getComment())
					  .build();
			dtoList.add(dto);
//			log.debug("getCommentList-service: {}", dto);
		}
		
		return dtoList;
	}
	
	/**
	 * 댓글 저장
	 * @param dto 저장할 댓글 정보
	 */
	public void writeComment(CommentDTO dto) {
		CommentEntity entity = CommentEntity.builder()
							   .name(dto.getName())
							   .comment(dto.getComment())
							   .build();
		commentRepository.save(entity);
	}
	
	/**
	 * 댓글 삭제
	 * @param num 댓글 번호
	 */
	public void deleteComment(Integer num) {
		commentRepository.deleteById(num);
	}
	
	/**
	 * 댓글 수정
	 * @param dto 수정할 댓글 내용
	 */
	public void updateComment(CommentDTO dto) {
		CommentEntity entity = commentRepository.findById(dto.getNum())
				.orElseThrow(() -> new EntityNotFoundException("수정할 댓글이 없습니다."));
		
		entity.setComment(dto.getComment());
	}
	
	
	
	
	
//	public void entityToDTO() {}
//	public void dtoToEntity() {}
	
}
