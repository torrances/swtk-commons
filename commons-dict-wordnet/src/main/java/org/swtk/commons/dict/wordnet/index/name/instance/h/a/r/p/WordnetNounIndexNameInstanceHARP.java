package org.swtk.commons.dict.wordnet.index.name.instance.h.a.r.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHARP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"harp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03499379\", \"03500695\", \"03500383\"]}");
	add("{\"term\":\"harper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10180363\"]}");
	add("{\"term\":\"harpia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01616550\"]}");
	add("{\"term\":\"harpist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10180363\"]}");
	add("{\"term\":\"harpo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11181035\"]}");
	add("{\"term\":\"harpoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03500796\"]}");
	add("{\"term\":\"harpooneer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10180506\"]}");
	add("{\"term\":\"harpooner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10180506\"]}");
	add("{\"term\":\"harpsichord\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03501421\"]}");
	add("{\"term\":\"harpsichordist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10180640\"]}");
	add("{\"term\":\"harpulla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12764736\"]}");
	add("{\"term\":\"harpullia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12764583\"]}");
	add("{\"term\":\"harpy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01616679\", \"02143143\", \"09519230\", \"10778005\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }