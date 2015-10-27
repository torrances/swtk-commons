package org.swtk.commons.dict.wordnet.index.name.instance.d.e.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15148279\", \"07962243\"]}");
	add("{\"term\":\"deadbeat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10019052\"]}");
	add("{\"term\":\"deadbolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02869271\"]}");
	add("{\"term\":\"deadening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00273722\"]}");
	add("{\"term\":\"deadeye\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03170621\", \"10014416\"]}");
	add("{\"term\":\"deadhead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03170786\", \"10015842\"]}");
	add("{\"term\":\"deadlight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03170879\"]}");
	add("{\"term\":\"deadline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15204935\"]}");
	add("{\"term\":\"deadliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04798291\"]}");
	add("{\"term\":\"deadlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14038832\"]}");
	add("{\"term\":\"deadness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05013703\", \"05030570\", \"05220469\"]}");
	add("{\"term\":\"deadwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05127864\", \"13184451\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }