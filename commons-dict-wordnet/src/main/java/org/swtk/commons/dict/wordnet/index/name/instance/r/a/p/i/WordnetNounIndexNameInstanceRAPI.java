package org.swtk.commons.dict.wordnet.index.name.instance.r.a.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rapid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09428274\"]}");
	add("{\"term\":\"rapidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066283\"]}");
	add("{\"term\":\"rapidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066283\"]}");
	add("{\"term\":\"rapier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04061473\"]}");
	add("{\"term\":\"rapine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00968488\"]}");
	add("{\"term\":\"rapist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10526823\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }