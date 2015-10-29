package org.swtk.commons.dict.wordnet.indexbyname.instance.e.x.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"exigency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07432005\", \"14056536\"]}");
	add("{\"term\":\"exiguity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05120762\"]}");
	add("{\"term\":\"exile\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00208610\", \"10090946\", \"10091139\"]}");
	add("{\"term\":\"existence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09489410\", \"13977471\"]}");
	add("{\"term\":\"existential operator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06313745\"]}");
	add("{\"term\":\"existential philosopher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10091345\"]}");
	add("{\"term\":\"existential philosophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05979622\"]}");
	add("{\"term\":\"existential quantifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06313745\"]}");
	add("{\"term\":\"existentialism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05979622\"]}");
	add("{\"term\":\"existentialist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10091345\"]}");
	add("{\"term\":\"existentialist philosopher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10091345\"]}");
	add("{\"term\":\"existentialist philosophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05979622\"]}");
	add("{\"term\":\"exit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00059339\", \"07348249\", \"03308910\"]}");
	add("{\"term\":\"exit poll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05809294\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }