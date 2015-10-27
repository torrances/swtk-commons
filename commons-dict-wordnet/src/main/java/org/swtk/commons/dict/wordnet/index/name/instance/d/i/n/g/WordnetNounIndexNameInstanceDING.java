package org.swtk.commons.dict.wordnet.index.name.instance.d.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04700732\", \"07397857\"]}");
	add("{\"term\":\"dingbat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10033144\"]}");
	add("{\"term\":\"dinge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14522151\"]}");
	add("{\"term\":\"dinghy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03204585\"]}");
	add("{\"term\":\"dinginess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14522151\"]}");
	add("{\"term\":\"dingle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09287505\"]}");
	add("{\"term\":\"dingo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02118293\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }