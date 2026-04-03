package ex01_exception.service;

public class Convertor2 {
	public int toInt(String price) throws NumberFormatException{
		return Integer.parseInt(price);
	}
}
