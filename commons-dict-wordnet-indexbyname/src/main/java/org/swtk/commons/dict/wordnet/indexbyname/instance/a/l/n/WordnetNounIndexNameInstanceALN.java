package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"al nathir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08030385\"]}");
	add("{\"term\":\"alnico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14740519\"]}");
	add("{\"term\":\"alnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12304498\"]}");
	add("{\"term\":\"alnus crispa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306714\"]}");
	add("{\"term\":\"alnus glutinosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12305338\"]}");
	add("{\"term\":\"alnus incana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12305566\"]}");
	add("{\"term\":\"alnus maritima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12305712\"]}");
	add("{\"term\":\"alnus rhombifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12305886\"]}");
	add("{\"term\":\"alnus rubra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306029\"]}");
	add("{\"term\":\"alnus rugosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306222\"]}");
	add("{\"term\":\"alnus serrulata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306417\"]}");
	add("{\"term\":\"alnus veridis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306585\"]}");
	add("{\"term\":\"alnus veridis crispa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306714\"]}");
	add("{\"term\":\"alnus vulgaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12305338\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }