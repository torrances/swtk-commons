package org.swtk.commons.dict.wordnet.indexbyname.instance.h.y.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hygeia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09586012\"]}");
	add("{\"term\":\"hygiene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06060911\", \"14518664\"]}");
	add("{\"term\":\"hygienics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06060911\"]}");
	add("{\"term\":\"hygienist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10214588\"]}");
	add("{\"term\":\"hygrocybe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13091468\"]}");
	add("{\"term\":\"hygrodeik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03559555\"]}");
	add("{\"term\":\"hygrometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03559640\"]}");
	add("{\"term\":\"hygrophoraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13090763\"]}");
	add("{\"term\":\"hygrophorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13091789\"]}");
	add("{\"term\":\"hygrophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11573973\"]}");
	add("{\"term\":\"hygroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03559825\"]}");
	add("{\"term\":\"hygroton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03027306\"]}");
	add("{\"term\":\"hygrotrama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13093971\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }