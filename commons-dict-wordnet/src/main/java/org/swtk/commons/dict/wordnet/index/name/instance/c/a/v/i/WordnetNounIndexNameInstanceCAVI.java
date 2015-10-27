package org.swtk.commons.dict.wordnet.index.name.instance.c.a.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cavia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02367029\"]}");
	add("{\"term\":\"caviar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07815555\"]}");
	add("{\"term\":\"caviare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07815555\"]}");
	add("{\"term\":\"caviidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02366873\"]}");
	add("{\"term\":\"cavil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06774509\"]}");
	add("{\"term\":\"caviler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10520788\"]}");
	add("{\"term\":\"caviller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10520788\"]}");
	add("{\"term\":\"cavity\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05310901\", \"13465686\", \"13934532\", \"09416001\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }