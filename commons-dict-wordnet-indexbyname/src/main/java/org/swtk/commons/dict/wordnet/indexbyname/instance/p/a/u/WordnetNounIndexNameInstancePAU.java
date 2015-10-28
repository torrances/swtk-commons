package org.swtk.commons.dict.wordnet.indexbyname.instance.p.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"paucity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05124440\"]}");
	add("{\"term\":\"paul\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11245651\", \"11246604\"]}");
	add("{\"term\":\"pauli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11246703\"]}");
	add("{\"term\":\"pauling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11246923\"]}");
	add("{\"term\":\"paunch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05563550\"]}");
	add("{\"term\":\"paunchiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007129\"]}");
	add("{\"term\":\"pauper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10428756\"]}");
	add("{\"term\":\"pauperisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01152962\"]}");
	add("{\"term\":\"pauperism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14517300\"]}");
	add("{\"term\":\"pauperization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01152962\", \"14517300\"]}");
	add("{\"term\":\"pauropoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01785846\"]}");
	add("{\"term\":\"pause\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01064741\", \"15295994\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }