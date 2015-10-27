package org.swtk.commons.dict.wordnet.index.name.instance.s.o.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSORE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14206547\"]}");
	add("{\"term\":\"sorehead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10645992\"]}");
	add("{\"term\":\"soreness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07511113\", \"14356022\"]}");
	add("{\"term\":\"sorensen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11328734\"]}");
	add("{\"term\":\"sorex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01894506\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }