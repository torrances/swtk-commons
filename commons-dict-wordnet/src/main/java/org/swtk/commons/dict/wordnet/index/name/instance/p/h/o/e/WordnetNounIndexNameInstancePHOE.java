package org.swtk.commons.dict.wordnet.index.name.instance.p.h.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phoebe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01552527\", \"09600486\", \"13766661\"]}");
	add("{\"term\":\"phoebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09576896\"]}");
	add("{\"term\":\"phoenicia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08939466\"]}");
	add("{\"term\":\"phoenician\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07002133\", \"09661838\"]}");
	add("{\"term\":\"phoenicophorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12614450\"]}");
	add("{\"term\":\"phoenicopteridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02010076\"]}");
	add("{\"term\":\"phoeniculidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01832824\"]}");
	add("{\"term\":\"phoeniculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01832957\"]}");
	add("{\"term\":\"phoenicurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01563959\"]}");
	add("{\"term\":\"phoenix\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09413860\", \"09524068\", \"12614587\", \"09080839\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }