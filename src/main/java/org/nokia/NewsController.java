package org.nokia;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {


	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String getNews() {		
//		for (int i = 0 ; i<2 ;i++ ) {
//			System.out.println("News Publication calling => " + i);
//		}
		return "Welcome to News Module";
	}
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<News>> getAllNews(){
		ArrayList<News>  newsList = new ArrayList<News>();

		News n1 = new News(1, "Simaria Pul new construction", "general", "One rail and Road bridge is going to be constructed newr Mokama on the river of Ganga");
		News n2 = new News(2, "NItish Kumar on Rajgir Wild Safari", "social", "Newly developed wild life safari in Rajgir is now open for public visit. Many animals like Lion, Black Buck, Cheetah are visible by very close distance");
		News n3 = new News(3, "Russia attacks on Ukrain", "political", "Pussian president Putin has ordered a full scale invasion to neighbour country Ukrain. EU has condemned the move by Kremlin.");
		News n4 = new News(4, "News Heading Political", "political", "News Brief 4 for better reading");
		News n5 = new News(5, "News Heading Sport", "sports", "News Brief 5 for Sports news");
		News n6 = new News(6, "News Heading Entertainment", "entertainment", "News Brief 6 Movie information will be covered here");
		News n7 = new News(7, "News Heading General", "general", "General Event cover in Patna");
		News n8 = new News(8, "News about Village", "village", "Many local news about village day to day life");
		News n9 = new News(9, "International News", "international", "News update for Russia and Ucrain conflict");
		
		newsList.add(n1);		
		newsList.add(n2);		
		newsList.add(n3);
		newsList.add(n4);
		newsList.add(n5);
		newsList.add(n6);
		newsList.add(n7);
		newsList.add(n8);
		newsList.add(n9);
		
		
        return new ResponseEntity<List<News>>(newsList , HttpStatus.OK);
	}

	
	@RequestMapping(value="/site" , method= RequestMethod.GET)
	public String getPublicationName() {
        String siteName = "" ;

		ArrayList publicationList = new ArrayList<String>();
		publicationList.add("www.patnaInfo.com");
		publicationList.add("www.hindustanTimes.com");
		publicationList.add("www.khojo.online");
		publicationList.add("www.newsdekho.in");
		publicationList.add("www.kauwa.online");
		publicationList.add("www.work1.com");
		
		
		Random rand = new Random();
		int upperlimit = 5;
		int randNum = rand.nextInt(upperlimit);		
		siteName = (String) publicationList.get(randNum);
        
		return siteName;
	}

	@GetMapping("/site/{t}")
	public String newsType(@PathVariable("t") String type) {
		System.out.println("News Type in Request ==> " + type);
		return "News Type "+ type;
	}

	@GetMapping("/host/{t}")
	public String hostType(@PathVariable("t") String type) {
		System.out.println("Host Type in Request ==> " + type);
		return "Host Type "+ type;
	}


}
