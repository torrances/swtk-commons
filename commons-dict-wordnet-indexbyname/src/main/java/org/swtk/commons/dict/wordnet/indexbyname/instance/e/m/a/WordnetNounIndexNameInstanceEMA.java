package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"emaciation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05009032\"]}");
	add("{\"term\":\"email\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06289979\"]}");
	add("{\"term\":\"emanation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07341888\", \"01255647\", \"15134312\"]}");
	add("{\"term\":\"emancipation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01249960\"]}");
	add("{\"term\":\"emancipationist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09775968\"]}");
	add("{\"term\":\"emancipator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10070834\"]}");
	add("{\"term\":\"emasculation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00693602\", \"04676070\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }