package org.swtk.commons.dict.wordnet.index.name.instance.s.t.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stoma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05253558\", \"11700483\"]}");
	add("{\"term\":\"stomach\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07501056\", \"07514515\", \"05564576\", \"05403033\"]}");
	add("{\"term\":\"stomachache\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14350671\"]}");
	add("{\"term\":\"stomacher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04332942\"]}");
	add("{\"term\":\"stomate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11700483\"]}");
	add("{\"term\":\"stomatitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14379449\"]}");
	add("{\"term\":\"stomatopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01992510\"]}");
	add("{\"term\":\"stomatopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01992342\"]}");
	add("{\"term\":\"stomp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00534728\"]}");
	add("{\"term\":\"stomper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10666381\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }