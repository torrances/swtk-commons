package org.swtk.commons.dict.wordnet.indexbyname.instance.l.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"luba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07006530\", \"09712640\"]}");
	add("{\"term\":\"lubavitch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08492343\", \"09034292\"]}");
	add("{\"term\":\"lubavitcher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10295231\"]}");
	add("{\"term\":\"lubber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10265038\", \"10294336\"]}");
	add("{\"term\":\"lubbock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09167954\"]}");
	add("{\"term\":\"lube\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14914810\"]}");
	add("{\"term\":\"lubeck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08791713\"]}");
	add("{\"term\":\"lubitsch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11163321\"]}");
	add("{\"term\":\"lublin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09006593\"]}");
	add("{\"term\":\"lubricant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14914810\"]}");
	add("{\"term\":\"lubrication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00718197\", \"14601649\"]}");
	add("{\"term\":\"lubricator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14914810\"]}");
	add("{\"term\":\"lubricity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07505354\"]}");
	add("{\"term\":\"lubumbashi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08753178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }