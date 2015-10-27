package org.swtk.commons.dict.wordnet.index.name.instance.w.a.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWARD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ward\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02995487\", \"11393892\", \"11394080\", \"11394276\", \"04557205\", \"08690135\", \"10786688\"]}");
	add("{\"term\":\"warden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10786822\"]}");
	add("{\"term\":\"wardenship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00606927\"]}");
	add("{\"term\":\"warder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10786933\"]}");
	add("{\"term\":\"wardership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00607024\"]}");
	add("{\"term\":\"wardress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10787100\"]}");
	add("{\"term\":\"wardrobe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04557832\", \"04557712\", \"04557470\"]}");
	add("{\"term\":\"wardroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04557962\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }