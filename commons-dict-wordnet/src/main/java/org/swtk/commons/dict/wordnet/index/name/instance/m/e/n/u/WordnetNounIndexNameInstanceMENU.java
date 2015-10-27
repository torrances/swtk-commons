package org.swtk.commons.dict.wordnet.index.name.instance.m.e.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMENU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"menu\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05919718\", \"06505383\", \"07580648\", \"06504930\"]}");
	add("{\"term\":\"menuhin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11195030\"]}");
	add("{\"term\":\"menura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01548066\"]}");
	add("{\"term\":\"menurae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01547790\"]}");
	add("{\"term\":\"menuridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01547944\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }