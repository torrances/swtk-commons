package org.swtk.commons.dict.wordnet.index.name.instance.p.u.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"putrajaya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08983758\"]}");
	add("{\"term\":\"putrefaction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04858227\", \"13479192\", \"14584518\"]}");
	add("{\"term\":\"putrescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04798804\", \"14584694\"]}");
	add("{\"term\":\"putrescine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14887328\"]}");
	add("{\"term\":\"putridity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14511784\"]}");
	add("{\"term\":\"putridness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14584694\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }