package org.swtk.commons.dict.wordnet.indexbyname.instance.e.d.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEDU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eduard buchner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10889659\"]}");
	add("{\"term\":\"educatee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10685137\"]}");
	add("{\"term\":\"education\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"08149619\", \"04929077\", \"00612720\", \"05761561\", \"05993172\", \"00884975\"]}");
	add("{\"term\":\"education department\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08149619\"]}");
	add("{\"term\":\"education secretary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00601986\", \"10590879\"]}");
	add("{\"term\":\"educational activity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00884975\"]}");
	add("{\"term\":\"educational institution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08293263\"]}");
	add("{\"term\":\"educational program\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05909037\"]}");
	add("{\"term\":\"educationalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10065262\"]}");
	add("{\"term\":\"educationist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10065262\"]}");
	add("{\"term\":\"educator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10065521\"]}");
	add("{\"term\":\"edutainment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00516589\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }