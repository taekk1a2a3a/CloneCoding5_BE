package com.sparta.cloneproject_be.repository;

import com.sparta.cloneproject_be.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Page<Room> findAll(Pageable pageable);
}
