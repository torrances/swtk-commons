package org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"avadavat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01546577\"]}");
	add("{\"term\":\"avahi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02503103\"]}");
	add("{\"term\":\"avail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05157079\"]}");
	add("{\"term\":\"availability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04726275\"]}");
	add("{\"term\":\"availableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04726275\"]}");
	add("{\"term\":\"avalanche\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07299741\", \"07419737\"]}");
	add("{\"term\":\"avalokiteshvara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555802\"]}");
	add("{\"term\":\"avalokitesvara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555802\"]}");
	add("{\"term\":\"avaram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12520262\"]}");
	add("{\"term\":\"avarice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04952935\", \"00759878\"]}");
	add("{\"term\":\"avariciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04952935\"]}");
	add("{\"term\":\"avaritia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00759878\"]}");
	add("{\"term\":\"avatar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09553360\", \"10438047\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }