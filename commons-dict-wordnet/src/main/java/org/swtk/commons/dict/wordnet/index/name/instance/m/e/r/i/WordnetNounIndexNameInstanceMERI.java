package org.swtk.commons.dict.wordnet.index.name.instance.m.e.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMERI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mericarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11698828\"]}");
	add("{\"term\":\"merida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08758200\"]}");
	add("{\"term\":\"meridian\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08616379\", \"09127772\", \"13963489\"]}");
	add("{\"term\":\"meringue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07636749\"]}");
	add("{\"term\":\"merino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02416936\"]}");
	add("{\"term\":\"meriones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02346658\"]}");
	add("{\"term\":\"meristem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13151644\"]}");
	add("{\"term\":\"merit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04814129\", \"05146223\"]}");
	add("{\"term\":\"meritocracy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06228761\", \"07989535\"]}");
	add("{\"term\":\"meritoriousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04814129\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }