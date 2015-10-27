package org.swtk.commons.dict.wordnet.index.name.instance.b.l.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBLIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"blind\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06773219\", \"02854358\", \"02854643\", \"07960684\"]}");
	add("{\"term\":\"blinder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04600956\"]}");
	add("{\"term\":\"blindfold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02855198\"]}");
	add("{\"term\":\"blindness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14150142\"]}");
	add("{\"term\":\"blindworm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01657985\", \"01692790\"]}");
	add("{\"term\":\"bling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02855302\"]}");
	add("{\"term\":\"blini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07656453\"]}");
	add("{\"term\":\"blink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00118779\"]}");
	add("{\"term\":\"blinker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04600956\", \"07277372\", \"02855432\"]}");
	add("{\"term\":\"blinking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00118779\"]}");
	add("{\"term\":\"blinks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11881956\"]}");
	add("{\"term\":\"blintz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07656600\"]}");
	add("{\"term\":\"blintze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07656600\"]}");
	add("{\"term\":\"bliny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07656453\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }