package org.swtk.commons.dict.wordnet.index.name.instance.b.e.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"best\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10869645\", \"09870573\", \"00128351\"]}");
	add("{\"term\":\"bestiality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00859689\", \"04837809\"]}");
	add("{\"term\":\"bestiary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06424253\"]}");
	add("{\"term\":\"bestowal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13292960\", \"01088280\"]}");
	add("{\"term\":\"bestower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10045455\"]}");
	add("{\"term\":\"bestowment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01088280\", \"13292960\"]}");
	add("{\"term\":\"bestseller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06424140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }