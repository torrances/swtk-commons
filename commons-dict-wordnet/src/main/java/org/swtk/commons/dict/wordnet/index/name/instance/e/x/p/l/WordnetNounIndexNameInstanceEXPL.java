package org.swtk.commons.dict.wordnet.index.name.instance.e.x.p.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXPL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"explanandum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06751572\"]}");
	add("{\"term\":\"explanans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06751762\"]}");
	add("{\"term\":\"explanation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07247081\", \"05801008\", \"06751030\"]}");
	add("{\"term\":\"expletive\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07140936\", \"07139804\"]}");
	add("{\"term\":\"explicandum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06751572\"]}");
	add("{\"term\":\"explication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06756057\", \"07247471\"]}");
	add("{\"term\":\"explicitness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04829263\"]}");
	add("{\"term\":\"exploit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00037483\"]}");
	add("{\"term\":\"exploitation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00419916\", \"00950022\"]}");
	add("{\"term\":\"exploiter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10092334\"]}");
	add("{\"term\":\"exploration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05793316\", \"00947593\", \"00310889\"]}");
	add("{\"term\":\"explorer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06583714\", \"10092496\"]}");
	add("{\"term\":\"explosion\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00573743\", \"07027968\", \"07131151\", \"07398296\", \"07428668\", \"00378172\", \"07323181\"]}");
	add("{\"term\":\"explosive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03309675\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }