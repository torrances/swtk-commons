package org.swtk.commons.dict.wordnet.indexbyname.instance.c.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cetacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02064862\"]}");
	add("{\"term\":\"cetacean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02065083\"]}");
	add("{\"term\":\"cetchup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07838173\"]}");
	add("{\"term\":\"ceterach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13204149\"]}");
	add("{\"term\":\"cetonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02178092\"]}");
	add("{\"term\":\"cetoniidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02177915\"]}");
	add("{\"term\":\"cetorhinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01487947\"]}");
	add("{\"term\":\"cetorhinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01487714\"]}");
	add("{\"term\":\"cetraria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13012782\"]}");
	add("{\"term\":\"cetrimide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14829720\"]}");
	add("{\"term\":\"cetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09263413\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }