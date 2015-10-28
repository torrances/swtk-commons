package org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ash\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12324438\", \"12323979\", \"14793339\"]}");
	add("{\"term\":\"ashbin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750182\"]}");
	add("{\"term\":\"ashcake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07704010\"]}");
	add("{\"term\":\"ashcan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750182\"]}");
	add("{\"term\":\"ashe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10845322\"]}");
	add("{\"term\":\"asheville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09150713\"]}");
	add("{\"term\":\"ashir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09539281\"]}");
	add("{\"term\":\"ashkenazi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09630933\"]}");
	add("{\"term\":\"ashkhabad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09044182\"]}");
	add("{\"term\":\"ashlar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750546\"]}");
	add("{\"term\":\"ashram\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08660842\", \"08660961\"]}");
	add("{\"term\":\"ashton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10845527\"]}");
	add("{\"term\":\"ashtoreth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09539458\"]}");
	add("{\"term\":\"ashtray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750807\"]}");
	add("{\"term\":\"ashur\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08939014\", \"09539281\"]}");
	add("{\"term\":\"ashurbanipal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10845637\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }