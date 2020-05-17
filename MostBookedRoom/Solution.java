package leetcode;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		String[] input = new String[] { "+1A", "+3E", "-1A", "+4F", "+1A", "-3E" };
		String result = mostBookedRoom(input);
		System.out.print(result);
	}
	
	public static String mostBookedRoom(String[] bookings) {
		
		Map<String, Integer> map = new HashMap<>();
		String maxRoom = null;
		int max = Integer.MIN_VALUE;
		
		for (String booking : bookings) {
			String room = booking.substring(1, booking.length());
			int count = map.getOrDefault(room, 0);
			count++;
			if (count > max) {
				max = count;
				maxRoom = room;
			}
			map.put(room, count);
		}
		
		return maxRoom;
	}
	
}
