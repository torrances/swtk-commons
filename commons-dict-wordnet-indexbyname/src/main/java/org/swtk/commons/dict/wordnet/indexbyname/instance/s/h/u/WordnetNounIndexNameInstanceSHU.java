package org.swtk.commons.dict.wordnet.indexbyname.instance.s.h.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08117622\"]}");
	add("{\"term\":\"shuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14830069\"]}");
	add("{\"term\":\"shucks\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06618035\", \"05148040\"]}");
	add("{\"term\":\"shudder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00349627\", \"07535351\"]}");
	add("{\"term\":\"shudra\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08324370\", \"10613692\"]}");
	add("{\"term\":\"shuffle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00293556\", \"00341289\"]}");
	add("{\"term\":\"shuffleboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00468604\"]}");
	add("{\"term\":\"shuffler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10613816\", \"10613931\"]}");
	add("{\"term\":\"shuffling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00341289\", \"00293556\"]}");
	add("{\"term\":\"shufti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00988007\"]}");
	add("{\"term\":\"shumac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12783656\"]}");
	add("{\"term\":\"shunning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00204602\"]}");
	add("{\"term\":\"shunt\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04217925\", \"04218068\", \"05556154\"]}");
	add("{\"term\":\"shunter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04218286\"]}");
	add("{\"term\":\"shutdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00230127\"]}");
	add("{\"term\":\"shute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11319202\"]}");
	add("{\"term\":\"shuteye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14049560\"]}");
	add("{\"term\":\"shutout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07491635\"]}");
	add("{\"term\":\"shutter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04218423\", \"04218595\"]}");
	add("{\"term\":\"shutterbug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10614042\"]}");
	add("{\"term\":\"shutting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00344866\"]}");
	add("{\"term\":\"shuttle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04218924\", \"04219037\", \"04219349\"]}");
	add("{\"term\":\"shuttlecock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04219349\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }