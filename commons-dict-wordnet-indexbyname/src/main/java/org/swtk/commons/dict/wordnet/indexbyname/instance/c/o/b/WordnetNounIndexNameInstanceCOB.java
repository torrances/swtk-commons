package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cob\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01861421\", \"02044529\", \"02388793\", \"07788764\"]}");
	add("{\"term\":\"cobalamin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15115871\"]}");
	add("{\"term\":\"cobalt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14659468\"]}");
	add("{\"term\":\"cobaltite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14696056\"]}");
	add("{\"term\":\"cobber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09952478\"]}");
	add("{\"term\":\"cobble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03063531\"]}");
	add("{\"term\":\"cobbler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07641440\", \"07930014\", \"09952556\"]}");
	add("{\"term\":\"cobblers\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05532751\", \"06620758\"]}");
	add("{\"term\":\"cobblestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03063531\"]}");
	add("{\"term\":\"cobbling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00619105\"]}");
	add("{\"term\":\"cobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02576902\"]}");
	add("{\"term\":\"cobitidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01441102\"]}");
	add("{\"term\":\"cobnut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07788764\", \"12309950\"]}");
	add("{\"term\":\"cobol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06915387\"]}");
	add("{\"term\":\"cobra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01750526\"]}");
	add("{\"term\":\"cobweb\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03063688\", \"03063809\", \"03063937\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }