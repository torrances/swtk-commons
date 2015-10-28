package org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRIV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rival\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10552570\"]}");
	add("{\"term\":\"rivalry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01171059\"]}");
	add("{\"term\":\"river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09434308\"]}");
	add("{\"term\":\"rivera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11283677\"]}");
	add("{\"term\":\"riverbank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09438462\"]}");
	add("{\"term\":\"riverbed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09438549\"]}");
	add("{\"term\":\"riverside\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09087338\", \"09438462\"]}");
	add("{\"term\":\"rivet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04102436\", \"04350424\"]}");
	add("{\"term\":\"riveter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04102671\", \"10553098\"]}");
	add("{\"term\":\"rivetter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04102671\", \"10553098\"]}");
	add("{\"term\":\"riviera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08958974\"]}");
	add("{\"term\":\"rivina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11876858\"]}");
	add("{\"term\":\"rivulet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09438816\"]}");
	add("{\"term\":\"rivulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01450299\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }