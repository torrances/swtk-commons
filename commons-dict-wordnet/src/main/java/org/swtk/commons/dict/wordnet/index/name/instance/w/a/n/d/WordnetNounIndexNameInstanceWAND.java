package org.swtk.commons.dict.wordnet.index.name.instance.w.a.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wand\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02812499\", \"07282278\", \"13185183\", \"04556915\"]}");
	add("{\"term\":\"wandala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06996761\"]}");
	add("{\"term\":\"wanderer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06591891\", \"10785347\"]}");
	add("{\"term\":\"wandering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00297888\"]}");
	add("{\"term\":\"wanderlust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09206037\"]}");
	add("{\"term\":\"wandflower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12271795\", \"12439012\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }