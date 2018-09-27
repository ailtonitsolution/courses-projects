/*
 * Section 8, Class 87 - Enum
 */
package application;

import java.util.Date;

import entities.Class87Order;
import entities.enums.Class87OrderStatus;

public class Class87Enum {

	public static void main(String[] args) {

		Class87Order order = new Class87Order(1080, new Date(), Class87OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		Class87OrderStatus os1 = Class87OrderStatus.DELIVERED;
		
		Class87OrderStatus os2 = Class87OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}