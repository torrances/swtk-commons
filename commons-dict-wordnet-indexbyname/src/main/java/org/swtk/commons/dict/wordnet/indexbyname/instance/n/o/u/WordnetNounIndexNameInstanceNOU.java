package org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nouakchott\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08989527\"]}");
	add("{\"term\":\"nougat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07623948\"]}");
	add("{\"term\":\"nougat bar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07624038\"]}");
	add("{\"term\":\"nought\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13764498\"]}");
	add("{\"term\":\"noughts and crosses\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00507218\"]}");
	add("{\"term\":\"noumenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05821558\"]}");
	add("{\"term\":\"noun\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06328855\", \"06330286\"]}");
	add("{\"term\":\"noun phrase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06327473\"]}");
	add("{\"term\":\"nourishment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00666092\", \"07586285\"]}");
	add("{\"term\":\"nous\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05619057\", \"05622930\"]}");
	add("{\"term\":\"nouvelle cuisine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07587468\"]}");
	add("{\"term\":\"nouvelle vague\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08486928\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }