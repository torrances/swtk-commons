package org.swtk.commons.dict.wordnet.index.name.instance.a.l.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"algol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06914540\", \"09215444\"]}");
	add("{\"term\":\"algolagnia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07508822\"]}");
	add("{\"term\":\"algology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06084057\"]}");
	add("{\"term\":\"algometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02699428\"]}");
	add("{\"term\":\"algometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01000138\"]}");
	add("{\"term\":\"algonkian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06920935\", \"09666270\"]}");
	add("{\"term\":\"algonkin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06920935\", \"09666270\"]}");
	add("{\"term\":\"algonquian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06919747\", \"09666446\"]}");
	add("{\"term\":\"algonquin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06919747\", \"09666446\"]}");
	add("{\"term\":\"algophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07508822\"]}");
	add("{\"term\":\"algophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14406276\"]}");
	add("{\"term\":\"algorism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06013929\", \"06823549\"]}");
	add("{\"term\":\"algorithm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05855965\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }