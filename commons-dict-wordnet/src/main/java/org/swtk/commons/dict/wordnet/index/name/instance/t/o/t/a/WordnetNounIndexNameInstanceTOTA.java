package org.swtk.commons.dict.wordnet.index.name.instance.t.o.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOTA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"total\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05869651\", \"04360881\"]}");
	add("{\"term\":\"totalisator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896211\"]}");
	add("{\"term\":\"totaliser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02682111\", \"03896211\"]}");
	add("{\"term\":\"totalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06223441\"]}");
	add("{\"term\":\"totalitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10736986\"]}");
	add("{\"term\":\"totalitarianism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06223441\", \"08457622\"]}");
	add("{\"term\":\"totality\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04360881\", \"04773106\", \"14484815\"]}");
	add("{\"term\":\"totalizator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896211\"]}");
	add("{\"term\":\"totalizer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02682111\", \"03896211\"]}");
	add("{\"term\":\"totara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11673577\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }