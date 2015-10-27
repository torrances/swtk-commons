package org.swtk.commons.dict.wordnet.index.name.instance.e.s.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceESCH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eschalot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12453683\"]}");
	add("{\"term\":\"eschar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05271916\"]}");
	add("{\"term\":\"eschatologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10083147\"]}");
	add("{\"term\":\"eschatology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06192878\"]}");
	add("{\"term\":\"eschaton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15196354\"]}");
	add("{\"term\":\"escheat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13277498\", \"13362608\"]}");
	add("{\"term\":\"escherichia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01370857\"]}");
	add("{\"term\":\"eschrichtiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02068585\"]}");
	add("{\"term\":\"eschrichtius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02068739\"]}");
	add("{\"term\":\"eschscholtzia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11925705\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }