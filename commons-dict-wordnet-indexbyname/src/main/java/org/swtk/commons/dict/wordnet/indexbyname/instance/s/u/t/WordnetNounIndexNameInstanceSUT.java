package org.swtk.commons.dict.wordnet.indexbyname.instance.s.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sutherland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11345862\"]}");
	add("{\"term\":\"sutler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10701004\"]}");
	add("{\"term\":\"sutra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06636504\"]}");
	add("{\"term\":\"suttee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00224442\"]}");
	add("{\"term\":\"sutura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05550526\"]}");
	add("{\"term\":\"sutura coronalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05551550\"]}");
	add("{\"term\":\"sutura frontalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05551711\"]}");
	add("{\"term\":\"sutura intermaxillaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05551897\"]}");
	add("{\"term\":\"sutura internasalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05552065\"]}");
	add("{\"term\":\"sutura lamboidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05552208\"]}");
	add("{\"term\":\"sutura sagittalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05552680\"]}");
	add("{\"term\":\"sutural bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05618674\"]}");
	add("{\"term\":\"suture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04374292\", \"04374458\", \"05550526\"]}");
	add("{\"term\":\"suturing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00717307\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }