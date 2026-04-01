package ex01_abstact;

public class TransportMain {
	public static void main(String[] args) {
        Transport[] transports = new Transport[2];
        
        transports[0] = new Bus("버스", 1200);
        transports[1] = new Taxi("택시", 3000, 10, 100);

        System.out.println("=== 교통 수단 요금 정보 ===");
        for (Transport t : transports) {
            t.printFare();
            System.out.println("-------------------------");
        }
    }
}
