package org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gesell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11017230\"]}");
	add("{\"term\":\"gesner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11017401\"]}");
	add("{\"term\":\"gesneria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12850735\"]}");
	add("{\"term\":\"gesneriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12849859\"]}");
	add("{\"term\":\"gesneriad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12850342\"]}");
	add("{\"term\":\"gesso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14700917\"]}");
	add("{\"term\":\"gestalt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05940127\"]}");
	add("{\"term\":\"gestapo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08228681\"]}");
	add("{\"term\":\"gestation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05780212\", \"14069684\", \"15251010\"]}");
	add("{\"term\":\"gesticulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06889821\"]}");
	add("{\"term\":\"gesture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01230869\", \"06889359\", \"00335335\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }