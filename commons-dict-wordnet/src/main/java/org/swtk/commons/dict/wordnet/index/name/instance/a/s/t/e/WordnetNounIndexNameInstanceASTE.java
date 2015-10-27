package org.swtk.commons.dict.wordnet.index.name.instance.a.s.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05453582\", \"11952387\"]}");
	add("{\"term\":\"asteraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11932060\"]}");
	add("{\"term\":\"astereognosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14079625\"]}");
	add("{\"term\":\"asteridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11931304\"]}");
	add("{\"term\":\"asterion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05238727\"]}");
	add("{\"term\":\"asterisk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06841439\"]}");
	add("{\"term\":\"asterism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09231384\", \"13904467\"]}");
	add("{\"term\":\"asteroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09231590\"]}");
	add("{\"term\":\"asteroidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02319864\"]}");
	add("{\"term\":\"asterope\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09468684\", \"09573112\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }