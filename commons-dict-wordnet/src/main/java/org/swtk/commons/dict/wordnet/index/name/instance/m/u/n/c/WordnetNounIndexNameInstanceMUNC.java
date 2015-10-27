package org.swtk.commons.dict.wordnet.index.name.instance.m.u.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUNC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"munch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00843054\", \"11216198\"]}");
	add("{\"term\":\"munchausen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11216295\"]}");
	add("{\"term\":\"munchener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07903279\"]}");
	add("{\"term\":\"muncher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358104\"]}");
	add("{\"term\":\"munchhausen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11216295\"]}");
	add("{\"term\":\"muncie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09108512\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }