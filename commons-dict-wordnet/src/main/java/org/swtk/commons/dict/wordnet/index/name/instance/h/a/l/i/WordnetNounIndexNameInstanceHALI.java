package org.swtk.commons.dict.wordnet.index.name.instance.h.a.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHALI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"haliaeetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01617410\"]}");
	add("{\"term\":\"halibut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02662838\", \"07807784\"]}");
	add("{\"term\":\"halicarnassus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09064057\"]}");
	add("{\"term\":\"halicoeres\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02611338\"]}");
	add("{\"term\":\"halictidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02213380\"]}");
	add("{\"term\":\"halide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14928510\"]}");
	add("{\"term\":\"halifax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08845994\"]}");
	add("{\"term\":\"halimodendron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12554093\"]}");
	add("{\"term\":\"haliotidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01945242\"]}");
	add("{\"term\":\"haliotis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01945365\"]}");
	add("{\"term\":\"halite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14696385\"]}");
	add("{\"term\":\"halitosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14866189\"]}");
	add("{\"term\":\"halitus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14866261\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }