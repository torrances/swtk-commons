package org.swtk.commons.dict.wordnet.index.name.instance.i.n.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINCI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"incidence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11488396\", \"13849172\"]}");
	add("{\"term\":\"incident\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14001480\", \"07322095\"]}");
	add("{\"term\":\"incidental\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06494667\", \"13327458\"]}");
	add("{\"term\":\"incienso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11984401\"]}");
	add("{\"term\":\"incineration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00379514\"]}");
	add("{\"term\":\"incinerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03571373\"]}");
	add("{\"term\":\"incipience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15167972\"]}");
	add("{\"term\":\"incipiency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15167972\"]}");
	add("{\"term\":\"incision\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00679253\", \"13927849\"]}");
	add("{\"term\":\"incisiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05206948\"]}");
	add("{\"term\":\"incisor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05315140\"]}");
	add("{\"term\":\"incisura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13928127\"]}");
	add("{\"term\":\"incisure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13928127\"]}");
	add("{\"term\":\"incitation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01263983\", \"09207872\"]}");
	add("{\"term\":\"incitement\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07260696\", \"09207872\", \"07267432\", \"01263983\"]}");
	add("{\"term\":\"inciter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10228847\"]}");
	add("{\"term\":\"incivility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04922542\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }