package org.swtk.commons.dict.wordnet.indexbyname.instance.i.d.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIDO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ido\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06909521\"]}");
	add("{\"term\":\"idocrase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15112471\"]}");
	add("{\"term\":\"idol\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05933151\", \"10218056\", \"03565341\"]}");
	add("{\"term\":\"idol worship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01046116\"]}");
	add("{\"term\":\"idol worshiper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218221\"]}");
	add("{\"term\":\"idolater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218221\"]}");
	add("{\"term\":\"idolatress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218378\"]}");
	add("{\"term\":\"idolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01046116\"]}");
	add("{\"term\":\"idolisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01045852\", \"01221256\"]}");
	add("{\"term\":\"idoliser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10218221\", \"10218451\"]}");
	add("{\"term\":\"idolization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01045852\", \"01221256\"]}");
	add("{\"term\":\"idolizer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10218221\", \"10218451\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }