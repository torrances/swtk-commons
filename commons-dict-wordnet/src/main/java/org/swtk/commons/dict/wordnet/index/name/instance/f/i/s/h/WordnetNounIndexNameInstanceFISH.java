package org.swtk.commons.dict.wordnet.index.name.instance.f.i.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFISH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fish\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08705814\", \"09773123\", \"07791351\", \"02514684\"]}");
	add("{\"term\":\"fishbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02470122\"]}");
	add("{\"term\":\"fishbowl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03355050\", \"13958433\"]}");
	add("{\"term\":\"fisher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02453460\", \"10113427\"]}");
	add("{\"term\":\"fisherman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10113427\"]}");
	add("{\"term\":\"fishery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03355726\"]}");
	add("{\"term\":\"fishgig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04278258\"]}");
	add("{\"term\":\"fishhook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03355997\"]}");
	add("{\"term\":\"fishing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00455145\", \"00454959\"]}");
	add("{\"term\":\"fishmonger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10113587\"]}");
	add("{\"term\":\"fishnet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03357474\"]}");
	add("{\"term\":\"fishpaste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07872968\"]}");
	add("{\"term\":\"fishplate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03357699\"]}");
	add("{\"term\":\"fishpond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09303819\"]}");
	add("{\"term\":\"fishwife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10113587\"]}");
	add("{\"term\":\"fishworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01938036\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }