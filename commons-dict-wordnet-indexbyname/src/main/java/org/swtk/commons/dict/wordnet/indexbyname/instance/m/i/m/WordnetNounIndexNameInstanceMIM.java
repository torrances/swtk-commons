package org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mimamsa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06248401\"]}");
	add("{\"term\":\"mime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00551053\", \"10338550\"]}");
	add("{\"term\":\"mimeo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03772994\"]}");
	add("{\"term\":\"mimeograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03772994\"]}");
	add("{\"term\":\"mimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10338550\"]}");
	add("{\"term\":\"mimesis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06625801\", \"14102215\", \"05971652\"]}");
	add("{\"term\":\"mimic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10338821\"]}");
	add("{\"term\":\"mimicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10338821\"]}");
	add("{\"term\":\"mimicry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01023338\", \"00550509\"]}");
	add("{\"term\":\"mimidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01589182\"]}");
	add("{\"term\":\"mimir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09605034\"]}");
	add("{\"term\":\"mimosa\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07946555\", \"11775362\", \"11778122\"]}");
	add("{\"term\":\"mimosaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11774405\"]}");
	add("{\"term\":\"mimosoideae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11774657\"]}");
	add("{\"term\":\"mimus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01589432\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }