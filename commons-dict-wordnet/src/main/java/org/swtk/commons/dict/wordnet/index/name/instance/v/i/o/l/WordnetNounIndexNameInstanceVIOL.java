package org.swtk.commons.dict.wordnet.index.name.instance.v.i.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVIOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"viol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04543448\"]}");
	add("{\"term\":\"viola\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04543630\", \"12407995\", \"12408150\"]}");
	add("{\"term\":\"violaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12407718\"]}");
	add("{\"term\":\"violation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00774891\", \"00747530\", \"00734781\", \"00772032\", \"00771759\"]}");
	add("{\"term\":\"violator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10773949\", \"10774117\"]}");
	add("{\"term\":\"violence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14003462\", \"05044968\", \"00967515\"]}");
	add("{\"term\":\"violet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04978025\", \"12408356\"]}");
	add("{\"term\":\"violin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04544161\"]}");
	add("{\"term\":\"violinist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10774246\"]}");
	add("{\"term\":\"violist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10774748\"]}");
	add("{\"term\":\"violoncellist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09922954\"]}");
	add("{\"term\":\"violoncello\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02995666\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }