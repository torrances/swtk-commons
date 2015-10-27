package org.swtk.commons.dict.wordnet.index.name.instance.m.u.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"must\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04935371\", \"07940895\", \"09386867\"]}");
	add("{\"term\":\"mustache\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05269684\"]}");
	add("{\"term\":\"mustachio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05270033\"]}");
	add("{\"term\":\"mustagh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09346730\"]}");
	add("{\"term\":\"mustang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02383235\"]}");
	add("{\"term\":\"mustard\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07729508\", \"07835456\", \"11898752\"]}");
	add("{\"term\":\"mustela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02444354\"]}");
	add("{\"term\":\"mustelid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02443957\"]}");
	add("{\"term\":\"mustelidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02443336\"]}");
	add("{\"term\":\"musteline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02443957\"]}");
	add("{\"term\":\"mustelus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01494853\"]}");
	add("{\"term\":\"muster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01160337\", \"08496626\"]}");
	add("{\"term\":\"musth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15314179\"]}");
	add("{\"term\":\"mustiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04935371\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }