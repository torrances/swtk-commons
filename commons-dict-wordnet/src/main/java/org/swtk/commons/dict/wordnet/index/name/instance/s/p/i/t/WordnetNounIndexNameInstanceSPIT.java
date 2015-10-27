package org.swtk.commons.dict.wordnet.index.name.instance.s.p.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spit\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00119372\", \"04288108\", \"05423542\", \"09465499\"]}");
	add("{\"term\":\"spitball\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00110047\", \"04288269\"]}");
	add("{\"term\":\"spite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04849746\", \"07566132\"]}");
	add("{\"term\":\"spitefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04849746\", \"07566132\"]}");
	add("{\"term\":\"spitfire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10656144\"]}");
	add("{\"term\":\"spitsbergen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08782550\"]}");
	add("{\"term\":\"spitter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00110047\", \"10656272\"]}");
	add("{\"term\":\"spitting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00119372\"]}");
	add("{\"term\":\"spittle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05423542\"]}");
	add("{\"term\":\"spittlebug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02260367\"]}");
	add("{\"term\":\"spittoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04288398\"]}");
	add("{\"term\":\"spitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02114278\"]}");
	add("{\"term\":\"spitzbergen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08782550\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }