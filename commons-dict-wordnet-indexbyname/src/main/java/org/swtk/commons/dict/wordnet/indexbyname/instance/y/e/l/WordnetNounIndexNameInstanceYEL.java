package org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yell\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07135865\", \"07135232\"]}");
	add("{\"term\":\"yeller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10553540\"]}");
	add("{\"term\":\"yelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07138260\"]}");
	add("{\"term\":\"yellow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04972838\"]}");
	add("{\"term\":\"yellowbird\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01534966\", \"01571533\"]}");
	add("{\"term\":\"yellowcake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15131096\"]}");
	add("{\"term\":\"yellowfin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02630162\"]}");
	add("{\"term\":\"yellowhammer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01540841\", \"01842391\"]}");
	add("{\"term\":\"yellowknife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08845142\"]}");
	add("{\"term\":\"yellowlegs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02030829\"]}");
	add("{\"term\":\"yellowness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04972838\"]}");
	add("{\"term\":\"yellowstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09505261\"]}");
	add("{\"term\":\"yellowtail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02581559\", \"02590507\"]}");
	add("{\"term\":\"yellowthroat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01573317\"]}");
	add("{\"term\":\"yellowwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11671009\", \"11671584\"]}");
	add("{\"term\":\"yelp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07415152\"]}");
	add("{\"term\":\"yelping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07415152\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }