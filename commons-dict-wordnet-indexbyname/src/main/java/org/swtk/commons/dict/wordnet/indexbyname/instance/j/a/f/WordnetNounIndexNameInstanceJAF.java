package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jafar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11098394\"]}");
	add("{\"term\":\"jafar umar thalib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11098394\"]}");
	add("{\"term\":\"jaffa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08816047\"]}");
	add("{\"term\":\"jaffa orange\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07765071\"]}");
	add("{\"term\":\"jaffar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11098394\"]}");
	add("{\"term\":\"jaffar umar thalib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11098394\"]}");
	add("{\"term\":\"jafnea semitosta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13052234\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }