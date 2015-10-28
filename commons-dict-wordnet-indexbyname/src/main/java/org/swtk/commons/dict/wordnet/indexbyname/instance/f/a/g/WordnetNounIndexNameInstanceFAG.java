package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03034648\", \"10095821\"]}");
	add("{\"term\":\"fagaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12280725\"]}");
	add("{\"term\":\"fagales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12280538\"]}");
	add("{\"term\":\"faggot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03322178\", \"10095821\"]}");
	add("{\"term\":\"faggoting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03322285\"]}");
	add("{\"term\":\"fagin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09621772\"]}");
	add("{\"term\":\"fagopyrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12622096\"]}");
	add("{\"term\":\"fagot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03322178\", \"10095821\"]}");
	add("{\"term\":\"fagoting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03322285\"]}");
	add("{\"term\":\"fagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12281110\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }