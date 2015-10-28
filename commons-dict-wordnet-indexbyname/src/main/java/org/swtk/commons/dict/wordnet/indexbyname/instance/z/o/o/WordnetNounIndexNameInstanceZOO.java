package org.swtk.commons.dict.wordnet.indexbyname.instance.z.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03750637\"]}");
	add("{\"term\":\"zooerastia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00859689\"]}");
	add("{\"term\":\"zooerasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00859689\"]}");
	add("{\"term\":\"zooflagellate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01421261\"]}");
	add("{\"term\":\"zooid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01418854\"]}");
	add("{\"term\":\"zoolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048365\"]}");
	add("{\"term\":\"zoologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10825826\"]}");
	add("{\"term\":\"zoology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06092831\", \"08009721\"]}");
	add("{\"term\":\"zoom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00327117\", \"07390125\"]}");
	add("{\"term\":\"zoomastigina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01420878\"]}");
	add("{\"term\":\"zoomastigote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01421261\"]}");
	add("{\"term\":\"zoomorphism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05743090\"]}");
	add("{\"term\":\"zoonosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14300151\"]}");
	add("{\"term\":\"zoophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00739896\"]}");
	add("{\"term\":\"zoophilism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00739896\"]}");
	add("{\"term\":\"zoophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14408201\"]}");
	add("{\"term\":\"zoophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01908819\"]}");
	add("{\"term\":\"zooplankton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01386805\"]}");
	add("{\"term\":\"zoopsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14401991\"]}");
	add("{\"term\":\"zoospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570346\"]}");
	add("{\"term\":\"zootoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15059308\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }