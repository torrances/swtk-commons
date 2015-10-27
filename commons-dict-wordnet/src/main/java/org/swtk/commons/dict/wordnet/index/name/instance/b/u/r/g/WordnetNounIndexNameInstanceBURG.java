package org.swtk.commons.dict.wordnet.index.name.instance.b.u.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBURG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"burg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08688906\"]}");
	add("{\"term\":\"burger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07712845\", \"10891874\"]}");
	add("{\"term\":\"burgess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09900112\", \"10892092\"]}");
	add("{\"term\":\"burgh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08557756\"]}");
	add("{\"term\":\"burgher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09889236\", \"09900112\"]}");
	add("{\"term\":\"burglar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09900207\"]}");
	add("{\"term\":\"burglary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00786699\"]}");
	add("{\"term\":\"burgomaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09900347\"]}");
	add("{\"term\":\"burgoo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07605295\", \"07605443\", \"07890971\"]}");
	add("{\"term\":\"burgoyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10892211\"]}");
	add("{\"term\":\"burgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12134174\"]}");
	add("{\"term\":\"burgrave\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09900475\", \"09900599\"]}");
	add("{\"term\":\"burgundy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04971082\", \"07909866\", \"08960830\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }