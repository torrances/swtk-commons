package org.swtk.commons.dict.wordnet.index.name.instance.t.h.y.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHYR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thyreophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01703975\"]}");
	add("{\"term\":\"thyreophoran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01703975\"]}");
	add("{\"term\":\"thyrocalcitonin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05420808\"]}");
	add("{\"term\":\"thyroglobulin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14946917\"]}");
	add("{\"term\":\"thyroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05337792\"]}");
	add("{\"term\":\"thyroidectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00689473\"]}");
	add("{\"term\":\"thyroiditis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14380565\"]}");
	add("{\"term\":\"thyromegaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14222959\"]}");
	add("{\"term\":\"thyronine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15099023\"]}");
	add("{\"term\":\"thyroprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14946775\"]}");
	add("{\"term\":\"thyrotoxicosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14144249\"]}");
	add("{\"term\":\"thyrotrophin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15098540\"]}");
	add("{\"term\":\"thyrotropin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15098540\"]}");
	add("{\"term\":\"thyroxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05420990\"]}");
	add("{\"term\":\"thyroxine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05420990\"]}");
	add("{\"term\":\"thyrse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13153515\"]}");
	add("{\"term\":\"thyrsopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13212782\"]}");
	add("{\"term\":\"thyrsus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13153515\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }