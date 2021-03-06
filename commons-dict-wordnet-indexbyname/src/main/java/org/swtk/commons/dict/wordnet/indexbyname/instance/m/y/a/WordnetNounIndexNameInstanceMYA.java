package org.swtk.commons.dict.wordnet.indexbyname.instance.m.y.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01959843\"]}");
	add("{\"term\":\"mya arenaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01959976\"]}");
	add("{\"term\":\"myaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01959565\"]}");
	add("{\"term\":\"myacidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01959716\"]}");
	add("{\"term\":\"myadestes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01563700\"]}");
	add("{\"term\":\"myalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14352445\"]}");
	add("{\"term\":\"myanmar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08733223\"]}");
	add("{\"term\":\"myanmar monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13706245\"]}");
	add("{\"term\":\"myasthenia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14068334\", \"14102353\"]}");
	add("{\"term\":\"myasthenia gravis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14102353\"]}");
	add("{\"term\":\"myasthenic syndrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14102638\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }