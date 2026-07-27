package com.korea.movie_reservation.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.movie_reservation.service.MovieService;
import com.korea.movie_reservation.vo.MovieVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {

	private final MovieService movieService;

	// 1. 영화 등록
	@PostMapping
	public ResponseEntity<?> insertMovie(@RequestBody MovieVO vo) {
		int result = movieService.insertMovie(vo);

		try {
			if (result == 1) {
				return ResponseEntity.ok().body("영화 등록 성공");
			} else {
				return ResponseEntity.ok().body("영화 등록 실패");
			}
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	// 2. 영화 단건 조회
	@GetMapping("/{movieId}")
	public ResponseEntity<?> findMovieById(@PathVariable int movieId) {
		try {
			List<MovieVO> result = movieService.findMovieById(movieId);
			return ResponseEntity.ok().body(result);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
