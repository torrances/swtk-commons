package org.swtk.commons.dict.wordnet.index.name.instance.i.r.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIRRA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"irradiation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00706833\", \"05764695\", \"05948527\", \"07347150\", \"11448137\", \"14601298\"]}");
	add("{\"term\":\"irrational\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13752694\"]}");
	add("{\"term\":\"irrationality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14420967\"]}");
	add("{\"term\":\"irrawaddy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09338776\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }