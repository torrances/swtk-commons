package org.swtk.commons.dict.wordnet.index.name.instance.a.f.f.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAFFI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"affiant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09795702\"]}");
	add("{\"term\":\"affidavit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06749278\"]}");
	add("{\"term\":\"affiliate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08026210\", \"09795787\"]}");
	add("{\"term\":\"affiliation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01083985\", \"13953418\"]}");
	add("{\"term\":\"affine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09795963\"]}");
	add("{\"term\":\"affinity\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04695997\", \"04755038\", \"11442936\", \"13833622\", \"13834508\", \"13835495\", \"11446892\"]}");
	add("{\"term\":\"affirmation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01188682\", \"06697543\", \"07217786\", \"06745099\"]}");
	add("{\"term\":\"affirmative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07218356\"]}");
	add("{\"term\":\"affirmativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05174644\"]}");
	add("{\"term\":\"affirmed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02387291\"]}");
	add("{\"term\":\"affirmer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834065\"]}");
	add("{\"term\":\"affix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06319039\"]}");
	add("{\"term\":\"affixation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00380230\", \"00929509\", \"06187639\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }