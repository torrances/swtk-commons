package org.swtk.commons.dict.wordnet.index.name.instance.t.w.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTWEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03361927\", \"04509797\"]}");
	add("{\"term\":\"tweediness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04824251\", \"04955899\"]}");
	add("{\"term\":\"tweet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07413627\"]}");
	add("{\"term\":\"tweeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04509965\"]}");
	add("{\"term\":\"tweezer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03947960\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }