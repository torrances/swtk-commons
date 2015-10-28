package org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mirabeau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11201624\"]}");
	add("{\"term\":\"mirabilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11859766\"]}");
	add("{\"term\":\"miracle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07303524\", \"07304204\"]}");
	add("{\"term\":\"mirage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05948932\", \"11504775\"]}");
	add("{\"term\":\"mirasol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11999182\"]}");
	add("{\"term\":\"mire\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14433769\", \"14980662\", \"09378747\"]}");
	add("{\"term\":\"miri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06946601\"]}");
	add("{\"term\":\"mirid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02240233\"]}");
	add("{\"term\":\"miridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02239891\"]}");
	add("{\"term\":\"mirish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06946601\"]}");
	add("{\"term\":\"miro\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11201825\", \"11678782\"]}");
	add("{\"term\":\"mirounga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02082943\"]}");
	add("{\"term\":\"mirror\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05775242\", \"03778568\"]}");
	add("{\"term\":\"mirth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07544765\"]}");
	add("{\"term\":\"mirthfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07544765\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }