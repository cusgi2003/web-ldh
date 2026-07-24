package com.korea.petclinic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.petclinic.service.ReservationService;
import com.korea.petclinic.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {

	private final ReservationService reservationService;
	
	@GetMapping
	public List<ReservationVO> findAll(){
		return reservationService.findAll();
	}
	
	@GetMapping("{id}")
	public List<ReservationVO> findById(@PathVariable Long id) {
		return reservationService.findById(id);
	}
	
	@PostMapping
	public int insert(@RequestBody ReservationVO vo) {
		return reservationService.insert(vo);
	}
	
	@PutMapping("{id}")
	public int update(@RequestBody ReservationVO vo) {
		return reservationService.update(vo);
	}
	
	@DeleteMapping("{id}")
	public List<ReservationVO> delete(@PathVariable Long id){
		return reservationService.delete(id);
	}
	
	@GetMapping("search-detail")
	public List<ReservationVO> searchDetail(
			@RequestParam("searchType") String searchType,
			@RequestParam("keyword") String keyword){
		return reservationService.searchDetail(searchType, keyword);
	}
	
	@GetMapping("sort")
	public List<ReservationVO> findByOrder(@RequestParam("sort") String sort){
		return reservationService.findByOrder(sort);
	}
	
	// 전체 예상 진료비
	@GetMapping("total-price")
	public Integer getTotalPrice() {
		return reservationService.getTotalPrice();
	}
	
	// 예약 상태별 개수 출력
	@GetMapping("status-count")
	public Integer getStatusCount() {
		return reservationService.getStatusCount();
	}
}
