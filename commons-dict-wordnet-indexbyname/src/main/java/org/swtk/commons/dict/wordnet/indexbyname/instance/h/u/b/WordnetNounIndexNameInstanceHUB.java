package org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hub\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08560786\", \"03552838\"]}");
	add("{\"term\":\"hub of the universe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09118343\"]}");
	add("{\"term\":\"hubbard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09329548\", \"11083530\"]}");
	add("{\"term\":\"hubbard squash\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07733459\", \"12181573\"]}");
	add("{\"term\":\"hubble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11083682\"]}");
	add("{\"term\":\"hubble constant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13611801\"]}");
	add("{\"term\":\"hubble law\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05887811\"]}");
	add("{\"term\":\"hubble parameter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13611801\"]}");
	add("{\"term\":\"hubbub\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07400260\"]}");
	add("{\"term\":\"hubby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10213586\"]}");
	add("{\"term\":\"hubcap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03553266\"]}");
	add("{\"term\":\"hubel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11083939\"]}");
	add("{\"term\":\"hubris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04895898\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }