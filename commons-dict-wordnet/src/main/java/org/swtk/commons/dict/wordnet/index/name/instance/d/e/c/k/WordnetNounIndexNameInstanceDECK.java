package org.swtk.commons.dict.wordnet.index.name.instance.d.e.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDECK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deck\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03172773\", \"07973335\", \"03172644\", \"03172332\"]}");
	add("{\"term\":\"decker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03173030\", \"10947891\"]}");
	add("{\"term\":\"deckhand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10018308\"]}");
	add("{\"term\":\"deckle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03173329\", \"03173440\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }