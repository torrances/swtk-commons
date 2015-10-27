package org.swtk.commons.dict.wordnet.index.name.instance.d.e.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"demagnetisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13482194\"]}");
	add("{\"term\":\"demagnetization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13482194\"]}");
	add("{\"term\":\"demagog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10021074\"]}");
	add("{\"term\":\"demagogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10021074\"]}");
	add("{\"term\":\"demagoguery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07201957\"]}");
	add("{\"term\":\"demagogy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07201957\"]}");
	add("{\"term\":\"demand\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"14472592\", \"01063257\", \"05901258\", \"13482365\", \"07205939\"]}");
	add("{\"term\":\"demander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10021240\"]}");
	add("{\"term\":\"demantoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14853342\"]}");
	add("{\"term\":\"demarcation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05756783\", \"08610212\"]}");
	add("{\"term\":\"demarche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00168942\"]}");
	add("{\"term\":\"dematiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13101231\"]}");
	add("{\"term\":\"demavend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09197354\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }