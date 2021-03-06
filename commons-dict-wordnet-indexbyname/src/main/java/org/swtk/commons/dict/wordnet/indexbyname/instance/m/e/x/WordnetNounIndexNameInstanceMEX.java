package org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mexicali\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08761938\"]}");
	add("{\"term\":\"mexican\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09742054\"]}");
	add("{\"term\":\"mexican beaded lizard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01695164\"]}");
	add("{\"term\":\"mexican bean beetle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02168881\"]}");
	add("{\"term\":\"mexican black cherry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07773850\"]}");
	add("{\"term\":\"mexican capital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08762069\"]}");
	add("{\"term\":\"mexican cypress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11652827\"]}");
	add("{\"term\":\"mexican fire plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12941479\"]}");
	add("{\"term\":\"mexican flameleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12940964\"]}");
	add("{\"term\":\"mexican freetail bat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02152305\"]}");
	add("{\"term\":\"mexican green\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02672679\"]}");
	add("{\"term\":\"mexican hairless\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02116630\"]}");
	add("{\"term\":\"mexican hat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12027399\"]}");
	add("{\"term\":\"mexican husk tomato\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07750531\", \"12932200\"]}");
	add("{\"term\":\"mexican hyssop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12861262\"]}");
	add("{\"term\":\"mexican jumping bean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12949579\"]}");
	add("{\"term\":\"mexican juniper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11659149\"]}");
	add("{\"term\":\"mexican mint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12887219\"]}");
	add("{\"term\":\"mexican monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13714818\"]}");
	add("{\"term\":\"mexican nut pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11630313\"]}");
	add("{\"term\":\"mexican onyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14689648\"]}");
	add("{\"term\":\"mexican peso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13714927\"]}");
	add("{\"term\":\"mexican pocket mouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02352499\"]}");
	add("{\"term\":\"mexican poppy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11923451\"]}");
	add("{\"term\":\"mexican revolution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01308287\"]}");
	add("{\"term\":\"mexican spanish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06980102\"]}");
	add("{\"term\":\"mexican standoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13959590\"]}");
	add("{\"term\":\"mexican sunflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12046487\"]}");
	add("{\"term\":\"mexican swamp cypress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11662881\"]}");
	add("{\"term\":\"mexican tea\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11849273\", \"11849674\"]}");
	add("{\"term\":\"mexican tulip poppy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11926596\"]}");
	add("{\"term\":\"mexican valium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04042970\"]}");
	add("{\"term\":\"mexican war\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01308498\"]}");
	add("{\"term\":\"mexicano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09742481\"]}");
	add("{\"term\":\"mexico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08758708\"]}");
	add("{\"term\":\"mexico city\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08762069\"]}");
	add("{\"term\":\"mexiletine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03763454\"]}");
	add("{\"term\":\"mexitil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03763454\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }