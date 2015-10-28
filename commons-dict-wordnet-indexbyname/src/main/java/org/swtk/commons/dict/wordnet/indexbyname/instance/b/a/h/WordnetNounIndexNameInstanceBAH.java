package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bahai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09852233\"]}");
	add("{\"term\":\"bahaism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06254682\"]}");
	add("{\"term\":\"bahamas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08866260\"]}");
	add("{\"term\":\"bahamian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09711125\"]}");
	add("{\"term\":\"bahasa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06951975\"]}");
	add("{\"term\":\"bahrain\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08867086\", \"08867413\"]}");
	add("{\"term\":\"bahraini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09711254\"]}");
	add("{\"term\":\"bahrein\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08867086\", \"08867413\"]}");
	add("{\"term\":\"bahreini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09711254\"]}");
	add("{\"term\":\"baht\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13685925\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }