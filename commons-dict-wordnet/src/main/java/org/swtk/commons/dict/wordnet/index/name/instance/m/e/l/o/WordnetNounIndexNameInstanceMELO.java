package org.swtk.commons.dict.wordnet.index.name.instance.m.e.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMELO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"melocactus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11870605\"]}");
	add("{\"term\":\"melodiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04991097\"]}");
	add("{\"term\":\"melodrama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07029762\"]}");
	add("{\"term\":\"melody\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05719862\", \"07041860\"]}");
	add("{\"term\":\"melogale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02451133\"]}");
	add("{\"term\":\"meloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02181664\"]}");
	add("{\"term\":\"meloidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02181538\"]}");
	add("{\"term\":\"melolontha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02177173\"]}");
	add("{\"term\":\"melolonthidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02176805\"]}");
	add("{\"term\":\"melon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12184341\", \"07771387\"]}");
	add("{\"term\":\"melophagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02201648\"]}");
	add("{\"term\":\"melopsittacus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01824368\"]}");
	add("{\"term\":\"melosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12014996\"]}");
	add("{\"term\":\"melospiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01539115\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }