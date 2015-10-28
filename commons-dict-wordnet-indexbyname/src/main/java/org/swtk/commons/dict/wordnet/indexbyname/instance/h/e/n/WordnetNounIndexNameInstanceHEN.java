package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hen\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01323614\", \"07661676\", \"01517500\", \"01795281\"]}");
	add("{\"term\":\"henbane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12925074\"]}");
	add("{\"term\":\"henbit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12870176\"]}");
	add("{\"term\":\"henchman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09972962\"]}");
	add("{\"term\":\"hencoop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03020043\"]}");
	add("{\"term\":\"hendiadys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07118224\"]}");
	add("{\"term\":\"hendrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11060020\"]}");
	add("{\"term\":\"henhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03020043\"]}");
	add("{\"term\":\"henna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15013308\"]}");
	add("{\"term\":\"henroost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03520038\"]}");
	add("{\"term\":\"henry\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11060236\", \"11060377\", \"11060592\", \"13660884\"]}");
	add("{\"term\":\"henson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11063831\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }