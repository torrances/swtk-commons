package org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08359597\"]}");
	add("{\"term\":\"cimabue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10917885\"]}");
	add("{\"term\":\"cimarron\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02418223\", \"09267878\"]}");
	add("{\"term\":\"cimarron river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09267878\"]}");
	add("{\"term\":\"cimetidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03035538\"]}");
	add("{\"term\":\"cimex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02243029\"]}");
	add("{\"term\":\"cimex lectularius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02243169\"]}");
	add("{\"term\":\"cimicidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02242875\"]}");
	add("{\"term\":\"cimicifuga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11748819\"]}");
	add("{\"term\":\"cimicifuga americana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11749238\"]}");
	add("{\"term\":\"cimicifuga foetida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11749611\"]}");
	add("{\"term\":\"cimicifuga racemosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11749414\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }