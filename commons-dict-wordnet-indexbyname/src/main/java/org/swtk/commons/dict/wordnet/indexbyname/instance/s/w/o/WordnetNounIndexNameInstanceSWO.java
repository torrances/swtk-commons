package org.swtk.commons.dict.wordnet.indexbyname.instance.s.w.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSWO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"swob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04374567\"]}");
	add("{\"term\":\"swoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07493458\"]}");
	add("{\"term\":\"swoop\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00327859\", \"00979300\", \"06870314\"]}");
	add("{\"term\":\"swoosh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07411130\"]}");
	add("{\"term\":\"swop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01111592\"]}");
	add("{\"term\":\"sword\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04380981\"]}");
	add("{\"term\":\"swordfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02632346\", \"07801863\"]}");
	add("{\"term\":\"swordplay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00042206\"]}");
	add("{\"term\":\"swordsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10104986\"]}");
	add("{\"term\":\"swordsmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05648184\"]}");
	add("{\"term\":\"swordtail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01450932\"]}");
	add("{\"term\":\"swot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704113\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }