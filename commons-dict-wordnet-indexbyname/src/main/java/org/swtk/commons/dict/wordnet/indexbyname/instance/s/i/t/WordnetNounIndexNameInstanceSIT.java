package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09554428\"]}");
	add("{\"term\":\"sitar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04231904\"]}");
	add("{\"term\":\"sitcom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07030493\", \"07030847\"]}");
	add("{\"term\":\"site\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06370600\", \"08640525\", \"08668822\"]}");
	add("{\"term\":\"sitka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09078741\"]}");
	add("{\"term\":\"sitophylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02185448\"]}");
	add("{\"term\":\"sitotroga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02296626\"]}");
	add("{\"term\":\"sitsang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08926725\"]}");
	add("{\"term\":\"sitta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01593478\"]}");
	add("{\"term\":\"sitter\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01795596\", \"09832624\", \"09848551\", \"10623367\", \"11323517\"]}");
	add("{\"term\":\"sittidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01593084\"]}");
	add("{\"term\":\"sitting\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07160898\", \"08434877\", \"00345085\", \"00345247\"]}");
	add("{\"term\":\"situation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00587299\", \"08640525\", \"14434647\", \"13948785\", \"13950416\"]}");
	add("{\"term\":\"sitwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11324006\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }