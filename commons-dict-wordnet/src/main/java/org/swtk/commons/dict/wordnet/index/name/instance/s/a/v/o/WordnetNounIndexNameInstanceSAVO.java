package org.swtk.commons.dict.wordnet.index.name.instance.s.a.v.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAVO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"savonarola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11302792\"]}");
	add("{\"term\":\"savor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05723811\"]}");
	add("{\"term\":\"savoriness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003105\"]}");
	add("{\"term\":\"savoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00843562\"]}");
	add("{\"term\":\"savorlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05004197\"]}");
	add("{\"term\":\"savory\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07610411\", \"07836790\", \"12878216\", \"12887728\"]}");
	add("{\"term\":\"savour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05723811\"]}");
	add("{\"term\":\"savouring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00843562\"]}");
	add("{\"term\":\"savourlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05004197\"]}");
	add("{\"term\":\"savoury\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07610411\", \"07836790\"]}");
	add("{\"term\":\"savoy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07730640\", \"08965050\"]}");
	add("{\"term\":\"savoyard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09728551\", \"10573452\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }