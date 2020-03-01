package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PrintArrayList {

	public static void main(String[] args) {

		List<String> footBallClublist = new ArrayList<>();
		footBallClublist.add("Bengaluru FC");
		footBallClublist.add("FC Goa");
		footBallClublist.add("Chelsea FC");
		footBallClublist.add("Manchester United FC");
		footBallClublist.add("Arsenal FC");

		// 1. USING FOR LOOP
		System.out.println("USING FOR LOOP");
		System.out.println("**********************");
		for (int i = 0; i < footBallClublist.size(); i++) {

			System.out.println(footBallClublist.get(i));
		}

		// 2. USING ENHANCED FOR LOOP
		System.out.println("USING ENHANCED FOR LOOP");
		System.out.println("************************");
		for (String s : footBallClublist) {

			System.out.println(s);
		}

		// 3. USING ITERATOR
		System.out.println("USING ITERATOR");
		System.out.println("************************");

		Iterator<String> itr = footBallClublist.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		// 4. USING FOR EACH METHOD
		System.out.println("USING FOR EACH METHOD");
		System.out.println("************************");
		footBallClublist.forEach(club -> {

			System.out.println(club);
		});

		// 5. USING FOR EACH REMAINING
		System.out.println("USING FOR EACH REMAINING");
		System.out.println("************************");
		Iterator<String> footballClubListItr = footBallClublist.iterator();
		footballClubListItr.forEachRemaining(club -> {
			System.out.println(club);
		});

		// 6. USING LIST ITERATOR - FORWARD TRAVERSE
		System.out.println("USING LIST ITERATOR - FORWARD TRAVERSE");
		System.out.println("****************************************");
		ListIterator<String> listIteratorFootballClubs = footBallClublist.listIterator(0);
		while (listIteratorFootballClubs.hasNext()) {

			System.out.println(listIteratorFootballClubs.next());
		}

		// 7. USING LIST ITERATOR - REVERSE TRAVERSE
		System.out.println("USING LIST ITERATOR - REVERSE TRAVERSE");
		System.out.println("***************************************");
		ListIterator<String> revFootballClubListItr = footBallClublist.listIterator(footBallClublist.size());
		while (revFootballClubListItr.hasPrevious()) {

			System.out.println(revFootballClubListItr.previous());
		}

	}

}
