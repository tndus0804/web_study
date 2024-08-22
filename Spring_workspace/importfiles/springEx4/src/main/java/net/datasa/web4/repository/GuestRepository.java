package net.datasa.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.datasa.web4.entity.GuestBookEntity;

public interface GuestRepository extends JpaRepository<GuestBookEntity, Integer>{

}
