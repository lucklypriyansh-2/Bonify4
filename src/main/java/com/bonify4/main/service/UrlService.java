package com.bonify4.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UrlService {

	/**
	 * 
	 * <li>1 Breaks first input url string in string array seperated by /</li>
	 *<li> 2 maintains list of all of the tokens of first url in array named firsturltokensplitted </li>
	 * <li>3 break each remaining  url(delimiter "/") in string token array  and then read  the  token present at every index number which is present in indexofstatictoken named list  </li>
	 * <li>5 if found that this token at index i is not same as  token in first list of token remove index number  from   indexofstatictoken  list</li>
	 * Time complexity worst case O(n2) best Case O(N) average case  O(n*(n-k) where k is number of varible part in token as soon as k increase complexity decrease
	 * Space complexity O(N)
	 * 
	 * @param url
	 * @return String
	 */
	public String identifyDynamicParts(List<String> url) {

		String[] firsturltokensplitted = url.get(0).split("/");

		Set<Integer> indexofstatictoken = new HashSet();
		
		//O(n)
		for (int i = 0; i < firsturltokensplitted.length; i++) {
			indexofstatictoken.add(new Integer(i));
		}

		int urlnumber = 1;

		while (indexofstatictoken.size() > 0 && urlnumber < url.size()) {

			String[] urlsplitted = url.get(urlnumber).split("/");

			Iterator<Integer> indexiterator = indexofstatictoken.iterator();

			while (indexiterator.hasNext()) {
				Integer index = indexiterator.next();

				if (!urlsplitted[index].equals(firsturltokensplitted[index])) {
					indexiterator.remove();
				}

			}
			
			urlnumber++;

		}

		String responseString = "";
		for (int i = 0; i < firsturltokensplitted.length; i++) {
			if (indexofstatictoken.contains(i)) {
				responseString += "/" + firsturltokensplitted[i];
			}

			else {
				responseString += "/*Variable*";
			}
		}
		return responseString;

	}

	private List<List<String>> splitUrls(List<String> urls) {

		List<List<String>> splittedUrl = new ArrayList<List<String>>();

		for (String url : urls) {

			if (url.startsWith("/")) {

				url = url.substring(1);
				splittedUrl.add(Arrays.asList(url.split("/")));
			}

		}

		return splittedUrl;
	}

}
