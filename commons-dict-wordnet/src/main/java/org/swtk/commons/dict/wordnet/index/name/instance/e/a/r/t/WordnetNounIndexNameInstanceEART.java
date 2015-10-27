package org.swtk.commons.dict.wordnet.index.name.instance.e.a.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEART {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"earth\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03467679\", \"05678816\", \"14868584\", \"08579604\", \"09357302\", \"14867162\", \"09293800\"]}");
	add("{\"term\":\"earthball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12989891\"]}");
	add("{\"term\":\"earthenware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03267222\"]}");
	add("{\"term\":\"earthing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00149656\"]}");
	add("{\"term\":\"earthling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10718758\"]}");
	add("{\"term\":\"earthman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10718758\"]}");
	add("{\"term\":\"earthnut\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07752947\", \"07753721\", \"12956915\", \"13006180\"]}");
	add("{\"term\":\"earthquake\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14001317\", \"07443554\"]}");
	add("{\"term\":\"earthstar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13065538\"]}");
	add("{\"term\":\"earthtongue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13247769\"]}");
	add("{\"term\":\"earthwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03267420\"]}");
	add("{\"term\":\"earthworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01938036\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }