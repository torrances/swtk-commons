package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unlawful carnal knowledge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00849728\"]}");
	add("{\"term\":\"unlawfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04818117\"]}");
	add("{\"term\":\"unleaded gasoline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15108386\"]}");
	add("{\"term\":\"unleaded petrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15108386\"]}");
	add("{\"term\":\"unleavened bread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07699909\"]}");
	add("{\"term\":\"unlikelihood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04766031\"]}");
	add("{\"term\":\"unlikeliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04766031\"]}");
	add("{\"term\":\"unlikeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04758019\"]}");
	add("{\"term\":\"unlisted security\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13442268\"]}");
	add("{\"term\":\"unlisted stock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13442459\"]}");
	add("{\"term\":\"unloading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00715425\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }