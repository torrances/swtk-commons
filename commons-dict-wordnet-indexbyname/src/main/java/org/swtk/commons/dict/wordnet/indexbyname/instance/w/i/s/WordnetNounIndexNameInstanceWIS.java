package org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wisconsin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09179934\", \"09503686\"]}");
	add("{\"term\":\"wisconsinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09765867\"]}");
	add("{\"term\":\"wisdom\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06472194\", \"05167331\", \"05624890\", \"04897307\", \"05934868\"]}");
	add("{\"term\":\"wise\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11413119\", \"11413310\", \"04938910\"]}");
	add("{\"term\":\"wiseacre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10803789\"]}");
	add("{\"term\":\"wisecrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06780568\"]}");
	add("{\"term\":\"wiseness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04897307\", \"05167331\"]}");
	add("{\"term\":\"wisenheimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10803789\"]}");
	add("{\"term\":\"wisent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02413546\"]}");
	add("{\"term\":\"wish\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05799610\", \"06643134\", \"07200530\", \"07501369\"]}");
	add("{\"term\":\"wishbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01898152\"]}");
	add("{\"term\":\"wishfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07502317\"]}");
	add("{\"term\":\"wishing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07501369\"]}");
	add("{\"term\":\"wisp\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08008664\", \"08024812\", \"10804112\", \"07977542\"]}");
	add("{\"term\":\"wistaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12601205\"]}");
	add("{\"term\":\"wister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11413441\"]}");
	add("{\"term\":\"wisteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12601205\"]}");
	add("{\"term\":\"wistfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07502416\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }