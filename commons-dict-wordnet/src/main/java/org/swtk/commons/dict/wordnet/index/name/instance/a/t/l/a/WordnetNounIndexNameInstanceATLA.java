package org.swtk.commons.dict.wordnet.index.name.instance.a.t.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"atlanta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01272126\", \"09099186\"]}");
	add("{\"term\":\"atlantic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09232170\"]}");
	add("{\"term\":\"atlantides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09572345\"]}");
	add("{\"term\":\"atlantis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05634712\"]}");
	add("{\"term\":\"atlas\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02755815\", \"05596396\", \"06438756\", \"09598726\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }