package org.swtk.commons.dict.wordnet.index.name.instance.c.h.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chase\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03013937\", \"10913358\", \"00320765\"]}");
	add("{\"term\":\"chased\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10514363\"]}");
	add("{\"term\":\"chaser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07899835\", \"10514520\"]}");
	add("{\"term\":\"chasid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10181288\"]}");
	add("{\"term\":\"chasidim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08111832\"]}");
	add("{\"term\":\"chasidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06244411\"]}");
	add("{\"term\":\"chasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09265295\"]}");
	add("{\"term\":\"chasse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00535189\"]}");
	add("{\"term\":\"chassid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10181288\"]}");
	add("{\"term\":\"chassidim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08111832\"]}");
	add("{\"term\":\"chassidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06244411\"]}");
	add("{\"term\":\"chassis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03014127\", \"03014310\", \"05224424\"]}");
	add("{\"term\":\"chasteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04704790\"]}");
	add("{\"term\":\"chastening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06727227\"]}");
	add("{\"term\":\"chastisement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06727227\", \"01163504\"]}");
	add("{\"term\":\"chastity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04856990\", \"01071049\"]}");
	add("{\"term\":\"chasuble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03014449\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }