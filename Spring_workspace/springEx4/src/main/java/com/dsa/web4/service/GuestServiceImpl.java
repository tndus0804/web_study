package com.dsa.web4.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dsa.web4.dto.GuestBookDTO;
import com.dsa.web4.entity.GuestBookEntity;
import com.dsa.web4.repository.GuestBookRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class GuestServiceImpl implements GuestService {
	
	private final GuestBookRepository repository;

	@Override
	public void insertMessage(GuestBookDTO guestBook) {
		
		GuestBookEntity entity = GuestBookEntity.builder()
									.name(guestBook.getName())
									.password(guestBook.getPassword())
									.message(guestBook.getMessage())
									.build();
		
		repository.save(entity);
		log.debug("[service-save] guestBookEnetity: ");

	}

	@Override
	public List<GuestBookDTO> selectList() {
		List<GuestBookEntity> entities = repository.findAll(Sort.by(Sort.Direction.DESC, "num"));
		List<GuestBookDTO> list = new ArrayList<>(); 
		for(GuestBookEntity entity : entities) {
			list.add(new GuestBookDTO(entity.getNum(), entity.getName(), entity.getPassword(), entity.getMessage(), entity.getInputdate()));
		}
		return list;
	}

	@Override
	public void delete(int num) {
		repository.deleteById(num);
	}

	@Override
	public GuestBookDTO selectBook(int num) {
		GuestBookEntity entity = repository.findById(num).orElse(null);
		if(entity == null) return null;
		
		
		return new GuestBookDTO(entity.getNum(), entity.getName(), entity.getPassword(), entity.getMessage(), entity.getInputdate());
	}
	
	
	
	
}
