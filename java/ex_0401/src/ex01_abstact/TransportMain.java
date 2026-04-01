package ex01_abstact;

public class TransportMain {
	public static void main(String[] args) {
        Transport[] transports = {
        		new Bus("버스", 1200),
        		new Taxi("택시", 3000, 10, 100),
        		new AirPlane("비행기", 100000, 50000, 200000)
        };


        System.out.println("=== 교통 수단 요금 정보 ===");
        for (Transport t : transports) {
            t.printFare();
            System.out.println("-------------------------");
        }
    }
}
