package org.swtk.commons.dict.wordnet.indexbyname.instance.m.a.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"maha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09683333\"]}");
	add("{\"term\":\"mahabharata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06443166\"]}");
	add("{\"term\":\"mahabharatam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06443166\"]}");
	add("{\"term\":\"mahabharatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06443166\"]}");
	add("{\"term\":\"mahagua\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12199011\", \"12200685\"]}");
	add("{\"term\":\"mahan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11169473\"]}");
	add("{\"term\":\"maharaja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301334\"]}");
	add("{\"term\":\"maharajah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301334\"]}");
	add("{\"term\":\"maharanee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301467\"]}");
	add("{\"term\":\"maharani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301467\"]}");
	add("{\"term\":\"maharashtra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08925719\"]}");
	add("{\"term\":\"mahatma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301593\"]}");
	add("{\"term\":\"mahayana\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06250995\", \"08116230\"]}");
	add("{\"term\":\"mahayanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06198976\"]}");
	add("{\"term\":\"mahayanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09703460\"]}");
	add("{\"term\":\"mahdi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301711\"]}");
	add("{\"term\":\"mahdism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06245983\"]}");
	add("{\"term\":\"mahdist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301959\"]}");
	add("{\"term\":\"mahgrib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08614879\"]}");
	add("{\"term\":\"mahican\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06923734\", \"09681578\"]}");
	add("{\"term\":\"mahimahi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02584588\", \"07794914\"]}");
	add("{\"term\":\"mahjong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00506137\"]}");
	add("{\"term\":\"mahler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11169620\"]}");
	add("{\"term\":\"mahlstick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03737373\"]}");
	add("{\"term\":\"mahoe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12199011\", \"12200685\"]}");
	add("{\"term\":\"mahogany\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04980653\", \"12715905\", \"12716333\"]}");
	add("{\"term\":\"mahomet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11204082\"]}");
	add("{\"term\":\"mahonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11719752\"]}");
	add("{\"term\":\"mahound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11204082\"]}");
	add("{\"term\":\"mahout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10302071\"]}");
	add("{\"term\":\"mahratta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09695841\"]}");
	add("{\"term\":\"mahratti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06983955\"]}");
	add("{\"term\":\"mahuang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11619337\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }