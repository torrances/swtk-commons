package org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAVO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"avo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13712654\"]}");
	add("{\"term\":\"avocado\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11727230\", \"07780823\"]}");
	add("{\"term\":\"avocado pear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07780823\"]}");
	add("{\"term\":\"avocado tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11727230\"]}");
	add("{\"term\":\"avocation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00433629\"]}");
	add("{\"term\":\"avocet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02039365\"]}");
	add("{\"term\":\"avogadro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10849642\"]}");
	add("{\"term\":\"avogadro number\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13607022\"]}");
	add("{\"term\":\"avoidance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00204602\"]}");
	add("{\"term\":\"avoirdupois\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05006566\", \"13738026\"]}");
	add("{\"term\":\"avoirdupois unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13738189\"]}");
	add("{\"term\":\"avoirdupois weight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13738026\"]}");
	add("{\"term\":\"avon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08901380\", \"09234851\", \"09235058\"]}");
	add("{\"term\":\"avouchment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06745099\"]}");
	add("{\"term\":\"avowal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06745099\"]}");
	add("{\"term\":\"avower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09834065\", \"09846100\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }