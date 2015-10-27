package org.swtk.commons.dict.wordnet.index.name.instance.s.h.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sham\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10221154\", \"03323383\"]}");
	add("{\"term\":\"shaman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10645556\"]}");
	add("{\"term\":\"shamanism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06254982\", \"06255214\"]}");
	add("{\"term\":\"shamash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09544898\"]}");
	add("{\"term\":\"shamble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00293556\"]}");
	add("{\"term\":\"shambles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02669573\", \"14521263\"]}");
	add("{\"term\":\"shambling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00293556\"]}");
	add("{\"term\":\"shame\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07319716\", \"14463603\", \"07521808\"]}");
	add("{\"term\":\"shamefacedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07522799\"]}");
	add("{\"term\":\"shamefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04815533\"]}");
	add("{\"term\":\"shamelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04866867\"]}");
	add("{\"term\":\"shamisen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04139686\"]}");
	add("{\"term\":\"shammer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10221154\", \"10306236\"]}");
	add("{\"term\":\"shammy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14785985\"]}");
	add("{\"term\":\"shampoo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00257982\", \"04190559\"]}");
	add("{\"term\":\"shamrock\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11773406\", \"12723950\", \"11774169\"]}");
	add("{\"term\":\"shamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10496256\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }