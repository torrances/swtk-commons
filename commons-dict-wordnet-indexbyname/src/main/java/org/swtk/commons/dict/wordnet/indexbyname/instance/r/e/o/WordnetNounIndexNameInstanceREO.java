package org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reorder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06542246\"]}");
	add("{\"term\":\"reordering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00340289\"]}");
	add("{\"term\":\"reorganisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01140308\"]}");
	add("{\"term\":\"reorganization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00201617\", \"01140308\"]}");
	add("{\"term\":\"reorientation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00347122\", \"06218349\"]}");
	add("{\"term\":\"reoviridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01336251\"]}");
	add("{\"term\":\"reovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01343576\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }