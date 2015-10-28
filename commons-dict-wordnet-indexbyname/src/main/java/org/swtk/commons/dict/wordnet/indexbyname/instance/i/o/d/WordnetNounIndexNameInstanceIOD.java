package org.swtk.commons.dict.wordnet.indexbyname.instance.i.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iodide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14946509\"]}");
	add("{\"term\":\"iodin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14665575\"]}");
	add("{\"term\":\"iodination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13523759\"]}");
	add("{\"term\":\"iodine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04446439\", \"14665575\"]}");
	add("{\"term\":\"iodochlorhydroxyquin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03588278\"]}");
	add("{\"term\":\"iodocompound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14946667\"]}");
	add("{\"term\":\"iodoform\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03588421\", \"14644959\"]}");
	add("{\"term\":\"iodoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14758940\"]}");
	add("{\"term\":\"iodopsin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15113236\"]}");
	add("{\"term\":\"iodothyronine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14859295\"]}");
	add("{\"term\":\"iodotyrosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14859174\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }