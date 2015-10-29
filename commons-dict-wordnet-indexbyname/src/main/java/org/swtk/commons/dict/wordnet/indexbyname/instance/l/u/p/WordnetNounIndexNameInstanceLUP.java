package org.swtk.commons.dict.wordnet.indexbyname.instance.l.u.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLUP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lupin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12566688\"]}");
	add("{\"term\":\"lupine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12566688\"]}");
	add("{\"term\":\"lupinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12566520\"]}");
	add("{\"term\":\"lupinus albus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12566925\"]}");
	add("{\"term\":\"lupinus arboreus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12567122\"]}");
	add("{\"term\":\"lupinus luteus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12567337\"]}");
	add("{\"term\":\"lupinus perennis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12567467\"]}");
	add("{\"term\":\"lupinus subcarnosus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12567720\"]}");
	add("{\"term\":\"lupinus texensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12568008\"]}");
	add("{\"term\":\"lupus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09367346\", \"14253394\"]}");
	add("{\"term\":\"lupus erythematosus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14244620\"]}");
	add("{\"term\":\"lupus vulgaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14243790\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }