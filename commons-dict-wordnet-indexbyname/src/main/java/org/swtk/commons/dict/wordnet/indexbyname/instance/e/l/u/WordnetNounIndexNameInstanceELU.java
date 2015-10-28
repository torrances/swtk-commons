package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eluate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14872319\"]}");
	add("{\"term\":\"elucidation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07185857\", \"07247315\"]}");
	add("{\"term\":\"eluding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00060196\"]}");
	add("{\"term\":\"elul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15241556\"]}");
	add("{\"term\":\"elusion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00060196\"]}");
	add("{\"term\":\"elusiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04831349\"]}");
	add("{\"term\":\"elution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13495039\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }