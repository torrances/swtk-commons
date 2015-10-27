package org.swtk.commons.dict.wordnet.index.name.instance.p.e.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePERT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pertainym\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06333350\"]}");
	add("{\"term\":\"perth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08853798\"]}");
	add("{\"term\":\"pertinacity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04871746\"]}");
	add("{\"term\":\"pertinence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13817392\"]}");
	add("{\"term\":\"pertinency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13817392\"]}");
	add("{\"term\":\"pertness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04640060\", \"04657008\"]}");
	add("{\"term\":\"perturbation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00554210\", \"04912173\", \"07443050\", \"11434988\", \"14426686\"]}");
	add("{\"term\":\"pertusaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13010061\"]}");
	add("{\"term\":\"pertusariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13009902\"]}");
	add("{\"term\":\"pertussis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14168108\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }