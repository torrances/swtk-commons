package org.swtk.commons.dict.wordnet.indexbyname.instance.g.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gig\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00271999\", \"03441566\", \"03441682\", \"03441900\", \"04278258\", \"03441801\"]}");
	add("{\"term\":\"gigabit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13650593\"]}");
	add("{\"term\":\"gigabyte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13650222\", \"13650416\"]}");
	add("{\"term\":\"gigacycle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15303677\"]}");
	add("{\"term\":\"gigacycle per second\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15303677\"]}");
	add("{\"term\":\"gigahertz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15303677\"]}");
	add("{\"term\":\"gigantism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05113520\", \"14391693\"]}");
	add("{\"term\":\"gigartinaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417000\"]}");
	add("{\"term\":\"giggle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07142401\"]}");
	add("{\"term\":\"giggler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10732773\"]}");
	add("{\"term\":\"gigo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06668672\"]}");
	add("{\"term\":\"gigolo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10149001\"]}");
	add("{\"term\":\"gigot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07684333\"]}");
	add("{\"term\":\"gigue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07069845\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }