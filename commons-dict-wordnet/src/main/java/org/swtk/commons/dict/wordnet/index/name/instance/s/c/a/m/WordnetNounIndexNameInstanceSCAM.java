package org.swtk.commons.dict.wordnet.index.name.instance.s.c.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00755623\"]}");
	add("{\"term\":\"scammer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09974494\"]}");
	add("{\"term\":\"scammony\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12845049\", \"12845242\", \"12849280\"]}");
	add("{\"term\":\"scammonyroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848667\"]}");
	add("{\"term\":\"scamp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10219666\"]}");
	add("{\"term\":\"scamper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00557179\"]}");
	add("{\"term\":\"scampi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07892526\"]}");
	add("{\"term\":\"scampo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07809497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }