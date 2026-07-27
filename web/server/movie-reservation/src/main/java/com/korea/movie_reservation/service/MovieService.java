package com.korea.movie_reservation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.movie_reservation.dao.MovieDAO;
import com.korea.movie_reservation.vo.MovieVO;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
	
	private final MovieDAO movieDAO;
	
	public int insertMovie(MovieVO vo) {
		return movieDAO.insertMovie(vo);
	}
	
	public List<MovieVO> findMovieById(int movieId) {
		return movieDAO.findMovieById(movieId);
	}
}
