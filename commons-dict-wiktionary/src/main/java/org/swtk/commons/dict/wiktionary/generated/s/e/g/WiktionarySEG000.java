package org.swtk.commons.dict.wiktionary.generated.s.e.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySEG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("segment", "{\"term\":\"segment\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"{{PIE root|en|sek}}From Latin \u0027segmentum\u0027 (a piece cut off, a strip, segment of the earth, a strip of tinsel) from \u0027secare\u0027 (to cut)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A length of some object\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One of the parts into which any body naturally separates or is divided; a part divided or cut off; a section; a portion\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.americanscientist.org/issues/pub/2013/5/the-evolution-of-eyeglasses The Evolution of passage\u003dThe ability of a \u0027\u0027segment\u0027\u0027 of a glass sphere to magnify whatever is placed before it was known around the year 1000, when the spherical \u0027\u0027segment\u0027\u0027 was called a reading stone,. Scribes, illuminators, and scholars held such stones directly over manuscript pages as an aid in seeing what was being written, drawn, or read\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A portion\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A straight path between two points that is the shortest distance between them\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The part of a circle between its circumference and a chord (usually other than the diameter\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Any of the pieces that comprise an order tree\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A portion\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A discrete unit of speech: a consonant or a vowel\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A portion of an organ whose cells are derived from a single cell within the primordium from which the organ developed\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"In Lejeuneaceae vegetative branches normally originate from the basiscopic basal portion of a lateral \u0027\u0027segment\u0027\u0027 half, as in the Radulaceae, and the associated leaves, therefore, are quite unmodified\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"One of several parts of an organism, with similar structure, arranged in a chain; such as a vertebra, or a third of an insect\u0027s thorax\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"A part of a broadcast program, devoted to a topic\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"An Ethernet bus\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"A region of memory or a fragment of an executable file designated to contain a particular part of a program\", \"priority\":15},{\"upperType\":\"NOUN\", \"text\":\"A portion of an itinerary; can be a flight or train between two cities, a car or hotel booked in a particular city\", \"priority\":16}]}, \"synonyms\":{}}");

	add("segmenter", "{\"term\":\"segmenter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|segment|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A software program or algorithm that divides text into segments, used in corpus linguistics\", \"priority\":1}]}, \"synonyms\":{}}");

	add("segregationalist", "{\"term\":\"segregationalist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|segregational|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A segregationist; a supporter of racial, ethnic, or religious segregation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who believes that linguistic signs have meaning independent of the context of their use in communication\", \"priority\":2}]}, \"synonyms\":{}}");

	add("segregationism", "{\"term\":\"segregationism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|segregation|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A belief in (usually racial) segregation\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }