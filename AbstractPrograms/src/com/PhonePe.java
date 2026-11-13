package com;

abstract class PhonePe {
	
	abstract void payAmount(int amount);
}

abstract class Amazon extends PhonePe{
	
	abstract void buyProduct(String product);
}
