package org.swtk.commons.dict.wordnet.index.name.instance.m.e.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06033377\"]}");
	add("{\"term\":\"meander\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00285253\", \"09372545\"]}");
	add("{\"term\":\"meanie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10323945\"]}");
	add("{\"term\":\"meaning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05928460\", \"06613680\"]}");
	add("{\"term\":\"meaningfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05177763\"]}");
	add("{\"term\":\"meaninglessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05181322\", \"06619692\"]}");
	add("{\"term\":\"meanness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04840918\", \"04852915\"]}");
	add("{\"term\":\"means\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13374873\", \"03739038\", \"00173531\"]}");
	add("{\"term\":\"meantime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15297873\"]}");
	add("{\"term\":\"meanwhile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15297873\"]}");
	add("{\"term\":\"meany\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10323945\", \"11190754\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }