package org.swtk.commons.dict.wordnet.indexbyname.instance.o.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceONC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"onchocerciasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14477496\"]}");
	add("{\"term\":\"oncidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12094909\"]}");
	add("{\"term\":\"oncidium papilio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12101321\"]}");
	add("{\"term\":\"oncidium papilio kramerianum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12101089\"]}");
	add("{\"term\":\"oncogene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05447986\"]}");
	add("{\"term\":\"oncologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10397332\"]}");
	add("{\"term\":\"oncology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06063797\"]}");
	add("{\"term\":\"oncoming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07340590\"]}");
	add("{\"term\":\"oncorhynchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02538540\"]}");
	add("{\"term\":\"oncorhynchus keta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02539316\"]}");
	add("{\"term\":\"oncorhynchus kisutch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02539495\"]}");
	add("{\"term\":\"oncorhynchus nerka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02538796\"]}");
	add("{\"term\":\"oncorhynchus tshawytscha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02539087\"]}");
	add("{\"term\":\"oncovin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04543121\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }