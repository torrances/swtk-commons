package org.swtk.commons.dict.wordnet.indexbyname.instance.c.y.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cyamopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12540728\"]}");
	add("{\"term\":\"cyamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01996368\"]}");
	add("{\"term\":\"cyan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04975796\"]}");
	add("{\"term\":\"cyanamid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14850652\"]}");
	add("{\"term\":\"cyanamide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14813390\", \"14850652\"]}");
	add("{\"term\":\"cyanide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14850937\", \"14851516\"]}");
	add("{\"term\":\"cyanite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14703745\"]}");
	add("{\"term\":\"cyanobacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01361213\"]}");
	add("{\"term\":\"cyanocitta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01583285\"]}");
	add("{\"term\":\"cyanocobalamin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15115871\"]}");
	add("{\"term\":\"cyanogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14851187\"]}");
	add("{\"term\":\"cyanohydrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14851675\"]}");
	add("{\"term\":\"cyanophyceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01360900\"]}");
	add("{\"term\":\"cyanophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01360348\"]}");
	add("{\"term\":\"cyanosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14326529\"]}");
	add("{\"term\":\"cyanuramide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14973885\"]}");
	add("{\"term\":\"cyathea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13208065\"]}");
	add("{\"term\":\"cyatheaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13207929\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }