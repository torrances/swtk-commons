package org.swtk.commons.dict.wordnet.index.name.instance.s.y.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSYMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"symbiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13864821\"]}");
	add("{\"term\":\"symbol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05773412\", \"06819327\"]}");
	add("{\"term\":\"symbolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047015\"]}");
	add("{\"term\":\"symbolisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00413284\", \"05773412\", \"06614677\"]}");
	add("{\"term\":\"symboliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10705336\"]}");
	add("{\"term\":\"symbolising\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00901768\"]}");
	add("{\"term\":\"symbolism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08487518\", \"00413284\", \"06820707\"]}");
	add("{\"term\":\"symbolist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10705336\", \"10705168\"]}");
	add("{\"term\":\"symbolization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00413284\", \"05773412\", \"06614677\"]}");
	add("{\"term\":\"symbolizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10705336\"]}");
	add("{\"term\":\"symbolizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00901768\"]}");
	add("{\"term\":\"symbology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06008071\"]}");
	add("{\"term\":\"symbololatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047015\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }