package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dismantlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00914105\"]}");
	add("{\"term\":\"dismantling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00914105\"]}");
	add("{\"term\":\"dismay\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07535012\", \"07558063\"]}");
	add("{\"term\":\"dismemberment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07448110\"]}");
	add("{\"term\":\"dismissal\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00217041\", \"06702574\", \"07227739\", \"01192662\"]}");
	add("{\"term\":\"dismission\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00217041\", \"07227739\"]}");
	add("{\"term\":\"dismount\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01255387\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }