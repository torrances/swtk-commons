package org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08039725\"]}");
	add("{\"term\":\"huainaputina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09198514\"]}");
	add("{\"term\":\"hualapai\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06936060\", \"09691513\"]}");
	add("{\"term\":\"hualpai\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06936060\", \"09691513\"]}");
	add("{\"term\":\"huamachil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11784947\"]}");
	add("{\"term\":\"huambo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08726314\"]}");
	add("{\"term\":\"huang hai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09505088\"]}");
	add("{\"term\":\"huang he\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09329163\"]}");
	add("{\"term\":\"huarache\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03552710\"]}");
	add("{\"term\":\"huaraches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03552710\"]}");
	add("{\"term\":\"huascaran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09329403\"]}");
	add("{\"term\":\"huayna capac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10209992\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }