package org.swtk.commons.dict.wordnet.index.name.instance.v.e.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVESI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vesica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05519790\"]}");
	add("{\"term\":\"vesicant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15136806\"]}");
	add("{\"term\":\"vesicaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11920064\"]}");
	add("{\"term\":\"vesication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13594384\"]}");
	add("{\"term\":\"vesicatory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15136806\"]}");
	add("{\"term\":\"vesicle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05525229\"]}");
	add("{\"term\":\"vesicopapule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14357416\"]}");
	add("{\"term\":\"vesiculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13594384\"]}");
	add("{\"term\":\"vesiculitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382265\"]}");
	add("{\"term\":\"vesiculovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01336124\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }