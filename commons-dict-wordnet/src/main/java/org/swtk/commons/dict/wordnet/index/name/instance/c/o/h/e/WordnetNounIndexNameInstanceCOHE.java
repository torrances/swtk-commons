package org.swtk.commons.dict.wordnet.index.name.instance.c.o.h.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOHE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coherence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04828508\", \"14443868\"]}");
	add("{\"term\":\"coherency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04828508\", \"14443868\"]}");
	add("{\"term\":\"cohesion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11456699\", \"13470887\", \"14443868\"]}");
	add("{\"term\":\"cohesiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04943081\", \"14443868\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }