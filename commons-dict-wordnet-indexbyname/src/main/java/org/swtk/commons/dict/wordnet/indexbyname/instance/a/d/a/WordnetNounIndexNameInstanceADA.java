package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ada\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14731522\"]}");
	add("{\"term\":\"adactylia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14176285\"]}");
	add("{\"term\":\"adactylism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14176285\"]}");
	add("{\"term\":\"adactyly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14176285\"]}");
	add("{\"term\":\"adad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09538162\"]}");
	add("{\"term\":\"adage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07168546\"]}");
	add("{\"term\":\"adagio\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00527296\", \"07061862\"]}");
	add("{\"term\":\"adalia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02168406\", \"09063314\"]}");
	add("{\"term\":\"adam\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02681592\", \"10827649\", \"09609728\"]}");
	add("{\"term\":\"adamance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04871024\"]}");
	add("{\"term\":\"adamant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14858733\"]}");
	add("{\"term\":\"adams\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09210304\", \"10827804\", \"10827957\", \"10828143\"]}");
	add("{\"term\":\"adana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09062950\"]}");
	add("{\"term\":\"adansonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12210137\"]}");
	add("{\"term\":\"adapa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09538266\"]}");
	add("{\"term\":\"adapid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02498841\"]}");
	add("{\"term\":\"adapin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03234608\"]}");
	add("{\"term\":\"adaptability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04666447\"]}");
	add("{\"term\":\"adaptation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00194255\", \"13448251\", \"06420422\"]}");
	add("{\"term\":\"adapter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02681751\", \"09829330\"]}");
	add("{\"term\":\"adaption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13448251\"]}");
	add("{\"term\":\"adaptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02681751\"]}");
	add("{\"term\":\"adar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15240276\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }