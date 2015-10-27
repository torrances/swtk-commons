package org.swtk.commons.dict.wordnet.index.name.instance.s.h.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shoe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02894181\", \"03544613\", \"04207043\", \"04206070\"]}");
	add("{\"term\":\"shoebill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02008053\"]}");
	add("{\"term\":\"shoebird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02008053\"]}");
	add("{\"term\":\"shoeblack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09886223\"]}");
	add("{\"term\":\"shoebox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04207301\", \"04207433\"]}");
	add("{\"term\":\"shoeful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13791689\"]}");
	add("{\"term\":\"shoehorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04207580\"]}");
	add("{\"term\":\"shoelace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04207680\"]}");
	add("{\"term\":\"shoemaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09952556\"]}");
	add("{\"term\":\"shoemaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00619105\"]}");
	add("{\"term\":\"shoes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13949819\"]}");
	add("{\"term\":\"shoeshine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00580119\", \"04708615\"]}");
	add("{\"term\":\"shoestring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13784318\", \"04207680\"]}");
	add("{\"term\":\"shoetree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04207951\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }