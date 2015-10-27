package org.swtk.commons.dict.wordnet.index.name.instance.a.n.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anapaest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110056\"]}");
	add("{\"term\":\"anapest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110056\"]}");
	add("{\"term\":\"anaphalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11941669\"]}");
	add("{\"term\":\"anaphase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13452553\"]}");
	add("{\"term\":\"anaphor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06298530\"]}");
	add("{\"term\":\"anaphora\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07115344\", \"07115481\"]}");
	add("{\"term\":\"anaphrodisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07503816\"]}");
	add("{\"term\":\"anaphylaxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14557149\"]}");
	add("{\"term\":\"anaplasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14392599\"]}");
	add("{\"term\":\"anaplasmosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14283546\"]}");
	add("{\"term\":\"anaplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00691754\"]}");
	add("{\"term\":\"anaprox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03813684\"]}");
	add("{\"term\":\"anapsid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01664233\"]}");
	add("{\"term\":\"anapsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01664045\"]}");
	add("{\"term\":\"anapurna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09220823\", \"09550694\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }