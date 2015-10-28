package org.swtk.commons.dict.wordnet.indexbyname.instance.e.b.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEBU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ebullience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04641897\"]}");
	add("{\"term\":\"ebullition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07027434\"]}");
	add("{\"term\":\"eburnation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13491890\"]}");
	add("{\"term\":\"eburophyton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12080881\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }