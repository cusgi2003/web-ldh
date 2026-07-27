package com.korea.movie_reservation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.movie_reservation.vo.MovieVO;

@Mapper
public interface MovieDAO {

	int insertMovie(MovieVO vo);

	List<MovieVO> findMovieById(int movieId);

}
