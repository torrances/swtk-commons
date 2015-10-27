package org.swtk.commons.dict.wordnet.index.name.instance.s.a.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"saman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11780322\"]}");
	add("{\"term\":\"samanala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09210491\"]}");
	add("{\"term\":\"samara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12056695\"]}");
	add("{\"term\":\"samarang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08930003\"]}");
	add("{\"term\":\"samarcand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09045037\"]}");
	add("{\"term\":\"samaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08817314\"]}");
	add("{\"term\":\"samaritan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10569205\"]}");
	add("{\"term\":\"samarium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14677775\"]}");
	add("{\"term\":\"samarkand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09045037\"]}");
	add("{\"term\":\"samarskite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15037235\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }