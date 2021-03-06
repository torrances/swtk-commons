package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dexamethasone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777987\"]}");
	add("{\"term\":\"dexamethasone intensol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777987\"]}");
	add("{\"term\":\"dexedrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03190689\"]}");
	add("{\"term\":\"dexone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14777987\"]}");
	add("{\"term\":\"dexterity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05650660\"]}");
	add("{\"term\":\"dextrality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05074683\"]}");
	add("{\"term\":\"dextrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14858495\"]}");
	add("{\"term\":\"dextroamphetamine sulphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03190689\"]}");
	add("{\"term\":\"dextrocardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14116807\"]}");
	add("{\"term\":\"dextroglucose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908487\"]}");
	add("{\"term\":\"dextrorotation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07455973\"]}");
	add("{\"term\":\"dextrose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908487\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }