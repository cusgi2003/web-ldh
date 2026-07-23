package com.korea.petclinic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.petclinic.vo.ReservationVO;

@Mapper
public interface ReservationDAO {
	List<ReservationVO> findAll();

	List<ReservationVO> findById(Long id);

	int insert(ReservationVO vo);

	int update(ReservationVO vo);

	List<ReservationVO> delete(Long id);

	List<ReservationVO> searchDetail(String searchType, String keyword);

	List<ReservationVO> findByOrder(String sort);
}
