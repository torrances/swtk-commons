package org.swtk.commons.dict.wordnet.index.name.instance.r.a.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rain\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05052359\", \"15033174\", \"11521799\"]}");
	add("{\"term\":\"rainbow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05959849\", \"09426302\"]}");
	add("{\"term\":\"raincoat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04056517\"]}");
	add("{\"term\":\"raindrop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11522067\"]}");
	add("{\"term\":\"rainfall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11521799\"]}");
	add("{\"term\":\"rainfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04419232\"]}");
	add("{\"term\":\"rainforest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08456118\"]}");
	add("{\"term\":\"rainier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09428044\"]}");
	add("{\"term\":\"raininess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05044192\"]}");
	add("{\"term\":\"rainmaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10524940\", \"10525052\"]}");
	add("{\"term\":\"rainmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00923868\"]}");
	add("{\"term\":\"rainstorm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11522155\"]}");
	add("{\"term\":\"rainwater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15033174\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }