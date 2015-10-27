package org.swtk.commons.dict.wordnet.index.name.instance.a.m.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09583190\"]}");
	add("{\"term\":\"amora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808202\"]}");
	add("{\"term\":\"amoralism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05967294\"]}");
	add("{\"term\":\"amoralist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808591\"]}");
	add("{\"term\":\"amorality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04862124\"]}");
	add("{\"term\":\"amorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808745\"]}");
	add("{\"term\":\"amorousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07504199\", \"07559601\"]}");
	add("{\"term\":\"amorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12524599\"]}");
	add("{\"term\":\"amorphophallus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803230\"]}");
	add("{\"term\":\"amortisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01123391\", \"01125259\"]}");
	add("{\"term\":\"amortization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01123391\", \"01125259\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }