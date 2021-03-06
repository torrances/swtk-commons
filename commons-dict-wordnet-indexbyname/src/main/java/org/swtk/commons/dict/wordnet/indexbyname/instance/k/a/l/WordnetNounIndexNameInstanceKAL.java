package org.swtk.commons.dict.wordnet.indexbyname.instance.k.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kala azar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14201559\"]}");
	add("{\"term\":\"kalaallit nunaat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08837249\"]}");
	add("{\"term\":\"kalahari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09193191\"]}");
	add("{\"term\":\"kalahari desert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09193191\"]}");
	add("{\"term\":\"kalamazoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09123833\"]}");
	add("{\"term\":\"kalansuwa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03612740\"]}");
	add("{\"term\":\"kalantas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12721117\"]}");
	add("{\"term\":\"kalapooia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09677959\"]}");
	add("{\"term\":\"kalapooian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06937880\"]}");
	add("{\"term\":\"kalapuya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09677959\"]}");
	add("{\"term\":\"kalapuyan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06937880\"]}");
	add("{\"term\":\"kalashnikov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03612872\"]}");
	add("{\"term\":\"kalashnikov culture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06204629\"]}");
	add("{\"term\":\"kale\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07729823\", \"11897445\", \"13406389\"]}");
	add("{\"term\":\"kaleidoscope\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03612969\", \"05940613\"]}");
	add("{\"term\":\"kalemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14293518\"]}");
	add("{\"term\":\"kali\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09549837\", \"11855123\"]}");
	add("{\"term\":\"kalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03538194\"]}");
	add("{\"term\":\"kalif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09906948\"]}");
	add("{\"term\":\"kalimantan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08862207\", \"08929310\"]}");
	add("{\"term\":\"kalinin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11116023\"]}");
	add("{\"term\":\"kaliph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09906948\"]}");
	add("{\"term\":\"kaliuresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14293629\"]}");
	add("{\"term\":\"kalka\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941785\", \"09757184\"]}");
	add("{\"term\":\"kalki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09553761\"]}");
	add("{\"term\":\"kalmia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258003\"]}");
	add("{\"term\":\"kalmia angustifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258590\"]}");
	add("{\"term\":\"kalmia latifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258158\"]}");
	add("{\"term\":\"kalmia polifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258372\"]}");
	add("{\"term\":\"kalon tripa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10248704\"]}");
	add("{\"term\":\"kalotermes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02228059\"]}");
	add("{\"term\":\"kalotermitidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02227883\"]}");
	add("{\"term\":\"kalpac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02944683\"]}");
	add("{\"term\":\"kaluga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09027523\"]}");
	add("{\"term\":\"kalumpang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12216251\"]}");
	add("{\"term\":\"kaluresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14293629\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }