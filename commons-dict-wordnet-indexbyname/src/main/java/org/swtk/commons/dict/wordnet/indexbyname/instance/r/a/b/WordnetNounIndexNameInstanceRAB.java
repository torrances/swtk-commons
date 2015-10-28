package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rabat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08992796\"]}");
	add("{\"term\":\"rabato\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04043124\"]}");
	add("{\"term\":\"rabbet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04043252\"]}");
	add("{\"term\":\"rabbi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06352979\", \"10521914\"]}");
	add("{\"term\":\"rabbinate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00599793\", \"08130876\"]}");
	add("{\"term\":\"rabbit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07682266\", \"14789503\", \"02326697\"]}");
	add("{\"term\":\"rabbiteye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12267719\"]}");
	add("{\"term\":\"rabbitfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01484139\"]}");
	add("{\"term\":\"rabbitweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11995026\"]}");
	add("{\"term\":\"rabbitwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12757759\"]}");
	add("{\"term\":\"rabble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08418776\", \"08201518\"]}");
	add("{\"term\":\"rabelais\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11271215\"]}");
	add("{\"term\":\"rabidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04892979\"]}");
	add("{\"term\":\"rabidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04892979\"]}");
	add("{\"term\":\"rabies\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14295169\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }