package hyundai;

import ex02_package.hankook.SnowTire;
import ex02_package.kumho.AllSeasonTire;

public class Car {
	// 타이어가 필요하다
	
	// 클래스의 전체 경로를 다 작성해줬기 때문에 import를 써주지 않아도 된다.
	ex02_package.hankook.Tire tire1 = new ex02_package.hankook.Tire();
	ex02_package.kumho.Tire tire2 = new ex02_package.kumho.Tire();
	
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4= new AllSeasonTire();
}
