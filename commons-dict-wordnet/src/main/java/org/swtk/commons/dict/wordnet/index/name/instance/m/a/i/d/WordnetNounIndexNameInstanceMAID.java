package org.swtk.commons.dict.wordnet.index.name.instance.m.a.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"maid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10302179\", \"10302369\"]}");
	add("{\"term\":\"maiden\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15283756\", \"10302179\"]}");
	add("{\"term\":\"maidenhair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13227715\"]}");
	add("{\"term\":\"maidenhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05529585\"]}");
	add("{\"term\":\"maidenhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15172290\"]}");
	add("{\"term\":\"maidenliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675280\"]}");
	add("{\"term\":\"maidhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15172290\"]}");
	add("{\"term\":\"maidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14224355\"]}");
	add("{\"term\":\"maidservant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10302369\"]}");
	add("{\"term\":\"maidu\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06937672\", \"09679571\"]}");
	add("{\"term\":\"maiduguri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08997188\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }