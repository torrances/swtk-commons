package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05759170\"]}");
	add("{\"term\":\"fad diet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07578446\"]}");
	add("{\"term\":\"faddist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095687\"]}");
	add("{\"term\":\"fade\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00231039\", \"00573080\"]}");
	add("{\"term\":\"fadeout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07445969\", \"07350814\"]}");
	add("{\"term\":\"fading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07442134\"]}");
	add("{\"term\":\"fading away\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07437848\"]}");
	add("{\"term\":\"fado\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07065481\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }