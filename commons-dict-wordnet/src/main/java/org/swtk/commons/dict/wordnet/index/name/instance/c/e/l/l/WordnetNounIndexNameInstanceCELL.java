package org.swtk.commons.dict.wordnet.index.name.instance.c.e.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCELL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cell\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02994757\", \"02995010\", \"02995984\", \"08375521\", \"02994503\", \"00006484\", \"02995166\"]}");
	add("{\"term\":\"cellar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02995302\", \"04115231\", \"02803656\"]}");
	add("{\"term\":\"cellarage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02995405\", \"13341788\"]}");
	add("{\"term\":\"cellaret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03775145\"]}");
	add("{\"term\":\"cellblock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02995487\"]}");
	add("{\"term\":\"cellini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10908540\"]}");
	add("{\"term\":\"cellist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09922954\"]}");
	add("{\"term\":\"cello\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02995666\"]}");
	add("{\"term\":\"cellophane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02995823\"]}");
	add("{\"term\":\"cellphone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02995984\"]}");
	add("{\"term\":\"cellularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14084944\"]}");
	add("{\"term\":\"cellulite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05277167\"]}");
	add("{\"term\":\"cellulitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14363319\"]}");
	add("{\"term\":\"celluloid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06273220\", \"14989676\"]}");
	add("{\"term\":\"cellulose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14818091\"]}");
	add("{\"term\":\"cellulosic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14828209\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }