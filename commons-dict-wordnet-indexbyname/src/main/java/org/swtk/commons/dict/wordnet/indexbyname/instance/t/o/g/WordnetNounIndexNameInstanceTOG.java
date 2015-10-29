package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04452174\"]}");
	add("{\"term\":\"toga virilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04452288\"]}");
	add("{\"term\":\"togaviridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01334988\"]}");
	add("{\"term\":\"togetherness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07545710\"]}");
	add("{\"term\":\"toggle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04452461\", \"04453086\", \"06599575\"]}");
	add("{\"term\":\"toggle bolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04452744\"]}");
	add("{\"term\":\"toggle joint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04452916\"]}");
	add("{\"term\":\"toggle switch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04453086\"]}");
	add("{\"term\":\"togo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08777819\"]}");
	add("{\"term\":\"togo franc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13701036\"]}");
	add("{\"term\":\"togolese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09753967\"]}");
	add("{\"term\":\"togolese republic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08777819\"]}");
	add("{\"term\":\"togs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04453296\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }