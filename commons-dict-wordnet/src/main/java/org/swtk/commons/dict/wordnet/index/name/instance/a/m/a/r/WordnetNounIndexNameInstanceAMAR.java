package org.swtk.commons.dict.wordnet.index.name.instance.a.m.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amaranth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11843512\", \"11843774\"]}");
	add("{\"term\":\"amaranthaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11843026\"]}");
	add("{\"term\":\"amaranthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11843318\"]}");
	add("{\"term\":\"amarelle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07774101\", \"12664449\"]}");
	add("{\"term\":\"amaretto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07924807\"]}");
	add("{\"term\":\"amarillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09165508\"]}");
	add("{\"term\":\"amaryllidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12439185\"]}");
	add("{\"term\":\"amaryllis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12439542\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }