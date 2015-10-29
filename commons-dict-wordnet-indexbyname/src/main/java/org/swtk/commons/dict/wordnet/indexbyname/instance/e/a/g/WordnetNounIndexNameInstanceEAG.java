package org.swtk.commons.dict.wordnet.indexbyname.instance.e.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07418520\"]}");
	add("{\"term\":\"eager beaver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10060753\"]}");
	add("{\"term\":\"eagerness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04652076\", \"07570749\"]}");
	add("{\"term\":\"eagle\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06894613\", \"13413645\", \"13617211\", \"01615935\"]}");
	add("{\"term\":\"eagle ray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01501630\"]}");
	add("{\"term\":\"eagle scout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10060901\"]}");
	add("{\"term\":\"eaglet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01616448\"]}");
	add("{\"term\":\"eagre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07418520\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }