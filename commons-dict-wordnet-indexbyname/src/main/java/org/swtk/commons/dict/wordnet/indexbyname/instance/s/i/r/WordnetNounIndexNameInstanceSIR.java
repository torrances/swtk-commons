package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sir\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10620934\", \"10620859\"]}");
	add("{\"term\":\"sirach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06471965\"]}");
	add("{\"term\":\"siracusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08827903\"]}");
	add("{\"term\":\"sirc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08363832\"]}");
	add("{\"term\":\"sirdar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10621052\"]}");
	add("{\"term\":\"sire\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01325996\", \"10122569\", \"10621133\"]}");
	add("{\"term\":\"siren\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01641828\", \"04231457\", \"07280494\", \"10075218\", \"10621248\"]}");
	add("{\"term\":\"sirenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02075693\"]}");
	add("{\"term\":\"sirenian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02075902\"]}");
	add("{\"term\":\"sirenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01641593\"]}");
	add("{\"term\":\"siriasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14228068\"]}");
	add("{\"term\":\"siris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11780078\"]}");
	add("{\"term\":\"sirius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09458869\"]}");
	add("{\"term\":\"sirloin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07674703\"]}");
	add("{\"term\":\"sirocco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11468490\"]}");
	add("{\"term\":\"sirrah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10621527\"]}");
	add("{\"term\":\"sirup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07875559\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }