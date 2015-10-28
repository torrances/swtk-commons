package org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRIF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rifadin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04097176\"]}");
	add("{\"term\":\"rifampin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04097176\"]}");
	add("{\"term\":\"riff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07059846\", \"10550050\"]}");
	add("{\"term\":\"riffian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10550050\"]}");
	add("{\"term\":\"riffle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00341664\", \"07359263\"]}");
	add("{\"term\":\"riffraff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08418776\"]}");
	add("{\"term\":\"rifle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04097375\"]}");
	add("{\"term\":\"riflebird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01574051\"]}");
	add("{\"term\":\"rifleman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10550146\", \"10550252\"]}");
	add("{\"term\":\"rifling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00927840\"]}");
	add("{\"term\":\"rift\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07328414\", \"09432904\", \"09432979\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }