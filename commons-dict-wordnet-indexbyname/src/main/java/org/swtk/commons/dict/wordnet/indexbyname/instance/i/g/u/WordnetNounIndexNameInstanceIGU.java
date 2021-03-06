package org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIGU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iguana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01680007\"]}");
	add("{\"term\":\"iguana iguana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01680007\"]}");
	add("{\"term\":\"iguania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01678954\"]}");
	add("{\"term\":\"iguanid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01679396\"]}");
	add("{\"term\":\"iguanid lizard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01679396\"]}");
	add("{\"term\":\"iguanidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01678954\"]}");
	add("{\"term\":\"iguanodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01710339\"]}");
	add("{\"term\":\"iguanodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01710074\"]}");
	add("{\"term\":\"iguassu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09332362\"]}");
	add("{\"term\":\"iguassu falls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09332362\"]}");
	add("{\"term\":\"iguazu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09332362\"]}");
	add("{\"term\":\"iguazu falls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09332362\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }