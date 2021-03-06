package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"joule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11112730\", \"13748184\"]}");
	add("{\"term\":\"jounce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07353698\"]}");
	add("{\"term\":\"journal\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03607678\", \"03607775\", \"13426339\", \"06609819\", \"06413674\"]}");
	add("{\"term\":\"journal bearing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03607899\"]}");
	add("{\"term\":\"journal box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03608003\"]}");
	add("{\"term\":\"journalese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07085290\"]}");
	add("{\"term\":\"journalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00612961\", \"06277070\"]}");
	add("{\"term\":\"journalist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10031140\", \"10244248\"]}");
	add("{\"term\":\"journey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00307252\"]}");
	add("{\"term\":\"journey cake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07704748\"]}");
	add("{\"term\":\"journeyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10791060\"]}");
	add("{\"term\":\"journeying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00307252\"]}");
	add("{\"term\":\"journeyman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09994178\"]}");
	add("{\"term\":\"joust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07487600\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }