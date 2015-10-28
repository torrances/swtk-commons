package org.swtk.commons.dict.wordnet.indexbyname.instance.g.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09311852\"]}");
	add("{\"term\":\"gilbert\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"11019044\", \"11019198\", \"11019406\", \"11019580\", \"13663479\"]}");
	add("{\"term\":\"gild\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08244135\"]}");
	add("{\"term\":\"gilder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10149122\"]}");
	add("{\"term\":\"gildhall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442094\"]}");
	add("{\"term\":\"gilding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442340\"]}");
	add("{\"term\":\"gilgamesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11019869\"]}");
	add("{\"term\":\"gilgamish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09545972\"]}");
	add("{\"term\":\"gill\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02513400\", \"13032439\", \"13640309\", \"13642941\"]}");
	add("{\"term\":\"gillespie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11020008\"]}");
	add("{\"term\":\"gillette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11020168\"]}");
	add("{\"term\":\"gillie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03441200\", \"10149256\"]}");
	add("{\"term\":\"gillyflower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11828937\", \"11913106\"]}");
	add("{\"term\":\"gilman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11020345\"]}");
	add("{\"term\":\"gilmer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11020465\"]}");
	add("{\"term\":\"gilt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442340\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }