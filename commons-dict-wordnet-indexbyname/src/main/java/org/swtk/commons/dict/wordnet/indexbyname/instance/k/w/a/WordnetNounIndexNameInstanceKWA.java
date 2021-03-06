package org.swtk.commons.dict.wordnet.indexbyname.instance.k.w.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKWA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kwa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07009828\"]}");
	add("{\"term\":\"kwacha\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13705326\", \"13705683\"]}");
	add("{\"term\":\"kwai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13732097\"]}");
	add("{\"term\":\"kwajalein\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01285459\", \"08858706\"]}");
	add("{\"term\":\"kwakiutl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06927388\", \"09679416\"]}");
	add("{\"term\":\"kwangchow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743287\"]}");
	add("{\"term\":\"kwangju\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08976078\"]}");
	add("{\"term\":\"kwangtung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743169\"]}");
	add("{\"term\":\"kwannon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09558520\"]}");
	add("{\"term\":\"kwanza\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00519208\", \"13706037\"]}");
	add("{\"term\":\"kwanzaa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00519208\"]}");
	add("{\"term\":\"kwashiorkor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14223416\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }