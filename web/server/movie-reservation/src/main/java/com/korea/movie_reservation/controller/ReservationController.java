package com.korea.movie_reservation.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.movie_reservation.service.MovieService;
import com.korea.movie_reservation.service.ReservationService;
import com.korea.movie_reservation.vo.MovieVO;
import com.korea.movie_reservation.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

	private final MovieService movieService;
	private final ReservationService reservationService;

	// 3. 영화 예매 기능
	@PostMapping
	public ResponseEntity<?> insertReservation(@RequestBody ReservationVO vo) {
		int result = reservationService.insertReservation(vo);

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

	// 4. 예매 정보 수정
	@PutMapping("{reservationId}")
	public ResponseEntity<?> updateReservation(@PathVariable int reservationId, @RequestBody ReservationVO vo) {

		try {
			vo.setReservationId(reservationId);

			return ResponseEntity.ok().body(vo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	// 5. 전체 예매 정보를 조회
	@GetMapping("/details")
	public List<ReservationVO> findReservationDetail() {
		return reservationService.findReservationDetail();
	}
}
