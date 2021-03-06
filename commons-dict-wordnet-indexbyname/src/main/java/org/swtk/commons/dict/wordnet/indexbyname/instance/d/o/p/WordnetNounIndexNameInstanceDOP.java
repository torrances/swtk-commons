package org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dopa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14629137\"]}");
	add("{\"term\":\"dopamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14862387\"]}");
	add("{\"term\":\"dopastat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14862387\"]}");
	add("{\"term\":\"dope\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06648638\", \"07944171\", \"10059116\", \"03997192\"]}");
	add("{\"term\":\"dope sheet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06608229\"]}");
	add("{\"term\":\"doppelganger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09510822\"]}");
	add("{\"term\":\"doppelzentner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13747381\"]}");
	add("{\"term\":\"doppler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960307\"]}");
	add("{\"term\":\"doppler effect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11533612\"]}");
	add("{\"term\":\"doppler radar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03229193\"]}");
	add("{\"term\":\"doppler shift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11533612\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }